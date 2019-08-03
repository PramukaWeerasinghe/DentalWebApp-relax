package com.doerit.action.patient;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.PatientDiagnosticDrug;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.util.State;
import com.doerit.action.patient.AbstractPatientDiagnosticAction;

public class PatientDiagnosticSaveAction extends AbstractPatientDiagnosticAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticSaveAction.class);

	@Autowired
	PatientDiagnosticService patientDiagnosticService;
	
	private PatientDiagnosticComplaint patientDiagnosticComplaint;
	private PatientDiagnosticWrapper patientDiagnosticWrapper;

	private String commonIdTemp;

	public String clearSessionCache() {
		clearSessionVariables();
		return SUCCESS;
	}

	public String save() {

		try {
			commonIdTemp = null;
			PatientDiagnosticWrapper pwdSession = getPatientDiagnosticWrapper();
			
			if(pwdSession.isReworked()) {
				pwdSession.getPatientDiagnosticComplaint().setId(generatePrimaryKey());
				commonIdTemp = pwdSession.getPreviousCommonId();
				
				PatientDiagnosticWrapper temp = patientDiagnosticService.viewByCommonId(commonIdTemp);
				temp.setStatusForAllRecords(State.RESUBMITTED.getDatabaseValue());
				
				PatientDiagnosticDrug pdd = temp.getPatientDiagnosticDrug();
				pwdSession.setPatientDiagnosticDrug(pdd);
				//TODO
				//iterate
				
				patientDiagnosticService.updateCommentsAll(temp);	
				
			}
			patientDiagnosticService.saveAll(pwdSession);
			commonIdTemp = pwdSession.getPatientDiagnosticComplaint().getId();
			clearSessionVariables();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return INPUT;
		}
		
		return SUCCESS;
	}
	
	

	public String resubmitSave() {
		
		try {
			commonIdTemp = null;
			PatientDiagnosticWrapper records = getPatientDiagnosticWrapper();
			commonIdTemp = records.getPatientDiagnosticComplaint().getId();
			//patientDiagnosticService.saveAll(records);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			logger.error(e);
			return INPUT;
		}
		
		return SUCCESS;
	
	}

	public String update() {

		try {
			PatientDiagnosticWrapper records = getPatientDiagnosticWrapper();
			records.getPatientDiagnosticComplaint().setStatus(State.ACTIVE.getDatabaseValue());
			patientDiagnosticService.updateAll(records);
			clearSessionVariables();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
			return INPUT;
		}
		return SUCCESS;
	}

	public String getCommonIdTemp() {
		return commonIdTemp;
	}

	public void setCommonIdTemp(String commonIdTemp) {
		this.commonIdTemp = commonIdTemp;
	}

}
