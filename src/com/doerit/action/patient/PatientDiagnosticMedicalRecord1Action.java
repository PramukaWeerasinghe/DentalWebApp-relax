package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticMedicalRecord1;
import com.doerit.service.PatientDiagnosticMedicalRecord1Service;
import com.doerit.service.PatientService;
import com.doerit.util.State;
public class PatientDiagnosticMedicalRecord1Action extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticMedicalRecord1Action.class);

	
	@Autowired PatientDiagnosticMedicalRecord1Service patientDiagnosticMedicalRecord1Service;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1;
	private Patient patient;
	
	private String patientId;

	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticMedicalRecord1 = getPatientDiagnosticWrapper().getPatientDiagnosticMedicalRecord1();
				System.out.println(patientDiagnosticMedicalRecord1);
			}
			
			return SUCCESS;
		} else {
			return INPUT;
		}
	}	
	
	public String view() {
		return SUCCESS;
	}
	
	
	public String save() {

		if (patientDiagnosticMedicalRecord1 != null) {

			patientDiagnosticMedicalRecord1.setId(generatePrimaryKey());
			patientDiagnosticMedicalRecord1.setPatientId(patient.getId());
			patientDiagnosticMedicalRecord1.setStatus(State.ACTIVE.getDatabaseValue());
				//int inserted = patientDiagnosticMedicalRecord1Service.save(patientDiagnosticMedicalRecord1);
			
				//validation
				pdw = getPatientDiagnosticWrapper();
				pdw.setPatientDiagnosticMedicalRecord1(patientDiagnosticMedicalRecord1);
				updatePatientDiagnosticSession(pdw);
			
				if(isPreviewVisited()) {
					return PREVIEW;
				} else {
					return SUCCESS;
				}
			/*
				if (inserted == 1) {
					addActionMessage("Inserted");

					this.id = patientDiagnosticMedicalRecord1.getId();
					return view();
				} else {
					addActionError("Not inserted");
					return INPUT;
				}
*/			

		} else {
			return INPUT;
		}

	}

	public PatientDiagnosticMedicalRecord1 getPatientDiagnosticMedicalRecord1() {
		return patientDiagnosticMedicalRecord1;
	}

	public void setPatientDiagnosticMedicalRecord1(PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1) {
		this.patientDiagnosticMedicalRecord1 = patientDiagnosticMedicalRecord1;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticMedicalRecord1Action.logger = logger;
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