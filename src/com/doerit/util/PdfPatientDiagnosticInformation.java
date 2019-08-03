package com.doerit.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.doerit.model.PatientDiagnosticDrug;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;

public class PdfPatientDiagnosticInformation {

	private PatientDiagnosticWrapper patientDiagnosticWrapper;
	private Date d1 = new Date();
	private SimpleDateFormat sdf = new SimpleDateFormat("YYYY/MM/dd");
	private String formattedDate = sdf.format(d1);

	public ByteArrayOutputStream createDiagnosticPdf(PatientDiagnosticWrapper patientDiagnosticWrapper) throws DocumentException, IOException {

		
		this.patientDiagnosticWrapper = patientDiagnosticWrapper;

		FontFactory.defaultEmbedding = true;
		FontFactory.registerDirectories();

		float left = PdfSettings.R_LEFT;
		float right = PdfSettings.R_RIGHT;
		float top = PdfSettings.R_TOP;
		float bottom = PdfSettings.R_BOTTOM;
		
		Document document = new Document(PageSize.A4, left, right, top, bottom);
		ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();

		PdfWriter writer = PdfWriter.getInstance(document, baosPDF);


		
		//header and footer
		Header_Footer_PDF event = new Header_Footer_PDF();
		writer.setPageEvent(event);
		//header and footer ends
		
		
		document.open();
		Chunk headerChunk1 = new Chunk("Dental Hospital (Teaching) - Peradeniya");
		headerChunk1.setUnderline(1.2f, -6.0f);
		Paragraph headerLine1 = new Paragraph(headerChunk1);
		headerChunk1.setFont(PdfFont.FontHeader);
		headerLine1.setAlignment(Element.ALIGN_CENTER);
		document.add(headerLine1);

		Chunk headerChunk2 = new Chunk("Patient Diagnostic Report");
		headerChunk2.setUnderline(1.2f, -6.0f);
		Paragraph headerLine2 = new Paragraph(headerChunk2);
		headerChunk2.setFont(PdfFont.FontHeader);
		headerLine2.setAlignment(Element.ALIGN_CENTER);
		document.add(headerLine2);
		
		Paragraph gap = new Paragraph();
		gap.setSpacingBefore(5);
		document.add(gap);
		document.add(gap);
		
		LineSeparator ls = new LineSeparator();
		ls.setLineColor(new BaseColor(200, 200, 200));

		document.add(ls);
		
		
		gap.setSpacingBefore(5);
		document.add(gap);
		
		document.add(patientHeader());
		
		//document.add(gap);

		prepareTables(document);

		document.close();

		return baosPDF;
	}
	
	public PdfPTable patientHeader() throws DocumentException, IOException{
		
		PdfPTable table = new PdfPTable(5);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
		
		if(patientDiagnosticWrapper.getPatient().getPrintName()!=null ) {
			PdfPCell patientName = createCellValue("Name:"+patientDiagnosticWrapper.getPatient().getPrintName(), PdfFont.Level2Value);		
			patientName.setColspan(2);
			table.addCell(patientName);
		}

		table.addCell("");
		
		if(patientDiagnosticWrapper.getPatient().getSerialNumber() != null) {
			PdfPCell patientSerialNumber = createCellValue("Serial:"+patientDiagnosticWrapper.getPatient().getSerialNumber(), PdfFont.Level2Value);
			table.addCell(patientSerialNumber);
			table.addCell(createCellValue("Date:"+formattedDate, PdfFont.Level3Header));			
		}

		return table;
	}

	
	//all tables included here
	public void prepareTables(Document document) throws DocumentException, IOException {

		//document.add(createDateAndBarCode());
		Paragraph gap = new Paragraph();
		gap.setSpacingBefore(5);
		document.add(gap);

		LineSeparator ls = new LineSeparator();
		ls.setLineColor(new BaseColor(200, 200, 200));

		//document.add(ls);
		//gap.setSpacingBefore(5);
		//document.add(gap);
		
		document.add(new Chunk(ls));
		document.add(createPatientDiagnosticComplaintTable());
		
		document.add(gap);
		document.add(new Chunk(ls));
		document.add(createPatientDiagnosticDentalHistoryTable());
		document.add(gap);
		document.add(new Chunk(ls));
		
		//document.newPage();
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
		document.add(gap);
		document.add(new Chunk(ls));
		
		document.add(createInvestigationInformationTable());
		document.add(gap);
		
		document.add(createDrugHistoryInformationPhase1Table());

		document.add(gap);
		document.add(new Chunk(ls));

		if(this.patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs()!=null && this.patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs().size() != 0) {
			document.add(createDrugHistoryInformationPhase2Table());
		}

		document.add(gap);
		document.add(new Chunk(ls));

		
		
		document.add(createHabitsInformationTable());
		document.add(gap);
		document.add(createHabitsSmokingInformationTable());
		document.add(gap);
		document.add(createHabits2AlcoholInformationTable());
		document.add(gap);
		document.add(createHabits2ParafunctionalInformationTable());
		
		document.add(gap);
		document.add(new Chunk(ls));

		document.add(createBrushingHabitsInformationTable());
	
		document.add(gap);
		document.add(new Chunk(ls));

		document.add(createDietaryHabitsInformationTable());
		document.add(new Chunk(ls));
	}
	
	
	
	public PdfPTable createPatientDiagnosticComplaintTable() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(5);       
	  
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		PdfPCell complaintCell = createCellValue("Complaint", PdfFont.Level1Header);
		complaintCell.setColspan(5);
		table.addCell(complaintCell);
		
		if(patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaint()!=null && !patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaint().isEmpty()) {
			table.addCell(createCellValue("Complaint:", PdfFont.Level3Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaint(), PdfFont.Level3Value));
		}
		
		if (patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaintType() != null && !patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaintType().isEmpty()) {
			table.addCell(createCellValue("Complaint Type:", PdfFont.Level3Header));
			PdfPCell complaintTypeCell = createCellValue(patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaintType(), PdfFont.Level3Value);
			complaintTypeCell.setColspan(5);
			table.addCell(complaintTypeCell);			
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaintHistory()!=null && !patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaintHistory().isEmpty()) {
			table.addCell(createCellValue("Complaint History:", PdfFont.Level3Header));
			PdfPCell complaintHistoryCell = createCellValue(patientDiagnosticWrapper.getPatientDiagnosticComplaint().getComplaintHistory(), PdfFont.Level3Value);
			complaintHistoryCell.setColspan(5);
			table.addCell(complaintHistoryCell);
		}	
		return table;

	}
	
	
	public PdfPTable createPatientDiagnosticDentalHistoryTable() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(5);
		//table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		PdfPCell dentalHistoryCell = createCellValue("Dental History", PdfFont.Level1Header);
		dentalHistoryCell.setColspan(5);
		table.addCell(dentalHistoryCell);
		
		if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getExtraction()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getExtraction().equals("Yes")){
			PdfPCell cell1=createCellValue("Extraction:", PdfFont.Level2Header);
			table.addCell(cell1);
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getExtraction(), PdfFont.Level2Value));
			//PdfPCell extractionCell =createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getExtraction(), PdfFont.Level2Value);
			//table.addCell(extractionCell);
			table.addCell("");
			table.addCell("");
			table.addCell("");
		
			PdfPCell extractionComplicationsCell_label=createCellValue("Extraction Complications Type:", PdfFont.Level2Header);
			extractionComplicationsCell_label.setColspan(2);
			table.addCell(extractionComplicationsCell_label);
			
			if (patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getExtractionComplicationsType()!=null) {
				PdfPCell extractionComplicationsCell = createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getExtractionComplicationsType(), PdfFont.Level2Value);
				extractionComplicationsCell.setColspan(3);
				table.addCell(extractionComplicationsCell);				
			} else {	
				table.addCell("");
				table.addCell("");
				table.addCell("");
			}

		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOralSurgery()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOralSurgery().equals("Yes")) {
			PdfPCell oralSurgery_label=createCellValue("Other Minor/Major Oral Surgery:", PdfFont.Level2Header);
			oralSurgery_label.setColspan(2);
			table.addCell(oralSurgery_label);
			PdfPCell oralSurgery=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOralSurgery(), PdfFont.Level2Value);
			oralSurgery.setColspan(3);
			table.addCell(oralSurgery);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRx()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRx().equals("Yes")) {
			PdfPCell periodontalRxCell_label = createCellValue("Periodontal Rx:", PdfFont.Level2Header);
			periodontalRxCell_label.setColspan(5);
			table.addCell(periodontalRxCell_label);

			//not null checked try catch added


			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxScaling()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxScaling().equals("true")) {
				PdfPCell cell_scalingValue=createCellValue("Scaling",PdfFont.Level3Header);
				table.addCell("");
				cell_scalingValue.setColspan(4);
				table.addCell(cell_scalingValue);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxRootdebriment()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxRootdebriment().equals("true")) {
				PdfPCell cell_rootDebrimentValue=createCellValue("Root Debriment",PdfFont.Level3Header);
				table.addCell("");
				cell_rootDebrimentValue.setColspan(4);
				table.addCell(cell_rootDebrimentValue);
			}
			
			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxSurgical()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxSurgical().equals("true")) {
				PdfPCell cell_surgicalValue=createCellValue("Surgical Perio Rx",PdfFont.Level3Header);
				table.addCell("");
				cell_surgicalValue.setColspan(4);
				table.addCell(cell_surgicalValue);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxMaintenance()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getPeriodontalRxMaintenance().equals("true")) {
				PdfPCell cell_maintenanceValue=createCellValue("Maintenance",PdfFont.Level3Header);
				table.addCell("");
				cell_maintenanceValue.setColspan(4);
				table.addCell(cell_maintenanceValue);
			}
						

		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatment()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatment().equals("Yes")) {
			PdfPCell orthodontic_label=createCellValue("Orthodontic Treatment:", PdfFont.Level2Header);
			orthodontic_label.setColspan(5);
			table.addCell(orthodontic_label);

			//not null checked

			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentFixed().equalsIgnoreCase("true")|| patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentFunctional().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentRemovable().equalsIgnoreCase("true")) {
				if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentFixed().equalsIgnoreCase("true")) {
					PdfPCell cell_fixedValue=createCellValue("Fixed",PdfFont.Level3Header);
					table.addCell("");
					cell_fixedValue.setColspan(4);
					table.addCell(cell_fixedValue);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentFunctional().equalsIgnoreCase("true")) {
					PdfPCell cell_functionalValue=createCellValue("Functional",PdfFont.Level3Header);
					table.addCell("");
					cell_functionalValue.setColspan(4);
					table.addCell(cell_functionalValue);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentRemovable().equalsIgnoreCase("true")) {
					PdfPCell cell_removableValue=createCellValue("Removable",PdfFont.Level3Header);
					table.addCell("");
					cell_removableValue.setColspan(4);
					table.addCell(cell_removableValue);
				}
			}				

			
			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentComplications()!=null && !patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentComplications().isEmpty()) {
				PdfPCell orthodonticTreatmentComplications_label =createCellValue("Orthodontic Treatment Complications:", PdfFont.Level2Header);
				orthodonticTreatmentComplications_label.setColspan(2);
				table.addCell(orthodonticTreatmentComplications_label);
				table.addCell("");
				PdfPCell orthodonticTreatment=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getOrthodonticTreatmentComplications(), PdfFont.Level2Value);
				orthodonticTreatment.setColspan(2);
				table.addCell(orthodonticTreatment);
			}
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRx()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRx().equals("Yes")) {
			PdfPCell restorative_label=createCellValue("Restorative Rx/Prosthesis:", PdfFont.Level2Header);
//			table.addCell("");
//			table.addCell("");
			restorative_label.setColspan(5);
			table.addCell(restorative_label);
			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxEndodontics().equals("true") || patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxFixedprosthesis().equals("true") || patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxRemovableprosthesis().equals("true") || patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxRestorations().equals("true")) {
				if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxEndodontics() != null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxEndodontics().equals("true")) {
					PdfPCell cell_endodonticsValue=createCellValue("Endodontics",PdfFont.Level3Header);
					table.addCell("");
					cell_endodonticsValue.setColspan(4);
					table.addCell(cell_endodonticsValue);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxFixedprosthesis()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxFixedprosthesis().equals("true")) {
					PdfPCell cell_fixedprosthesisValue=createCellValue("Fixed Prosthesis",PdfFont.Level3Header);
					table.addCell("");
					cell_fixedprosthesisValue.setColspan(4);
					table.addCell(cell_fixedprosthesisValue);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxRemovableprosthesis()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxRemovableprosthesis().equals("true")) {
					PdfPCell cell_removableprosthesisValue=createCellValue("Removable Prosthesis",PdfFont.Level3Header);
					table.addCell("");
					cell_removableprosthesisValue.setColspan(4);
					table.addCell(cell_removableprosthesisValue);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxRestorations()!=null && patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxRestorations().equals("true")) {
					PdfPCell cell_restorationsValue=createCellValue("Restorations",PdfFont.Level3Header);
					table.addCell("");
					cell_restorationsValue.setColspan(4);
					table.addCell(cell_restorationsValue);
				}
			}
			
			if(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxComplications()!=null && !patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxComplications().isEmpty()) {
				PdfPCell restorativeRxComplications_label=createCellValue("Restorative Rx Complications:", PdfFont.Level2Header);
				restorativeRxComplications_label.setColspan(2);
				table.addCell(restorativeRxComplications_label);
				PdfPCell restorativeRxComplications=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory().getRestorativeRxComplications(), PdfFont.Level2Value);
				restorativeRxComplications.setColspan(3);
				table.addCell(restorativeRxComplications);
			}
		}

		return table;

	}
	
	public PdfPTable createPatientDiagnosticMedicalRecord1Table() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(5);
		//table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		
		PdfPCell medicalRecord1Cell = createCellValue("Allergies", PdfFont.Level1Header);
		medicalRecord1Cell.setColspan(5);
		table.addCell(medicalRecord1Cell);
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAnaemia()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAnaemia().equals("Yes")) {
			table.addCell(createCellValue("Anaemia:", PdfFont.Level2Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAnaemia(), PdfFont.Level2Value));
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAsthma()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAsthma().equals("Yes")) {
			PdfPCell AsthmaCell_label =createCellValue("Asthma:", PdfFont.Level2Header);
			AsthmaCell_label.setColspan(2);
			table.addCell(AsthmaCell_label);
			PdfPCell AsthmaCell =createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAsthma(), PdfFont.Level2Value);
			AsthmaCell.setColspan(1);
			table.addCell(AsthmaCell);
		}

		try {
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getDrugPenicillin().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getDrugParacetamol().equalsIgnoreCase("true")|| patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getDrugNsaids().equalsIgnoreCase("true")) {
				PdfPCell drugallergies_label=createCellValue("Drug Allergies:", PdfFont.Level2Header);
				drugallergies_label.setColspan(5);
				table.addCell(drugallergies_label);
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getDrugPenicillin().equals("true")) {
					PdfPCell penicillinCell_label = createCellValue("Penicillin/Amoxicillin", PdfFont.Level3Header);
					table.addCell("");
					penicillinCell_label.setColspan(4);
					table.addCell(penicillinCell_label);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getDrugParacetamol().equals("true")) {
					PdfPCell paracetamolCell_label = createCellValue("Paracetamol", PdfFont.Level3Header);
					table.addCell("");
					paracetamolCell_label.setColspan(4);
					table.addCell(paracetamolCell_label);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getDrugNsaids().equals("true")) {
					PdfPCell nsaidsCell_label = createCellValue("NSAIDS", PdfFont.Level3Header);
					table.addCell("");
					nsaidsCell_label.setColspan(4);
					table.addCell(nsaidsCell_label);
				}
				
			}			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAllergiesOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAllergiesOther().isEmpty()) {
			PdfPCell otherDrug_label =createCellValue("Other Drug Allergies:", PdfFont.Level2Header);
			otherDrug_label.setColspan(2);
			table.addCell(otherDrug_label);
			PdfPCell otherDrug=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getDrugOther(), PdfFont.Level2Value);
			otherDrug.setColspan(1);
			table.addCell(otherDrug);
		}
		
		
		try {
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodPineapple().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodTomatoe().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodCannedfish().equalsIgnoreCase("true")) {
				PdfPCell foodallergies_label=createCellValue("Food Allergies:", PdfFont.Level2Header);
				table.addCell("");
				table.addCell("");
				foodallergies_label.setColspan(5);
				table.addCell(foodallergies_label);
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodPineapple().equalsIgnoreCase("true")) {
					PdfPCell pineappleCell_label = createCellValue("Pineapple", PdfFont.Level3Header);
					table.addCell("");
					pineappleCell_label.setColspan(4);
					table.addCell(pineappleCell_label);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodTomatoe().equalsIgnoreCase("true")) {
					PdfPCell tomatoeCell_label = createCellValue("Tomatoe", PdfFont.Level3Header);
					table.addCell("");
					tomatoeCell_label.setColspan(4);
					table.addCell(tomatoeCell_label);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodCannedfish().equalsIgnoreCase("true")) {
					PdfPCell cannedfishCell_label = createCellValue("Canned Fish", PdfFont.Level3Header);
					table.addCell("");
					cannedfishCell_label.setColspan(4);
					table.addCell(cannedfishCell_label);
				}
			}			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodOther().isEmpty()) {
			PdfPCell otherFood_label=createCellValue("Other Food Allergies:", PdfFont.Level2Header);
			otherFood_label.setColspan(2);
			table.addCell(otherFood_label);
			PdfPCell otherFood=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getFoodOther(), PdfFont.Level2Value);
			otherFood.setColspan(3);
			table.addCell(otherFood);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getLatexRubber()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getLatexRubber().equals("Yes")) {
			table.addCell(createCellValue("Latex/Rubber:", PdfFont.Level2Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getLatexRubber(), PdfFont.Level2Value));
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAllergiesOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAllergiesOther().isEmpty()) {
			PdfPCell otherAllergies_label=createCellValue("Other Allergies:", PdfFont.Level2Header);
			otherAllergies_label.setColspan(2);
			table.addCell(otherAllergies_label);
			PdfPCell otherAllergies=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1().getAllergiesOther(), PdfFont.Level2Value);
			otherAllergies.setColspan(1);
			table.addCell(otherAllergies);
		}
		return table;

	}
	
	
	
	
	
	public PdfPTable createPatientDiagnosticMedicalRecord2Table() throws DocumentException, IOException {
		PdfPTable table = new PdfPTable(5);
		//table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		
		PdfPCell medicalRecord2Cell = createCellValue("Medical Record(B-E)", PdfFont.Level1Header);
		medicalRecord2Cell.setColspan(5);
		table.addCell(medicalRecord2Cell);
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getHeamophilia()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getHeamophilia().equals("true")) {
			PdfPCell heamophilia_label =createCellValue("Bleeding disorders: ", PdfFont.Level2Header);
			heamophilia_label.setColspan(2);
			table.addCell(heamophilia_label);
			PdfPCell heamophilia =createCellValue("heamophilia", PdfFont.Level2Value);
			heamophilia.setColspan(3);
			table.addCell(heamophilia);
			}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getBleedingDisordersOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getBleedingDisordersOther().isEmpty()) {
			PdfPCell AsthmaCell_label =createCellValue("Other Bleeding disorders:", PdfFont.Level2Header);
			AsthmaCell_label.setColspan(2);
			table.addCell(AsthmaCell_label);
			PdfPCell AsthmaCell =createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getBleedingDisordersOther(), PdfFont.Level2Value);
			AsthmaCell.setColspan(2);
			table.addCell(AsthmaCell);
		}
		
		try {
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersAngina().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersCarditis().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersAngina().equalsIgnoreCase("true")) {
				PdfPCell cardiacdisorders_label =createCellValue("Cardiac disorders:", PdfFont.Level2Header);
				table.addCell("");
				cardiacdisorders_label.setColspan(5);
				table.addCell(cardiacdisorders_label);
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersAngina().equalsIgnoreCase("true")) {
					PdfPCell anginaCell = createCellValue("Angina", PdfFont.Level3Header);
					table.addCell("");
					anginaCell.setColspan(4);
					table.addCell(anginaCell);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersCarditis().equalsIgnoreCase("true")) {
					PdfPCell rheumaticCell = createCellValue("Rheumatic carditis", PdfFont.Level3Header);
					table.addCell("");
					rheumaticCell.setColspan(4);
					table.addCell(rheumaticCell);
				}
				if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersAngina().equalsIgnoreCase("true")) {
					PdfPCell valvularCell = createCellValue("Valvular problems", PdfFont.Level3Header);
					table.addCell("");
					valvularCell.setColspan(4);
					table.addCell(valvularCell);
				}
			}			
		} catch (NullPointerException e) {
			e.printStackTrace();
		}		

		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getAnginaOther()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersAngina().equals("true")  && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getAnginaOther().isEmpty()) {
			PdfPCell angina_label =createCellValue("Angina Comments:", PdfFont.Level2Header);
			angina_label.setColspan(2);
			table.addCell(angina_label);
			PdfPCell angina=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getAnginaOther(), PdfFont.Level2Value);
			angina.setColspan(3);
			table.addCell(angina);
		}
		

		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getOralPenicillin()!= null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getOralPenicillin().equalsIgnoreCase("true") && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersCarditis()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersCarditis().equalsIgnoreCase("true")) {
			PdfPCell oralpenicillin_label =createCellValue("Regular Oral Penicillin:", PdfFont.Level2Header);
			oralpenicillin_label.setColspan(2);
			table.addCell(oralpenicillin_label);
			PdfPCell oralpenicillin=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getOralPenicillin(), PdfFont.Level2Value);
			oralpenicillin.setColspan(3);
			table.addCell(oralpenicillin);
		}			

		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersValvular()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersValvular().equals("true")) {
			PdfPCell valvularcomments_label =createCellValue("Valvular Comments:", PdfFont.Level2Header);
			valvularcomments_label.setColspan(2);
			table.addCell(valvularcomments_label);
			if (patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getValvularOther()!=null &&  !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getValvularOther().isEmpty()) {
				PdfPCell valvularcomments=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getValvularOther(), PdfFont.Level2Value);
				valvularcomments.setColspan(3);
				table.addCell(valvularcomments);				
			}

			
			PdfPCell sabeprophylaxis_label =createCellValue("Indication of SABE Prophylaxis:", PdfFont.Level2Header);
			sabeprophylaxis_label.setColspan(2);
			table.addCell(sabeprophylaxis_label);
			if (patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getSabeProphylaxis()!=null &&  !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getSabeProphylaxis().isEmpty()) {
				PdfPCell sabeprophylaxis=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getSabeProphylaxis(), PdfFont.Level2Value);
				sabeprophylaxis.setColspan(3);
				table.addCell(sabeprophylaxis);				
			}

		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getPacemaker()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getPacemaker().equals("Yes")) {
			table.addCell(createCellValue("Pacemaker:", PdfFont.Level2Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getPacemaker(), PdfFont.Level2Value));
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getProstheticHeartValve()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getProstheticHeartValve().equals("Yes")) {
			PdfPCell prostheticvalve_label =createCellValue("Prosthetic heart valve:", PdfFont.Level2Header);
			prostheticvalve_label.setColspan(2);
			table.addCell(prostheticvalve_label);
			PdfPCell prostheticvalve=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getProstheticHeartValve(), PdfFont.Level2Value);
			prostheticvalve.setColspan(3);
			table.addCell(prostheticvalve);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersOther().isEmpty()) {
			PdfPCell othercardiac_label =createCellValue("Other Cardiac disorders:", PdfFont.Level2Header);
			othercardiac_label.setColspan(2);
			table.addCell(othercardiac_label);
			PdfPCell othercardiac=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getCardiacDisordersOther(), PdfFont.Level2Value);
			othercardiac.setColspan(3);
			table.addCell(othercardiac);
		}
		


		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getDevelopmentalCleftlip().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getDevelopmentalCerebral().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getDevelopmentalSyndromic().equalsIgnoreCase("true")) {
			PdfPCell developmental_label =createCellValue("Developmental:", PdfFont.Level2Header);
			developmental_label.setColspan(5);
			table.addCell(developmental_label);
	
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getDevelopmentalCleftlip().equalsIgnoreCase("true")) {
				PdfPCell cleftlipCell = createCellValue("Cleft Lip/Palate", PdfFont.Level3Header);
				table.addCell("");
				cleftlipCell.setColspan(4);
				table.addCell(cleftlipCell);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getDevelopmentalCerebral().equalsIgnoreCase("true")) {
				PdfPCell cerebralCell = createCellValue("Cerebral Palsy", PdfFont.Level3Header);
				table.addCell("");
				cerebralCell.setColspan(4);
				table.addCell(cerebralCell);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getDevelopmentalSyndromic().equalsIgnoreCase("true")) {
				PdfPCell syndromicCell = createCellValue("Syndromic", PdfFont.Level3Header);
				table.addCell("");
				syndromicCell.setColspan(4);
				table.addCell(syndromicCell);
			}
		}			

		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getEndocrineDiabetes()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getEndocrineDiabetes().equals("true")) {
			PdfPCell endocrine_label=createCellValue("Endocrine: ", PdfFont.Level2Header);
			endocrine_label.setColspan(2);
			table.addCell(endocrine_label);
			PdfPCell endocrine=createCellValue("diabetes", PdfFont.Level3Header);
			endocrine.setColspan(3);
			table.addCell(endocrine);
		}
		
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getEpilepsy()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getEpilepsy().equals("Yes")) {
			PdfPCell epilepsy_label=createCellValue("Epilepsy:", PdfFont.Level2Header);
			epilepsy_label.setColspan(2);
			table.addCell(epilepsy_label);
			PdfPCell epilepsy=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2().getEpilepsy(), PdfFont.Level2Value);
			epilepsy.setColspan(3);
			table.addCell(epilepsy);
		}
		
		return table;

	}
	
	public PdfPTable createPatientDiagnosticMedicalRecord3Table() throws DocumentException, IOException {
		PdfPTable table = new PdfPTable(5);
		//table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		
		PdfPCell medicalRecord3Cell = createCellValue("Medical Record(G-N)", PdfFont.Level1Header);
		medicalRecord3Cell.setColspan(5);
		table.addCell(medicalRecord3Cell);
		

		PdfPCell gastrointestinal_label=createCellValue("Gastro-intestinal disorders:", PdfFont.Level2Header);
		gastrointestinal_label.setColspan(5);
		table.addCell(gastrointestinal_label);

		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalGastricreflux() !=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalGastricreflux().equals("true")) {
			PdfPCell gastrorefluxCell = createCellValue("Gastric reflux", PdfFont.Level3Header);
			table.addCell("");
			gastrorefluxCell.setColspan(4);
			table.addCell(gastrorefluxCell);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalUlcers()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalUlcers().equals("true")) {
			PdfPCell ulcersCell = createCellValue("Ulcers", PdfFont.Level3Header);
			table.addCell("");
			ulcersCell.setColspan(4);
			table.addCell(ulcersCell);
		}
		
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalOther().equalsIgnoreCase("true") && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalOtherComments()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalOtherComments().isEmpty()) {
			PdfPCell gastroIntesinal_label =createCellValue("Other Gastro-intestinal disorders:", PdfFont.Level2Header);
			gastroIntesinal_label.setColspan(2);
			table.addCell(gastroIntesinal_label);
			PdfPCell gastroIntesinal =createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getGastroIntestinalOtherComments(), PdfFont.Level2Value);
			gastroIntesinal.setColspan(2);
			table.addCell(gastroIntesinal);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisA().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisB().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisC().equalsIgnoreCase("true")) {
			PdfPCell hepatitis_label =createCellValue("Hepatitis:", PdfFont.Level2Header);
			table.addCell("");
			hepatitis_label.setColspan(5);
			table.addCell(hepatitis_label);
			
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisA()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisA().equals("true")) {
				PdfPCell hepa = createCellValue("Hep A", PdfFont.Level3Header);
				table.addCell("");
				hepa.setColspan(4);
				table.addCell(hepa);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisB()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisB().equals("true")) {
				PdfPCell hepb = createCellValue("Hep B", PdfFont.Level3Header);
				table.addCell("");
				hepb.setColspan(4);
				table.addCell(hepb);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisC()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisC().equals("true")) {
				PdfPCell hepc = createCellValue("Hep C", PdfFont.Level3Header);
				table.addCell("");
				hepc.setColspan(4);
				table.addCell(hepc);
			}
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisOther().equalsIgnoreCase("true") && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisOtherComments()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisOtherComments().isEmpty()) {
			PdfPCell hepatitisother_label =createCellValue("Other Hepatits disorders:", PdfFont.Level2Header);
			hepatitisother_label.setColspan(2);
			table.addCell(hepatitisother_label);
			PdfPCell hepatitisother=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHepatitisOtherComments(), PdfFont.Level2Value);
			hepatitisother.setColspan(1);
			table.addCell(hepatitisother);
			
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHiv()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHiv().equals("true")) {
			PdfPCell hiv = createCellValue("HIV", PdfFont.Level2Header);
			table.addCell("");
			table.addCell("");
			hiv.setColspan(5);
			table.addCell(hiv);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHypertension()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getHypertension().equals("true")) {
			PdfPCell hypertension = createCellValue("Hypertension", PdfFont.Level2Header);
			hypertension.setColspan(5);
			table.addCell(hypertension);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getLiverDisorders()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getLiverDisorders().equals("true")) {
			PdfPCell liverdisorders = createCellValue("Liver disorders", PdfFont.Level2Header);
			liverdisorders.setColspan(5);
			table.addCell(liverdisorders);
		}
	
	
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalArthritis().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalJointreplacement().equalsIgnoreCase("true")) {
			PdfPCell musculoskeletal_label =createCellValue("Musculo-skeletal disorders:", PdfFont.Level2Header);
			musculoskeletal_label.setColspan(5);
			table.addCell(musculoskeletal_label);
	
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalArthritis()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalArthritis().equals("true")) {
				PdfPCell arthritis = createCellValue("Arthritis", PdfFont.Level3Header);
				table.addCell("");
				arthritis.setColspan(4);
				table.addCell(arthritis);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalJointreplacement()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalJointreplacement().equals("true")) {
				PdfPCell jointreplacement = createCellValue("Joint Replacement", PdfFont.Level3Header);
				table.addCell("");
				jointreplacement.setColspan(4);
				table.addCell(jointreplacement);
			}
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalOther().equalsIgnoreCase("true") && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalOtherComments()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalOtherComments().isEmpty()) {
			PdfPCell musculoskeletalother_label =createCellValue("Other Musculo-skeletal disorders:", PdfFont.Level2Header);
			musculoskeletalother_label.setColspan(2);
			table.addCell(musculoskeletalother_label);
			PdfPCell musculoskeletalother=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getMusculoSkeletalOtherComments(), PdfFont.Level2Value);
			musculoskeletalother.setColspan(2);
			table.addCell(musculoskeletalother);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getNeurologicalDisordersMigraine().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getNeurologicalDisordersNeuralgic().equals("true")) {
			PdfPCell neurologicaldisorders_label =createCellValue("Neurological disorders:", PdfFont.Level2Header);
			table.addCell("");
			neurologicaldisorders_label.setColspan(5);
			table.addCell(neurologicaldisorders_label);
			
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getNeurologicalDisordersMigraine().equalsIgnoreCase("true")) {
				PdfPCell migraineCell = createCellValue("Migraine", PdfFont.Level3Header);
				table.addCell("");
				migraineCell.setColspan(4);
				table.addCell(migraineCell);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3().getNeurologicalDisordersNeuralgic().equalsIgnoreCase("true")) {
				PdfPCell neuralgicCell = createCellValue("Migraine", PdfFont.Level3Header);
				table.addCell("");
				neuralgicCell.setColspan(4);
				table.addCell(neuralgicCell);
			}
		}
		
		return table;
	}
	
	private PdfPTable createPatientDiagnosticMedicalRecord4Table() throws DocumentException, IOException {
		PdfPTable table = new PdfPTable(5);
		//table.setWidths(new float[] { 0.5f, 2, 3, 2, 1 });
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		
		PdfPCell medicalRecord4Cell = createCellValue("Medical Record(P-T)", PdfFont.Level1Header);
		medicalRecord4Cell.setColspan(5);
		table.addCell(medicalRecord4Cell);
		

		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getPregnancy()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getPregnancy().isEmpty()) {
			table.addCell(createCellValue("Pregnancy:", PdfFont.Level2Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getPregnancy(), PdfFont.Level2Value));
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getOnHormonalContraceptives()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getOnHormonalContraceptives().isEmpty()) {
			PdfPCell hormonalcontraceptives_label =createCellValue("On hormonal contraceptives:", PdfFont.Level2Header);
			hormonalcontraceptives_label.setColspan(2);
			table.addCell(hormonalcontraceptives_label);
			PdfPCell hormonalcontraceptives =createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getOnHormonalContraceptives(), PdfFont.Level2Value);
			hormonalcontraceptives.setColspan(2);
			table.addCell(hormonalcontraceptives);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getBehaviouralDisorders()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getBehaviouralDisorders().equalsIgnoreCase("Yes") ){
			PdfPCell psychiatricdisorders_label =createCellValue("Psychiatric/Behavioral disorders:", PdfFont.Level2Header);
			psychiatricdisorders_label.setColspan(2);
			table.addCell(psychiatricdisorders_label);
			PdfPCell psychiatricdisorders=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getBehaviouralDisorders(), PdfFont.Level2Value);
			psychiatricdisorders.setColspan(3);
			table.addCell(psychiatricdisorders);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersChronicinfections().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersKidneyfailure().equalsIgnoreCase("true") || patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersTransplant().equalsIgnoreCase("true")) {
			PdfPCell renaldisorders_label =createCellValue("Renal disorders:", PdfFont.Level2Header);
			renaldisorders_label.setColspan(5);
			table.addCell(renaldisorders_label);
	
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersChronicinfections()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersChronicinfections().equals("true")) {
				PdfPCell chronicinfections = createCellValue("Chronic infections", PdfFont.Level3Header);
				table.addCell("");
				chronicinfections.setColspan(4);
				table.addCell(chronicinfections);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersKidneyfailure()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersKidneyfailure().equals("true")) {
				PdfPCell kidneyfailure = createCellValue("Kidney failure", PdfFont.Level3Header);
				table.addCell("");
				kidneyfailure.setColspan(4);
				table.addCell(kidneyfailure);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersTransplant()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersTransplant().equals("true")) {
				PdfPCell transplant = createCellValue("Transplant", PdfFont.Level3Header);
				table.addCell("");
				transplant.setColspan(4);
				table.addCell(transplant);
			}
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersOther().isEmpty()) {
			PdfPCell renaldisordersother_label =createCellValue("Other Renal disorders:", PdfFont.Level2Header);
			renaldisordersother_label.setColspan(2);
			table.addCell(renaldisordersother_label);
			PdfPCell renaldisordersother=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getRenalDisordersOther(), PdfFont.Level2Value);
			renaldisordersother.setColspan(3);
			table.addCell(renaldisordersother);
		}
		
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getTmd()!=null && patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getTmd().equals("Yes")) {
				table.addCell(createCellValue("TMD:", PdfFont.Level2Header));
				table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getTmd(), PdfFont.Level2Value));
			
			if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getTmdOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getTmdOther().isEmpty()) {
				PdfPCell tmdcomments_label =createCellValue("TMD Comments:", PdfFont.Level2Header);
				tmdcomments_label.setColspan(1);
				table.addCell(tmdcomments_label);
				PdfPCell tmdcomments=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getTmdOther(), PdfFont.Level2Value);
				tmdcomments.setColspan(2);
				table.addCell(tmdcomments);
			}
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getOtherComments()!=null && !patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getOtherComments().isEmpty()) {
			PdfPCell comments_label =createCellValue("Comments:", PdfFont.Level2Header);
			comments_label.setColspan(2);
			table.addCell(comments_label);
			PdfPCell comments=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4().getOtherComments(), PdfFont.Level2Value);
			comments.setColspan(2);
			table.addCell(comments);
		}
				
		return table;
	}
	
	
	
	
	

	public PdfPTable createDietaryHabitsInformationTable() {

		PdfPTable table = new PdfPTable(3);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
		PdfPCell cell = createCellValue("Dietary Habits", PdfFont.Level1Header);
		cell.setColspan(3);
		table.addCell(cell);
		
		PdfPCell cell_sugar = createCellValue("Sugar consumption", PdfFont.Level3Header);
		table.addCell(cell_sugar);
		if (patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getSugarConsumption()!=null) {
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getSugarConsumption(),PdfFont.Level3Value));
			table.addCell("");			
		}

		
		if(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getBeverageCarbonic()!=null || patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getBeverageFruit()!=null ) {
			table.addCell(createCellValue("Consumption of beverages:", PdfFont.Level3Header));
			
			if(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getBeverageCarbonic()!=null && patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getBeverageCarbonic().equals("true")) {
				table.addCell(createCellValue("Carbonic drinks", PdfFont.Level3Header));
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getBeverageFruit()!=null && patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getBeverageFruit().equals("true")) {
				table.addCell(createCellValue("Fruit juice", PdfFont.Level3Value));
			}
			
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getOther().isEmpty()) {
			table.addCell(createCellValue("Other:", PdfFont.Level3Header));
			PdfPCell cell_other = createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getOther(), PdfFont.Level3Value);
			cell_other.setColspan(2);
			table.addCell(cell_other);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getEmployment()!=null && !patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getEmployment().isEmpty()) {
			table.addCell(createCellValue("Employment:", PdfFont.Level3Header));
			PdfPCell cell_emp = createCellValue(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits().getEmployment(), PdfFont.Level3Value);
			cell_emp.setColspan(2);
			table.addCell(cell_emp);
		}	
		return table;
	}

	
	public PdfPTable createBrushingHabitsInformationTable() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(4);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
		PdfPCell cell = createCellValue("Brushing Habits", PdfFont.Level1Header);
		cell.setColspan(4);
		table.addCell(cell);
		
		table.addCell(createCellValue("Brushing Tool:", PdfFont.Level3Header));
		if (patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits()!=null) {
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingTool(),PdfFont.Level3Value));			
		}

		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingToolOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingToolOther().isEmpty()) {	
			table.addCell(createCellValue("Other Brushing Tools:", PdfFont.Level3Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingToolOther(),PdfFont.Level3Value));
		}
		
		table.addCell(createCellValue("Toothpaste Type:", PdfFont.Level3Header));
		
		if (patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getToothpaste()!=null) {
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getToothpaste(),PdfFont.Level3Value));			
		}

		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getToothpasteOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getToothpasteOther().isEmpty()) {
			table.addCell(createCellValue("Other Toothpaste Type:", PdfFont.Level3Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getToothpasteOther(),PdfFont.Level3Value));
		}
		
		if (patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingFrequency()!=null) {
			table.addCell(createCellValue("Brushing Frequency:", PdfFont.Level3Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingFrequency(),PdfFont.Level3Value));				
		}
		
		if (patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBristles()!=null) {
			table.addCell(createCellValue("Bristles Type:", PdfFont.Level3Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBristles(),PdfFont.Level3Value));			
		}

		if (patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingDuration()!=null) {
			table.addCell(createCellValue("Duration of Brushing:", PdfFont.Level3Header));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getBrushingDuration(),PdfFont.Level3Value));
			table.addCell("");
			table.addCell("");			
		}

		
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementNone().equals("true") ||patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementFloss().equals("true") ||patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementBottleBrushes().equals("true")||patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementSingleTuft().equals("true") || patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementWoodpicks().equals("true") ||patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementIrrigators().equals("true")) {
			
			PdfPCell cell_aids=createCellValue("Supplementary Cleaning Aids:", PdfFont.Level3Header);
			cell_aids.setColspan(4);
			table.addCell(cell_aids);
		}
		
		
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementNone()!=null && patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementNone().equals("true")) {
			PdfPCell cell_item=createCellValue("None", PdfFont.Level3Value);
			table.addCell("");
			cell_item.setColspan(3);
			table.addCell(cell_item);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementFloss() !=null && patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementFloss().equals("true")) {
			PdfPCell cell_item=createCellValue("Floss", PdfFont.Level3Value);
			table.addCell("");
			cell_item.setColspan(3);
			table.addCell(cell_item);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementBottleBrushes()!=null && patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementBottleBrushes().equals("true")) {
			PdfPCell cell_item=createCellValue("Bottle-brushes", PdfFont.Level3Value);
			table.addCell("");
			cell_item.setColspan(3);
			table.addCell(cell_item);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementSingleTuft()!=null && patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementSingleTuft().equals("true")) {
			PdfPCell cell_item=createCellValue("Single-tufted TB", PdfFont.Level3Value);
			table.addCell("");
			cell_item.setColspan(3);
			table.addCell(cell_item);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementWoodpicks()!=null && patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementWoodpicks().equals("true")) {
			PdfPCell cell_item=createCellValue("Wood picks", PdfFont.Level3Value);
			table.addCell("");
			cell_item.setColspan(3);
			table.addCell(cell_item);
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementIrrigators()!=null && patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementIrrigators().equals("true")) {
			PdfPCell cell_item=createCellValue("Irrigators", PdfFont.Level3Value);
			table.addCell("");
			cell_item.setColspan(3);
			table.addCell(cell_item);
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementOther().isEmpty()) {
			PdfPCell cell_other=createCellValue("Other supplementary cleaning aids:", PdfFont.Level3Header);
			cell_other.setColspan(4);
			table.addCell(cell_other);

			if (patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementOther()!=null && !patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementOther().isEmpty()) {
				PdfPCell cell_details=createCellValue(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits().getSupplementOther(),PdfFont.Level3Value);
				table.addCell("");
				cell_details.setColspan(3);
				table.addCell(cell_details);				
			}

		}
		
		
		
		
		
		return table;
	}
	
	public PdfPTable createHabits2ParafunctionalInformationTable() throws DocumentException, IOException{
	
		PdfPTable table = new PdfPTable(2);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
		PdfPCell cell = createCellValue("Parafunctional Habits", PdfFont.Level1Header);
		cell.setColspan(2);
		table.addCell(cell);
		
		if((patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBruxismDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBruxismDuration().isEmpty()) || (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalClenchingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalClenchingDuration().isEmpty()) || (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNailLipBitingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNailLipBitingDuration().isEmpty()) || (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBitingObjectsDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBitingObjectsDuration().isEmpty()) || (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalChewingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalChewingDuration().isEmpty()) || (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveFingerSuckingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveFingerSuckingDuration().isEmpty()) || (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveThumbSuckingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveThumbSuckingDuration().isEmpty()) || (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveDummySuckingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveDummySuckingDuration().isEmpty())) {
			table.addCell(createCellValue("Habit", PdfFont.Level2Header));
			table.addCell(createCellValue("Duartion", PdfFont.Level2Header));
		}
		
		
		
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBruxismDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBruxismDuration().isEmpty()) {
			table.addCell(createCellValue("Bruxism", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBruxismDuration(), PdfFont.Level3Value));
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalClenchingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalClenchingDuration().isEmpty()) {
			table.addCell(createCellValue("Clenching", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalClenchingDuration(), PdfFont.Level3Value));
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNailLipBitingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNailLipBitingDuration().isEmpty()) {
			table.addCell(createCellValue("Lip/finger nail biting", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNailLipBitingDuration(), PdfFont.Level3Value));
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBitingObjectsDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBitingObjectsDuration().isEmpty()) {
			table.addCell(createCellValue("Biting objects", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalBitingObjectsDuration(), PdfFont.Level3Value));
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalChewingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalChewingDuration().isEmpty()) {
			table.addCell(createCellValue("Unilateral chewing", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalChewingDuration(), PdfFont.Level3Value));
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveFingerSuckingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveFingerSuckingDuration().isEmpty()) {
			table.addCell(createCellValue("Finger Sucking", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveFingerSuckingDuration(), PdfFont.Level3Value));
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveThumbSuckingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveThumbSuckingDuration().isEmpty()) {
			table.addCell(createCellValue("Thumb Sucking", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveThumbSuckingDuration(), PdfFont.Level3Value));
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveDummySuckingDuration()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveDummySuckingDuration().isEmpty()) {
			table.addCell(createCellValue("Dummy Sucking", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getParafunctionalNonNutriveDummySuckingDuration(), PdfFont.Level3Value));
		}
		
		return table;
	
	}
	
	public PdfPTable createHabits2AlcoholInformationTable() throws DocumentException, IOException{
		PdfPTable table = new PdfPTable(3);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
			PdfPCell cell = createCellValue("Alcohol Status", PdfFont.Level1Header);
			cell.setColspan(3);
			table.addCell(cell);
			

			if (patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcohol()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcohol().isEmpty()) {
				table.addCell(createCellValue("Type:", PdfFont.Level3Header));
				table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcohol(), PdfFont.Level3Value));
				table.addCell("");
								
			}

			//table.addCell(createCellValue("Drinker Type", PdfFont.Level2Header));
			table.addCell("");
			table.addCell(createCellValue("Category", PdfFont.Level2Header));
			table.addCell(createCellValue("Duartion", PdfFont.Level2Header));
		
			
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholSpirits() !=null && patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholSpirits().equals("true")) {
			table.addCell("");
			table.addCell(createCellValue("Spirits", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholSpiritsDuration(), PdfFont.Level3Value));
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholWine()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholWine().equals("true")) {
			table.addCell("");
			table.addCell(createCellValue("Wine", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholWineDuration(), PdfFont.Level3Value));
		}
		
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholBeer()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholBeer().equals("true")) {
			table.addCell("");
			table.addCell(createCellValue("Beer", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholBeerDuration(), PdfFont.Level3Value));
		}
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholLocal()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholLocal().equals("true")) {
			table.addCell("");
			table.addCell(createCellValue("Local Brews", PdfFont.Level3Value));
			table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits2().getAlcoholLocalDuration(), PdfFont.Level3Value));
		}
		
		return table;
	}
	public PdfPTable createHabitsSmokingInformationTable() throws DocumentException, IOException{
		
		PdfPTable table = new PdfPTable(3);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
		
		
		if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmoking()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmoking().equals("Yes")) {
			PdfPCell cell = createCellValue("Smoking Status", PdfFont.Level1Header);
			cell.setColspan(3);
			table.addCell(cell);
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmoking()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmoking().equals("Yes")) {
				table.addCell(createCellValue("Category", PdfFont.Level2Header));
				table.addCell(createCellValue("Frequency", PdfFont.Level2Header));
				table.addCell(createCellValue("Duartion", PdfFont.Level2Header));
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarettes()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarettes().equals("true")) {
				table.addCell(createCellValue("Cigarettes", PdfFont.Level3Header));
				table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarettesFrequency(), PdfFont.Level3Value));
				table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarettesDuration(), PdfFont.Level3Value));
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigar()!= null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigar().equals("true")) {

				if (patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarFrequency()!=null) {
					table.addCell(createCellValue("Cigar", PdfFont.Level3Header));
					table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarFrequency(), PdfFont.Level3Value));					
				}
				
				if (patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarDuration()!=null) {
					table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingCigarDuration(), PdfFont.Level3Value));					
				}

			}
			
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingBeedi() != null ) {
				table.addCell(createCellValue("Beedi", PdfFont.Level3Header));
				if (patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingBeediFrequency()!=null && !patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingBeediFrequency().isEmpty()) {
					table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingBeediFrequency(), PdfFont.Level3Value));					
				}else {
					table.addCell("");
				}

				if (patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingBeediDuration()!= null && !patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingBeediDuration().isEmpty()) {
					table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingBeediDuration(), PdfFont.Level3Value));					
				}else {
					table.addCell("");
				}


			}
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingPipe()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingPipe().equals("true")) {
				table.addCell(createCellValue("Pipe", PdfFont.Level3Header));
				table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingPipeFrequency(), PdfFont.Level3Value));
				table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingPipeDuration(), PdfFont.Level3Value));
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingRollup()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingRollup().equals("true")) {
				table.addCell(createCellValue("Roll up", PdfFont.Level3Header));
				
				if (patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingRollupFrequency()!=null) {
					table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingRollupFrequency(), PdfFont.Level3Value));					
				}else {
					table.addCell("");
				}

				if (patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingRollupDuration()!=null) {
					table.addCell(createCellValue(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getSmokingRollupDuration(), PdfFont.Level3Value));					
				}else {
					table.addCell("");
				}

			}
		}
		
		return table;
	}
	
	
	public PdfPTable createHabitsInformationTable() throws DocumentException, IOException {
		
		PdfPTable table = new PdfPTable(6);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
		
			PdfPCell cell = createCellValue("Habits", PdfFont.Level1Header);
			cell.setColspan(6);
			table.addCell(cell);
			
			PdfPCell cell_ingredients = createCellValue("Betel quid ingredients:", PdfFont.Level3Header);
			cell_ingredients.setColspan(6);
			table.addCell(cell_ingredients);
		
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsBetel()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsBetel().equals("true")) {
				PdfPCell cell_betel=createCellValue("Betel", PdfFont.Level3Value);
				table.addCell("");
				cell_betel.setColspan(5);
				table.addCell(cell_betel);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsLime()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsLime().equals("true")) {
				//table.addCell(createCellValue("Lime", PdfFont.Level3Value));
				PdfPCell cell_lime=createCellValue("Lime", PdfFont.Level3Value);
				table.addCell("");
				cell_lime.setColspan(5);
				table.addCell(cell_lime);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsTobacco()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsTobacco().equals("true")) {
				//table.addCell(createCellValue("Tobacco", PdfFont.Level3Value));
				PdfPCell cell_tobacco=createCellValue("Tobacco", PdfFont.Level3Value);
				table.addCell("");
				cell_tobacco.setColspan(5);
				table.addCell(cell_tobacco);
			}
			
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsArecaProducts()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsArecaProducts().equals("true")){
				//table.addCell(createCellValue("Commercial Areca Products", PdfFont.Level3Value));
				PdfPCell cell_betel=createCellValue("Commercial Areca Products", PdfFont.Level3Value);
				table.addCell("");
				cell_betel.setColspan(5);
				table.addCell(cell_betel);
			}
			
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsArecanut()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsArecanut().equals("true")) {
				//table.addCell(createCellValue("Arecanut", PdfFont.Level3Value));
				PdfPCell cell_betel=createCellValue("Arecanut", PdfFont.Level3Value);
				table.addCell("");
				cell_betel.setColspan(5);
				table.addCell(cell_betel);
			}
			if(patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsTobaccoProducts()!=null && patientDiagnosticWrapper.getPatientDiagnosticHabits1().getBetelQuidIngredientsTobaccoProducts().equals("true")) {
				//table.addCell(createCellValue("Commercial Tobacco Products", PdfFont.Level3Value));
				PdfPCell cell_betel=createCellValue("Commercial Tobacco Products", PdfFont.Level3Value);
				table.addCell("");
				cell_betel.setColspan(5);
				table.addCell(cell_betel);
			}
		
		
		return table;
	}

	public PdfPTable createInvestigationInformationTable() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(2);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		PdfPCell cell = createCellValue("Investigations", PdfFont.Level1Header);
		cell.setColspan(2);
		table.addCell(cell);
		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getBloodPresure() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getBloodPresure().isEmpty()) {
			table.addCell(createCellValue("Blood Presure:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getBloodPresure(),
							PdfFont.Level3Value));

		}
		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getBloodPresureDate() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getBloodPresureDate().isEmpty()) {
			table.addCell(createCellValue("Date:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getBloodPresureDate(),
							PdfFont.Level3Value));
		}

		PdfPCell cell_haematological = createCellValue("Haematological", PdfFont.Level2Header);
		cell_haematological.setColspan(2);
		table.addCell(cell_haematological);

		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalBt() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalBt().isEmpty()) {
			table.addCell(createCellValue("Bleeding Time:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalBt(),
							PdfFont.Level3Value));
		}

		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalCt() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalCt().isEmpty()) {
			table.addCell(createCellValue("Clotting Time:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalCt(),
							PdfFont.Level3Value));
		}

		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalHba1c() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalHba1c().isEmpty()) {
			table.addCell(createCellValue("HBA1C:", PdfFont.Level3Header));
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalHba1c(),
					PdfFont.Level3Value));
		}
		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalInr() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalInr().isEmpty()) {
			table.addCell(createCellValue("INR:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalInr(),
							PdfFont.Level3Value));
		}

		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalFbs() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalFbs().isEmpty()) {
			table.addCell(createCellValue("FBS:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalFbs(),
							PdfFont.Level3Value));
		}
		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalFbc() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalFbc().isEmpty()) {
			table.addCell(createCellValue("FBC:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalFbc(),
							PdfFont.Level3Value));
		}

		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalSgpt() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalSgpt().isEmpty()) {
			table.addCell(createCellValue("SGPT:", PdfFont.Level3Header));
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalSgpt(),
					PdfFont.Level3Value));
		}
		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalHb() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalHb().isEmpty()) {
			table.addCell(createCellValue("Hb:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalHb(),
							PdfFont.Level3Value));
		}
		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalRbs() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalRbs().isEmpty()) {
			table.addCell(createCellValue("RBS:", PdfFont.Level3Header));
			table.addCell(
					createCellValue(patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalRbs(),
							PdfFont.Level3Value));
		}
		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalDate() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalDate().isEmpty()) {
			table.addCell(createCellValue("Haematological Date:", PdfFont.Level3Header));
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalDate(),
					PdfFont.Level3Value));
		}

		if (patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalComments() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalComments()
						.isEmpty()) {
			table.addCell(createCellValue("Comments:", PdfFont.Level3Header));
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticInvestigation().getHaematologicalComments(),
					PdfFont.Level3Value));
		}

		return table;
	}

	public PdfPTable createDrugHistoryInformationPhase2Table() throws DocumentException, IOException {
		
		PdfPTable table = new PdfPTable(5);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);
		
		PdfPCell cell = createCellValue("Drug Details", PdfFont.Level1Header);
		cell.setColspan(5);
		table.addCell(cell);
		
		table.addCell(createCellValue("Category Name", PdfFont.Level2Header));
		table.addCell(createCellValue("Drug Name", PdfFont.Level2Header));
		table.addCell(createCellValue("Dose", PdfFont.Level2Header));
		table.addCell(createCellValue("Frequency", PdfFont.Level2Header));
		table.addCell(createCellValue("Duartion", PdfFont.Level2Header));

		if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs() != null) {
			for (PatientDiagnosticDrug pdd : this.patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs()) {
				if (pdd.getCategoryName() != null) {
					table.addCell(createCellValue(pdd.getCategoryName(), PdfFont.Level3Value));
				} else {
					table.addCell("");
				}
	
				if (pdd.getCategoryDrugName() != null) {
					table.addCell(createCellValue(pdd.getCategoryDrugName(), PdfFont.Level3Value));
				} else {
					table.addCell("");
				}
	
				if (pdd.getCategoryDrugDose() != null) {
					table.addCell(createCellValue(pdd.getCategoryDrugDose(), PdfFont.Level3Value));
				} else {
					table.addCell("");
				}
	
				if (pdd.getCategoryDrugFrequency() != null) {
					table.addCell(createCellValue(pdd.getCategoryDrugFrequency(), PdfFont.Level3Value));
				} else {
					table.addCell("");
				}
	
				if (pdd.getCategoryDrugDuration() != null) {
					table.addCell(createCellValue(pdd.getCategoryDrugDuration(), PdfFont.Level3Value));
				} else {
					table.addCell("");
				}
	
			}			
		}

		
		return table;
	}

	public PdfPTable createDrugHistoryInformationPhase1Table() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(4);
		table.setWidthPercentage(100);
		table.getDefaultCell().setBorder(0);

		PdfPCell cell = createCellValue("Anticoagulant Details", PdfFont.Level1Header);
		cell.setColspan(4);
		table.addCell(cell);

		table.addCell(createCellValue("Name", PdfFont.Level2Header));
		table.addCell(createCellValue("Dose", PdfFont.Level2Header));
		table.addCell(createCellValue("Frequency", PdfFont.Level2Header));
		table.addCell(createCellValue("Duartion", PdfFont.Level2Header));

		if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarin()!=null && patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarin().equals("true")) {

			table.addCell(createCellValue("Warfarin", PdfFont.Level3Header));
			
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarinDose()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarinDose(),
					PdfFont.Level3Value));				
			} else {
				table.addCell("");
			}
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarinFrequency()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarinFrequency(),
					PdfFont.Level3Value));				
			} else {
				table.addCell("");
			}			
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarinDuration()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantWarfarinDuration(),
					PdfFont.Level3Value));				
			} else {
				table.addCell("");
			}			
			
			

		}

		if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrel()!=null && patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrel().equals("true")) {
			table.addCell(createCellValue("Clopidogrel", PdfFont.Level3Header));
			
			if(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrelDose()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrelDose(),
					PdfFont.Level3Value));			
			} else {
				table.addCell("");
			}			
			if(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrelFrequency()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrelFrequency(),
					PdfFont.Level3Value));			
			} else {
				table.addCell("");
			}		
			if(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrelDuration()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantClopidogrelDuration(),
					PdfFont.Level3Value));			
			} else {
				table.addCell("");
			}				
			



		}
		if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirin()!=null && patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirin().equals("true")) {
			table.addCell(createCellValue("Aspirin", PdfFont.Level3Header));


			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirinDose()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirinDose(),
					PdfFont.Level3Value));				
			} else {
				table.addCell("");
			}
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirinFrequency()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirinFrequency(),
					PdfFont.Level3Value));				
			} else {
				table.addCell("");
			}			
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirinDuration()!=null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantAspirinDuration(),
					PdfFont.Level3Value));				
			} else {

			}	
			



		}
		if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOther()!=null && patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOther().equals("true")) {
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherDetail() != null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherDetail(),
					PdfFont.Level3Header));				
			}else {
				table.addCell("");				
			}
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherDose() != null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherDose(),
					PdfFont.Level3Value));				
			}else {
				table.addCell("");				
			}
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherFrequency() != null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherFrequency(),
					PdfFont.Level3Value));				
			}else {
				table.addCell("");				
			}			
			if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherDuration() != null) {
			table.addCell(createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getAnticoagulantOtherDuration(),
					PdfFont.Level3Value));				
			}else {
				table.addCell("");				
			}	
			

		}

		if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getRadiationtherapyDuration() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getRadiationtherapyDuration()
						.isEmpty()) {
			PdfPCell cell_radiation_label = createCellValue("Radiation Therapy Duartion:", PdfFont.Level2Header);
			cell_radiation_label.setColspan(2);
			table.addCell(cell_radiation_label);
			
			PdfPCell cell_radiation = createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getRadiationtherapyDuration(),
					PdfFont.Level3Value);
			cell_radiation.setColspan(2);
			table.addCell(cell_radiation);
		}
		
		if (patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getComments() != null
				&& !patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getComments().isEmpty()) {
			PdfPCell cell_comments_label = createCellValue("Comments:", PdfFont.Level2Header);
			cell_comments_label.setColspan(2);
			table.addCell(cell_comments_label);
			
			PdfPCell cell_comments = createCellValue(
					patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getComments(), PdfFont.Level3Value);
			cell_comments.setColspan(2);
			table.addCell(cell_comments);

		}

		return table;

	}

	/*private PdfPTable createDateAndBarCode() throws DocumentException, IOException {

		PdfPTable table = new PdfPTable(2);
		table.setWidths(new float[] { 8, 2 });
		table.getDefaultCell().setBorder(0);

		Paragraph dateLabel = new Paragraph(sdf.format(new Date()), PdfFont.getTitleNormal());
		dateLabel.setAlignment(Element.ALIGN_BOTTOM);
		// dateLabel.setSpacingAfter(18);
		PdfPCell dateCell = new PdfPCell(dateLabel); // new Phrase(12, dateLabel, PdfFont.Level1Header));
		dateCell.setBorder(0);

		table.addCell(dateCell);

		BufferedImage bufferedImage = BarCodeImageUtility.createBarCode(patientDiagnosticWrapper.getPatientDiagnosticComplaint().getId(), 40f);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		ImageIO.write(bufferedImage, "png", baos);
		Image iTextImage = Image.getInstance(baos.toByteArray());

		PdfPCell imageCell = new PdfPCell(iTextImage);
		imageCell.setBorder(0);
		table.addCell(imageCell);

		return table;

	}*/

	public PdfPCell createCellValue(String label, Font font) {
		PdfPCell pdfPCell = new PdfPCell(new Phrase(16, label, font));
		pdfPCell.setBorder(0);

		return pdfPCell;
	}
	

	// }

}
