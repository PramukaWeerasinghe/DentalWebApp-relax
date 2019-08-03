package com.doerit.model;

import java.util.Date;

public class PatientDiagnosticMedicalRecord1 implements InsertUpdate{

	private String id;
	private String patientId;
	private String anaemia;
	private String asthma;
	private String drugPenicillin;
	private String drugParacetamol;
	private String drugNsaids;
	private String drugOther;
	private String foodPineapple;
	private String foodTomatoe;
	private String foodCannedfish;
	private String foodOther;
	private String latexRubber;
	private String allergiesOther;
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

	public String getAnaemia() {
		return anaemia;
	}

	public void setAnaemia(String anaemia) {
		this.anaemia = anaemia == null ? null : anaemia.trim();
	}

	public String getAsthma() {
		return asthma;
	}

	public void setAsthma(String asthma) {
		this.asthma = asthma == null ? null : asthma.trim();
	}

	public String getDrugPenicillin() {
		return drugPenicillin;
	}

	public void setDrugPenicillin(String drugPenicillin) {
		this.drugPenicillin = drugPenicillin == null ? null : drugPenicillin.trim();
	}

	public String getDrugParacetamol() {
		return drugParacetamol;
	}

	public void setDrugParacetamol(String drugParacetamol) {
		this.drugParacetamol = drugParacetamol == null ? null : drugParacetamol.trim();
	}

	public String getDrugNsaids() {
		return drugNsaids;
	}

	public void setDrugNsaids(String drugNsaids) {
		this.drugNsaids = drugNsaids == null ? null : drugNsaids.trim();
	}

	public String getDrugOther() {
		return drugOther;
	}

	public void setDrugOther(String drugOther) {
		this.drugOther = drugOther == null ? null : drugOther.trim();
	}

	public String getFoodPineapple() {
		return foodPineapple;
	}

	public void setFoodPineapple(String foodPineapple) {
		this.foodPineapple = foodPineapple == null ? null : foodPineapple.trim();
	}

	public String getFoodTomatoe() {
		return foodTomatoe;
	}

	public void setFoodTomatoe(String foodTomatoe) {
		this.foodTomatoe = foodTomatoe == null ? null : foodTomatoe.trim();
	}

	public String getFoodCannedfish() {
		return foodCannedfish;
	}

	public void setFoodCannedfish(String foodCannedfish) {
		this.foodCannedfish = foodCannedfish == null ? null : foodCannedfish.trim();
	}

	public String getFoodOther() {
		return foodOther;
	}

	public void setFoodOther(String foodOther) {
		this.foodOther = foodOther == null ? null : foodOther.trim();
	}

	public String getLatexRubber() {
		return latexRubber;
	}

	public void setLatexRubber(String latexRubber) {
		this.latexRubber = latexRubber == null ? null : latexRubber.trim();
	}

	public String getAllergiesOther() {
		return allergiesOther;
	}

	public void setAllergiesOther(String allergiesOther) {
		this.allergiesOther = allergiesOther == null ? null : allergiesOther.trim();
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
		return "PatientDiagnosticMedicalRecord1 [id=" + id + ", patientId=" + patientId + ", anaemia=" + anaemia
				+ ", asthma=" + asthma + ", drugPenicillin=" + drugPenicillin + ", drugParacetamol=" + drugParacetamol
				+ ", drugNsaids=" + drugNsaids + ", drugOther=" + drugOther + ", foodPineapple=" + foodPineapple
				+ ", foodTomatoe=" + foodTomatoe + ", foodCannedfish=" + foodCannedfish + ", foodOther=" + foodOther
				+ ", latexRubber=" + latexRubber + ", allergiesOther=" + allergiesOther + ", comment=" + comment
				+ ", status=" + status + ", sortOrder=" + sortOrder + ", insertUserId=" + insertUserId
				+ ", insertDatetime=" + insertDatetime + ", updateUserId=" + updateUserId + ", updateDatetime="
				+ updateDatetime + "]";
	}
	
	
}