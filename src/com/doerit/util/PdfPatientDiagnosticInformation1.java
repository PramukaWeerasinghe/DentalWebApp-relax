package com.doerit.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.PatientDiagnosticDentalHistory;
import com.doerit.model.PatientDiagnosticMedicalRecord1;
import com.doerit.model.PatientDiagnosticMedicalRecord2;
import com.doerit.model.PatientDiagnosticMedicalRecord3;
import com.doerit.model.PatientDiagnosticMedicalRecord4;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

public class PdfPatientDiagnosticInformation1 {
	private PatientDiagnosticComplaint patientDiagnosticComplaint;
	private PatientDiagnosticDentalHistory patientDiagnosticDentalHistory;
	private PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1;
	private PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2;
	private PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3;
	private PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4;
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	
	public ByteArrayOutputStream createPdf(PatientDiagnosticComplaint patientDiagnosticComplaint) throws DocumentException, IOException {
		
		this.patientDiagnosticComplaint = patientDiagnosticComplaint;
		
		FontFactory.defaultEmbedding = true;
		FontFactory.registerDirectories();

		float left = PdfSettings.LEFT; // 30 mm with 72 px/inch
		float right = PdfSettings.RIGHT; // 30 mm
		float top = PdfSettings.TOP; // 20 mm
		float bottom = PdfSettings.BOTTOM; // 20 mm
		
		Document document = new Document(PageSize.A4, left, right, top, bottom);
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();

		
		PdfWriter writer = PdfWriter.getInstance(document, baosPDF);
		//writer.setPageEvent(new PdfPatientHeaderFooter());
		document.open();

		Chunk headerChunk1 = new Chunk("Patient Diagnostic Information");
		headerChunk1.setUnderline(1.2f, -6.0f);
        Paragraph headerLine1 = new Paragraph(headerChunk1);
        headerChunk1.setFont(PdfFont.FontHeader);
        headerLine1.setAlignment(Element.ALIGN_CENTER);
        document.add(headerLine1);
        
        prepareTables(document);
		
		document.close();

		return baosPDF;
	}

	private void prepareTables(Document document) throws DocumentException, IOException {
		
		document.add(createDateAndBarCode());
		
		Paragraph gap = new Paragraph();
		gap.setSpacingBefore(5);
		document.add(gap);
		
		LineSeparator ls = new LineSeparator();
		ls.setLineColor(new BaseColor(200, 200, 200));

		document.add(ls);
		gap.setSpacingBefore(5);
		document.add(gap);

		document.add(createPatientDiagnosticComplaintTable());

		document.add(gap);
		document.add(new Chunk(ls));

		document.add(createPatientDiagnosticDentalHistoryTable());

		document.add(gap);
		document.add(new Chunk(ls));
		
		document.add(createPatientDiagnosticMedicalRecord1Table());
		
		document.add(gap);
		document.add(new Chunk(ls));
		
		document.add(createPatientDiagnosticMedicalRecord2Table());
		
		document.add(gap);
		document.add(new Chunk(ls));
		
		document.add(createPatientDiagnosticMedicalRecord3Table());
		
		document.add(gap);
		document.add(new Chunk(ls));
		
		document.add(createPatientDiagnosticMedicalRecord4Table());
		document.add(new Chunk(ls));
	}
	
	private PdfPTable createDateAndBarCode() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(2);
		table.setWidths(new float[] { 8, 2 });
		table.getDefaultCell().setBorder(0);

		Paragraph dateLabel = new Paragraph(sdf.format(new Date()), PdfFont.getTitleNormal());
		dateLabel.setAlignment(Element.ALIGN_BOTTOM);
		//dateLabel.setSpacingAfter(18);
		PdfPCell dateCell = new PdfPCell(dateLabel); // new Phrase(12, dateLabel, PdfFont.Level1Header));
		dateCell.setBorder(0);
		
		table.addCell(dateCell);
		
		return table;

	}
	
	private PdfPTable createPatientDiagnosticComplaintTable() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(5);
		table.setWidths(new float[] { 0.5f, 2, 3, 2, 1  });
		table.getDefaultCell().setBorder(0);

		table.addCell(""); // offset
		table.addCell(createCellValue("Complaint:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticComplaint.getComplaint(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");

		table.addCell(""); // offset
		table.addCell(createCellValue("Complaint Type:", PdfFont.Level2Header));
		PdfPCell complaintTypeCell = createCellValue(patientDiagnosticComplaint.getComplaintType(), PdfFont.Level2Value);
		complaintTypeCell.setColspan(2);
		table.addCell(complaintTypeCell);
		table.addCell("");

		table.addCell(""); // offset
		table.addCell(createCellValue("Complaint History", PdfFont.Level2Header));
		PdfPCell complaintHistoryCell = createCellValue(patientDiagnosticComplaint.getComplaintHistory(), PdfFont.Level2Value);
		complaintHistoryCell.setColspan(3);
		table.addCell(complaintHistoryCell);

		return table;

	}
	
	private PdfPTable createPatientDiagnosticDentalHistoryTable() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(5);
		table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.getDefaultCell().setBorder(0);

		table.addCell(""); // offset
		table.addCell(createCellValue("Extraction:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getExtraction(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");

		table.addCell(""); // offset
		table.addCell(createCellValue("Extraction Complications:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getExtractionComplications(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");

		table.addCell(""); // offset
		table.addCell(createCellValue("Extraction Complications Type:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getExtractionComplicationsType(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Oral Surgery:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getOralSurgery(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Periodontal Rx:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getPeriodontalRx(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Orthodontic Treatment:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getOrthodonticTreatment(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Orthodontic Treatment Complications:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getOrthodonticTreatmentComplications(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Restorative Rx:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getRestorativeRx(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Restorative Rx Complications:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticDentalHistory.getRestorativeRxComplications(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");

		return table;

	}

	private PdfPTable createPatientDiagnosticMedicalRecord1Table() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(5);
		table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.getDefaultCell().setBorder(0);

		table.addCell(""); // offset
		table.addCell(createCellValue("Anaemia:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getAnaemia(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");

		table.addCell(""); // offset
		table.addCell(createCellValue("Asthma:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getAsthma(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");

		table.addCell(""); // offset
		table.addCell(createCellValue("Drug Allergies:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getDrugPenicillin(), PdfFont.Level2Value));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getDrugParacetamol(), PdfFont.Level2Value));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getDrugNsaids(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Other Drug Allergies:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getDrugOther(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Food Allergies:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getFoodPineapple(), PdfFont.Level2Value));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getFoodTomatoe(), PdfFont.Level2Value));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getFoodCannedfish(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Other Food Allergies:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getFoodOther(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Latex/Rubber:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getLatexRubber(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");
		
		table.addCell(""); // offset
		table.addCell(createCellValue("Other Allergies:", PdfFont.Level2Header));
		table.addCell(createCellValue(patientDiagnosticMedicalRecord1.getAllergiesOther(), PdfFont.Level2Value));
		table.addCell("");
		table.addCell("");

		return table;

	}
	
	private PdfPTable createPatientDiagnosticMedicalRecord2Table() throws DocumentException, IOException {
		//implement
		return null;
	}
	
	private PdfPTable createPatientDiagnosticMedicalRecord3Table() throws DocumentException, IOException {
		//implement
		return null;
	}
	
	private PdfPTable createPatientDiagnosticMedicalRecord4Table() throws DocumentException, IOException {
		//implement
		return null;
	}

	private PdfPCell createCellValue(String label, Font font) {
		PdfPCell pdfPCell = new PdfPCell(new Phrase(16, label, font));
		pdfPCell.setBorder(0);

		return pdfPCell;
	}

	
}
