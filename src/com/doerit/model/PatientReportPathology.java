package com.doerit.model;

import java.text.ParseException;
import java.util.Date;

public class PatientReportPathology implements InsertUpdate {

	private String id;
	private String patientId;
	private String prNumber;
	private String accessionNumber;
	private String caseNumber;
	private Date reportDate;
	private String reportDateString;
	private String verifiedBy;
	private String note;
	private String fileName;
	private String fileType;
	private Byte status;
	private Integer sortOrder;
	private String insertUserId;
	private String updateUserId;
	private Date insertDatetime;
	private Date updateDatetime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId == null ? null : patientId.trim();
	}

	public String getPrNumber() {
		return prNumber;
	}

	public void setPrNumber(String prNumber) {
		this.prNumber = prNumber == null ? null : prNumber.trim();
	}

	public String getAccessionNumber() {
		return accessionNumber;
	}

	public void setAccessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber == null ? null : accessionNumber.trim();
	}

	public String getCaseNumber() {
		return caseNumber;
	}

	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber == null ? null : caseNumber.trim();
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getVerifiedBy() {
		return verifiedBy;
	}

	public void setVerifiedBy(String verifiedBy) {
		this.verifiedBy = verifiedBy == null ? null : verifiedBy.trim();
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note == null ? null : note.trim();
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName == null ? null : fileName.trim();
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType == null ? null : fileType.trim();
	}

	public Byte getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Integer getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getInsertUserId() {
		return insertUserId;
	}

	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId == null ? null : insertUserId.trim();
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId == null ? null : updateUserId.trim();
	}

	public Date getInsertDatetime() {
		return insertDatetime;
	}

	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getReportDateString() {
		if(this.reportDate != null) {
			reportDateString = Patient.sdf.format(this.reportDate);
		}
		return reportDateString;
	}

	public void setReportDateString(String reportDateString) {
		this.reportDateString = reportDateString;
		
		if(this.reportDateString != null && !this.reportDateString.isEmpty()) {
			
			try {
				Date date = Patient.sdf.parse(this.reportDateString);
				this.reportDate = date;
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else {
			this.reportDate = null;
		}
	}
	
}