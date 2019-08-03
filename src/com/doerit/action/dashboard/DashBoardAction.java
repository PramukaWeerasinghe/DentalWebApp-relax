package com.doerit.action.dashboard;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.exception.SessionNotExist;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.util.State;

public class DashBoardAction extends AbstractManagementAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired PatientDiagnosticService patientDiagnosticService;
	private int pendingReportCount;
	private int acceptedReportCount;
	private int rejectedReportCount;
	
	private int diagReportCount;
	
	
	public int getDiagReportCount() {
		return diagReportCount;
	}

	public void setDiagReportCount(int diagReportCount) {
		this.diagReportCount = diagReportCount;
	}

	private String menu;

	public String index() {
		return SUCCESS;
	}
	
	public String reports() {
		return SUCCESS;
	}
	
	public String dashBoard() {
		
		String userRole = null;
		boolean isPatientAuthorizer = false;
		try {
			userRole = getUserRole();
			isPatientAuthorizer = authorizeVisits();
			
			//auth employee - general account user
			if (userRole.equals("EMPLOYEE") && isPatientAuthorizer) {
				System.out.println("auth emp login");
				authEmployeeDashboard();
				
				return "AUTHORIZED "+userRole;
				
			} else if( userRole.equals("EMPLOYEE") ) {
				employeeDashboard();
				
				return userRole;
				
			} else if (userRole.equals("DOCTOR") && isPatientAuthorizer) { //doctor dashboard
				System.out.println("auth doc login");
				authDoctorDashboard();
				return "AUTHORIZED "+userRole;
				
			} else if (userRole.equals("DEPARTMENT") && isPatientAuthorizer) {
				authDepartmentDashboard();
				return "AUTHORIZED " + userRole;
				
			} else if (userRole.equals("STUDENT") && isPatientAuthorizer) {
				authStudentDashboard();
				return "AUTHORIZED "+userRole;
				
			}else if (userRole.equals("RECEPTION") && isPatientAuthorizer) {
				authReceptionDashboard();
				return "AUTHORIZED "+userRole;
			}
			
		} catch (SessionNotExist e) {
			e.printStackTrace();
		}
				
		return userRole;
	}

	private void authReceptionDashboard() {
		
	}

	private void authDepartmentDashboard() {
		
	}

	private void authStudentDashboard() throws SessionNotExist  {
		setMenu("student");
		//diagReportCount = patientDiagnosticService.viewTodayCount();
		acceptedReportCount = patientDiagnosticService.countReportCountByUserAndState(getSessionUserId(), State.ACTIVE.getDatabaseValue());
		rejectedReportCount = patientDiagnosticService.countReportCountByUserAndState(getSessionUserId(), State.REJECTED.getDatabaseValue());
		pendingReportCount = patientDiagnosticService.countReportCountByUserAndState(getSessionUserId(), State.PENDING.getDatabaseValue());
		//System.out.println(patientDiagnosticService.viewReportCount());
	}

	public int getPendingReportCount() {
		return pendingReportCount;
	}

	public void setPendingReportCount(int pendingReportCount) {
		this.pendingReportCount = pendingReportCount;
	}

	public int getAcceptedReportCount() {
		return acceptedReportCount;
	}

	public void setAcceptedReportCount(int acceptedReportCount) {
		this.acceptedReportCount = acceptedReportCount;
	}

	public int getRejectedReportCount() {
		return rejectedReportCount;
	}

	public void setRejectedReportCount(int rejectedReportCount) {
		this.rejectedReportCount = rejectedReportCount;
	}

	private void authDoctorDashboard() {
		setMenu("doctor");
		
		diagReportCount = patientDiagnosticService.viewTodayCount();
	
	}

	private void authEmployeeDashboard() {
		
	}

	private void employeeDashboard() { 
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	
}
