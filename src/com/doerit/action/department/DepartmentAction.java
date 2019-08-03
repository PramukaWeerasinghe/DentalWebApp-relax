package com.doerit.action.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.action.AbstractManagementAction;
import com.doerit.model.Department;
import com.doerit.service.DepartmentService;

public class DepartmentAction extends AbstractManagementAction{

	private static final long serialVersionUID = 1L;
	
	@Autowired private DepartmentService departmentService;
	
	private List<Department> departments;
	private Department department;
	
	public String list() {
		departments = departmentService.viewAll();
		return SUCCESS;
	}

	public String view() {
		if(getId() != null) {
			department = departmentService.viewById(getId());
			return SUCCESS;
		} else {
			return INPUT;
		}
	}
	
	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

}
