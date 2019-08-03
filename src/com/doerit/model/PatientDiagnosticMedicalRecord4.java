package com.doerit.model;

import java.util.Date;

public class PatientDiagnosticMedicalRecord4 implements InsertUpdate {
	private String id;
	private String patientId;
	private String behaviouralDisorders;
	private String tmd;
	private String tmdOther;
	private String renalDisordersChronicinfections;
	private String renalDisordersKidneyfailure;
	private String renalDisordersTransplant;
	private String renalDisordersOther;
	private String pregnancy;
	private String onHormonalContraceptives;
	private String otherComments;
	private String comment;
	private Byte status;
	private Integer sortOrder;
	private String insertUserId;
	private Date insertDatetime;
	private String updateUserId;
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

	public String getBehaviouralDisorders() {
		return behaviouralDisorders;
	}

	public void setBehaviouralDisorders(String behaviouralDisorders) {
		this.behaviouralDisorders = behaviouralDisorders == null ? null : behaviouralDisorders.trim();
	}

	public String getTmd() {
		return tmd;
	}

	public void setTmd(String tmd) {
		this.tmd = tmd == null ? null : tmd.trim();
	}

	public String getTmdOther() {
		return tmdOther;
	}

	public void setTmdOther(String tmdOther) {
		this.tmdOther = tmdOther == null ? null : tmdOther.trim();
	}

	public String getRenalDisordersChronicinfections() {
		return renalDisordersChronicinfections;
	}

	public void setRenalDisordersChronicinfections(String renalDisordersChronicinfections) {
		this.renalDisordersChronicinfections = renalDisordersChronicinfections == null ? null
				: renalDisordersChronicinfections.trim();
	}

	public String getRenalDisordersKidneyfailure() {
		return renalDisordersKidneyfailure;
	}

	public void setRenalDisordersKidneyfailure(String renalDisordersKidneyfailure) {
		this.renalDisordersKidneyfailure = renalDisordersKidneyfailure == null ? null
				: renalDisordersKidneyfailure.trim();
	}

	public String getRenalDisordersTransplant() {
		return renalDisordersTransplant;
	}

	public void setRenalDisordersTransplant(String renalDisordersTransplant) {
		this.renalDisordersTransplant = renalDisordersTransplant == null ? null : renalDisordersTransplant.trim();
	}

	public String getRenalDisordersOther() {
		return renalDisordersOther;
	}

	public void setRenalDisordersOther(String renalDisordersOther) {
		this.renalDisordersOther = renalDisordersOther == null ? null : renalDisordersOther.trim();
	}

	public String getPregnancy() {
		return pregnancy;
	}

	public void setPregnancy(String pregnancy) {
		this.pregnancy = pregnancy == null ? null : pregnancy.trim();
	}

	public String getOnHormonalContraceptives() {
		return onHormonalContraceptives;
	}

	public void setOnHormonalContraceptives(String onHormonalContraceptives) {
		this.onHormonalContraceptives = onHormonalContraceptives == null ? null : onHormonalContraceptives.trim();
	}

	public String getOtherComments() {
		return otherComments;
	}

	public void setOtherComments(String otherComments) {
		this.otherComments = otherComments == null ? null : otherComments.trim();
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

	@Override
	public String toString() {
		return "PatientDiagnosticMedicalRecord4 [id=" + id + ", patientId=" + patientId + ", behaviouralDisorders="
				+ behaviouralDisorders + ", tmd=" + tmd + ", tmdOther=" + tmdOther
				+ ", renalDisordersChronicinfections=" + renalDisordersChronicinfections
				+ ", renalDisordersKidneyfailure=" + renalDisordersKidneyfailure + ", renalDisordersTransplant="
				+ renalDisordersTransplant + ", renalDisordersOther=" + renalDisordersOther + ", pregnancy=" + pregnancy
				+ ", onHormonalContraceptives=" + onHormonalContraceptives + ", otherComments=" + otherComments
				+ ", comment=" + comment + ", status=" + status + ", sortOrder=" + sortOrder + ", insertUserId="
				+ insertUserId + ", insertDatetime=" + insertDatetime + ", updateUserId=" + updateUserId
				+ ", updateDatetime=" + updateDatetime + "]";
	}
    
    
}