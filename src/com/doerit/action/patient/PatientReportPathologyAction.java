package com.doerit.action.patient;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDocumentSupportManagementAction;
import com.doerit.model.DocumentWithBLOBs;
import com.doerit.model.Patient;
import com.doerit.model.PatientReportPathologyWithBLOBs;
import com.doerit.service.PatientReportPathologyService;
import com.doerit.service.PatientService;
import com.doerit.util.DocumentCategory;
import com.doerit.util.EntityType;
import com.doerit.util.FileManager;
import com.doerit.util.State;

public class PatientReportPathologyAction extends AbstractDocumentSupportManagementAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(PatientReportPathologyAction.class);
	@Autowired PatientService patientService;
	@Autowired PatientReportPathologyService patientReportPathologyService;

	private String patientId;
	private Patient patient;
	private List<PatientReportPathologyWithBLOBs> pathologyReports;
	private PatientReportPathologyWithBLOBs patientReportPathology;
	
	private void loadPreviousReports() {
		if(patientId != null) {
			pathologyReports = patientReportPathologyService.viewByPatientId(patientId);
		}
	}
	
	public String form() {
		if(patientId != null) {
			patient = patientService.viewById(patientId);
			loadPreviousReports();
			return SUCCESS;
		} else {
			return INPUT;
		}
		
	}
	
	public String view() {
		if(getId() != null) {
			patientReportPathology = patientReportPathologyService.viewById(getId());
		} 
		return SUCCESS;
	}	
	
	public String save(){
		
		loadPreviousReports();
		
		if(patientReportPathology != null) {
			
			if(patientReportPathology.getId() == null) {
				
				if(getUpload() != null) {
				
					String pathologyKey = generatePrimaryKey();
					
					patientReportPathology.setId(pathologyKey);
					patientReportPathology.setPatientId(patientId);
					addInsertSettings(patientReportPathology);
					patientReportPathology.setStatus(State.ACTIVE.getDatabaseValue());
					int updated = patientReportPathologyService.save(patientReportPathology);
					
					if(updated == 1) {
						document = new DocumentWithBLOBs();
						document.setId(generatePrimaryKey());
						document.setContent(FileManager.getFileContent(getUpload()));
						document.setContentType(getUploadContentType());
						document.setFileName(getUploadFileName());
						document.setDocumentCategory(DocumentCategory.PATHOLOGY.getDatabaseValue());
						document.setEntityName(EntityType.PATIENT_PATHOLOGY.getDatabaseValue());
						document.setEntityId(pathologyKey);
						document.setDocuementDescription("Size: " + document.getContent().length + " bytes");
						document.setState(State.ACTIVE.getDatabaseValue());
						addInsertSettings(document);
						documentService.save(document);
						logger.info("Pathology report uploaded " + document.getId());
						document = null;
						patientReportPathology = null;
						addActionMessage("Records Updated");
						return form();
					}
				} else {
					addActionError("File is empty");
					return INPUT;
				}
			
			}else {
				addActionError("");
				return INPUT;
			}
		} else {
			return INPUT;
		}
		
		return INPUT;
	}	

	public String edit() {
		return SUCCESS;
	}
	
	public String delete() {
		return SUCCESS;
	}
	
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public PatientReportPathologyWithBLOBs getPatientReportPathology() {
		return patientReportPathology;
	}


	public void setPatientReportPathology(PatientReportPathologyWithBLOBs patientReportPathology) {
		this.patientReportPathology = patientReportPathology;
	}

	public List<PatientReportPathologyWithBLOBs> getPathologyReports() {
		return pathologyReports;
	}

	public void setPathologyReports(List<PatientReportPathologyWithBLOBs> pathologyReports) {
		this.pathologyReports = pathologyReports;
	}

	public String display() {
		return NONE;
	}
	
}
