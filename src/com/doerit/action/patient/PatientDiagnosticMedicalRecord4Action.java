package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticMedicalRecord4;
import com.doerit.service.PatientDiagnosticMedicalRecord4Service;
import com.doerit.service.PatientService;
import com.doerit.util.State;
public class PatientDiagnosticMedicalRecord4Action extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticMedicalRecord4Action.class);

	
	@Autowired PatientDiagnosticMedicalRecord4Service patientDiagnosticMedicalRecord4Service;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4;
	private Patient patient;
	
	private String patientId;

	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticMedicalRecord4 = getPatientDiagnosticWrapper().getPatientDiagnosticMedicalRecord4();
				System.out.println(patientDiagnosticMedicalRecord4);
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

		if (patientDiagnosticMedicalRecord4 != null) {

			patientDiagnosticMedicalRecord4.setId(generatePrimaryKey());
			patientDiagnosticMedicalRecord4.setPatientId(patient.getId());
			patientDiagnosticMedicalRecord4.setStatus(State.ACTIVE.getDatabaseValue());
				//int inserted = patientDiagnosticMedicalRecord4Service.save(patientDiagnosticMedicalRecord4);
			
				//validation
				pdw = getPatientDiagnosticWrapper();
				pdw.setPatientDiagnosticMedicalRecord4(patientDiagnosticMedicalRecord4);
				updatePatientDiagnosticSession(pdw);
		
				if(isPreviewVisited()) {
					return PREVIEW;
				} else {
					return SUCCESS;
				}
		/*
				if (inserted == 1) {
					addActionMessage("Inserted");

					this.id = patientDiagnosticMedicalRecord4.getId();
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

	public PatientDiagnosticMedicalRecord4 getPatientDiagnosticMedicalRecord4() {
		return patientDiagnosticMedicalRecord4;
	}

	public void setPatientDiagnosticMedicalRecord4(PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4) {
		this.patientDiagnosticMedicalRecord4 = patientDiagnosticMedicalRecord4;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticMedicalRecord4Action.logger = logger;
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