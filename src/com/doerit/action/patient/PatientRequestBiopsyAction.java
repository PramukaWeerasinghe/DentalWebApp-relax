package com.doerit.action.patient;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.exception.SessionNotExist;
import com.doerit.model.Patient;
import com.doerit.model.PatientRequestBiopsy;
import com.doerit.model.ActivityLogger.MessageType;
import com.doerit.service.PatientRequestBiopsyService;
import com.doerit.service.PatientService;
import com.doerit.util.State;


public class PatientRequestBiopsyAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientRequestBiopsyAction.class);
	
	@Autowired PatientRequestBiopsyService patientRequestBiopsyService;
	@Autowired PatientService patientService;

	private Patient patient;
	private PatientRequestBiopsy patientRequestBiopsy;
	private String patientSerial;

	//biopsy types for the form start
	private List<String> biopsyTypes;
	private String biopsyType;
	private String previousBiopsyType;
	
	
	public String getBiopsyType() {
		return biopsyType;
	}

	public void setBiopsyType(String biopsyType) {
		this.biopsyType = biopsyType;
	}

	
	
	public PatientRequestBiopsyAction(){
		super();
		biopsyTypes = new ArrayList<String>();
		biopsyTypes.add("incision");
		biopsyTypes.add("excision");
		biopsyTypes.add("FNAB");
		biopsyTypes.add("smear");
		
		lesionTypes = new ArrayList<String>();
		lesionTypes.add("Extraosseous");
		lesionTypes.add("Intraosseous");
		
	}
	
	public String[] getDefaultBiopsyType(){
		return new String [] {}; //no default values currently
	}
	
	public List<String> getBiopsyTypes() {
		return biopsyTypes;
	}

	public void setBiopsyTypes(List<String> biopsyTypes) {
		this.biopsyTypes = biopsyTypes;
	}	
	//biopsy types for the form end
	
	public String getPreviousBiopsyType() {
		return previousBiopsyType;
	}

	public void setPreviousBiopsyType(String biopsyTypes) {
		this.previousBiopsyType = biopsyTypes;
	}

	
	//lession type start
	private List<String> lesionTypes;




	private String typeOfLession;	
	
	public List<String> getLesionTypes() {
		return lesionTypes;
	}

	public void setLesionTypes(List<String> lesionTypes) {
		this.lesionTypes = lesionTypes;
	}

	public String getLesionType() {
		return typeOfLession;
	}

	public void setLesionType(String lesionType) {
		this.typeOfLession = lesionType;
	}	
	//lesion type ends
	
	
	


	public String form() {
		return SUCCESS;
	}


	public String save() throws SessionNotExist {
		patient = patientService.viewBySerial(patientRequestBiopsy.getPatientSerialNumber());
		
		if(patient == null) {
			addActionMessage("patient serial number is not valid, please check it");
			return INPUT;
		}else {
			if (patientRequestBiopsy != null) {

				if (patientRequestBiopsy.getId() != null && !patientRequestBiopsy.getId().isEmpty()) {

					int updated = patientRequestBiopsyService.update(patientRequestBiopsy);
					if (updated == 1) {
						addActionMessage("Updated");
						addUpdateSettings(patientRequestBiopsy);
						this.id = patientRequestBiopsy.getId();
						return view();
					} else {
						addActionError("Not updated");
						return INPUT;
					}
				} else {
					patientRequestBiopsy.setId(generatePrimaryKey());
					patientRequestBiopsy.setPatientSerialNumber(patient.getSerialNumber());
					addInsertSettings(patientRequestBiopsy);
					patientRequestBiopsy.setStatus(State.ACTIVE.getDatabaseValue());
					System.out.println("patientRequestBiopsy " + patientRequestBiopsy);
					
					int inserted = patientRequestBiopsyService.save(patientRequestBiopsy);
					if (inserted == 1) {
						addActionMessage("Inserted");
						addLoggerMessage("tbl_patient_request_biopsy", MessageType.PATIENT_BIOPSY_REQUESTED.toString(),
								"SUCCESS", "PatientRequestBiopsyId: " + patientRequestBiopsy.getId() + ", Host: " + ServletActionContext.getRequest().getRemoteHost() + ",USER:"+ getSessionUser().getName() );
						this.id = patientRequestBiopsy.getId();
						return view();
					} else {
						addActionError("Not inserted");
						return INPUT;
					}
				}

			} else {
				return INPUT;
			}
			
			
			
		}


	}
	
	
	public String edit() {
		view();
		return SUCCESS;
	}

	public String draw() {
		view();
		return SUCCESS;
	}
	
	public String savedraw() {
		view();
		return SUCCESS;
	}
	
	public String view() {
		if(getId() != null) {
			patientRequestBiopsy = patientRequestBiopsyService.viewById(getId());
			return SUCCESS;
			
		}else {
			addActionError("Invalid access");
			return INPUT;
		} 
		
	}	
	
	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientRequestBiopsyAction.logger = logger;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientRequestBiopsy getPatientRequestBiopsy() {
		return patientRequestBiopsy;
	}

	public void setPatientRequestBiopsy(PatientRequestBiopsy patientRequestBiopsy) {
		this.patientRequestBiopsy = patientRequestBiopsy;
	}

	public String getPatientSerial() {
		return patientSerial;
	}

	public void setPatientSerial(String patientSerial) {
		this.patientSerial = patientSerial;
	}	

}
