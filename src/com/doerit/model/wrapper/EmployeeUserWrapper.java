package com.doerit.model.wrapper;

import com.doerit.model.Employee;
import com.doerit.model.UserAccount;

public class EmployeeUserWrapper {
	private UserAccount userAccount;
	private Employee employee;
	
	public UserAccount getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(UserAccount userAccount) {
		this.userAccount = userAccount;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	

}
