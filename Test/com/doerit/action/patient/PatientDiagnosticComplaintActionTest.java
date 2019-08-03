package com.doerit.action.patient;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.doerit.model.Employee;
import com.doerit.service.EmployeeService;
import com.opensymphony.xwork2.ActionSupport;

public class PatientDiagnosticComplaintActionTest {

	private PatientDiagnosticComplaintAction testclass;
	
	@Autowired EmployeeService employeeservice;
	
	public void setApplicationContext(ApplicationContext context) throws BeansException{
		
	}
	
	@Before
	public void setup() throws Exception{
		testclass = new PatientDiagnosticComplaintAction();

		
		@SuppressWarnings("unused")
		String patientId = null;		
	}
	
	@Test
	public void testForm() {
		
		String ExpValue = ActionSupport.SUCCESS;
		
		AssertionError assertionError  = new AssertionError();
		
	
		
		//assertEquals(testclass.form(), testclass.form());
		assertTrue(ExpValue.equals(testclass.view()));
		
		
		
		
		
	}

}
