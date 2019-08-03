package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticDrug;
import com.doerit.model.PatientDiagnosticDrugHistory;
import com.doerit.service.PatientDiagnosticDrugHistoryService;
import com.doerit.service.PatientService;
import com.doerit.util.State;

public class PatientDiagnosticDrugHistoryAction extends AbstractPatientDiagnosticAction{

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticDrugHistoryAction.class);
	
	@Autowired PatientDiagnosticDrugHistoryService patientDiagnosticDrugHistoryService;
	@Autowired PatientService patientService;

	private PatientDiagnosticDrug patientDiagnosticDrug;
	
	private PatientDiagnosticDrugHistory patientDiagnosticDrugHistory;
	private Patient patient;
	
	private String patientId;
	
	public String form() {
		if (patientId != null) {
			patient = patientService.viewById(patientId);

			if (getPatientDiagnosticWrapper() != null) {
				patientDiagnosticDrugHistory = getPatientDiagnosticWrapper().getPatientDiagnosticDrugHistory();
			}

			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	public String formPhase2() {
		
		if(getPatientDiagnosticWrapper().getPatientDiagnosticDrugHistory() == null) {
			addActionError("Phase 1 must be completed before phase 2");
			return "phase1";
		}
		
		if (patientId != null) {  //[TODO] remove
			
			patient = patientService.viewById(patientId);

			if (getPatientDiagnosticWrapper() != null) {
				patientDiagnosticDrugHistory = getPatientDiagnosticWrapper().getPatientDiagnosticDrugHistory();
				System.out.println(patientDiagnosticDrugHistory);
			}

			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	public String view() {
		return SUCCESS;
	}
	
	/*public String saveDrugs() {

		if(patientDiagnosticDrug != null) {
			System.out.println(patientDiagnosticDrug);
			pdw = getPatientDiagnosticWrapper();
			pdw.addDrug(patientDiagnosticDrug);
		}
		
		return SUCCESS;
	}*/
	
	public String save() {

		if (patientDiagnosticDrugHistory != null) {

			
			patientDiagnosticDrugHistory.setId(generatePrimaryKey());
			patientDiagnosticDrugHistory.setPatientId(patient.getId());
			patientDiagnosticDrugHistory.setStatus(State.ACTIVE.getDatabaseValue());

			PatientDiagnosticDrugHistory pdd = getPatientDiagnosticWrapper().getPatientDiagnosticDrugHistory();
			if(pdd != null) {
				patientDiagnosticDrugHistory.setDrugs(pdd.getDrugs());
			}
			
			// validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticDrugHistory(patientDiagnosticDrugHistory);
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
	public String savePhase2() {

		if(patientDiagnosticDrug != null) {
			
			//[TODO] validation
			patientDiagnosticDrug.setId(generatePrimaryKey());
			System.out.println("*****");
			System.out.println(patientDiagnosticDrug);
			pdw = getPatientDiagnosticWrapper();
			pdw.getPatientDiagnosticDrugHistory().addDrug(patientDiagnosticDrug);
			updatePatientDiagnosticSession(pdw);
			
			/*patientDiagnosticDrug.setCategoryName(null);
			patientDiagnosticDrug.setCategoryDrugDose(null);
			patientDiagnosticDrug.setCategoryDrugFrequency(null);
			patientDiagnosticDrug.setCategoryDrugDuration(null);
			patientDiagnosticDrug.setId(null);*/
			System.out.println("Drug added");
		}
		
		return SUCCESS;

	}

	public PatientDiagnosticDrugHistory getPatientDiagnosticDrugHistory() {
		return patientDiagnosticDrugHistory;
	}

	public void setPatientDiagnosticDrugHistory(PatientDiagnosticDrugHistory patientDiagnosticDrugHistory) {
		this.patientDiagnosticDrugHistory = patientDiagnosticDrugHistory;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticDrugHistoryAction.logger = logger;
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

	public PatientDiagnosticDrug getPatientDiagnosticDrug() {
		return patientDiagnosticDrug;
	}

	public void setPatientDiagnosticDrug(PatientDiagnosticDrug patientDiagnosticDrug) {
		this.patientDiagnosticDrug = patientDiagnosticDrug;
	}	
	
	
	
	
}