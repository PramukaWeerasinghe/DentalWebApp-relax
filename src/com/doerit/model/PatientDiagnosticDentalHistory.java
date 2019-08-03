package com.doerit.model;

import java.util.Date;

public class PatientDiagnosticDentalHistory implements InsertUpdate{

	@Override
	public String toString() {
		return "PatientDiagnosticDentalHistory [id=" + id + ", patientId=" + patientId + ", extraction=" + extraction
				+ ", extractionComplications=" + extractionComplications + ", extractionComplicationsType="
				+ extractionComplicationsType + ", oralSurgery=" + oralSurgery + ", periodontalRx=" + periodontalRx
				+ ", periodontalRxScaling=" + periodontalRxScaling + ", periodontalRxRootdebriment="
				+ periodontalRxRootdebriment + ", periodontalRxSurgical=" + periodontalRxSurgical
				+ ", periodontalRxMaintenance=" + periodontalRxMaintenance + ", orthodonticTreatment="
				+ orthodonticTreatment + ", orthodonticTreatmentFixed=" + orthodonticTreatmentFixed
				+ ", orthodonticTreatmentRemovable=" + orthodonticTreatmentRemovable
				+ ", orthodonticTreatmentFunctional=" + orthodonticTreatmentFunctional
				+ ", orthodonticTreatmentComplications=" + orthodonticTreatmentComplications + ", restorativeRx="
				+ restorativeRx + ", restorativeRxEndodontics=" + restorativeRxEndodontics
				+ ", restorativeRxFixedprosthesis=" + restorativeRxFixedprosthesis
				+ ", restorativeRxRemovableprosthesis=" + restorativeRxRemovableprosthesis
				+ ", restorativeRxRestorations=" + restorativeRxRestorations + ", restorativeRxComplications="
				+ restorativeRxComplications + ", comment=" + comment + ", status=" + status + ", sortOrder="
				+ sortOrder + ", insertUserId=" + insertUserId + ", insertDatetime=" + insertDatetime
				+ ", updateUserId=" + updateUserId + ", updateDatetime=" + updateDatetime + "]";
	}
	
	
	private String id;
	private String patientId;
	private String extraction;
	private String extractionComplications;
	private String extractionComplicationsType;
	private String oralSurgery;
	private String periodontalRx;
	private String periodontalRxScaling;
	private String periodontalRxRootdebriment;
	private String periodontalRxSurgical;
	private String periodontalRxMaintenance;
	private String orthodonticTreatment;
	private String orthodonticTreatmentFixed;
	private String orthodonticTreatmentRemovable;
	private String orthodonticTreatmentFunctional;
	private String orthodonticTreatmentComplications;
	private String restorativeRx;
	private String restorativeRxEndodontics;
	private String restorativeRxFixedprosthesis;
	private String restorativeRxRemovableprosthesis;
	private String restorativeRxRestorations;
	private String restorativeRxComplications;
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

	public String getExtraction() {
		return extraction;
	}

	public void setExtraction(String extraction) {
		this.extraction = extraction == null ? null : extraction.trim();
	}

	public String getExtractionComplications() {
		return extractionComplications;
	}

	public void setExtractionComplications(String extractionComplications) {
		this.extractionComplications = extractionComplications == null ? null : extractionComplications.trim();
	}

	public String getExtractionComplicationsType() {
		return extractionComplicationsType;
	}

	public void setExtractionComplicationsType(String extractionComplicationsType) {
		this.extractionComplicationsType = extractionComplicationsType == null ? null
				: extractionComplicationsType.trim();
	}

	public String getOralSurgery() {
		return oralSurgery;
	}

	public void setOralSurgery(String oralSurgery) {
		this.oralSurgery = oralSurgery == null ? null : oralSurgery.trim();
	}

	public String getPeriodontalRx() {
		return periodontalRx;
	}

	public void setPeriodontalRx(String periodontalRx) {
		this.periodontalRx = periodontalRx == null ? null : periodontalRx.trim();
	}

	public String getPeriodontalRxScaling() {
		return periodontalRxScaling;
	}

	public void setPeriodontalRxScaling(String periodontalRxScaling) {
		this.periodontalRxScaling = periodontalRxScaling == null ? null : periodontalRxScaling.trim();
	}

	public String getPeriodontalRxRootdebriment() {
		return periodontalRxRootdebriment;
	}

	public void setPeriodontalRxRootdebriment(String periodontalRxRootdebriment) {
		this.periodontalRxRootdebriment = periodontalRxRootdebriment == null ? null : periodontalRxRootdebriment.trim();
	}

	public String getPeriodontalRxSurgical() {
		return periodontalRxSurgical;
	}

	public void setPeriodontalRxSurgical(String periodontalRxSurgical) {
		this.periodontalRxSurgical = periodontalRxSurgical == null ? null : periodontalRxSurgical.trim();
	}

	public String getPeriodontalRxMaintenance() {
		return periodontalRxMaintenance;
	}

	public void setPeriodontalRxMaintenance(String periodontalRxMaintenance) {
		this.periodontalRxMaintenance = periodontalRxMaintenance == null ? null : periodontalRxMaintenance.trim();
	}

	public String getOrthodonticTreatment() {
		return orthodonticTreatment;
	}

	public void setOrthodonticTreatment(String orthodonticTreatment) {
		this.orthodonticTreatment = orthodonticTreatment == null ? null : orthodonticTreatment.trim();
	}

	public String getOrthodonticTreatmentFixed() {
		return orthodonticTreatmentFixed;
	}

	public void setOrthodonticTreatmentFixed(String orthodonticTreatmentFixed) {
		this.orthodonticTreatmentFixed = orthodonticTreatmentFixed == null ? null : orthodonticTreatmentFixed.trim();
	}

	public String getOrthodonticTreatmentRemovable() {
		return orthodonticTreatmentRemovable;
	}

	public void setOrthodonticTreatmentRemovable(String orthodonticTreatmentRemovable) {
		this.orthodonticTreatmentRemovable = orthodonticTreatmentRemovable == null ? null
				: orthodonticTreatmentRemovable.trim();
	}

	public String getOrthodonticTreatmentFunctional() {
		return orthodonticTreatmentFunctional;
	}

	public void setOrthodonticTreatmentFunctional(String orthodonticTreatmentFunctional) {
		this.orthodonticTreatmentFunctional = orthodonticTreatmentFunctional == null ? null
				: orthodonticTreatmentFunctional.trim();
	}

	public String getOrthodonticTreatmentComplications() {
		return orthodonticTreatmentComplications;
	}

	public void setOrthodonticTreatmentComplications(String orthodonticTreatmentComplications) {
		this.orthodonticTreatmentComplications = orthodonticTreatmentComplications == null ? null
				: orthodonticTreatmentComplications.trim();
	}

	public String getRestorativeRx() {
		return restorativeRx;
	}

	public void setRestorativeRx(String restorativeRx) {
		this.restorativeRx = restorativeRx == null ? null : restorativeRx.trim();
	}

	public String getRestorativeRxEndodontics() {
		return restorativeRxEndodontics;
	}

	public void setRestorativeRxEndodontics(String restorativeRxEndodontics) {
		this.restorativeRxEndodontics = restorativeRxEndodontics == null ? null : restorativeRxEndodontics.trim();
	}

	public String getRestorativeRxFixedprosthesis() {
		return restorativeRxFixedprosthesis;
	}

	public void setRestorativeRxFixedprosthesis(String restorativeRxFixedprosthesis) {
		this.restorativeRxFixedprosthesis = restorativeRxFixedprosthesis == null ? null
				: restorativeRxFixedprosthesis.trim();
	}

	public String getRestorativeRxRemovableprosthesis() {
		return restorativeRxRemovableprosthesis;
	}

	public void setRestorativeRxRemovableprosthesis(String restorativeRxRemovableprosthesis) {
		this.restorativeRxRemovableprosthesis = restorativeRxRemovableprosthesis == null ? null
				: restorativeRxRemovableprosthesis.trim();
	}

	public String getRestorativeRxRestorations() {
		return restorativeRxRestorations;
	}

	public void setRestorativeRxRestorations(String restorativeRxRestorations) {
		this.restorativeRxRestorations = restorativeRxRestorations == null ? null : restorativeRxRestorations.trim();
	}

	public String getRestorativeRxComplications() {
		return restorativeRxComplications;
	}

	public void setRestorativeRxComplications(String restorativeRxComplications) {
		this.restorativeRxComplications = restorativeRxComplications == null ? null : restorativeRxComplications.trim();
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

	
	
	
	
}