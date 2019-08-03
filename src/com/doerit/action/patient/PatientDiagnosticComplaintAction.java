package com.doerit.action.patient;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.ActivityLogger.MessageType;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.model.Department;

import com.doerit.model.Employee;
import com.doerit.service.EmployeeService;
import com.doerit.service.DepartmentService;
import com.doerit.service.PatientDiagnosticComplaintService;
import com.doerit.service.PatientService;
import com.doerit.util.State;

public class PatientDiagnosticComplaintAction extends AbstractPatientDiagnosticAction{
	

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientDiagnosticComplaintAction.class);

	
	@Autowired PatientDiagnosticComplaintService patientDiagnosticComplaintService;
	@Autowired PatientService patientService;
	@Autowired EmployeeService employeeService;
	@Autowired DepartmentService departmentService;
	
	
	private PatientDiagnosticComplaint patientDiagnosticComplaint;
	private Patient patient;
	
	private List<Employee> employeeList;

	private String patientId;

	public List<Department> getDepartments() {
		return departmentService.viewAll();
	}
	
	public List<Employee> getEmployees() {
		return employeeService.viewAll();
	}
	

	public String formInit() {
		clearSessionVariables();
		return form();
	}

	public String hello() {
		return SUCCESS;
	}
	
	
	public String resubmitForm() {
		formReWork();
		PatientDiagnosticWrapper pdw =  getPatientDiagnosticWrapper();
		pdw.setReworked(true);
		pdw.setPreviousCommonId(pdw.getPatientDiagnosticComplaint().getId());
		pdw.getPatientDiagnosticComplaint().setId(generatePrimaryKey());
		updatePatientDiagnosticSession(pdw);
		return SUCCESS;
	}

	public String formReWork() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			
			//TODO
			/*try {
				employeeList = employeeService.viewByCategoryType("DENTAL_DOCTOR");	
				System.out.println(employeeList.size());
			} catch (Exception e) {
				e.printStackTrace();
			}*/

			
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticComplaint = getPatientDiagnosticWrapper().getPatientDiagnosticComplaint();
				System.out.println(patientDiagnosticComplaint);
			} else {
				System.err.println("Complaint is null, cannot be edited");
				return INPUT;
			}
			
			return SUCCESS;
		} else {
			return INPUT;
		}
	}	
	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			
			//TODO
			/*try {
				employeeList = employeeService.viewByCategoryType("DENTAL_DOCTOR");	
				System.out.println(employeeList.size());
			} catch (Exception e) {
				e.printStackTrace();
			}*/

			
			if(getPatientDiagnosticWrapper() != null) {
				patientDiagnosticComplaint = getPatientDiagnosticWrapper().getPatientDiagnosticComplaint();
				System.out.println(patientDiagnosticComplaint);
			} else {
				System.err.println("Complaint is null, cannot be edited");
				return INPUT;
			}
			clearSessionVariables();
			return SUCCESS;
		} else {
			return INPUT;
		}
	}	
	
	public String view() {
		return SUCCESS;
	}
	
	public String save() {

		if (patientDiagnosticComplaint != null) {

			patientDiagnosticComplaint.setId(generatePrimaryKey());
			patientDiagnosticComplaint.setPatientId(patient.getId());
			patientDiagnosticComplaint.setStatus(State.PENDING.getDatabaseValue());
			addInsertSettings(patientDiagnosticComplaint);
			
			//int inserted = patientDiagnosticComplaintService.save(patientDiagnosticComplaint);
			
			//validation
			pdw = getPatientDiagnosticWrapper();
			pdw.setPatientDiagnosticComplaint(patientDiagnosticComplaint);
			updatePatientDiagnosticSession(pdw);
			addLoggerMessage("tbl_diagnostic_complaint", MessageType.PATIENT_DIAGNOSTIC.toString(), "SUCCESS", "PatientId: "
					+ patient.getId() + ", Host: " + ServletActionContext.getRequest().getRemoteHost());
			
			if(isPreviewVisited()) {
				return PREVIEW;
			} else {
				
				return SUCCESS;
			}
			
						

		} else {
			return INPUT;
		}

	}

	

	
	public PatientDiagnosticComplaint getPatientDiagnosticComplaint() {
		return patientDiagnosticComplaint;
	}

	public void setPatientDiagnosticComplaint(PatientDiagnosticComplaint patientDiagnosticComplaint) {
		this.patientDiagnosticComplaint = patientDiagnosticComplaint;
	}

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientDiagnosticComplaintAction.logger = logger;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}


	public List<Employee> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}	
	
	
}