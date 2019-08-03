package com.doerit.action.patient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.InsertUpdate;
import com.doerit.model.Patient;
import com.doerit.model.PatientRequestXray;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.service.PatientRequestXrayService;
import com.doerit.service.PatientService;
import com.doerit.util.PdfPatientInformation;
import com.doerit.util.PdfRequestXray;
import com.doerit.util.State;
import com.itextpdf.text.DocumentException;

public class PatientRequestXrayAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientRequestXrayAction.class);
	
	@Autowired 	PatientRequestXrayService patientRequestXrayService;
	@Autowired PatientService patientService;
	@Autowired PatientDiagnosticService patientDiagnosticService;

	private Patient patient;
	private PatientRequestXray patientRequestXray;
	private String commonId;
	
	private String patientId;
	
	public void findPatientId(String id) {
		patientId = patientService.viewBySerial(id).getId();
		
	}
	public String findPatientSerial(String id) {
		patientId = patientService.viewById(id).getSerialNumber();
		return patientId;
		
	}	
	
	public String form() {
		
		if(patient != null) {
			patientId = findPatientSerial(id);
		}
		
				
		return SUCCESS;
	}

	public String edit() {
		return view();
	}
	
	public String view() {
		if(getId() != null) {
			patientRequestXray = patientRequestXrayService.viewById(getId());
			return SUCCESS;
			
		}else {
			addActionError("Invalid access");
			return INPUT;
		} 
		
	}	


	

	
	public String save() {
		
		try {
			
			patient = patientService.viewBySerial(patientRequestXray.getPatientId());
			
			System.out.println(patient);
			
			if(patient == null) {
				addActionMessage("patient serial number is not valid, please check it");
				return INPUT;
			}
			else {
				if (patientRequestXray != null) {

					String id = generatePrimaryKey();
					patientRequestXray.setId(id);
					patientRequestXray.setPatientId(patient.getSerialNumber());
					
					addInsertSettings(patientRequestXray);
					//requests remain PENDING STATE - 2 till reviewed
					patientRequestXray.setStatus(State.PENDING.getDatabaseValue());
					
					patientRequestXrayService.save(patientRequestXray);
					addActionMessage("Records Updated");
					return SUCCESS;				

					
			
				} else {
					addActionMessage("Xray request was not added");
					return INPUT;

				}
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
		

	}
	
	public String patientXrayRequestPdf() {

		try {
			view();
			PdfRequestXray pdfRequestXray = new PdfRequestXray();
			ByteArrayOutputStream baos = pdfRequestXray.createPdf(patientRequestXray);
			return download(baos, patientRequestXray.getId());
		} catch (DocumentException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return INPUT;
		} catch (IOException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return INPUT;
		}

	}	

	private String download(ByteArrayOutputStream baos, String prefix) {
		byte[] pdfFile = baos.toByteArray();
		setFileInputStream(new ByteArrayInputStream(pdfFile));

		String dateString = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		setFileName(prefix + dateString + ".pdf");
		return SUCCESS;
	}	
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientRequestXray getPatientRequestXray() {
		return patientRequestXray;
	}

	public void setPatientRequestXray(PatientRequestXray patientRequestXray) {
		this.patientRequestXray = patientRequestXray;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientRequestXrayAction.logger = logger;
	}

	public String getCommonId() {
		return commonId;
	}

	public void setCommonId(String commonId) {
		this.commonId = commonId;
	}	

}
