package com.doerit.model;

import java.util.Date;

public class Employee implements InsertUpdate {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.USER_ROLE
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String userRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.TITLE
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.SURNAME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String surname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.INITIALS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String initials;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.FIRST_NAME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.NIC
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String nic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.DESIGNATION
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String designation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.DEPARTMENT
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String department;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.MARITAL_STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String maritalStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.UPF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String upfNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.EPF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String epfNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.ETF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String etfNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.COMMENT
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String comment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.SORT_ORDER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private Integer sortOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.INSERT_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String insertUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.INSERT_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private Date insertDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.UPDATE_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private String updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_employee.UPDATE_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    private Date updateDatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.ID
     *
     * @return the value of tbl_employee.ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.ID
     *
     * @param id the value for tbl_employee.ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.USER_ROLE
     *
     * @return the value of tbl_employee.USER_ROLE
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.USER_ROLE
     *
     * @param userRole the value for tbl_employee.USER_ROLE
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.TITLE
     *
     * @return the value of tbl_employee.TITLE
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.TITLE
     *
     * @param title the value for tbl_employee.TITLE
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.SURNAME
     *
     * @return the value of tbl_employee.SURNAME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.SURNAME
     *
     * @param surname the value for tbl_employee.SURNAME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setSurname(String surname) {
        this.surname = surname == null ? null : surname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.INITIALS
     *
     * @return the value of tbl_employee.INITIALS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getInitials() {
        return initials;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.INITIALS
     *
     * @param initials the value for tbl_employee.INITIALS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setInitials(String initials) {
        this.initials = initials == null ? null : initials.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.FIRST_NAME
     *
     * @return the value of tbl_employee.FIRST_NAME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.FIRST_NAME
     *
     * @param firstName the value for tbl_employee.FIRST_NAME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.NIC
     *
     * @return the value of tbl_employee.NIC
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getNic() {
        return nic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.NIC
     *
     * @param nic the value for tbl_employee.NIC
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setNic(String nic) {
        this.nic = nic == null ? null : nic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.DESIGNATION
     *
     * @return the value of tbl_employee.DESIGNATION
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.DESIGNATION
     *
     * @param designation the value for tbl_employee.DESIGNATION
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setDesignation(String designation) {
        this.designation = designation == null ? null : designation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.DEPARTMENT
     *
     * @return the value of tbl_employee.DEPARTMENT
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.DEPARTMENT
     *
     * @param department the value for tbl_employee.DEPARTMENT
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.MARITAL_STATUS
     *
     * @return the value of tbl_employee.MARITAL_STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.MARITAL_STATUS
     *
     * @param maritalStatus the value for tbl_employee.MARITAL_STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.UPF_NUMBER
     *
     * @return the value of tbl_employee.UPF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getUpfNumber() {
        return upfNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.UPF_NUMBER
     *
     * @param upfNumber the value for tbl_employee.UPF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setUpfNumber(String upfNumber) {
        this.upfNumber = upfNumber == null ? null : upfNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.EPF_NUMBER
     *
     * @return the value of tbl_employee.EPF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getEpfNumber() {
        return epfNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.EPF_NUMBER
     *
     * @param epfNumber the value for tbl_employee.EPF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setEpfNumber(String epfNumber) {
        this.epfNumber = epfNumber == null ? null : epfNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.ETF_NUMBER
     *
     * @return the value of tbl_employee.ETF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getEtfNumber() {
        return etfNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.ETF_NUMBER
     *
     * @param etfNumber the value for tbl_employee.ETF_NUMBER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setEtfNumber(String etfNumber) {
        this.etfNumber = etfNumber == null ? null : etfNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.COMMENT
     *
     * @return the value of tbl_employee.COMMENT
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getComment() {
        return comment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.COMMENT
     *
     * @param comment the value for tbl_employee.COMMENT
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.STATUS
     *
     * @return the value of tbl_employee.STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.STATUS
     *
     * @param status the value for tbl_employee.STATUS
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.SORT_ORDER
     *
     * @return the value of tbl_employee.SORT_ORDER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.SORT_ORDER
     *
     * @param sortOrder the value for tbl_employee.SORT_ORDER
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.INSERT_USER_ID
     *
     * @return the value of tbl_employee.INSERT_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getInsertUserId() {
        return insertUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.INSERT_USER_ID
     *
     * @param insertUserId the value for tbl_employee.INSERT_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setInsertUserId(String insertUserId) {
        this.insertUserId = insertUserId == null ? null : insertUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.INSERT_DATETIME
     *
     * @return the value of tbl_employee.INSERT_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public Date getInsertDatetime() {
        return insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.INSERT_DATETIME
     *
     * @param insertDatetime the value for tbl_employee.INSERT_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setInsertDatetime(Date insertDatetime) {
        this.insertDatetime = insertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.UPDATE_USER_ID
     *
     * @return the value of tbl_employee.UPDATE_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public String getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.UPDATE_USER_ID
     *
     * @param updateUserId the value for tbl_employee.UPDATE_USER_ID
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId == null ? null : updateUserId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_employee.UPDATE_DATETIME
     *
     * @return the value of tbl_employee.UPDATE_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public Date getUpdateDatetime() {
        return updateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_employee.UPDATE_DATETIME
     *
     * @param updateDatetime the value for tbl_employee.UPDATE_DATETIME
     *
     * @mbggenerated Sun Jul 09 08:24:40 IST 2017
     */
    public void setUpdateDatetime(Date updateDatetime) {
        this.updateDatetime = updateDatetime;
    }
    
}