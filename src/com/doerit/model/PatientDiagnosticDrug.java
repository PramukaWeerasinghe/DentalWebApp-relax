package com.doerit.model;

import java.util.Date;

public class PatientDiagnosticDrug implements InsertUpdate {
  
    private String id;
    private String drughistoryId;
    private String categoryName;
    private String categoryDrugName;
    private String categoryDrugDose;
    private String categoryDrugFrequency;
    private String categoryDrugDuration;
    private String comment;
    private Byte status;
    private Integer sortOrder;
    private String insertUserId;
    private Date insertDatetime;
    private String updateUserId;
    private Date updateDatetime;

    @Override
	public String toString() {
		return "PatientDiagnosticDrug [id=" + id + ", drughistoryId=" + drughistoryId + ", categoryName=" + categoryName
				+ ", categoryDrugName=" + categoryDrugName + ", categoryDrugDose=" + categoryDrugDose
				+ ", categoryDrugFrequency=" + categoryDrugFrequency + ", categoryDrugDuration=" + categoryDrugDuration
				+ ", comment=" + comment + ", status=" + status + ", sortOrder=" + sortOrder + ", insertUserId="
				+ insertUserId + ", insertDatetime=" + insertDatetime + ", updateUserId=" + updateUserId
				+ ", updateDatetime=" + updateDatetime + "]";
	}

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.ID
     *
     * @return the value of tbl_patient_diagnostic_drug.ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.ID
     *
     * @param id the value for tbl_patient_diagnostic_drug.ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.DRUGHISTORY_ID
     *
     * @return the value of tbl_patient_diagnostic_drug.DRUGHISTORY_ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getDrughistoryId() {
        return drughistoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.DRUGHISTORY_ID
     *
     * @param drughistoryId the value for tbl_patient_diagnostic_drug.DRUGHISTORY_ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setDrughistoryId(String drughistoryId) {
        this.drughistoryId = drughistoryId == null ? null : drughistoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.CATEGORY_NAME
     *
     * @return the value of tbl_patient_diagnostic_drug.CATEGORY_NAME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.CATEGORY_NAME
     *
     * @param categoryName the value for tbl_patient_diagnostic_drug.CATEGORY_NAME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_NAME
     *
     * @return the value of tbl_patient_diagnostic_drug.CATEGORY_DRUG_NAME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getCategoryDrugName() {
        return categoryDrugName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_NAME
     *
     * @param categoryDrugName the value for tbl_patient_diagnostic_drug.CATEGORY_DRUG_NAME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setCategoryDrugName(String categoryDrugName) {
        this.categoryDrugName = categoryDrugName == null ? null : categoryDrugName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_DOSE
     *
     * @return the value of tbl_patient_diagnostic_drug.CATEGORY_DRUG_DOSE
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getCategoryDrugDose() {
        return categoryDrugDose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_DOSE
     *
     * @param categoryDrugDose the value for tbl_patient_diagnostic_drug.CATEGORY_DRUG_DOSE
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setCategoryDrugDose(String categoryDrugDose) {
        this.categoryDrugDose = categoryDrugDose == null ? null : categoryDrugDose.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_FREQUENCY
     *
     * @return the value of tbl_patient_diagnostic_drug.CATEGORY_DRUG_FREQUENCY
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getCategoryDrugFrequency() {
        return categoryDrugFrequency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_FREQUENCY
     *
     * @param categoryDrugFrequency the value for tbl_patient_diagnostic_drug.CATEGORY_DRUG_FREQUENCY
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setCategoryDrugFrequency(String categoryDrugFrequency) {
        this.categoryDrugFrequency = categoryDrugFrequency == null ? null : categoryDrugFrequency.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_DURATION
     *
     * @return the value of tbl_patient_diagnostic_drug.CATEGORY_DRUG_DURATION
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getCategoryDrugDuration() {
        return categoryDrugDuration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.CATEGORY_DRUG_DURATION
     *
     * @param categoryDrugDuration the value for tbl_patient_diagnostic_drug.CATEGORY_DRUG_DURATION
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setCategoryDrugDuration(String categoryDrugDuration) {
        this.categoryDrugDuration = categoryDrugDuration == null ? null : categoryDrugDuration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.COMMENT
     *
     * @return the value of tbl_patient_diagnostic_drug.COMMENT
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.COMMENT
     *
     * @param comment the value for tbl_patient_diagnostic_drug.COMMENT
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.STATUS
     *
     * @return the value of tbl_patient_diagnostic_drug.STATUS
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.STATUS
     *
     * @param status the value for tbl_patient_diagnostic_drug.STATUS
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.SORT_ORDER
     *
     * @return the value of tbl_patient_diagnostic_drug.SORT_ORDER
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.SORT_ORDER
     *
     * @param sortOrder the value for tbl_patient_diagnostic_drug.SORT_ORDER
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.INSERT_USER_ID
     *
     * @return the value of tbl_patient_diagnostic_drug.INSERT_USER_ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.INSERT_USER_ID
     *
     * @param insertUserId the value for tbl_patient_diagnostic_drug.INSERT_USER_ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.INSERT_DATETIME
     *
     * @return the value of tbl_patient_diagnostic_drug.INSERT_DATETIME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public Date getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.INSERT_DATETIME
     *
     * @param insertDatetime the value for tbl_patient_diagnostic_drug.INSERT_DATETIME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.UPDATE_USER_ID
     *
     * @return the value of tbl_patient_diagnostic_drug.UPDATE_USER_ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.UPDATE_USER_ID
     *
     * @param updateUserId the value for tbl_patient_diagnostic_drug.UPDATE_USER_ID
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_patient_diagnostic_drug.UPDATE_DATETIME
     *
     * @return the value of tbl_patient_diagnostic_drug.UPDATE_DATETIME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_patient_diagnostic_drug.UPDATE_DATETIME
     *
     * @param updateDatetime the value for tbl_patient_diagnostic_drug.UPDATE_DATETIME
     *
     * @mbg.generated Fri May 11 13:21:27 IST 2018
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
    
    
}