/**
 * 
 */
package com.doerit.action.patient.missingTeeth;

import java.util.List;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.Patient;
import com.doerit.model.PatientMissingTeeth;
import com.doerit.service.PatientMissingTeethService;
import com.doerit.service.PatientService;
import com.doerit.util.State;

/**
 * @author Arjuna
 *
 */
public class MissingTeethAction extends AbstractDownloadManamentAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(MissingTeethAction.class);

	@Autowired
	PatientService patientService;
	@Autowired
	private PatientMissingTeethService patientMissingTeethService;

	private Patient patient;
	private PatientMissingTeeth patientMissingTeeth;

	private List<PatientMissingTeeth> records;

	private String teethType;
	private String teethVal;
	private String patientId;

	public String view() {

		try {
			System.out.println("pat id" + patientId);
			beforeAction();
			pager = patientMissingTeethService
					.viewAllByPagerAndPatientIdAndStatus(pager, patientId,
							State.ACTIVE.getDatabaseValue());
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur");
			// logger
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public String viewMissing() {
		return SUCCESS;
	}

	public String addMissingTeeth() {
		// System.out.println("patient id " + patientId);
		return SUCCESS;
	}

	public String addPermanentMissingTeeth() {
		// System.out.println("patient id " + patientId);
		return SUCCESS;
	}

	public String addMixedMissingTeeth() {
		// System.out.println("patient id " + patientId);
		return SUCCESS;
	}

	public String save() {

		patientMissingTeeth = new PatientMissingTeeth();

		if (teethVal != null) {

			try {

				patientMissingTeeth.setId(generatePrimaryKey());
				patientMissingTeeth.setPatientId(patientId);
				patientMissingTeeth.setTeethType(teethType);
				patientMissingTeeth.setTeethList(teethVal);
				patientMissingTeeth.setStatus(State.ACTIVE.getDatabaseValue());
				addInsertSettings(patientMissingTeeth);

				System.out.println(patientMissingTeeth.toString());

				patientMissingTeethService.save(patientMissingTeeth);
				addLoggerMessage("tbl_patient_missing_teeth", "ADD", "SUCCESS",
						"Email: " + ", Host: " + ServletActionContext
								.getRequest().getRemoteHost());
				return SUCCESS;
			} catch (Exception e) {
				// System.out.println("action class error");
				e.printStackTrace();
			}
		}
		return SUCCESS;
	}

	//delete record temporary ( set status bit to 0 )
	public String deleteTemporary() {

		try {
			if (getId() != null && patientMissingTeeth != null) {

				patientMissingTeeth = patientMissingTeethService
						.getPatientMissingTeethById(getId());
				System.out.println("id " + getId() + " patientMissingTeeth "
						+ patientMissingTeeth.toString());

				patientMissingTeeth.setStatus(State.DELETED.getDatabaseValue());
				patientMissingTeethService.update(patientMissingTeeth);
				return view();
			} else {
				addActionError("Record was not updated");
				return INPUT;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;

	}

	/*
	 * public String deletePermonent() {
	 * 
	 * if (teethVal() != null) { patientService.delete(getId()); }
	 * 
	 * return viewAll(); }
	 */

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientMissingTeeth getMissingTeeth() {
		return patientMissingTeeth;
	}

	public void setMissingTeeth(PatientMissingTeeth missingTeeth) {
		this.patientMissingTeeth = missingTeeth;
	}

	public String getTeethVal() {
		return teethVal;
	}

	public void setTeethVal(String teethVal) {
		this.teethVal = teethVal;
	}

	public PatientMissingTeeth getPatientMissingTeeth() {
		return patientMissingTeeth;
	}

	public void setPatientMissingTeeth(
			PatientMissingTeeth patientMissingTeeth) {
		this.patientMissingTeeth = patientMissingTeeth;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public PatientMissingTeethService getPatientMissingTeethService() {
		return patientMissingTeethService;
	}

	public void setPatientMissingTeethService(
			PatientMissingTeethService patientMissingTeethService) {
		this.patientMissingTeethService = patientMissingTeethService;
	}

	public PatientService getPatientService() {
		return patientService;
	}

	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	public String getTeethType() {
		return teethType;
	}

	public void setTeethType(String teethType) {
		this.teethType = teethType;
	}

	public List<PatientMissingTeeth> getRecords() {
		return records;
	}

	public void setRecords(List<PatientMissingTeeth> records) {
		this.records = records;
	}

}
