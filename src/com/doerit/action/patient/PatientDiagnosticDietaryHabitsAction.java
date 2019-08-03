package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticDietaryHabits;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.service.PatientDiagnosticDietaryHabitsService;
import com.doerit.service.PatientService;
import com.doerit.util.SessionKey;
import com.doerit.util.State;

public class PatientDiagnosticDietaryHabitsAction extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticDietaryHabitsAction.class);

	
	@Autowired PatientDiagnosticDietaryHabitsService patientDiagnosticDietaryHabitsService;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticDietaryHabits patientDiagnosticDietaryHabits;
	private Patient patient;
	
	private String patientId;
	
	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticDietaryHabits = getPatientDiagnosticWrapper().getPatientDiagnosticDietaryHabits();
				System.out.println(patientDiagnosticDietaryHabits);
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

		if (patientDiagnosticDietaryHabits != null) {

			patientDiagnosticDietaryHabits.setId(generatePrimaryKey());
			patientDiagnosticDietaryHabits.setPatientId(patient.getId());
			patientDiagnosticDietaryHabits.setStatus(State.ACTIVE.getDatabaseValue());
			
			//int inserted = patientDiagnosticDietaryHabitsService.save(patientDiagnosticDietaryHabits);
			
			//validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticDietaryHabits(patientDiagnosticDietaryHabits);
			updatePatientDiagnosticSession(pdw);
			
			session.put(SessionKey.PREVIEW_VISITED, true);
			if(isPreviewVisited()) {
				return PREVIEW;
			} else {
				return SUCCESS;
			}
			
				
						/*if (inserted == 1) {
					addActionMessage("Inserted");

					this.id = patientDiagnosticDietaryHabits.getId();
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

	public PatientDiagnosticDietaryHabits getPatientDiagnosticDietaryHabits() {
		return patientDiagnosticDietaryHabits;
	}

	public void setPatientDiagnosticDietaryHabits(PatientDiagnosticDietaryHabits patientDiagnosticDietaryHabits) {
		this.patientDiagnosticDietaryHabits = patientDiagnosticDietaryHabits;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticDietaryHabitsAction.logger = logger;
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