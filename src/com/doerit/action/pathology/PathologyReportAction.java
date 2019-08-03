package com.doerit.action.pathology;

import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractDocumentSupportManagementAction;
import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.service.PatientReportPathologyService;
import com.doerit.util.State;

public class PathologyReportAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	
	@Autowired private PatientReportPathologyService patientReportPathologyService;

  private String searchKey;

  private String searchWord;
	
	private String search() {
	
		try {
			beforeAction();
			pager = patientReportPathologyService.search(pager, this.searchKey, this.searchWord);
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String list() {
		try {
			beforeAction();
			pager = patientReportPathologyService.viewAllByPagerAndStatus(pager, State.ACTIVE.getDatabaseValue());
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur " + e.getMessage());
			// logger
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String view(){
		return SUCCESS;
	}
}
