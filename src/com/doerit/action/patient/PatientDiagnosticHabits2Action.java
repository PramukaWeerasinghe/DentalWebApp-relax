package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticHabits2;
import com.doerit.service.PatientDiagnosticHabits2Service;
import com.doerit.service.PatientService;
import com.doerit.util.State;
public class PatientDiagnosticHabits2Action extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticHabits2Action.class);

	
	@Autowired PatientDiagnosticHabits2Service patientDiagnosticHabits2Service;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticHabits2 patientDiagnosticHabits2;
	private Patient patient;
	
	private String patientId;
	
	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticHabits2 = getPatientDiagnosticWrapper().getPatientDiagnosticHabits2();
				System.out.println(patientDiagnosticHabits2);
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

		if (patientDiagnosticHabits2 != null) {

			patientDiagnosticHabits2.setId(generatePrimaryKey());
			patientDiagnosticHabits2.setPatientId(patient.getId());
			patientDiagnosticHabits2.setStatus(State.ACTIVE.getDatabaseValue());
			
			//int inserted = patientDiagnosticComplaintService.save(patientDiagnosticComplaint);
			
			//validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticHabits2(patientDiagnosticHabits2);
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

	public PatientDiagnosticHabits2 getPatientDiagnosticHabits2() {
		return patientDiagnosticHabits2;
	}

	public void setPatientDiagnosticHabits2(PatientDiagnosticHabits2 patientDiagnosticHabits2) {
		this.patientDiagnosticHabits2 = patientDiagnosticHabits2;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticHabits2Action.logger = logger;
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