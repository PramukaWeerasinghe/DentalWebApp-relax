package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticMedicalRecord3;
import com.doerit.service.PatientDiagnosticMedicalRecord3Service;
import com.doerit.service.PatientService;
import com.doerit.util.State;
public class PatientDiagnosticMedicalRecord3Action extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticMedicalRecord3Action.class);

	
	@Autowired PatientDiagnosticMedicalRecord3Service patientDiagnosticMedicalRecord3Service;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3;
	private Patient patient;
	
	private String patientId;

	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticMedicalRecord3 = getPatientDiagnosticWrapper().getPatientDiagnosticMedicalRecord3();
				System.out.println(patientDiagnosticMedicalRecord3);
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

		if (patientDiagnosticMedicalRecord3 != null) {

			patientDiagnosticMedicalRecord3.setId(generatePrimaryKey());
			patientDiagnosticMedicalRecord3.setPatientId(patient.getId());
			patientDiagnosticMedicalRecord3.setStatus(State.ACTIVE.getDatabaseValue());
			
				//int inserted = patientDiagnosticMedicalRecord3Service.save(patientDiagnosticMedicalRecord3);
				
				//validation
				pdw = getPatientDiagnosticWrapper();
				pdw.setPatientDiagnosticMedicalRecord3(patientDiagnosticMedicalRecord3);
				updatePatientDiagnosticSession(pdw);
			
				if(isPreviewVisited()) {
					return PREVIEW;
				} else {
					return SUCCESS;
				}
			
		/*		if (inserted == 1) {
					addActionMessage("Inserted");

					this.id = patientDiagnosticMedicalRecord3.getId();
					return view();
				} else {
					addActionError("Not inserted");
					return INPUT;
				}
			

*/		} else {
			return INPUT;
		}

	}

	public PatientDiagnosticMedicalRecord3 getPatientDiagnosticMedicalRecord3() {
		return patientDiagnosticMedicalRecord3;
	}

	public void setPatientDiagnosticMedicalRecord3(PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3) {
		this.patientDiagnosticMedicalRecord3 = patientDiagnosticMedicalRecord3;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticMedicalRecord3Action.logger = logger;
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