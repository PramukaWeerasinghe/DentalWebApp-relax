package com.doerit.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import com.doerit.model.Patient;
import com.doerit.model.PatientRequestXray;
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
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

public class PdfRequestXray {

	private PatientRequestXray patientRequestXray;
	private Patient patient;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	
	public ByteArrayOutputStream createPdf(PatientRequestXray patientRequestXray) throws DocumentException, IOException {
		
		this.patientRequestXray = patientRequestXray;
		
		FontFactory.defaultEmbedding = true;
		FontFactory.registerDirectories();

		float left = PdfSettings.LEFT; // 30 mm with 72 px/inch
		float right = PdfSettings.RIGHT; // 30 mm
		float top = PdfSettings.TOP; // 20 mm
		float bottom = PdfSettings.BOTTOM; // 20 mm
		
		Document document = new Document(PageSize.A4, left, right, top, bottom);
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();

		
		PdfWriter writer = PdfWriter.getInstance(document, baosPDF);
		writer.setPageEvent(new PdfPatientHeaderFooter());
		document.open();

		Chunk headerChunk1 = new Chunk("Dental Hospital (Teaching) - Peradeniya");
		headerChunk1.setUnderline(1.2f, -6.0f);
        Paragraph headerLine1 = new Paragraph(headerChunk1);
        headerChunk1.setFont(PdfFont.FontHeader);
        headerLine1.setAlignment(Element.ALIGN_CENTER);
        document.add(headerLine1);
        
        Chunk headerChunk2 = new Chunk("Patient Radiology Request Form");
		headerChunk2.setUnderline(1.2f, -6.0f);
        Paragraph headerLine2 = new Paragraph(headerChunk2);
        headerChunk2.setFont(PdfFont.FontHeader);
        headerLine2.setAlignment(Element.ALIGN_CENTER);
        document.add(headerLine2);
        
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
        
        document.add(createPrimaryInformationTable());
        
        document.add(gap);
        document.add(new Chunk(ls));
       
        
        document.add(createXrayInformationTable());
        document.add(new Chunk(ls)); 
	}

	   private PdfPTable createXrayInformationTable() throws DocumentException, IOException {
	        PdfPTable table = new PdfPTable(5);
	        table.setWidths(new float[]{0.5f, 2, 2, 1, 2});
	        table.getDefaultCell().setBorder(0);

	        if(!patientRequestXray.getClinicalHistory().isEmpty() ) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("Clinical history:", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getClinicalHistory(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        	
	        }

	        
	        table.addCell(""); //offset
	        table.addCell(createCellValue("IOPA:", PdfFont.Level2Header));
	        table.addCell(createCellValue(patientRequestXray.getIopa(), PdfFont.Level2Value));
	        table.addCell("");
	        table.addCell("");
	        
	        if(!patientRequestXray.getBitewing().isEmpty()) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("Bitewing:", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getBitewing(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        		        	
	        }


	        if(!patientRequestXray.getOcclusalView().isEmpty()) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("Occlusal views:", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getOcclusalView(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        	
	        }

	
	        if(patientRequestXray.getOpg().matches("true")) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("OPG:", PdfFont.Level2Header));
		        table.addCell(createCellValue("Digital", PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        		        	
	        }


	        //4 checkbox for views start
	        table.addCell(""); //offset
	        table.addCell(createCellValue("Views: ", PdfFont.Level1Header));
	        table.addCell("");
	        table.addCell("");
	        table.addCell(""); 
	        
	        if (patientRequestXray.getSialogram().matches("true")) {
		        table.addCell(""); //offset
		        table.addCell("");
		        table.addCell(createCellValue("Sialogram", PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");
			}

	        if (patientRequestXray.getCephalogram().matches("true")) {
		        table.addCell(""); //offset
		        table.addCell("");
		        table.addCell(createCellValue("Cephalogram", PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");
			}		        

	        if (patientRequestXray.getTmjView().matches("true")) {
		        table.addCell(""); //offset
		        table.addCell("");
		        table.addCell(createCellValue("TMJ", PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");
			}

	        if (patientRequestXray.getOmViewOfSkull().matches("true")) {
		        table.addCell(""); //offset
		        table.addCell("");
		        table.addCell(createCellValue("OM", PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");
			}		        

	        //end of 4 checkboxes
	        
	        
	        table.addCell("");
	        table.addCell("");
	        table.addCell("");
	        table.addCell("");
	        table.addCell("");
	  
	        if(!patientRequestXray.getMandibularView().isEmpty()) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("Mandibular view:", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getMandibularView(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        	
	        }

	  
	        if(!patientRequestXray.getSkullView().isEmpty()) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("Skull views", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getSkullView(), PdfFont.Level2Value));
		        if(patientRequestXray.getReverseTowns().equalsIgnoreCase("true")) {
			        table.addCell(createCellValue("Reverse Towns", PdfFont.Level2Value));	        	
		        }else {
			        table.addCell("");        	
		        }
		        table.addCell("");	        	
	        }



	        if(!patientRequestXray.getChestXray().isEmpty()) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("Chest x-ray:", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getChestXray(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        	
	        }

	        
	        if(patientRequestXray.getCspineneck().equalsIgnoreCase("true")) {
		        table.addCell(""); //offset
		        table.addCell("");
		        table.addCell(createCellValue("C – spine / neck", PdfFont.Level2Value));
		        //table.addCell(createCellValue(patientRequestXray.getCspineneck(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");
		        	        		        	
	        }


	        if(!patientRequestXray.getCbct().isEmpty()) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("CBCT", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getCbct(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        	
	        }


	        if(!patientRequestXray.getUss().isEmpty()) {
		        table.addCell(""); //offset
		        table.addCell(createCellValue("USS", PdfFont.Level2Header));
		        table.addCell(createCellValue(patientRequestXray.getUss(), PdfFont.Level2Value));
		        table.addCell("");
		        table.addCell("");	        	
	        }

	        
	        table.addCell(""); //offset
	        table.addCell(createCellValue("Department", PdfFont.Level2Header));
	        table.addCell(createCellValue(patientRequestXray.getDepartment(), PdfFont.Level2Value));
	        table.addCell("");
	        table.addCell("");

	        
	        table.addCell(""); //offset
	        table.addCell(createCellValue("Requested officer", PdfFont.Level2Header));
	        table.addCell(createCellValue(patientRequestXray.getOfficerName(), PdfFont.Level2Value));
	        table.addCell("");
	        table.addCell(""); 
	  
	        
	        
	        return table;
		}
	
	private PdfPTable createPrimaryInformationTable() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(5);
		table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.getDefaultCell().setBorder(0);

		PdfPCell cell = createCellValue("Personal Data:", PdfFont.Level1Header);
		cell.setColspan(5);
		table.addCell(cell);

		table.addCell(""); // offset
		table.addCell(createCellValue("Serial Number:", PdfFont.Level2Header));
		
		String fileNumber = "Not Assigned";
		if(patientRequestXray.getPatientId() != null) {
			fileNumber = patientRequestXray.getPatientId();
		}
		
		PdfPCell serialCell = createCellValue(patientRequestXray.getPatientId() + 
				" ( File Number: " + fileNumber + " )", PdfFont.Level2Value);
		serialCell.setColspan(3);
		table.addCell(serialCell);

		table.addCell(""); // offset
		table.addCell(createCellValue("Clinical history:", PdfFont.Level2Header));
		PdfPCell nameCell = createCellValue(patientRequestXray.getClinicalHistory() , PdfFont.Level2Value);
		nameCell.setColspan(3);
		table.addCell(nameCell);
/*
		table.addCell(""); // offset
		table.addCell(createCellValue("NIC Number:", PdfFont.Level2Header));
		table.addCell(createCellValue(patient.getNic(), PdfFont.Level2Value));
		
		BufferedImage bufferedImage = BarCodeImageUtility.createBarCode(patient.getSerialNumber(), 40f);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ImageIO.write(bufferedImage, "png", baos);
		Image iTextImage = Image.getInstance(baos.toByteArray());

		
		PdfPCell imageCell = new PdfPCell(new Phrase(""));
		imageCell.setBorder(0);
		imageCell.setRowspan(4);
		imageCell.setColspan(2);
		table.addCell(imageCell);

		table.addCell(""); // offset
		table.addCell(createCellValue("Date of Birth:", PdfFont.Level2Header));
		
		try{
			table.addCell(createCellValue(sdf.format(patient.getDateOfBirth()), PdfFont.Level2Value));
		}catch(Exception e) {
			table.addCell(createCellValue("", PdfFont.TenNormal));
		}
		table.addCell(""); // offset
		table.addCell(createCellValue("Sex:", PdfFont.Level2Header));
		table.addCell(createCellValue(patient.getSex(), PdfFont.Level2Value));

		table.addCell(""); // offset
		table.addCell(createCellValue("Ethnicity:", PdfFont.Level2Header));
		table.addCell(createCellValue(patient.getEthnicity(), PdfFont.Level2Value));
*/
		return table;
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

		BufferedImage bufferedImage = BarCodeImageUtility.createBarCode(patientRequestXray.getPatientId(), 40f);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ImageIO.write(bufferedImage, "png", baos);
		Image iTextImage = Image.getInstance(baos.toByteArray());

		PdfPCell imageCell = new PdfPCell(iTextImage);
		imageCell.setBorder(0);
		table.addCell(imageCell);
		
		return table;

	}

	private PdfPCell createCellValue(String label, Font font) {
		PdfPCell pdfPCell = new PdfPCell(new Phrase(16, label, font));
		pdfPCell.setBorder(0);

		return pdfPCell;
	}

	class PdfPatientHeaderFooter extends PdfPageEventHelper {

		Font ffont = PdfFont.getTableOfContentTitle();

		public void onEndPage(PdfWriter writer, Document document) {
			/*PdfContentByte cb = writer.getDirectContent();
			Paragraph header = PdfPatientSettings.HEADER();
			
			ColumnText.showTextAligned(cb, Element.ALIGN_LEFT, header, document.leftMargin(), document.top() + 15, 0);
*/
			/*Phrase footer = new Phrase(PdfPatientSettings.FOOTER(), ffont);
			ColumnText.showTextAligned(cb, Element.ALIGN_CENTER, footer,
					(document.right() - document.left()) / 2 + document.leftMargin(), document.bottom() - 30, 0);*/
		}
	}

}
