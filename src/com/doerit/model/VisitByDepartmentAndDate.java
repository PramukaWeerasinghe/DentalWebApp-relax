/**
 * 
 */
package com.doerit.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author Arjuna
 *
 */
public class VisitByDepartmentAndDate {
	private String Department;
	private Date visitDate;
	private ArrayList<Patient> patientListForVisit = new ArrayList<>();
	
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public ArrayList<Patient> getPatientListForVisit() {
		return patientListForVisit;
	}
	public void setPatientListForVisit(ArrayList<Patient> patientListForVisit) {
		this.patientListForVisit = patientListForVisit;
	}
	

}
