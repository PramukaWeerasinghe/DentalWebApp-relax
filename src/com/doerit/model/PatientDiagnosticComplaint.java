package com.doerit.model;

import java.util.Date;

public class PatientDiagnosticComplaint implements InsertUpdate  {

	private String id;
	private String patientId;
	private String department;
    private String supervisor;
	private String complaint;
	private String complaintType;
	private String comment;
	private Byte status;
	private Integer sortOrder;
	private String insertUserId;
	private Date insertDatetime;
	private String updateUserId;
	private Date updateDatetime;
	private String complaintHistory;
	
	private String patientInitial;
	private String patientFirstName;
	private String patientSurname;
	
	public String getFullName() {  //fullName
		return this.patientInitial + " " + this.patientFirstName + " " + this.patientSurname;
	}
	
	public String getPatientInitial() {
		return patientInitial;
	}

	public void setPatientInitial(String patientInitial) {
		this.patientInitial = patientInitial  == null ? null : patientInitial.trim();
	}

	public String getPatientFirstName() {
		return patientFirstName;
	}

	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName  == null ? null : patientFirstName.trim();
	}

	public String getPatientSurname() {
		return patientSurname;
	}

	public void setPatientSurname(String patientSurname) {
		this.patientSurname = patientSurname  == null ? null : patientSurname.trim();
	}

	private String insertUserName;

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
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
	}

	public String getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor == null ? null : supervisor.trim();
	}

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint == null ? null : complaint.trim();
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType == null ? null : complaintType.trim();
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
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

	public Date getInsertDatetime() {
		return insertDatetime;
	}

	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId == null ? null : updateUserId.trim();
	}

	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}

	public String getComplaintHistory() {
		return complaintHistory;
	}

	public void setComplaintHistory(String complaintHistory) {
		this.complaintHistory = complaintHistory == null ? null : complaintHistory.trim();
	}

/*	@Override
	public String toString() {
		return "PatientDiagnosticComplaint [id=" + id + ", patientId=" + patientId + ", complaint=" + complaint
				+ ", complaintType=" + complaintType + ", comment=" + comment + ", status=" + status + ", sortOrder="
				+ sortOrder + ", insertUserId=" + insertUserId + ", insertDatetime=" + insertDatetime
				+ ", updateUserId=" + updateUserId + ", updateDatetime=" + updateDatetime + ", complaintHistory="
				+ complaintHistory + "]";
	}*/

	@Override
	public String toString() {
		return "PatientDiagnosticComplaint [id=" + id + ", patientId=" + patientId + ", complaint=" + complaint
				+ ", complaintType=" + complaintType + ", comment=" + comment + ", status=" + status + ", sortOrder="
				+ sortOrder + ", insertUserId=" + insertUserId + ", insertDatetime=" + insertDatetime
				+ ", updateUserId=" + updateUserId + ", updateDatetime=" + updateDatetime + ", complaintHistory="
				+ complaintHistory + ", insertUserName=" + insertUserName + "]";
	}	

	public String getInsertUserName() {
		return insertUserName;
	}

	public void setInsertUserName(String insertUserName) {
		this.insertUserName = insertUserName ;
	}

	

	
}