package com.doerit.action.patient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.Patient;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.service.PatientService;
import com.doerit.util.PdfPatientDiagnosticInformation;
import com.doerit.util.PdfPatientInformation;
import com.itextpdf.text.DocumentException;

public class PatientDiagnosticPdfSaveAction extends AbstractDownloadManamentAction {
	
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticPdfSaveAction.class);
	
	@Autowired PatientDiagnosticService patientDiagnosticService;
	@Autowired PatientService patientService;
	private PatientDiagnosticWrapper patientDiagnosticWrapper;
	
	public String view() {
		// System.out.println(getId());
		if (getId() != null) {
			//patient = patientService.viewById(getId());
			patientDiagnosticWrapper=patientDiagnosticService.viewByCommonId(getId());
		} else {
			addActionError("Invalid access");
		}
		return SUCCESS;
	}
	
	public String patientDiagnosticInformationPdf() {

		try {
			//PatientDiagnosticWrapper records =  getPatientDiagnosticWrapper();
			//patientDiagnosticService.viewByCommonId(this.getPatientDiagnosticWrapper().getPatientId());
		/*	//view();
			Patient patient = patientService.viewById("1516857076763");
			PdfPatientInformation pdfPatientInformation = new PdfPatientInformation();
			ByteArrayOutputStream baos = pdfPatientInformation.createPdf(patient);
			return download(baos, patient.getSerialNumber());*/
			patientDiagnosticWrapper=patientDiagnosticService.viewByCommonId(getId());
			
			PdfPatientDiagnosticInformation pdfPatientDiagnosticInformation = new PdfPatientDiagnosticInformation();
			ByteArrayOutputStream baos = pdfPatientDiagnosticInformation.createDiagnosticPdf(patientDiagnosticWrapper);
			return download(baos, "Diagnostic");
		} catch (DocumentException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return SUCCESS;
		} catch (IOException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return SUCCESS;
		}

	}
	
	
	private String download(ByteArrayOutputStream baos, String prefix) {
		byte[] pdfFile = baos.toByteArray();
		setFileInputStream(new ByteArrayInputStream(pdfFile));

		String dateString = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		setFileName(prefix + dateString + ".pdf");
		return SUCCESS;
	}

}
