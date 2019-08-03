package com.doerit.action.student;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.patient.AbstractPatientDiagnosticAction;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.service.PatientDiagnosticComplaintService;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.util.State;

public class StudentReportsAction extends AbstractPatientDiagnosticAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(StudentReportsAction.class);
	@Autowired
	private PatientDiagnosticService patientDiagnosticService;
	@Autowired
	private PatientDiagnosticComplaintService patientDiagnosticComplaintService;
	private List<PatientDiagnosticComplaint> complaintList;
	private String patientId;

	/*
	 * public String clearSessionCache() { clearSessionVariables(); return SUCCESS;
	 * }
	 */

	public String newSubmissions() {
		try {
			// clearSessionCache();
			// if() {
			beforeAction();
			pager = patientDiagnosticComplaintService.viewAllByPagerUserIdAndStatus(pager, getSessionUserId(),
					State.PENDING.getDatabaseValue());
			pager = setActionContext(pager);
			// }
			System.out.println("test");

		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String activeSubmissions() {

		try {
			// clearSessionCache();
			// if() {
			beforeAction();
			pager = patientDiagnosticComplaintService.viewAllByPagerUserIdAndStatus(pager, getSessionUserId(),
					State.ACTIVE.getDatabaseValue());
			pager = setActionContext(pager);
			// }
			System.out.println("test");

		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;

	}

	public String rejectedSubmissions() {

		try {
			// clearSessionCache();
			// if() {
			beforeAction();
			pager = patientDiagnosticComplaintService.viewAllByPagerUserIdAndStatus(pager, getSessionUserId(),
					State.REJECTED.getDatabaseValue());
			pager = setActionContext(pager);
			// }
			System.out.println("test");

		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;

	}
	
	public String rejectedSubmissionsPreview() {
		
		return SUCCESS;
	}

}
