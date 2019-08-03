package com.doerit.action.xray;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.PatientRequestXray;
import com.doerit.service.PatientRequestXrayService;
import com.doerit.util.State;

public class XrayRequestAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	
	@Autowired private PatientRequestXrayService patientRequestXrayService;
	
	private PatientRequestXray patientRequestXray;
	
	public String listRequests() {
		try {
			beforeAction();
			pager = patientRequestXrayService.viewAllByPagerAndStatus(pager, State.PENDING.getDatabaseValue());
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
			pager = patientRequestXrayService.viewAllByPagerAndStatus(pager, State.ACTIVE.getDatabaseValue());
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
			patientRequestXray = patientRequestXrayService.viewById(getId());
			patientRequestXray.setStatus(State.ACTIVE.getDatabaseValue());
			patientRequestXrayService.update(patientRequestXray);
		} catch (Exception e) {
			addActionError("Exception occur " + e.getMessage());
			// logger
			e.printStackTrace();
		}
		return SUCCESS;
	}


	public PatientRequestXray getPatientRequestXray() {
		return patientRequestXray;
	}


	public void setPatientRequestXray(PatientRequestXray patientRequestXray) {
		this.patientRequestXray = patientRequestXray;
	}
	
}
