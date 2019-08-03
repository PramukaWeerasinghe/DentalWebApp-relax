package com.doerit.action.patient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientRequestConebeam;
import com.doerit.service.PatientRequestConebeamService;
import com.doerit.service.PatientService;
import com.doerit.util.PdfRequestConebeam;
import com.doerit.util.State;
import com.itextpdf.text.DocumentException;

public class PatientRequestConebeamAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	//private static Logger logger = Logger.getLogger(PatientRequestConebeamAction.class);
	
	@Autowired 	PatientRequestConebeamService patientRequestConebeamService;
	@Autowired PatientService patientService;

	private Patient patient;
	private PatientRequestConebeam patientRequestConebeam;
	
	private String patientId;
	
	public void findPatientId(String id) {
		setPatientId(patientService.viewBySerial(id).getId());
		
	}
	
	public String form() {
		return SUCCESS;
	}
	
	public String view() {
		if(getId() != null) {
			patientRequestConebeam = patientRequestConebeamService.viewById(getId());

		} 
		return SUCCESS;
	}	
	
	public String save() {


		try {
			patient = patientService.viewBySerial(patientRequestConebeam.getPatientId());
			System.out.println(patient);

			if(patient == null) {
				addActionMessage("patient serial number is not valid, please check it");
				return INPUT;
			}			
			else {
				if (patientRequestConebeam != null) {

					String id = generatePrimaryKey();
					patientRequestConebeam.setId(id);
					patientRequestConebeam.setPatientId(patient.getSerialNumber());
					patientRequestConebeam.setInsertUserId(getSessionUserId());
					patientRequestConebeam.setInsertDatetime(new Date());
					
					//requests remain PENDING STATE - 2 till reviewed
					patientRequestConebeam.setStatus(State.PENDING.getDatabaseValue());
					
					patientRequestConebeamService.save(patientRequestConebeam);
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

	

	public String patientConebeamRequestPdf() {

		try {
			view();
			PdfRequestConebeam pdfRequestConebeam = new PdfRequestConebeam();
			ByteArrayOutputStream baos = pdfRequestConebeam.createPdf(patientRequestConebeam);
			return download(baos, patientRequestConebeam.getId());
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
	
	
	public PatientRequestConebeam getPatientRequestConebeam() {
		return patientRequestConebeam;
	}

	public void setPatientRequestConebeam(PatientRequestConebeam patientRequestConebeam) {
		this.patientRequestConebeam = patientRequestConebeam;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}



}
