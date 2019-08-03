package com.doerit.util;

public enum DocumentCategory {
	
	X_RAY("X_RAY"), 
	PATHOLOGY("PATHOLOGY");

	private String databaseValue;
	
	private DocumentCategory(String typeString) {
		this.databaseValue = typeString;
	}
	
	public String getDatabaseValue() {
		return this.databaseValue;
	}

}
