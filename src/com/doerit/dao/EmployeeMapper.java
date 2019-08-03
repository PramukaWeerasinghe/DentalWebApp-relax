package com.doerit.dao;

import com.doerit.model.Department;
import com.doerit.model.Employee;
import com.doerit.model.EmployeeExample;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.util.Pager;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface EmployeeMapper {
   
    int countByExample(EmployeeExample example);
    int deleteByExample(EmployeeExample example);
    int deleteByPrimaryKey(String id);
    int insert(Employee record);
    int insertSelective(Employee record);
    List<Employee> selectByExample(EmployeeExample example);
    Employee selectByPrimaryKey(String id);
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);
    int updateByPrimaryKeySelective(Employee record);
    int updateByPrimaryKey(Employee record);
    
    @Select("SELECT INITIALS,SURNAME,ID FROM tbl_employee "
			+ "WHERE "
			+ "USER_ROLE =#{DENTAL_DOCTOR} "
			+ "ORDER BY SURNAME"
			)
    @ResultMap("BaseResultMap")
	List<Employee> findAll(@Param("DENTAL_DOCTOR")String DENTAL_DOCTOR);
	
	@Select("SELECT FIRST_NAME,SURNAME,ID FROM tbl_employee "
			+ "WHERE "
			+ "USER_ROLE = 'DENTAL_DOCTOR' AND "
			+ "STATUS = #{state} "
			+ "ORDER BY SURNAME"
			)
	@ResultMap("BaseResultMap")
	List<Employee> findAllByState(@Param("state")byte state);
    
    
}