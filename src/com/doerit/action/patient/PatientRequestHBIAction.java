package com.doerit.action.patient;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientRequestHBI;
import com.doerit.service.PatientRequestHBIService;
import com.doerit.service.PatientService;
import com.doerit.util.State;


public class PatientRequestHBIAction extends AbstractDownloadManamentAction{

	private static final long serialVersionUID = 1L;
	//private static Logger logger = Logger.getLogger(PatientRequestConebeamAction.class);
	

	@Autowired  PatientRequestHBIService patientRequestHBIService;
	@Autowired PatientService patientService;
	
	private PatientRequestHBI patientRequestHBI;
	private Patient patient;	
	
	public String form() {
		return SUCCESS;
	}

	public String list() {
      try {
        beforeAction();
        pager = patientRequestHBIService.viewAllByPagerAndStatus(pager, State.PENDING.getDatabaseValue());
        pager = setActionContext(pager);
    } catch (Exception e) {
        addActionError("Exception occur " + e.getMessage());
        // logger
        e.printStackTrace();
    }
    return SUCCESS;
	}

	
/*    public String listRequests() {
      try {
          beforeAction();
          pager = patientRequestXrayService.viewAllByPagerAndStatus(pager, State.PENDING.getDatabaseValue());
          pager = setActionContext(pager);
      } catch (Exception e) {
          addActionError("Exception occur " + e.getMessage());
          // logger
          e.printStackTrace();
      }
      return SUCCESS;
  }*/
	
	public String save() {
		
		try {
			patient = patientService.viewBySerial(patientRequestHBI.getPatientId());
			System.out.println(patient);
			
			if(patient == null) {
				addActionMessage("Patient serial number is not valid, please check it");
				return INPUT;
				
			}else {
				if(patientRequestHBI != null) {
					patientRequestHBI.setId(generatePrimaryKey());
					patientRequestHBI.setPatientId(patient.getSerialNumber());
					patientRequestHBI.setInsertUserId(getSessionUserId());
					patientRequestHBI.setInsertDatetime(new Date());
					
					patientRequestHBI.setStatus(State.PENDING.getDatabaseValue());
					
					patientRequestHBIService.save(patientRequestHBI);
					addActionMessage("HBI requested was added");
					return SUCCESS;
				} else {
					addActionMessage("HBI request was not added");
					return INPUT;
					
				}
			
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}
		
	}

	public String view() {
		if(getId() != null) {
			patientRequestHBI = patientRequestHBIService.viewById(getId());
			return SUCCESS;
		} else {
			addActionError("Invalid access");
			return INPUT;
		}
	}	
	
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientRequestHBI getPatientRequestHBI() {
		return patientRequestHBI;
	}

	public void setPatientRequestHBI(PatientRequestHBI patientRequestHBI) {
		this.patientRequestHBI = patientRequestHBI;
	}


}
