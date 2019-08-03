package com.doerit.util;

public enum EntityType {
	
	PATIENT("tbl_patient"), EMPLOYEE("tbl_employee"),
	PATIENT_X_RAY("tbl_patient_report_pathology"), 
	PATIENT_PATHOLOGY("tbl_patient_report_xray");

	private String databaseValue;
	
	private EntityType(String typeString) {
		this.databaseValue = typeString;
	}
	
	public String getDatabaseValue() {
		return this.databaseValue;
	}

}
