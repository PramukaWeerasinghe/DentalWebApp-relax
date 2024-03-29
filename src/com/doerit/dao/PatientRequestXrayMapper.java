package com.doerit.dao;

import com.doerit.model.PatientRequestXray;
import com.doerit.model.PatientRequestXrayExample;
import com.doerit.util.Pager;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface PatientRequestXrayMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	long countByExample(PatientRequestXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int deleteByExample(PatientRequestXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int insert(PatientRequestXray record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int insertSelective(PatientRequestXray record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	List<PatientRequestXray> selectByExample(PatientRequestXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	PatientRequestXray selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int updateByExampleSelective(@Param("record") PatientRequestXray record,
			@Param("example") PatientRequestXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int updateByExample(@Param("record") PatientRequestXray record,
			@Param("example") PatientRequestXrayExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int updateByPrimaryKeySelective(PatientRequestXray record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_request_xray
	 * @mbg.generated  Tue Feb 20 15:47:31 IST 2018
	 */
	int updateByPrimaryKey(PatientRequestXray record);

	@Select("Select * FROM tbl_patient_request_xray WHERE PATIENT_ID = #{patientId} ORDER BY INSERT_DATETIME DESC")
    @ResultMap("BaseResultMap")
    List<PatientRequestXray> findByPatientId(@Param("patientId")String patientId);	

    @Select("SELECT * FROM tbl_patient_request_xray WHERE STATUS = #{status}")
    @ResultMap("BaseResultMap")
	List<PatientRequestXray> findAllActive(@Param("status")byte databaseValue);

    
    @Select("SELECT c.* " + 
    		" FROM tbl_patient_request_xray c " +  
    		" WHERE c.STATUS = #{status} " + 
    		" ORDER BY INSERT_DATETIME DESC " +
    		" LIMIT #{pager.start}, #{pager.limit}"    		
    		)
    @ResultMap("BaseResultMap")
	List<PatientRequestXray> viewAllByStatus( @Param("pager")Pager pager, @Param("status") byte state);

    
    @Select("SELECT count(0) " + 
    		" FROM tbl_patient_request_xray c " +  
    		" WHERE c.STATUS = #{status}")
	Integer countAllByStatus(@Param("status")byte status);   
	
	@Select("Select * FROM tbl_patient_request_xray WHERE PATIENT_ID = #{patientId}")
    @ResultMap("BaseResultMap")
    List<PatientRequestXray> findByPatientIdAll(@Param("patientId")String patientId);
    	

      	
}