package com.doerit.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatientDiagnosticDrugHistory implements InsertUpdate {

	private String id;
	private String patientId;
	private String anticoagulantWarfarin;
	private String anticoagulantWarfarinDose;
	private String anticoagulantWarfarinFrequency;
	private String anticoagulantWarfarinDuration;
	private String anticoagulantClopidogrel;
	private String anticoagulantClopidogrelDose;
	private String anticoagulantClopidogrelFrequency;
	private String anticoagulantClopidogrelDuration;
	private String anticoagulantAspirin;
	private String anticoagulantAspirinDose;
	private String anticoagulantAspirinFrequency;
	private String anticoagulantAspirinDuration;
	private String anticoagulantOther;
	private String anticoagulantOtherDetail;
	private String anticoagulantOtherDose;
	private String anticoagulantOtherFrequency;
	private String anticoagulantOtherDuration;
	private String radiationtherapy;
	private String radiationtherapyDuration;
	private String comments;
	private String comment;
	private Byte status;
	private Integer sortOrder;
	private String insertUserId;
	private Date insertDatetime;
	private String updateUserId;
	private Date updateDatetime;
	
	private List<PatientDiagnosticDrug> drugs = new ArrayList<PatientDiagnosticDrug>();

	public void addDrug(PatientDiagnosticDrug drug) {
		this.drugs.add(drug);
	}
	
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

	public String getAnticoagulantWarfarin() {
		return anticoagulantWarfarin;
	}

	public void setAnticoagulantWarfarin(String anticoagulantWarfarin) {
		this.anticoagulantWarfarin = anticoagulantWarfarin == null ? null : anticoagulantWarfarin.trim();
	}

	public String getAnticoagulantWarfarinDose() {
		return anticoagulantWarfarinDose;
	}

	public void setAnticoagulantWarfarinDose(String anticoagulantWarfarinDose) {
		this.anticoagulantWarfarinDose = anticoagulantWarfarinDose == null ? null : anticoagulantWarfarinDose.trim();
	}

	public String getAnticoagulantWarfarinFrequency() {
		return anticoagulantWarfarinFrequency;
	}

	public void setAnticoagulantWarfarinFrequency(String anticoagulantWarfarinFrequency) {
		this.anticoagulantWarfarinFrequency = anticoagulantWarfarinFrequency == null ? null
				: anticoagulantWarfarinFrequency.trim();
	}

	public String getAnticoagulantWarfarinDuration() {
		return anticoagulantWarfarinDuration;
	}

	public void setAnticoagulantWarfarinDuration(String anticoagulantWarfarinDuration) {
		this.anticoagulantWarfarinDuration = anticoagulantWarfarinDuration == null ? null
				: anticoagulantWarfarinDuration.trim();
	}

	public String getAnticoagulantClopidogrel() {
		return anticoagulantClopidogrel;
	}

	public void setAnticoagulantClopidogrel(String anticoagulantClopidogrel) {
		this.anticoagulantClopidogrel = anticoagulantClopidogrel == null ? null : anticoagulantClopidogrel.trim();
	}

	public String getAnticoagulantClopidogrelDose() {
		return anticoagulantClopidogrelDose;
	}

	public void setAnticoagulantClopidogrelDose(String anticoagulantClopidogrelDose) {
		this.anticoagulantClopidogrelDose = anticoagulantClopidogrelDose == null ? null
				: anticoagulantClopidogrelDose.trim();
	}

	public String getAnticoagulantClopidogrelFrequency() {
		return anticoagulantClopidogrelFrequency;
	}

	public void setAnticoagulantClopidogrelFrequency(String anticoagulantClopidogrelFrequency) {
		this.anticoagulantClopidogrelFrequency = anticoagulantClopidogrelFrequency == null ? null
				: anticoagulantClopidogrelFrequency.trim();
	}

	public String getAnticoagulantClopidogrelDuration() {
		return anticoagulantClopidogrelDuration;
	}

	public void setAnticoagulantClopidogrelDuration(String anticoagulantClopidogrelDuration) {
		this.anticoagulantClopidogrelDuration = anticoagulantClopidogrelDuration == null ? null
				: anticoagulantClopidogrelDuration.trim();
	}

	public String getAnticoagulantAspirin() {
		return anticoagulantAspirin;
	}

	public void setAnticoagulantAspirin(String anticoagulantAspirin) {
		this.anticoagulantAspirin = anticoagulantAspirin == null ? null : anticoagulantAspirin.trim();
	}

	public String getAnticoagulantAspirinDose() {
		return anticoagulantAspirinDose;
	}

	public void setAnticoagulantAspirinDose(String anticoagulantAspirinDose) {
		this.anticoagulantAspirinDose = anticoagulantAspirinDose == null ? null : anticoagulantAspirinDose.trim();
	}

	public String getAnticoagulantAspirinFrequency() {
		return anticoagulantAspirinFrequency;
	}

	public void setAnticoagulantAspirinFrequency(String anticoagulantAspirinFrequency) {
		this.anticoagulantAspirinFrequency = anticoagulantAspirinFrequency == null ? null
				: anticoagulantAspirinFrequency.trim();
	}

	public String getAnticoagulantAspirinDuration() {
		return anticoagulantAspirinDuration;
	}

	public void setAnticoagulantAspirinDuration(String anticoagulantAspirinDuration) {
		this.anticoagulantAspirinDuration = anticoagulantAspirinDuration == null ? null
				: anticoagulantAspirinDuration.trim();
	}

	public String getAnticoagulantOther() {
		return anticoagulantOther;
	}

	public void setAnticoagulantOther(String anticoagulantOther) {
		this.anticoagulantOther = anticoagulantOther == null ? null : anticoagulantOther.trim();
	}

	public String getAnticoagulantOtherDetail() {
		return anticoagulantOtherDetail;
	}

	public void setAnticoagulantOtherDetail(String anticoagulantOtherDetail) {
		this.anticoagulantOtherDetail = anticoagulantOtherDetail == null ? null : anticoagulantOtherDetail.trim();
	}

	public String getAnticoagulantOtherDose() {
		return anticoagulantOtherDose;
	}

	public void setAnticoagulantOtherDose(String anticoagulantOtherDose) {
		this.anticoagulantOtherDose = anticoagulantOtherDose == null ? null : anticoagulantOtherDose.trim();
	}

	public String getAnticoagulantOtherFrequency() {
		return anticoagulantOtherFrequency;
	}

	public void setAnticoagulantOtherFrequency(String anticoagulantOtherFrequency) {
		this.anticoagulantOtherFrequency = anticoagulantOtherFrequency == null ? null
				: anticoagulantOtherFrequency.trim();
	}

	public String getAnticoagulantOtherDuration() {
		return anticoagulantOtherDuration;
	}

	public void setAnticoagulantOtherDuration(String anticoagulantOtherDuration) {
		this.anticoagulantOtherDuration = anticoagulantOtherDuration == null ? null : anticoagulantOtherDuration.trim();
	}

	public String getRadiationtherapy() {
		return radiationtherapy;
	}

	public void setRadiationtherapy(String radiationtherapy) {
		this.radiationtherapy = radiationtherapy == null ? null : radiationtherapy.trim();
	}

	public String getRadiationtherapyDuration() {
		return radiationtherapyDuration;
	}

	public void setRadiationtherapyDuration(String radiationtherapyDuration) {
		this.radiationtherapyDuration = radiationtherapyDuration == null ? null : radiationtherapyDuration.trim();
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments == null ? null : comments.trim();
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
	
	public List<PatientDiagnosticDrug> getDrugs() {
		return drugs;
	}

	public void setDrugs(List<PatientDiagnosticDrug> drugs) {
		this.drugs = drugs;
	}

	@Override
	public String toString() {
		return "PatientDiagnosticDrugHistory [id=" + id + ", patientId=" + patientId + ", anticoagulantWarfarin="
				+ anticoagulantWarfarin + ", anticoagulantWarfarinDose=" + anticoagulantWarfarinDose
				+ ", anticoagulantWarfarinFrequency=" + anticoagulantWarfarinFrequency
				+ ", anticoagulantWarfarinDuration=" + anticoagulantWarfarinDuration + ", anticoagulantClopidogrel="
				+ anticoagulantClopidogrel + ", anticoagulantClopidogrelDose=" + anticoagulantClopidogrelDose
				+ ", anticoagulantClopidogrelFrequency=" + anticoagulantClopidogrelFrequency
				+ ", anticoagulantClopidogrelDuration=" + anticoagulantClopidogrelDuration + ", anticoagulantAspirin="
				+ anticoagulantAspirin + ", anticoagulantAspirinDose=" + anticoagulantAspirinDose
				+ ", anticoagulantAspirinFrequency=" + anticoagulantAspirinFrequency + ", anticoagulantAspirinDuration="
				+ anticoagulantAspirinDuration + ", anticoagulantOther=" + anticoagulantOther
				+ ", anticoagulantOtherDetail=" + anticoagulantOtherDetail + ", anticoagulantOtherDose="
				+ anticoagulantOtherDose + ", anticoagulantOtherFrequency=" + anticoagulantOtherFrequency
				+ ", anticoagulantOtherDuration=" + anticoagulantOtherDuration + ", radiationtherapy="
				+ radiationtherapy + ", radiationtherapyDuration=" + radiationtherapyDuration + ", comments=" + comments
				+ ", comment=" + comment + ", status=" + status + ", sortOrder=" + sortOrder + ", insertUserId="
				+ insertUserId + ", insertDatetime=" + insertDatetime + ", updateUserId=" + updateUserId
				+ ", updateDatetime=" + updateDatetime + "]";
	}
}