package com.doerit.action.patient;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

public class PatientDiagnosticComplaintActionTest2 {

	private PatientDiagnosticComplaintAction testclass;
	
	@Before
	public void setup() throws Exception{
		
		testclass = new PatientDiagnosticComplaintAction();
	}
	
	@Test
	public void testHello() {
		
		String ExpValue = ActionSupport.SUCCESS;
			
		assertTrue(ExpValue.equals(testclass.hello()));
	}	

}
