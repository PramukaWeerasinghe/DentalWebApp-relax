package com.doerit.action.cbct;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.service.PatientReportXrayService;
import com.doerit.service.PatientRequestConebeamService;
import com.doerit.util.State;

public class CbctReportAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	
	@Autowired private PatientRequestConebeamService patientRequestConebeamService;
	
	public String list() {
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
	
}
