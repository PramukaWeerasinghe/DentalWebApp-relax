package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticDentalHistory;
import com.doerit.service.PatientDiagnosticDentalHistoryService;
import com.doerit.service.PatientService;
import com.doerit.util.State;
public class PatientDiagnosticDentalHistoryAction extends AbstractPatientDiagnosticAction{
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticDentalHistoryAction.class);

	
	@Autowired PatientDiagnosticDentalHistoryService patientDiagnosticDentalHistoryService;
	@Autowired PatientService patientService;
	
	private PatientDiagnosticDentalHistory patientDiagnosticDentalHistory;
	private Patient patient;
	
	private String patientId;

	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticDentalHistory = getPatientDiagnosticWrapper().getPatientDiagnosticDentalHistory();
				System.out.println(patientDiagnosticDentalHistory);
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

		if (patientDiagnosticDentalHistory != null) {

			patientDiagnosticDentalHistory.setId(generatePrimaryKey());
			patientDiagnosticDentalHistory.setPatientId(patient.getId());
			patientDiagnosticDentalHistory.setStatus(State.ACTIVE.getDatabaseValue());
			
			
				//int inserted = patientDiagnosticDentalHistoryService.save(patientDiagnosticDentalHistory);
				
			//validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticDentalHistory(patientDiagnosticDentalHistory);
			updatePatientDiagnosticSession(pdw);
			
			if(isPreviewVisited()) {
				return PREVIEW;
			} else {
				return SUCCESS;
			}
			
/*				if (inserted == 1) {
					addActionMessage("Inserted");

					this.id = patientDiagnosticDentalHistory.getId();
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

	public PatientDiagnosticDentalHistory getPatientDiagnosticDentalHistory() {
		return patientDiagnosticDentalHistory;
	}

	public void setPatientDiagnosticDentalHistory(PatientDiagnosticDentalHistory patientDiagnosticDentalHistory) {
		this.patientDiagnosticDentalHistory = patientDiagnosticDentalHistory;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticDentalHistoryAction.logger = logger;
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