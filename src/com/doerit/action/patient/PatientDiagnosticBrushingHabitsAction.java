package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticBrushingHabits;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.service.PatientDiagnosticBrushingHabitsService;
import com.doerit.service.PatientService;
import com.doerit.util.SessionKey;
import com.doerit.util.State;

public class PatientDiagnosticBrushingHabitsAction extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticBrushingHabitsAction.class);

	
	@Autowired PatientDiagnosticBrushingHabitsService patientDiagnosticBrushingHabitsService;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticBrushingHabits patientDiagnosticBrushingHabits;
	private Patient patient;
	
	private String patientId;
	
	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticBrushingHabits = getPatientDiagnosticWrapper().getPatientDiagnosticBrushingHabits();
				System.out.println(patientDiagnosticBrushingHabits);
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

		if (patientDiagnosticBrushingHabits != null) {

			patientDiagnosticBrushingHabits.setId(generatePrimaryKey());
			patientDiagnosticBrushingHabits.setPatientId(patient.getId());
			patientDiagnosticBrushingHabits.setStatus(State.ACTIVE.getDatabaseValue());
			
			//int inserted = patientDiagnosticBrushingHabitsService.save(patientDiagnosticBrushingHabits);
			
			//validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticBrushingHabits(patientDiagnosticBrushingHabits);
			updatePatientDiagnosticSession(pdw);
			
			if(isPreviewVisited()) {
				return PREVIEW;
			} else {
				return SUCCESS;
			}
			
				
						/*if (inserted == 1) {
					addActionMessage("Inserted");

					this.id = patientDiagnosticBrushingHabits.getId();
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

	public PatientDiagnosticBrushingHabits getPatientDiagnosticBrushingHabits() {
		return patientDiagnosticBrushingHabits;
	}

	public void setPatientDiagnosticBrushingHabits(PatientDiagnosticBrushingHabits patientDiagnosticBrushingHabits) {
		this.patientDiagnosticBrushingHabits = patientDiagnosticBrushingHabits;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticBrushingHabitsAction.logger = logger;
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