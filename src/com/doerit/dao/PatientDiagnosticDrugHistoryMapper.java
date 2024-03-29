package com.doerit.dao;

import com.doerit.model.PatientDiagnosticDrugHistory;
import com.doerit.model.PatientDiagnosticDrugHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientDiagnosticDrugHistoryMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	long countByExample(PatientDiagnosticDrugHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int deleteByExample(PatientDiagnosticDrugHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int insert(PatientDiagnosticDrugHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int insertSelective(PatientDiagnosticDrugHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	List<PatientDiagnosticDrugHistory> selectByExample(PatientDiagnosticDrugHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	PatientDiagnosticDrugHistory selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int updateByExampleSelective(@Param("record") PatientDiagnosticDrugHistory record,
			@Param("example") PatientDiagnosticDrugHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int updateByExample(@Param("record") PatientDiagnosticDrugHistory record,
			@Param("example") PatientDiagnosticDrugHistoryExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int updateByPrimaryKeySelective(PatientDiagnosticDrugHistory record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tbl_patient_diagnostic_drughistory
	 * @mbg.generated  Fri May 11 13:21:27 IST 2018
	 */
	int updateByPrimaryKey(PatientDiagnosticDrugHistory record);
}