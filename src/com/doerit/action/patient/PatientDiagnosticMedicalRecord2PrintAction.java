package com.doerit.action.patient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.Patient;
import com.doerit.service.PatientDiagnosticMedicalRecord2Service;
import com.doerit.service.PatientService;
import com.doerit.util.PdfPatientInformation;
import com.doerit.util.PdfPatientSticker;
import com.itextpdf.text.DocumentException;


public class PatientDiagnosticMedicalRecord2PrintAction extends AbstractDownloadManamentAction {

	private static final long serialVersionUID = 1L;	

	@Autowired PatientDiagnosticMedicalRecord2Service patientDiagnosticMedicalRecord2Service;
	@Autowired PatientService patientService;
	
	private Patient patient;
	
	public String view() {
		// System.out.println(getId());
		if (getId() != null) {
			patient = patientDiagnosticMedicalRecord2Service.viewById(getId());
		
			viewMedicalRecord2();
		} else {
			addActionError("Invalid access");
		}
		return SUCCESS;
	}
	
	private String viewMedicalRecord2() {
		if (getId() != null) {
			patient = patientService.viewById(getId());
		} else {
			addActionError("Invalid access");
		}
		return SUCCESS;
	}


	public String patientInformationPdf() {

		try {
			view();
			PdfPatientInformation pdfPatientInformation = new PdfPatientInformation();
			ByteArrayOutputStream baos = pdfPatientInformation.createPdf(patient);
			return download(baos, patient.getSerialNumber());
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

	public String patientStickerPdf() {

		try {
			view();
			PdfPatientSticker pdfPatientSticker = new PdfPatientSticker();
			ByteArrayOutputStream baos;
			baos = pdfPatientSticker.createPdf(patient);
			return download(baos, patient.getSerialNumber());
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

}
