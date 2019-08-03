package com.doerit.model;

import java.util.Date;

public class PatientDiagnosticMedicalRecord2 implements InsertUpdate  {

	private String id;
	private String patientId;
	private String heamophilia;
	private String bleedingDisordersOther;
	private String cardiacDisordersAngina;
	private String cardiacDisordersValvular;
	private String cardiacDisordersCarditis;
	private String anginaOther;
	private String valvularOther;
	private String sabeProphylaxis;
	private String oralPenicillin;
	private String prostheticHeartValve;
	private String pacemaker;
	private String cardiacDisordersOther;
	private String developmentalCleftlip;
	private String developmentalCerebral;
	private String developmentalSyndromic;
	private String endocrineDiabetes;
	private String endocrineOther;
	private String endocrineOtherComments;
	private String epilepsy;
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

	public String getHeamophilia() {
		return heamophilia;
	}

	public void setHeamophilia(String heamophilia) {
		this.heamophilia = heamophilia == null ? null : heamophilia.trim();
	}

	public String getBleedingDisordersOther() {
		return bleedingDisordersOther;
	}

	public void setBleedingDisordersOther(String bleedingDisordersOther) {
		this.bleedingDisordersOther = bleedingDisordersOther == null ? null : bleedingDisordersOther.trim();
	}

	public String getCardiacDisordersAngina() {
		return cardiacDisordersAngina;
	}

	public void setCardiacDisordersAngina(String cardiacDisordersAngina) {
		this.cardiacDisordersAngina = cardiacDisordersAngina == null ? null : cardiacDisordersAngina.trim();
	}

	public String getCardiacDisordersValvular() {
		return cardiacDisordersValvular;
	}

	public void setCardiacDisordersValvular(String cardiacDisordersValvular) {
		this.cardiacDisordersValvular = cardiacDisordersValvular == null ? null : cardiacDisordersValvular.trim();
	}

	public String getCardiacDisordersCarditis() {
		return cardiacDisordersCarditis;
	}

	public void setCardiacDisordersCarditis(String cardiacDisordersCarditis) {
		this.cardiacDisordersCarditis = cardiacDisordersCarditis == null ? null : cardiacDisordersCarditis.trim();
	}

	public String getAnginaOther() {
		return anginaOther;
	}

	public void setAnginaOther(String anginaOther) {
		this.anginaOther = anginaOther == null ? null : anginaOther.trim();
	}

	public String getValvularOther() {
		return valvularOther;
	}

	public void setValvularOther(String valvularOther) {
		this.valvularOther = valvularOther == null ? null : valvularOther.trim();
	}

	public String getSabeProphylaxis() {
		return sabeProphylaxis;
	}

	public void setSabeProphylaxis(String sabeProphylaxis) {
		this.sabeProphylaxis = sabeProphylaxis == null ? null : sabeProphylaxis.trim();
	}

	public String getOralPenicillin() {
		return oralPenicillin;
	}

	public void setOralPenicillin(String oralPenicillin) {
		this.oralPenicillin = oralPenicillin == null ? null : oralPenicillin.trim();
	}

	public String getProstheticHeartValve() {
		return prostheticHeartValve;
	}

	public void setProstheticHeartValve(String prostheticHeartValve) {
		this.prostheticHeartValve = prostheticHeartValve == null ? null : prostheticHeartValve.trim();
	}

	public String getPacemaker() {
		return pacemaker;
	}

	public void setPacemaker(String pacemaker) {
		this.pacemaker = pacemaker == null ? null : pacemaker.trim();
	}

	public String getCardiacDisordersOther() {
		return cardiacDisordersOther;
	}

	public void setCardiacDisordersOther(String cardiacDisordersOther) {
		this.cardiacDisordersOther = cardiacDisordersOther == null ? null : cardiacDisordersOther.trim();
	}

	public String getDevelopmentalCleftlip() {
		return developmentalCleftlip;
	}

	public void setDevelopmentalCleftlip(String developmentalCleftlip) {
		this.developmentalCleftlip = developmentalCleftlip == null ? null : developmentalCleftlip.trim();
	}

	public String getDevelopmentalCerebral() {
		return developmentalCerebral;
	}

	public void setDevelopmentalCerebral(String developmentalCerebral) {
		this.developmentalCerebral = developmentalCerebral == null ? null : developmentalCerebral.trim();
	}

	public String getDevelopmentalSyndromic() {
		return developmentalSyndromic;
	}

	public void setDevelopmentalSyndromic(String developmentalSyndromic) {
		this.developmentalSyndromic = developmentalSyndromic == null ? null : developmentalSyndromic.trim();
	}

	public String getEndocrineDiabetes() {
		return endocrineDiabetes;
	}

	public void setEndocrineDiabetes(String endocrineDiabetes) {
		this.endocrineDiabetes = endocrineDiabetes == null ? null : endocrineDiabetes.trim();
	}

	public String getEndocrineOther() {
		return endocrineOther;
	}

	public void setEndocrineOther(String endocrineOther) {
		this.endocrineOther = endocrineOther == null ? null : endocrineOther.trim();
	}

	public String getEndocrineOtherComments() {
		return endocrineOtherComments;
	}

	public void setEndocrineOtherComments(String endocrineOtherComments) {
		this.endocrineOtherComments = endocrineOtherComments == null ? null : endocrineOtherComments.trim();
	}

	public String getEpilepsy() {
		return epilepsy;
	}

	public void setEpilepsy(String epilepsy) {
		this.epilepsy = epilepsy == null ? null : epilepsy.trim();
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
		return "PatientDiagnosticMedicalRecord2 [id=" + id + ", patientId=" + patientId + ", heamophilia=" + heamophilia
				+ ", bleedingDisordersOther=" + bleedingDisordersOther + ", cardiacDisordersAngina="
				+ cardiacDisordersAngina + ", cardiacDisordersValvular=" + cardiacDisordersValvular
				+ ", cardiacDisordersCarditis=" + cardiacDisordersCarditis + ", anginaOther=" + anginaOther
				+ ", valvularOther=" + valvularOther + ", sabeProphylaxis=" + sabeProphylaxis + ", oralPenicillin="
				+ oralPenicillin + ", prostheticHeartValve=" + prostheticHeartValve + ", pacemaker=" + pacemaker
				+ ", cardiacDisordersOther=" + cardiacDisordersOther + ", developmentalCleftlip="
				+ developmentalCleftlip + ", developmentalCerebral=" + developmentalCerebral
				+ ", developmentalSyndromic=" + developmentalSyndromic + ", endocrineDiabetes=" + endocrineDiabetes
				+ ", endocrineOther=" + endocrineOther + ", endocrineOtherComments=" + endocrineOtherComments
				+ ", epilepsy=" + epilepsy + ", comment=" + comment + ", status=" + status + ", sortOrder=" + sortOrder
				+ ", insertUserId=" + insertUserId + ", insertDatetime=" + insertDatetime + ", updateUserId="
				+ updateUserId + ", updateDatetime=" + updateDatetime + "]";
	}

	
}