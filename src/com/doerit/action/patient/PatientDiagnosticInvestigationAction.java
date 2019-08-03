package com.doerit.action.patient;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticInvestigation;
import com.doerit.service.PatientAdditionalPropertyService;
import com.doerit.service.PatientDiagnosticInvestigationService;
import com.doerit.service.PatientService;
import com.doerit.util.PdfPatientInformation;
import com.doerit.util.State;
import com.itextpdf.text.DocumentException;

public class PatientDiagnosticInvestigationAction extends AbstractPatientDiagnosticAction {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticInvestigationAction.class);

	@Autowired
	PatientDiagnosticInvestigationService patientDiagnosticInvestigationService;
	@Autowired
	PatientService patientService;
	@Autowired
	PatientAdditionalPropertyService patientAdditionalPropertyService;

	/*
	 * public String view() { return SUCCESS; }
	 */
	public String view() {
		return SUCCESS;
	}

	private PatientDiagnosticInvestigation patientDiagnosticInvestigation;
	private Patient patient;

	private String patientId;

	public String form() {
		if (patientId != null) {
			patient = patientService.viewById(patientId);

			if (getPatientDiagnosticWrapper() != null) {
				patientDiagnosticInvestigation = getPatientDiagnosticWrapper().getPatientDiagnosticInvestigation();
				System.out.println(patientDiagnosticInvestigation);
			}

			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	/*
	 * public String view() { return SUCCESS; }
	 */

	public String save() {

		if (patientDiagnosticInvestigation != null) {

			patientDiagnosticInvestigation.setId(generatePrimaryKey());
			patientDiagnosticInvestigation.setPatientId(patient.getId());
			patientDiagnosticInvestigation.setStatus(State.ACTIVE.getDatabaseValue());

			// int inserted =
			// patientDiagnosticComplaintService.save(patientDiagnosticComplaint);

			// validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticInvestigation(patientDiagnosticInvestigation);
			updatePatientDiagnosticSession(pdw);

			if(isPreviewVisited()) {
				return PREVIEW;
			} else {
				return SUCCESS;
			}
			
				

		} else {
			return INPUT;
		}

	}

	public PatientDiagnosticInvestigation getPatientDiagnosticInvestigation() {
		return patientDiagnosticInvestigation;
	}

	public void setPatientDiagnosticInvestigation(PatientDiagnosticInvestigation patientDiagnosticInvestigation) {
		this.patientDiagnosticInvestigation = patientDiagnosticInvestigation;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticInvestigationAction.logger = logger;
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

	/* edit */
	public String edit() {
		return view();
	}

}