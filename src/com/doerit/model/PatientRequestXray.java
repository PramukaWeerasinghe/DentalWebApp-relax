package com.doerit.model;

import java.util.Date;

public class PatientRequestXray implements InsertUpdate {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.PATIENT_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String patientId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.CLINICAL_HISTORY
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String clinicalHistory;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.IOPA
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String iopa;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.BITEWING
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String bitewing;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.OCCLUSAL_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String occlusalView;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.OPG
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String opg;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.SIALOGRAM
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String sialogram;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.CEPHALOGRAM
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String cephalogram;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.TMJ_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String tmjView;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.OM_VIEW_OF_SKULL
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String omViewOfSkull;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.MANDIBULAR_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String mandibularView;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.SKULL_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String skullView;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.REVERSE_TOWNS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String reverseTowns;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.CHEST_XRAY
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String chestXray;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.CSPINENECK
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String cspineneck;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.CBCT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String cbct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.USS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String uss;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.OFFICER_NAME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String officerName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.DEPARTMENT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String department;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.XRAY_NUMBER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String xrayNumber;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.RADIOGRAPHER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String radiographer;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.PROPERTY_VALUE
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String propertyValue;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.COMMENT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String comment;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.STATUS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private Byte status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.SORT_ORDER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private Integer sortOrder;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.INSERT_USER_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String insertUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.UPDATE_USER_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private String updateUserId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.INSERT_DATETIME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private Date insertDatetime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column tbl_patient_request_xray.UPDATE_DATETIME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	private Date updateDatetime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.ID
	 * @return  the value of tbl_patient_request_xray.ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.ID
	 * @param id  the value for tbl_patient_request_xray.ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.PATIENT_ID
	 * @return  the value of tbl_patient_request_xray.PATIENT_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getPatientId() {
		return patientId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.PATIENT_ID
	 * @param patientId  the value for tbl_patient_request_xray.PATIENT_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setPatientId(String patientId) {
		this.patientId = patientId == null ? null : patientId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.CLINICAL_HISTORY
	 * @return  the value of tbl_patient_request_xray.CLINICAL_HISTORY
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getClinicalHistory() {
		return clinicalHistory;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.CLINICAL_HISTORY
	 * @param clinicalHistory  the value for tbl_patient_request_xray.CLINICAL_HISTORY
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setClinicalHistory(String clinicalHistory) {
		this.clinicalHistory = clinicalHistory == null ? null : clinicalHistory.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.IOPA
	 * @return  the value of tbl_patient_request_xray.IOPA
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getIopa() {
		return iopa;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.IOPA
	 * @param iopa  the value for tbl_patient_request_xray.IOPA
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setIopa(String iopa) {
		this.iopa = iopa == null ? null : iopa.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.BITEWING
	 * @return  the value of tbl_patient_request_xray.BITEWING
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getBitewing() {
		return bitewing;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.BITEWING
	 * @param bitewing  the value for tbl_patient_request_xray.BITEWING
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setBitewing(String bitewing) {
		this.bitewing = bitewing == null ? null : bitewing.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.OCCLUSAL_VIEW
	 * @return  the value of tbl_patient_request_xray.OCCLUSAL_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getOcclusalView() {
		return occlusalView;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.OCCLUSAL_VIEW
	 * @param occlusalView  the value for tbl_patient_request_xray.OCCLUSAL_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setOcclusalView(String occlusalView) {
		this.occlusalView = occlusalView == null ? null : occlusalView.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.OPG
	 * @return  the value of tbl_patient_request_xray.OPG
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getOpg() {
		return opg;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.OPG
	 * @param opg  the value for tbl_patient_request_xray.OPG
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setOpg(String opg) {
		this.opg = opg == null ? null : opg.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.SIALOGRAM
	 * @return  the value of tbl_patient_request_xray.SIALOGRAM
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getSialogram() {
		return sialogram;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.SIALOGRAM
	 * @param sialogram  the value for tbl_patient_request_xray.SIALOGRAM
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setSialogram(String sialogram) {
		this.sialogram = sialogram == null ? null : sialogram.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.CEPHALOGRAM
	 * @return  the value of tbl_patient_request_xray.CEPHALOGRAM
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getCephalogram() {
		return cephalogram;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.CEPHALOGRAM
	 * @param cephalogram  the value for tbl_patient_request_xray.CEPHALOGRAM
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setCephalogram(String cephalogram) {
		this.cephalogram = cephalogram == null ? null : cephalogram.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.TMJ_VIEW
	 * @return  the value of tbl_patient_request_xray.TMJ_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getTmjView() {
		return tmjView;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.TMJ_VIEW
	 * @param tmjView  the value for tbl_patient_request_xray.TMJ_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setTmjView(String tmjView) {
		this.tmjView = tmjView == null ? null : tmjView.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.OM_VIEW_OF_SKULL
	 * @return  the value of tbl_patient_request_xray.OM_VIEW_OF_SKULL
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getOmViewOfSkull() {
		return omViewOfSkull;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.OM_VIEW_OF_SKULL
	 * @param omViewOfSkull  the value for tbl_patient_request_xray.OM_VIEW_OF_SKULL
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setOmViewOfSkull(String omViewOfSkull) {
		this.omViewOfSkull = omViewOfSkull == null ? null : omViewOfSkull.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.MANDIBULAR_VIEW
	 * @return  the value of tbl_patient_request_xray.MANDIBULAR_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getMandibularView() {
		return mandibularView;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.MANDIBULAR_VIEW
	 * @param mandibularView  the value for tbl_patient_request_xray.MANDIBULAR_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setMandibularView(String mandibularView) {
		this.mandibularView = mandibularView == null ? null : mandibularView.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.SKULL_VIEW
	 * @return  the value of tbl_patient_request_xray.SKULL_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getSkullView() {
		return skullView;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.SKULL_VIEW
	 * @param skullView  the value for tbl_patient_request_xray.SKULL_VIEW
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setSkullView(String skullView) {
		this.skullView = skullView == null ? null : skullView.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.REVERSE_TOWNS
	 * @return  the value of tbl_patient_request_xray.REVERSE_TOWNS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getReverseTowns() {
		return reverseTowns;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.REVERSE_TOWNS
	 * @param reverseTowns  the value for tbl_patient_request_xray.REVERSE_TOWNS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setReverseTowns(String reverseTowns) {
		this.reverseTowns = reverseTowns == null ? null : reverseTowns.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.CHEST_XRAY
	 * @return  the value of tbl_patient_request_xray.CHEST_XRAY
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getChestXray() {
		return chestXray;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.CHEST_XRAY
	 * @param chestXray  the value for tbl_patient_request_xray.CHEST_XRAY
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setChestXray(String chestXray) {
		this.chestXray = chestXray == null ? null : chestXray.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.CSPINENECK
	 * @return  the value of tbl_patient_request_xray.CSPINENECK
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getCspineneck() {
		return cspineneck;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.CSPINENECK
	 * @param cspineneck  the value for tbl_patient_request_xray.CSPINENECK
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setCspineneck(String cspineneck) {
		this.cspineneck = cspineneck == null ? null : cspineneck.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.CBCT
	 * @return  the value of tbl_patient_request_xray.CBCT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getCbct() {
		return cbct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.CBCT
	 * @param cbct  the value for tbl_patient_request_xray.CBCT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setCbct(String cbct) {
		this.cbct = cbct == null ? null : cbct.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.USS
	 * @return  the value of tbl_patient_request_xray.USS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getUss() {
		return uss;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.USS
	 * @param uss  the value for tbl_patient_request_xray.USS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setUss(String uss) {
		this.uss = uss == null ? null : uss.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.OFFICER_NAME
	 * @return  the value of tbl_patient_request_xray.OFFICER_NAME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getOfficerName() {
		return officerName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.OFFICER_NAME
	 * @param officerName  the value for tbl_patient_request_xray.OFFICER_NAME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setOfficerName(String officerName) {
		this.officerName = officerName == null ? null : officerName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.DEPARTMENT
	 * @return  the value of tbl_patient_request_xray.DEPARTMENT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.DEPARTMENT
	 * @param department  the value for tbl_patient_request_xray.DEPARTMENT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setDepartment(String department) {
		this.department = department == null ? null : department.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.XRAY_NUMBER
	 * @return  the value of tbl_patient_request_xray.XRAY_NUMBER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getXrayNumber() {
		return xrayNumber;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.XRAY_NUMBER
	 * @param xrayNumber  the value for tbl_patient_request_xray.XRAY_NUMBER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setXrayNumber(String xrayNumber) {
		this.xrayNumber = xrayNumber == null ? null : xrayNumber.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.RADIOGRAPHER
	 * @return  the value of tbl_patient_request_xray.RADIOGRAPHER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getRadiographer() {
		return radiographer;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.RADIOGRAPHER
	 * @param radiographer  the value for tbl_patient_request_xray.RADIOGRAPHER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setRadiographer(String radiographer) {
		this.radiographer = radiographer == null ? null : radiographer.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.PROPERTY_VALUE
	 * @return  the value of tbl_patient_request_xray.PROPERTY_VALUE
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.PROPERTY_VALUE
	 * @param propertyValue  the value for tbl_patient_request_xray.PROPERTY_VALUE
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue == null ? null : propertyValue.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.COMMENT
	 * @return  the value of tbl_patient_request_xray.COMMENT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.COMMENT
	 * @param comment  the value for tbl_patient_request_xray.COMMENT
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.STATUS
	 * @return  the value of tbl_patient_request_xray.STATUS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public Byte getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.STATUS
	 * @param status  the value for tbl_patient_request_xray.STATUS
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setStatus(Byte status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.SORT_ORDER
	 * @return  the value of tbl_patient_request_xray.SORT_ORDER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public Integer getSortOrder() {
		return sortOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.SORT_ORDER
	 * @param sortOrder  the value for tbl_patient_request_xray.SORT_ORDER
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.INSERT_USER_ID
	 * @return  the value of tbl_patient_request_xray.INSERT_USER_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getInsertUserId() {
		return insertUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.INSERT_USER_ID
	 * @param insertUserId  the value for tbl_patient_request_xray.INSERT_USER_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setInsertUserId(String insertUserId) {
		this.insertUserId = insertUserId == null ? null : insertUserId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.UPDATE_USER_ID
	 * @return  the value of tbl_patient_request_xray.UPDATE_USER_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public String getUpdateUserId() {
		return updateUserId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.UPDATE_USER_ID
	 * @param updateUserId  the value for tbl_patient_request_xray.UPDATE_USER_ID
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId == null ? null : updateUserId.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.INSERT_DATETIME
	 * @return  the value of tbl_patient_request_xray.INSERT_DATETIME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public Date getInsertDatetime() {
		return insertDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.INSERT_DATETIME
	 * @param insertDatetime  the value for tbl_patient_request_xray.INSERT_DATETIME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setInsertDatetime(Date insertDatetime) {
		this.insertDatetime = insertDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column tbl_patient_request_xray.UPDATE_DATETIME
	 * @return  the value of tbl_patient_request_xray.UPDATE_DATETIME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public Date getUpdateDatetime() {
		return updateDatetime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column tbl_patient_request_xray.UPDATE_DATETIME
	 * @param updateDatetime  the value for tbl_patient_request_xray.UPDATE_DATETIME
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	public void setUpdateDatetime(Date updateDatetime) {
		this.updateDatetime = updateDatetime;
	}
}