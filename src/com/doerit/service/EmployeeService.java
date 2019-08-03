package com.doerit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.EmployeeMapper;
import com.doerit.model.Department;
import com.doerit.model.Employee;
import com.doerit.model.EmployeeExample;
import com.doerit.util.State;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	private EmployeeExample example;
	
	private Employee employee;
	
	public Employee viewById(String id) {
		return employeeMapper.selectByPrimaryKey(id);
	}
	public int save(Employee u) {
		return employeeMapper.insert(u);
	}
	
	public List<Employee> viewAll() {
		return employeeMapper.findAllByState(State.ACTIVE.getDatabaseValue());
		
	}
	
	public List<Employee> viewByCategoryType(String string) {
		
		example = null;
		example.createCriteria().andDesignationLike(string);
		
		return employeeMapper.selectByExample(example);
	}
		

}
