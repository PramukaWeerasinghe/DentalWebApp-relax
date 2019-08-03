package com.doerit.action.cbct;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.PatientRequestConebeam;
import com.doerit.model.PatientRequestXray;
import com.doerit.service.PatientRequestConebeamService;
import com.doerit.service.PatientRequestXrayService;
import com.doerit.util.State;

public class CbctRequestAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	
	@Autowired private PatientRequestConebeamService patientRequestConebeamService;
	
	private PatientRequestConebeam patientRequestConebeam;
	
	public String listRequests() {
		try {
			beforeAction();
			pager = patientRequestConebeamService.viewAllByPagerAndStatus(pager, State.PENDING.getDatabaseValue());
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur " + e.getMessage());
			// logger
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String listAccepted() {
		try {
			beforeAction();
			pager = patientRequestConebeamService.viewAllByPagerAndStatus(pager, State.ACTIVE.getDatabaseValue());
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur " + e.getMessage());
			// logger
			e.printStackTrace();
		}
		return SUCCESS;
	}	
	
	public String setAcceptedStatus() {
		try {
			patientRequestConebeam = patientRequestConebeamService.viewById(getId());
			patientRequestConebeam.setStatus(State.ACTIVE.getDatabaseValue());
			patientRequestConebeamService.update(patientRequestConebeam);
		} catch (Exception e) {
			addActionError("Exception occur " + e.getMessage());
			// logger
			e.printStackTrace();
		}
		return SUCCESS;
	}


	public PatientRequestConebeam getPatientRequestConebeam() {
		return patientRequestConebeam;
	}


	public void setPatientRequestConebeam(PatientRequestConebeam patientRequestConebeam) {
		this.patientRequestConebeam = patientRequestConebeam;
	}
	
}
