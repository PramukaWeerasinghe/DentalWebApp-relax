package com.doerit.action.reportChecking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.service.PatientDiagnosticComplaintService;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.util.State;
public class AllReportsCheckAction extends AbstractManagementAction {
	
	private static final long serialVersionUID = 1L;
	@Autowired private PatientDiagnosticService patientDiagnosticService;
	@Autowired private PatientDiagnosticComplaintService patientDiagnosticComplaintService;

	private List<PatientDiagnosticComplaint> complaintList;
	private String patientId;

	private String searchKey;
	private String searchWord;
	
	public String form() {
		return SUCCESS;
	}

	public String viewAllPendingAndAciveList() {

		try {
			beforeAction();
			pager = patientDiagnosticComplaintService.viewAll(pager, State.PENDING.getDatabaseValue(), State.ACTIVE.getDatabaseValue());
			pager = setActionContext(pager);
			
		} catch (Exception e) {
		addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;		


	}

	public PatientDiagnosticService getPatientDiagnosticService() {
		return patientDiagnosticService;
	}

	public void setPatientDiagnosticService(PatientDiagnosticService patientDiagnosticService) {
		this.patientDiagnosticService = patientDiagnosticService;
	}

	public PatientDiagnosticComplaintService getPatientDiagnosticComplaintService() {
		return patientDiagnosticComplaintService;
	}

	public void setPatientDiagnosticComplaintService(PatientDiagnosticComplaintService patientDiagnosticComplaintService) {
		this.patientDiagnosticComplaintService = patientDiagnosticComplaintService;
	}

	public List<PatientDiagnosticComplaint> getComplaintList() {
		return complaintList;
	}

	public void setComplaintList(List<PatientDiagnosticComplaint> complaintList) {
		this.complaintList = complaintList;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	
	
	public String search() {

		try {
			beforeAction();
			pager = patientDiagnosticComplaintService.search(pager, this.searchKey, this.searchWord);
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}
	
	

}