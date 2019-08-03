package com.doerit.action.reportChecking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.action.department.DepartmentAction;
import com.doerit.model.Department;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.service.EmployeeService;
import com.doerit.service.PatientDiagnosticComplaintService;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.util.State;

public class DepartmentReportsCheckAction extends AbstractManagementAction {
	private static final long serialVersionUID = 1L;
	@Autowired private PatientDiagnosticService patientDiagnosticService;
	@Autowired private PatientDiagnosticComplaintService patientDiagnosticComplaintService;
	@Autowired private EmployeeService employeeService;
	
	private List<PatientDiagnosticComplaint> complaintList;
	private PatientDiagnosticWrapper patientDiagnosticWrapper;
	private String patientId;
		
	public String form() {
		return SUCCESS;
	}

	public String viewAllDepartmentPendingList() {

		try {
			beforeAction();
			//String userId = null;
			String employeeDepartment = getSessionUser().getDepartment();
			pager = patientDiagnosticComplaintService.viewAllByPagerAndStatusPendingAndDepartment(pager, State.PENDING.getDatabaseValue(), employeeDepartment);
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

}