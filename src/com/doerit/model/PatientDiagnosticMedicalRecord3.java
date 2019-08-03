package com.doerit.model;

import java.util.Date;

public class PatientDiagnosticMedicalRecord3 implements InsertUpdate {

	private String id;
	private String patientId;
	private String gastroIntestinalUlcers;
	private String gastroIntestinalGastricreflux;
	private String gastroIntestinalOther;
	private String gastroIntestinalOtherComments;
	private String hepatitisA;
	private String hepatitisB;
	private String hepatitisC;
	private String hepatitisOther;
	private String hepatitisOtherComments;
	private String hiv;
	private String hypertension;
	private String liverDisorders;
	private String musculoSkeletalArthritis;
	private String musculoSkeletalJointreplacement;
	private String musculoSkeletalOther;
	private String musculoSkeletalOtherComments;
	private String neurologicalDisordersMigraine;
	private String neurologicalDisordersNeuralgic;
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

	public String getGastroIntestinalUlcers() {
		return gastroIntestinalUlcers;
	}

	public void setGastroIntestinalUlcers(String gastroIntestinalUlcers) {
		this.gastroIntestinalUlcers = gastroIntestinalUlcers == null ? null : gastroIntestinalUlcers.trim();
	}

	public String getGastroIntestinalGastricreflux() {
		return gastroIntestinalGastricreflux;
	}

	public void setGastroIntestinalGastricreflux(String gastroIntestinalGastricreflux) {
		this.gastroIntestinalGastricreflux = gastroIntestinalGastricreflux == null ? null
				: gastroIntestinalGastricreflux.trim();
	}

	public String getGastroIntestinalOther() {
		return gastroIntestinalOther;
	}

	public void setGastroIntestinalOther(String gastroIntestinalOther) {
		this.gastroIntestinalOther = gastroIntestinalOther == null ? null : gastroIntestinalOther.trim();
	}

	public String getGastroIntestinalOtherComments() {
		return gastroIntestinalOtherComments;
	}

	public void setGastroIntestinalOtherComments(String gastroIntestinalOtherComments) {
		this.gastroIntestinalOtherComments = gastroIntestinalOtherComments == null ? null
				: gastroIntestinalOtherComments.trim();
	}

	public String getHepatitisA() {
		return hepatitisA;
	}

	public void setHepatitisA(String hepatitisA) {
		this.hepatitisA = hepatitisA == null ? null : hepatitisA.trim();
	}

	public String getHepatitisB() {
		return hepatitisB;
	}

	public void setHepatitisB(String hepatitisB) {
		this.hepatitisB = hepatitisB == null ? null : hepatitisB.trim();
	}

	public String getHepatitisC() {
		return hepatitisC;
	}

	public void setHepatitisC(String hepatitisC) {
		this.hepatitisC = hepatitisC == null ? null : hepatitisC.trim();
	}

	public String getHepatitisOther() {
		return hepatitisOther;
	}

	public void setHepatitisOther(String hepatitisOther) {
		this.hepatitisOther = hepatitisOther == null ? null : hepatitisOther.trim();
	}

	public String getHepatitisOtherComments() {
		return hepatitisOtherComments;
	}

	public void setHepatitisOtherComments(String hepatitisOtherComments) {
		this.hepatitisOtherComments = hepatitisOtherComments == null ? null : hepatitisOtherComments.trim();
	}

	public String getHiv() {
		return hiv;
	}

	public void setHiv(String hiv) {
		this.hiv = hiv == null ? null : hiv.trim();
	}

	public String getHypertension() {
		return hypertension;
	}

	public void setHypertension(String hypertension) {
		this.hypertension = hypertension == null ? null : hypertension.trim();
	}

	public String getLiverDisorders() {
		return liverDisorders;
	}

	public void setLiverDisorders(String liverDisorders) {
		this.liverDisorders = liverDisorders == null ? null : liverDisorders.trim();
	}

	public String getMusculoSkeletalArthritis() {
		return musculoSkeletalArthritis;
	}

	public void setMusculoSkeletalArthritis(String musculoSkeletalArthritis) {
		this.musculoSkeletalArthritis = musculoSkeletalArthritis == null ? null : musculoSkeletalArthritis.trim();
	}

	public String getMusculoSkeletalJointreplacement() {
		return musculoSkeletalJointreplacement;
	}

	public void setMusculoSkeletalJointreplacement(String musculoSkeletalJointreplacement) {
		this.musculoSkeletalJointreplacement = musculoSkeletalJointreplacement == null ? null
				: musculoSkeletalJointreplacement.trim();
	}

	public String getMusculoSkeletalOther() {
		return musculoSkeletalOther;
	}

	public void setMusculoSkeletalOther(String musculoSkeletalOther) {
		this.musculoSkeletalOther = musculoSkeletalOther == null ? null : musculoSkeletalOther.trim();
	}

	public String getMusculoSkeletalOtherComments() {
		return musculoSkeletalOtherComments;
	}

	public void setMusculoSkeletalOtherComments(String musculoSkeletalOtherComments) {
		this.musculoSkeletalOtherComments = musculoSkeletalOtherComments == null ? null
				: musculoSkeletalOtherComments.trim();
	}

	public String getNeurologicalDisordersMigraine() {
		return neurologicalDisordersMigraine;
	}

	public void setNeurologicalDisordersMigraine(String neurologicalDisordersMigraine) {
		this.neurologicalDisordersMigraine = neurologicalDisordersMigraine == null ? null
				: neurologicalDisordersMigraine.trim();
	}

	public String getNeurologicalDisordersNeuralgic() {
		return neurologicalDisordersNeuralgic;
	}

	public void setNeurologicalDisordersNeuralgic(String neurologicalDisordersNeuralgic) {
		this.neurologicalDisordersNeuralgic = neurologicalDisordersNeuralgic == null ? null
				: neurologicalDisordersNeuralgic.trim();
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
		return "PatientDiagnosticMedicalRecord3 [id=" + id + ", patientId=" + patientId + ", gastroIntestinalUlcers="
				+ gastroIntestinalUlcers + ", gastroIntestinalGastricreflux=" + gastroIntestinalGastricreflux
				+ ", gastroIntestinalOther=" + gastroIntestinalOther + ", gastroIntestinalOtherComments="
				+ gastroIntestinalOtherComments + ", hepatitisA=" + hepatitisA + ", hepatitisB=" + hepatitisB
				+ ", hepatitisC=" + hepatitisC + ", hepatitisOther=" + hepatitisOther + ", hepatitisOtherComments="
				+ hepatitisOtherComments + ", hiv=" + hiv + ", hypertension=" + hypertension + ", liverDisorders="
				+ liverDisorders + ", musculoSkeletalArthritis=" + musculoSkeletalArthritis
				+ ", musculoSkeletalJointreplacement=" + musculoSkeletalJointreplacement + ", musculoSkeletalOther="
				+ musculoSkeletalOther + ", musculoSkeletalOtherComments=" + musculoSkeletalOtherComments
				+ ", neurologicalDisordersMigraine=" + neurologicalDisordersMigraine
				+ ", neurologicalDisordersNeuralgic=" + neurologicalDisordersNeuralgic + ", comment=" + comment
				+ ", status=" + status + ", sortOrder=" + sortOrder + ", insertUserId=" + insertUserId
				+ ", insertDatetime=" + insertDatetime + ", updateUserId=" + updateUserId + ", updateDatetime="
				+ updateDatetime + "]";
	}
	
	
}