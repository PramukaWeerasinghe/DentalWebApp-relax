package com.doerit.action.patient;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractManagementAction;
import com.doerit.exception.SessionNotExist;
import com.doerit.model.Patient;
import com.doerit.model.PatientVisit;
import com.doerit.model.ActivityLogger.MessageType;
import com.doerit.service.DepartmentService;
import com.doerit.service.PatientService;
import com.doerit.service.PatientVisitService;
import com.doerit.util.Pager;

public class PatientVisitAction extends AbstractManagementAction{
	
	private static final long serialVersionUID = 1L;
	
	private static Logger logger = Logger.getLogger(PatientVisitAction.class);
	
	@Autowired PatientVisitService patientVisitService;
	@Autowired PatientService patientService;
	@Autowired DepartmentService districtService;
	
	private Patient patient;
	private PatientVisit patientVisit;

	private List<PatientVisit> patientVisits;
	
	private String searchKey;
	private String searchWord;
	private String visitComment;
	private String patientId;
	
	private String departmentId;
	private String visitDate;
	
	
	public String view() {
		if(this.searchWord != null && !this.searchWord.equals("")) {
			patient = patientService.viewBySerial(this.searchWord);
			if(patient != null) {
				setPatient(patient);
				beforeAction();
				pager = patientVisitService.viewByPatientId(pager, patient.getSerialNumber());
				pager = setActionContext(pager);
			}
			
		} 
		return SUCCESS;
	}

	public String viewByPatientId() {
		if(getPatientId() != null) {
			//System.out.println("patient id "+ getPatientId());
			patient = patientService.viewById(getPatientId());
			if(patient != null) {
				setPatient(patient);
				beforeAction();
				pager = patientVisitService.viewByPatientId(pager, patient.getSerialNumber());
				pager = setActionContext(pager);
			}
			
			return SUCCESS;
		} 
		else {
			return ERROR;
		}
		
	}
	
	public String viewVisits() {

		return viewByPatientId();

	}

	public String searchVisitsByDepartmentAndDate() {
		
		try {
		if(departmentId != null && !departmentId.equals("") && visitDate !=null) {
			
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(visitDate);
			
			beforeAction();
			pager = patientVisitService.searchByDepartmentAndDate(pager, departmentId, date);
			pager = setActionContext(pager);						
		
			return SUCCESS;
		}else {
			return INPUT;
		}			
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}

		
	}
	
	public String addVisit() {		
		
		try {
			if(this.patientId != null && !getPatientId().equals("")) {
				System.out.println(getPatientId());
				patient = patientService.viewBySerial(getPatientId());
				setPatient(patient);
				setPatientVisit(new PatientVisit());
				
				beforeAction();
				
				patientVisit.setComment(this.visitComment);
				patientVisit.setId(generatePrimaryKey());
				patientVisit.setPatientId(getPatientId());
				patientVisit.setDepartmentId(getSessionUser().getDepartment());
				patientVisit.setInsertDatetime(new Date());
				patientVisit.setInsertUserId(getSessionUserId());
				patientVisitService.save(patientVisit);
				
				pager = patientVisitService.viewByPatientId(pager, patient.getSerialNumber());
				pager = setActionContext(pager);
			}		
			
		} catch (SessionNotExist e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return SUCCESS;
	}

	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
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


	public String getVisitComment() {
		return visitComment;
	}


	public void setVisitComment(String visitComment) {
		this.visitComment = visitComment;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public PatientVisit getPatientVisit() {
		return patientVisit;
	}

	public void setPatientVisit(PatientVisit patientVisit) {
		this.patientVisit = patientVisit;
	}


	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public List<PatientVisit> getPatientVisits() {
		return patientVisits;
	}

	public void setPatientVisits(List<PatientVisit> patientVisits) {
		this.patientVisits = patientVisits;
	}






}
