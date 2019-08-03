package com.doerit.action.patient;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDocumentSupportManagementAction;
import com.doerit.model.DocumentWithBLOBs;
import com.doerit.model.Patient;
import com.doerit.model.PatientReportXrayWithBLOBs;
import com.doerit.service.PatientReportXrayService;
import com.doerit.service.PatientService;
import com.doerit.util.DocumentCategory;
import com.doerit.util.EntityType;
import com.doerit.util.FileManager;
import com.doerit.util.State;

public class PatientReportXrayAction extends AbstractDocumentSupportManagementAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientReportXrayAction.class);

	@Autowired
	PatientReportXrayService patientReportXrayService;
	@Autowired
	PatientService patientService;

	private Patient patient;
	private String patientId;

	private List<PatientReportXrayWithBLOBs> xrayReports;
	private PatientReportXrayWithBLOBs patientReportXray;

	private void loadPreviousReports() {
		if (patientId != null) {
			xrayReports = patientReportXrayService.viewByPatientId(patientId);
		}
	}

	public String form() {
		if (patientId != null) {
			patient = patientService.viewById(patientId);
			loadPreviousReports();
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	public String view() {
		if (getId() != null) {
			patientReportXray = patientReportXrayService.viewById(getId());
		}
		return SUCCESS;
	}

	public String viewAll() {
		try {
			beforeAction();

			pager = patientReportXrayService.viewAllByPagerAndStatus(pager, State.ACTIVE.getDatabaseValue());
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur");
			// logger
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String save() {

		loadPreviousReports();

		if (patientReportXray != null) {

			if (patientReportXray.getId() == null) {

				if (getUpload() != null) {

					String radiologyKey = generatePrimaryKey();

					patientReportXray.setId(radiologyKey);
					patientReportXray.setPatientId(patientId);
					addInsertSettings(patientReportXray);
					patientReportXray.setStatus(State.ACTIVE.getDatabaseValue());
					int updated = patientReportXrayService.save(patientReportXray);

					if (updated == 1) {

						document = new DocumentWithBLOBs();
						document.setId(generatePrimaryKey());
						document.setContent(FileManager.getFileContent(getUpload()));
						document.setContentType(getUploadContentType());
						document.setFileName(getUploadFileName());
						document.setDocumentCategory(DocumentCategory.X_RAY.getDatabaseValue());
						document.setEntityName(EntityType.PATIENT_X_RAY.getDatabaseValue());
						document.setEntityId(radiologyKey);
						document.setDocuementDescription("Size: " + document.getContent().length + " bytes");
						document.setState(State.ACTIVE.getDatabaseValue());
						addInsertSettings(document);
						documentService.save(document);
						logger.info("XRay report uploaded " + document.getId());
						document = null;
						patientReportXray = null;
						addActionMessage("Records Updated");
						return form();
					}
				} else {
					addActionError("File is empty");
					return INPUT;
				}

			} else {
				addActionError("");
				return INPUT;
			}
		} else {
			return INPUT;
		}
		
		return INPUT;

	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public PatientReportXrayWithBLOBs getPatientReportXray() {
		return patientReportXray;
	}

	public void setPatientReportXray(PatientReportXrayWithBLOBs patientReportXray) {
		this.patientReportXray = patientReportXray;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public List<PatientReportXrayWithBLOBs> getXrayReports() {
		return xrayReports;
	}

	public void setXrayReports(List<PatientReportXrayWithBLOBs> xrayReports) {
		this.xrayReports = xrayReports;
	}

	public String display() {
		return NONE;
	}

}
