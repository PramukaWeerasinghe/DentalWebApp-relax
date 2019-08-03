/**
 * 
 */
package com.doerit.action.patient.teeth;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.action.AbstractManagementAction;
import com.doerit.exception.SessionNotExist;
import com.doerit.model.PatientMissingTeeth;
import com.doerit.model.PatientTeethDisorder;
import com.doerit.model.Tooth;
import com.doerit.service.PatientMissingTeethService;
import com.doerit.service.PatientService;
import com.doerit.service.PatientTeethDisorderService;
import com.doerit.util.Pager;
import com.doerit.util.SessionKey;
import com.doerit.util.State;
import com.google.gson.Gson;

/**
 * @author Arjuna
 *
 */
public class PatientTeethDisorderAction extends AbstractDownloadManamentAction {
	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger
			.getLogger(PatientTeethDisorderAction.class);

	private PatientTeethDisorder patientTeethDisorder;
	private String patientId;
	private List<PatientTeethDisorder> patientTeethDisorders;
	
	private PatientTeethDisorder patientTeethDisorder2;

	@Autowired
	private PatientService patientService;
	@Autowired
	private PatientMissingTeethService patientMissingTeethService;
	@Autowired
	private PatientTeethDisorderService patientTeethDisorderService;

	// patientMissingTeeth instance to store previous missing teeth info of the
	// patient
	private PatientMissingTeeth patientMissingTeeth;

	public PatientMissingTeeth getPatientMissingTeeth() {
		return patientMissingTeeth;
	}
	public void setPatientMissingTeeth(
			PatientMissingTeeth patientMissingTeeth) {
		this.patientMissingTeeth = patientMissingTeeth;
	}

	private List<Tooth> teeth;

	public static Logger getLogger() {
		return logger;
	}
	public static void setLogger(Logger logger) {
		PatientTeethDisorderAction.logger = logger;
	}

	public String view() {
		return SUCCESS;
	}

	public void viewOldRecords(String patientId) {

		try {
			beforeAction();
			pager = patientTeethDisorderService.getPatientOldRecords(pager, patientId);
			pager = setActionContext(pager);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String addDisorder() {

		if (patientId != null && patientId != "") {
			patientMissingTeeth = patientMissingTeethService.getPatientMissingTeethById(patientId);
			viewOldRecords(patientId);
			clearSessionVariables();
		}

		return SUCCESS;
	}

	public Boolean isMissingTeethAdded() {
		if (patientId != null && patientMissingTeethService
				.getPatientMissingTeethById(patientId) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	//session save
	protected void updatePatientTeethDisorderSession(PatientTeethDisorder ptd) {
		session.put(SessionKey.PATIENT_TEETH_DISORDER, ptd);
	}	

	//session clear
	protected void clearSessionVariables() {
		try {
			removeSessionVariable(SessionKey.PATIENT_TEETH_DISORDER);
		} catch (SessionNotExist e) {
			logger.error(e);
		}
	}
	
	public String confirm() {
		
		
	
		if (session.get(SessionKey.PATIENT_TEETH_DISORDER) != null) {
			
			PatientTeethDisorder patientTeethDisorder2 = (PatientTeethDisorder) session.get(SessionKey.PATIENT_TEETH_DISORDER);
			
			System.out.println("patientTeethDisorder ognl set values:" + patientTeethDisorder);
			
			try {
				//patientTeethDisorder = patientTeethDisorderService.viewById(patientTeethDisorder2.getId());
				
				patientTeethDisorder2.setComment(patientTeethDisorder.getComment());
				patientTeethDisorder2.setTreatmentPlan(patientTeethDisorder.getTreatmentPlan());
				patientTeethDisorder2.setStatus(State.ACTIVE.getDatabaseValue());
				
				System.out.println("patientTeethDisorder2 confirmed :" + patientTeethDisorder2);
				System.out.println("patientTeethDisorder confirmed :" + patientTeethDisorder);
				
				int update = patientTeethDisorderService.update(patientTeethDisorder2);
				
				if (update == 1) {
					addActionMessage("updated");
					clearSessionVariables();
				} else {
					addActionError("faild to save");
				}
			} catch (Exception e) {
				e.printStackTrace();
				return INPUT;
			}
			
			return SUCCESS;
		}else {
			return INPUT;
		}
	}
	
	public String save() {

		if (patientTeethDisorder != null) {

			patientTeethDisorder.setId(generatePrimaryKey());
			addInsertSettings(patientTeethDisorder);
			patientTeethDisorder.setStatus(State.PENDING.getDatabaseValue());

			System.out.println(
					" pat deso info " + patientTeethDisorder.toString() + "\n");
			
			clearSessionVariables();
			updatePatientTeethDisorderSession(patientTeethDisorder);

/*			int update = patientTeethDisorderService.save(patientTeethDisorder);

			
			if (update == 1) {
				addActionMessage("updated");
				
				clearSessionVariables();
				updatePatientTeethDisorderSession(patientTeethDisorder);
			} else {
				addActionError("faild to save");
			}*/

			return SUCCESS;
		} else {
			addActionError("patientTeethDisorderService was failed");
			return INPUT;
		}

	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	@Override
	public String toString() {
		return "PatientTeethDisorderAction [patientId=" + patientId + ", teeth="
				+ teeth + "]";
	}

	public PatientMissingTeethService getPatientMissingTeethService() {
		return patientMissingTeethService;
	}
	public void setPatientMissingTeethService(
			PatientMissingTeethService patientMissingTeethService) {
		this.patientMissingTeethService = patientMissingTeethService;
	}
	public List<Tooth> getTeeth() {
		return teeth;
	}
	public void setTeeth(List<Tooth> teeth) {
		this.teeth = teeth;
	}

	public PatientTeethDisorder getPatientTeethDisorder() {
		return patientTeethDisorder;
	}
	public void setPatientTeethDisorder(
			PatientTeethDisorder patientTeethDisorder) {
		this.patientTeethDisorder = patientTeethDisorder;
	}
	public List<PatientTeethDisorder> getPatientTeethDisorders() {
		return patientTeethDisorders;
	}
	public void setPatientTeethDisorders(List<PatientTeethDisorder> patientTeethDisorders) {
		this.patientTeethDisorders = patientTeethDisorders;
	}

}
