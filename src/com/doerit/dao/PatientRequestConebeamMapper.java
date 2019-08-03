package com.doerit.dao;

import com.doerit.model.PatientRequestConebeam;
import com.doerit.model.PatientRequestConebeamExample;
import com.doerit.model.PatientRequestXray;
import com.doerit.util.Pager;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface PatientRequestConebeamMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	long countByExample(PatientRequestConebeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int deleteByExample(PatientRequestConebeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int insert(PatientRequestConebeam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int insertSelective(PatientRequestConebeam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	List<PatientRequestConebeam> selectByExample(PatientRequestConebeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	PatientRequestConebeam selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int updateByExampleSelective(@Param("record") PatientRequestConebeam record,
			@Param("example") PatientRequestConebeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int updateByExample(@Param("record") PatientRequestConebeam record,
			@Param("example") PatientRequestConebeamExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int updateByPrimaryKeySelective(PatientRequestConebeam record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_conebeam
	 * @mbg.generated  Tue Feb 13 22:08:53 IST 2018
	 */
	int updateByPrimaryKey(PatientRequestConebeam record);

	List<PatientRequestConebeam> findAll(String patientId);

    @Select("SELECT c.* " + 
    		" FROM tbl_patient_request_conebeam c " +  
    		" WHERE c.STATUS = #{status} " + 
    		" ORDER BY INSERT_DATETIME DESC " +
    		" LIMIT #{pager.start}, #{pager.limit}"    		
    		)
    @ResultMap("BaseResultMap")
	List<PatientRequestConebeam> viewAllByStatus( @Param("pager")Pager pager, @Param("status") byte state);

    
    
	@Select("Select * FROM tbl_patient_request_conebeam WHERE PATIENT_ID = #{patientId} ORDER BY REPORT_DATE DESC")
    @ResultMap("BaseResultMap")
    List<PatientRequestConebeam> findByPatientId(@Param("patientId")String patientId);	

    @Select("SELECT * FROM tbl_patient_request_conebeam WHERE STATUS = #{status}")
    @ResultMap("BaseResultMap")
	List<PatientRequestConebeam> findAllActive(@Param("status")byte databaseValue);
   
    
    @Select("SELECT count(0) " + 
    		" FROM tbl_patient_request_conebeam c " +  
    		" WHERE c.STATUS = #{status}")
	Integer countAllByStatus(@Param("status")byte status);   
	
	@Select("Select * FROM tbl_patient_request_conebeam WHERE PATIENT_ID = #{patientId}")
    @ResultMap("BaseResultMap")
    List<PatientRequestConebeam> findByPatientIdAll(@Param("patientId")String patientId);
    	
	
}