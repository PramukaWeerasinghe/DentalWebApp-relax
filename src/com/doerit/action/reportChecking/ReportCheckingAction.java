package com.doerit.action.reportChecking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractManagementAction;
import com.doerit.service.PatientDiagnosticService;



public class ReportCheckingAction extends AbstractManagementAction {
	private static final long serialVersionUID = 1L;
	
	//private List<PatientDiagnosticReport> patientDiagnosticReports;
	
	@Autowired private PatientDiagnosticService patientDiagnosticService;	
	
	public String form() {
		return SUCCESS;
	}

	public PatientDiagnosticService getPatientDiagnosticService() {
		return patientDiagnosticService;
	}

	
	
/*	public String list() {
		if () {
			PatientDiagnosticService
		} else {

		}
		
	}*/
	
	
}