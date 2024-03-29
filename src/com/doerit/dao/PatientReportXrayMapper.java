package com.doerit.dao;

import com.doerit.model.PatientReportXray;
import com.doerit.model.PatientReportXrayExample;
import com.doerit.model.PatientReportXrayWithBLOBs;
import com.doerit.util.Pager;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface PatientReportXrayMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	long countByExample(PatientReportXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int deleteByExample(PatientReportXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int insert(PatientReportXrayWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int insertSelective(PatientReportXrayWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	List<PatientReportXrayWithBLOBs> selectByExampleWithBLOBs(PatientReportXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	List<PatientReportXray> selectByExample(PatientReportXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	PatientReportXrayWithBLOBs selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int updateByExampleSelective(@Param("record") PatientReportXrayWithBLOBs record,
			@Param("example") PatientReportXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int updateByExampleWithBLOBs(@Param("record") PatientReportXrayWithBLOBs record,
			@Param("example") PatientReportXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int updateByExample(@Param("record") PatientReportXray record, @Param("example") PatientReportXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int updateByPrimaryKeySelective(PatientReportXrayWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int updateByPrimaryKeyWithBLOBs(PatientReportXrayWithBLOBs record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_report_xray
	 * @mbg.generated  Wed May 30 13:49:22 IST 2018
	 */
	int updateByPrimaryKey(PatientReportXray record);

	@Select("Select * FROM tbl_patient_report_xray WHERE PATIENT_ID = #{patientId} ORDER BY REPORT_DATE DESC")
    @ResultMap("BaseResultMap")
    List<PatientReportXrayWithBLOBs> findByPatientId(@Param("patientId")String patientId);

/*    @Select("SELECT * FROM tbl_patient_report_xray")*/

	@Select("SELECT * FROM tbl_patient_report_xray c " +  
	    		" WHERE c.STATUS = #{status} " + 
	    		" ORDER BY INSERT_DATETIME DESC " +
	    		" LIMIT #{pager.start}, #{pager.limit}")
	 @ResultMap("BaseResultMap")
	List<PatientReportXrayWithBLOBs> viewAllByStatus(@Param("pager")Pager pager,  @Param("status")byte status);

	 @Select("SELECT count(0) " + 
	    		" FROM tbl_patient_report_xray c " +  
	    		" WHERE c.STATUS = #{status}")	 
	Integer countByStatus(@Param("status")byte state);
	    

	
	
	
	
}