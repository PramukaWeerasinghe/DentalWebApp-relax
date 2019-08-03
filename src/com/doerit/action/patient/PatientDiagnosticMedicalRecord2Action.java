package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticMedicalRecord2;
import com.doerit.service.PatientDiagnosticMedicalRecord2Service;
import com.doerit.service.PatientService;
import com.doerit.util.State;
public class PatientDiagnosticMedicalRecord2Action extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticMedicalRecord2Action.class);

	
	@Autowired PatientDiagnosticMedicalRecord2Service patientDiagnosticMedicalRecord2Service;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2;
	private Patient patient;
	
	private String patientId;

	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticMedicalRecord2 = getPatientDiagnosticWrapper().getPatientDiagnosticMedicalRecord2();
				System.out.println(patientDiagnosticMedicalRecord2);
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

		if (patientDiagnosticMedicalRecord2 != null) {

			patientDiagnosticMedicalRecord2.setId(generatePrimaryKey());
			patientDiagnosticMedicalRecord2.setPatientId(patient.getId());
			patientDiagnosticMedicalRecord2.setStatus(State.ACTIVE.getDatabaseValue());
				//int inserted = patientDiagnosticMedicalRecord2Service.save(patientDiagnosticMedicalRecord2);
			
			//validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticMedicalRecord2(patientDiagnosticMedicalRecord2);
			updatePatientDiagnosticSession(pdw);
			
			if(isPreviewVisited()) {
				return PREVIEW;
			} else {
				return SUCCESS;
			}

				/*if (inserted == 1) {
					addActionMessage("Inserted");

					this.id = patientDiagnosticMedicalRecord2.getId();
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

	public PatientDiagnosticMedicalRecord2 getPatientDiagnosticMedicalRecord2() {
		return patientDiagnosticMedicalRecord2;
	}

	public void setPatientDiagnosticMedicalRecord2(PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2) {
		this.patientDiagnosticMedicalRecord2 = patientDiagnosticMedicalRecord2;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticMedicalRecord2Action.logger = logger;
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