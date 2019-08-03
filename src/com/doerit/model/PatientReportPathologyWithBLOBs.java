package com.doerit.model;

public class PatientReportPathologyWithBLOBs extends PatientReportPathology implements InsertUpdate{
	
	private byte[] file;
	private String comment;
	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment == null ? null : comment.trim();
	}
}