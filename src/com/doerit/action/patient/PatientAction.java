package com.doerit.action.patient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.model.District;
import com.doerit.model.Patient;
import com.doerit.model.PatientAdditionalProperty;
import com.doerit.model.PatientGuardianWithBLOBs;
import com.doerit.model.PatientReportPathology;
import com.doerit.model.ActivityLogger.MessageType;
import com.doerit.service.DistrictService;
import com.doerit.service.PatientAdditionalPropertyService;
import com.doerit.service.PatientGuardianService;
import com.doerit.service.PatientMissingTeethService;
import com.doerit.service.PatientReportPathologyService;
import com.doerit.service.PatientService;
import com.doerit.util.PdfPatientInformation;
import com.doerit.util.PdfPatientSticker;
import com.doerit.util.State;
import com.itextpdf.text.DocumentException;

public class PatientAction extends AbstractDownloadManamentAction {

	private static final long serialVersionUID = 1L;

	private static Logger logger = Logger.getLogger(PatientAction.class);

	public static Logger getLogger() {
		return logger;
	}

	public static void setLogger(Logger logger) {
		PatientAction.logger = logger;
	}

	@Autowired
	PatientService patientService;
	@Autowired
	DistrictService districtService;
	@Autowired
	PatientAdditionalPropertyService patientAdditionalPropertyService;
	@Autowired
	PatientGuardianService patientGuardianService;
	@Autowired
	PatientReportPathologyService patientReportPathologyService;
	@Autowired
	PatientMissingTeethService patientMissingTeethService;

	private Patient patient;
	private List<Patient> patients;
	private List<PatientAdditionalProperty> patientAdditionalProperties;
	private List<PatientGuardianWithBLOBs> patientGuardians;
	private List<PatientReportPathology> patientReportPathologies;
	private String searchKey;
	private String searchWord;
	private Date visitDate;
	
	private String missingTeethStatus = "false";

	public String registrationForm() {
		return SUCCESS;
	}

	public String view() {
		// System.out.println(getId());
		if (getId() != null) {
			patient = patientService.viewById(getId());
			viewProperties();
			viewGuardians();
			
			try {
				if (patientMissingTeethService.getPatientMissingTeethRecordCount(patient.getId(),State.ACTIVE.getDatabaseValue()) > 0 ) {
					
					setMissingTeethStatus("true"); 
				}else {
					setMissingTeethStatus("false");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			addActionError("Invalid access");
		}
		return SUCCESS;
	}

	// viewBySerial
	public String viewBySerial() {
		// System.out.println(getId());
		if (getSerial() != null) {
			patient = patientService.viewBySerial(getSerial());
			viewProperties();
			viewGuardians();
		} else {
			addActionError("Invalid access");
		}
		return SUCCESS;
	}
 
	 public String addMissingTeeth() {
		 @SuppressWarnings("unused")
		String patientId;
		 return SUCCESS;
	 }

	
	
	
	private String viewProperties() {
		if (getId() != null) {
			patientAdditionalProperties = patientAdditionalPropertyService.viewByPatientId(getId());
		} else {
			addActionError("Invalid access");
		}
		return SUCCESS;
	}

	private String viewGuardians() {
		if (getId() != null) {
			patientGuardians = patientGuardianService.viewByPatientId(getId());
		} else {
			addActionError("Invalid access");
		}
		return SUCCESS;
	}

	/*
	 * public String viewAll() { this.patients =
	 * patientService.viewAll(State.ACTIVE); return SUCCESS; }
	 */

	public String viewAll() {
		try {
			beforeAction();
			pager = patientService.viewAllByPagerAndStatus(pager, State.ACTIVE.getDatabaseValue());
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur");
			// logger
			e.printStackTrace();
		}
		return SUCCESS;
	}

	/*
	 * public String viewAllHidden() { this.patients =
	 * patientService.viewAll(State.DELETED); return SUCCESS; }
	 */

	public String search() {

		try {
			beforeAction();
			pager = patientService.search(pager, this.searchKey, this.searchWord);
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;
	}

	//search visits
/*	public String searchByVisit() {
		try {
			beforeAction();
			pager = patientService.searchByDepartmentVist(pager, this.searchKey, visitDate);
			pager = setActionContext(pager);
		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;
		
		
	}*/
	
	public String save() {

		if (patient != null) {

			if (patient.getId() != null && !patient.getId().isEmpty()) {

				addUpdateSettings(patient);
				int updated = patientService.update(patient);
				if (updated == 1) {
					addActionMessage("Updated patient info");
					addLoggerMessage("tbl_patient", MessageType.PATIENT_UPDATED.toString(), "SUCCESS", "PatientId: "
							+ patient.getId() + ", Host: " + ServletActionContext.getRequest().getRemoteHost());
					//addUpdateSettings(patient);
					this.id = patient.getId();
					return view();
				} else {
					addActionError("Not updated");
					return INPUT;
				}
			} else {
				patient.setId(generatePrimaryKey());
				patient.setSerialNumber(createSerialNumber());
				addInsertSettings(patient);
				patient.setStatus(State.ACTIVE.getDatabaseValue());
				int inserted = patientService.save(patient);
				saveAdditionalProperties();
				if (inserted == 1) {
					addActionMessage("Inserted a patient record");
					addLoggerMessage("tbl_patient", MessageType.PATIENT_ADDED.toString(), "SUCCESS", "PatientId: "
							+ patient.getId() + ", Host: " + ServletActionContext.getRequest().getRemoteHost());
					this.id = patient.getId();
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

	private void saveAdditionalProperties() {
		for (PatientAdditionalProperty p : patientAdditionalProperties) {
			p.setPatientId(patient.getId());
			p.setId(generatePrimaryKey());
			addInsertSettings(p);
			p.setStatus(State.ACTIVE.getDatabaseValue());
			p.setName(p.getNameKey());

			patientAdditionalPropertyService.save(p);
		}
	}

	public String edit() {
		return view();
	}

	public String deleteTemporary() {

		view();

		if (patient != null) {
			patient.setStatus(State.DELETED.getDatabaseValue());
			return save();
		}
		addActionError("Record was not updated");
		return viewAll();
	}

	public String deletePermonent() {

		if (getId() != null) {
			patientService.delete(getId());
		}

		return viewAll();
	}

	public String patientInformationPdf() {

		try {
			view();
			PdfPatientInformation pdfPatientInformation = new PdfPatientInformation();
			ByteArrayOutputStream baos = pdfPatientInformation.createPdf(patient);
			return download(baos, patient.getSerialNumber());
		} catch (DocumentException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return INPUT;
		} catch (IOException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return INPUT;
		}

	}

	public String patientStickerPdf() {

		try {
			view();
			PdfPatientSticker pdfPatientSticker = new PdfPatientSticker();
			ByteArrayOutputStream baos;
			baos = pdfPatientSticker.createPdf(patient);
			return download(baos, patient.getSerialNumber());
		} catch (DocumentException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return INPUT;
		} catch (IOException e) {
			e.printStackTrace();
			addActionError(e.getMessage());
			return INPUT;
		}

	}

	private String download(ByteArrayOutputStream baos, String prefix) {
		byte[] pdfFile = baos.toByteArray();
		setFileInputStream(new ByteArrayInputStream(pdfFile));

		String dateString = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		setFileName(prefix + dateString + ".pdf");
		return SUCCESS;
	}

	private String createSerialNumber() {
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR) % 100; // take last two digits
		int month = calendar.get(Calendar.MONTH) + 1; // java month zero basis

		String serial = String.valueOf(year);
		if (month < 10) {
			serial += "0"; // make month two digits
		}
		serial += String.valueOf(month);

		int previousCount = patientService.findMonthlyCount(serial);
		previousCount++;

		serial += String.format("%04d", previousCount); // make count 4 digits

		return serial;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public List<District> getDistricts() {
		return districtService.viewAll();
	}

	public List<Patient> getPatients() {
		return patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
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

	public List<PatientAdditionalProperty> getPatientAdditionalProperties() {
		return patientAdditionalProperties;
	}

	public void setPatientAdditionalProperties(List<PatientAdditionalProperty> patientAdditionalProperties) {
		this.patientAdditionalProperties = patientAdditionalProperties;
	}

	public List<PatientGuardianWithBLOBs> getPatientGuardians() {
		return patientGuardians;
	}

	public void setPatientGuardians(List<PatientGuardianWithBLOBs> patientGuardians) {
		this.patientGuardians = patientGuardians;
	}

	public Date getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}

	public String getMissingTeethStatus() {
		return missingTeethStatus;
	}

	public void setMissingTeethStatus(String missingTeethStatus) {
		this.missingTeethStatus = missingTeethStatus;
	}

}
