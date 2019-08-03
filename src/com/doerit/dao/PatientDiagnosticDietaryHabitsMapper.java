package com.doerit.dao;

import com.doerit.model.PatientDiagnosticDietaryHabits;
import com.doerit.model.PatientDiagnosticDietaryHabitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatientDiagnosticDietaryHabitsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    long countByExample(PatientDiagnosticDietaryHabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int deleteByExample(PatientDiagnosticDietaryHabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int insert(PatientDiagnosticDietaryHabits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int insertSelective(PatientDiagnosticDietaryHabits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    List<PatientDiagnosticDietaryHabits> selectByExample(PatientDiagnosticDietaryHabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    PatientDiagnosticDietaryHabits selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int updateByExampleSelective(@Param("record") PatientDiagnosticDietaryHabits record, @Param("example") PatientDiagnosticDietaryHabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int updateByExample(@Param("record") PatientDiagnosticDietaryHabits record, @Param("example") PatientDiagnosticDietaryHabitsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int updateByPrimaryKeySelective(PatientDiagnosticDietaryHabits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_patient_diagnostic_dietary_habits
     *
     * @mbg.generated Tue Apr 24 15:45:48 IST 2018
     */
    int updateByPrimaryKey(PatientDiagnosticDietaryHabits record);
}