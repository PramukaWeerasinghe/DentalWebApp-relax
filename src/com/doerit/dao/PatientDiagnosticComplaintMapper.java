package com.doerit.dao;

import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.PatientDiagnosticComplaintExample;
import com.doerit.model.PatientRequestXray;
import com.doerit.util.Pager;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface PatientDiagnosticComplaintMapper {

	long countByExample(PatientDiagnosticComplaintExample example);

	int deleteByExample(PatientDiagnosticComplaintExample example);

	int deleteByPrimaryKey(String id);

	int insert(PatientDiagnosticComplaint record);

	int insertSelective(PatientDiagnosticComplaint record);

	List<PatientDiagnosticComplaint> selectByExampleWithBLOBs(PatientDiagnosticComplaintExample example);

	List<PatientDiagnosticComplaint> selectByExample(PatientDiagnosticComplaintExample example);

	PatientDiagnosticComplaint selectByPrimaryKey(String id);

	int updateByExampleSelective(@Param("record") PatientDiagnosticComplaint record,
			@Param("example") PatientDiagnosticComplaintExample example);

	int updateByExampleWithBLOBs(@Param("record") PatientDiagnosticComplaint record,
			@Param("example") PatientDiagnosticComplaintExample example);

	int updateByExample(@Param("record") PatientDiagnosticComplaint record,
			@Param("example") PatientDiagnosticComplaintExample example);

	int updateByPrimaryKeySelective(PatientDiagnosticComplaint record);

	int updateByPrimaryKeyWithBLOBs(PatientDiagnosticComplaint record);

	int updateByPrimaryKey(PatientDiagnosticComplaint record);

	@Select("SELECT * FROM tbl_patient_diagnostic_complaint WHERE PATIENT_ID =#{patietnId} AND STATUS = #{status}")
	@ResultMap("ResultMapWithBLOBs")
	List<PatientDiagnosticComplaint> findByPatientId(@Param("patietnId") String patientId,
			@Param("status") byte status);

	@Select("SELECT A.*,B.USER_NAME FROM tbl_patient_diagnostic_complaint A, tbl_user_account B WHERE A.PATIENT_ID =#{patietnId} AND A.INSERT_USER_ID = B.ID")
	@ResultMap("ResultMapWithBLOBs")
	List<PatientDiagnosticComplaint> findAllByPatientId(@Param("patietnId") String patientId); // return all active and
																								// pending lists

	/*
	 * @Select("SELECT * FROM tbl_patient_diagnostic_complaint WHERE PATIENT_ID =#{patietnId}"
	 * )
	 * 
	 * @ResultMap("ResultMapWithBLOBs") List<PatientDiagnosticComplaint>
	 * findAllByPatientId(@Param("patietnId") String patientId); //return all active
	 * and pending lists
	 */

	/*
	 * tbl_patient.NAME as PATIENT_NAME
	 */
	//to get patient name by patientID
	@Select("SELECT p.INITIALS AS INITIALS,p.FIRST_NAME AS FIRST_NAME,p.SURNAME AS SURNAME FROM tbl_patient p LEFT JOIN tbl_patient_diagnostic_complaint c ON c.PATIENT_ID WHERE p.ID = #{patientId}")
	@ResultMap("ResultMapWithBLOBs")
	List<PatientDiagnosticComplaint> getNameByPatientId(@Param("patietnId") String patientId);

	
	
	
	@Select("SELECT c.*,B.USER_NAME FROM tbl_patient_diagnostic_complaint c, tbl_user_account B " + "WHERE "
			+ "c.INSERT_USER_ID = B.ID AND " + "c.STATUS = #{status} " + "ORDER BY INSERT_DATETIME DESC "
			+ "LIMIT #{pager.start}, #{pager.limit} ")
	@ResultMap("ResultMapWithBLOBs")
	List<PatientDiagnosticComplaint> findAllByStatus(@Param("pager") Pager pager, @Param("status") byte status);

	@Select("SELECT * FROM tbl_patient_diagnostic_complaint c " + "WHERE " + "c.DEPARTMENT = #{department} AND  "
			+ "c.STATUS = 2 " + "ORDER BY INSERT_DATETIME DESC " + "LIMIT #{pager.start}, #{pager.limit} ")
	@ResultMap("ResultMapWithBLOBs")
	List<PatientDiagnosticComplaint> findAllByDepartmentPending(@Param("pager") Pager pager,
			@Param("status") byte status, @Param("department") String department);

	@Select("SELECT * FROM tbl_patient_diagnostic_complaint " + "WHERE " + "STATUS = 1 OR " + "STATUS = 2 "
			+ "ORDER BY INSERT_DATETIME DESC " + "LIMIT #{pager.start}, #{pager.limit} ")
	@ResultMap("ResultMapWithBLOBs")
	List<PatientDiagnosticComplaint> findAll(@Param("pager") Pager pager, @Param("status") byte status,
			@Param("status") byte status1);

	@Select("SELECT c.*,B.USER_NAME FROM tbl_patient_diagnostic_complaint c, tbl_user_account B " + "WHERE "
			+ "c.INSERT_USER_ID = B.ID AND " + "c.STATUS = #{status} AND B.id = #{userId} "
			+ "ORDER BY INSERT_DATETIME DESC " + "LIMIT #{pager.start}, #{pager.limit} ")
	@ResultMap("ResultMapWithBLOBs")
	List<PatientDiagnosticComplaint> findAllByUserAndStatus(@Param("pager") Pager pager, @Param("userId") String userId,
			@Param("status") byte status);

	@Select("SELECT count(c.id) FROM tbl_patient_diagnostic_complaint c, tbl_user_account B " + "WHERE "
			+ "c.INSERT_USER_ID = B.ID AND " + "c.STATUS = #{status} AND B.id = #{userId} ")
	@ResultMap("ResultMapWithBLOBs")
	int countAllByUserAndStatus(@Param("pager") Pager pager, @Param("userId") String userId,
			@Param("status") byte status);

	/*
	 * @Select("serial_number from tbl_patient where id = #{id}") String
	 * viewPatientSerial(@Param("id")String id);
	 */

	@Select("SELECT count(*) FROM tbl_patient_diagnostic_complaint where status = #{status}")
	int countAllByState(@Param("status") byte status);

	@Select("SELECT count(0) " + " FROM tbl_patient_diagnostic_complaint c " + " WHERE c.STATUS = #{status}")
	Integer countAllByStatus(@Param("status") byte status);

	@Select("SELECT count(*) " + " FROM tbl_patient_diagnostic_complaint c " + " WHERE c.STATUS = #{status} AND "
			+ " c.INSERT_USER_ID = #{userId}")
	Integer countStudentSubmissions(@Param("status") byte status, @Param("userId") String string);

	@Select("SELECT * " + " FROM tbl_patient_diagnostic_complaint " + " WHERE COMPLAINT_TYPE LIKE #{complaintType}")
	@ResultMap("BaseResultMap")

	List<Patient> searchByComplaintType(@Param("complaintType") String likeSearchValue);

	@Select("SELECT * " + " FROM tbl_patient_diagnostic_complaint " + " WHERE COMPLAINT LIKE #{complaint}")
	@ResultMap("BaseResultMap")

	List<Patient> searchByComplaint(@Param("complaint") String likeSearchValue);

}