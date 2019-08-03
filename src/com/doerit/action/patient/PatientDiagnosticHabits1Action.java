package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticHabits1;
import com.doerit.service.PatientDiagnosticHabits1Service;
import com.doerit.service.PatientService;
import com.doerit.util.State;
public class PatientDiagnosticHabits1Action extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticHabits1Action.class);

	
	@Autowired PatientDiagnosticHabits1Service patientDiagnosticHabits1Service;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticHabits1 patientDiagnosticHabits1;
	private Patient patient;
	
	private String patientId;
	
	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticHabits1 = getPatientDiagnosticWrapper().getPatientDiagnosticHabits1();
				System.out.println(patientDiagnosticHabits1);
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

		if (patientDiagnosticHabits1 != null) {

			patientDiagnosticHabits1.setId(generatePrimaryKey());
			patientDiagnosticHabits1.setPatientId(patient.getId());
			patientDiagnosticHabits1.setStatus(State.ACTIVE.getDatabaseValue());
			
			//int inserted = patientDiagnosticComplaintService.save(patientDiagnosticComplaint);
			
			//validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticHabits1(patientDiagnosticHabits1);
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

	public PatientDiagnosticHabits1 getPatientDiagnosticHabits1() {
		return patientDiagnosticHabits1;
	}

	public void setPatientDiagnosticHabits1(PatientDiagnosticHabits1 patientDiagnosticHabits1) {
		this.patientDiagnosticHabits1 = patientDiagnosticHabits1;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticHabits1Action.logger = logger;
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