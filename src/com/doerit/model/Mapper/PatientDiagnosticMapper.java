package com.doerit.model.Mapper;


import com.doerit.dao.PatientDiagnosticComplaintMapper;
import com.doerit.dao.PatientDiagnosticDentalHistoryMapper;


public class PatientDiagnosticMapper {
	
	private PatientDiagnosticComplaintMapper patientDiagnosticComplaintMapper;
	private PatientDiagnosticDentalHistoryMapper patientDiagnosticDentalHistoryMapper;
	
	public PatientDiagnosticComplaintMapper getPatientDiagnosticComplaintMapper() {
		return patientDiagnosticComplaintMapper;
	}
	public void setPatientDiagnosticComplaintMapper(PatientDiagnosticComplaintMapper patientDiagnosticComplaintMapper) {
		this.patientDiagnosticComplaintMapper = patientDiagnosticComplaintMapper;
	}
	public PatientDiagnosticDentalHistoryMapper getPatientDiagnosticDentalHistoryMapper() {
		return patientDiagnosticDentalHistoryMapper;
	}
	public void setPatientDiagnosticDentalHistoryMapper(
			PatientDiagnosticDentalHistoryMapper patientDiagnosticDentalHistoryMapper) {
		this.patientDiagnosticDentalHistoryMapper = patientDiagnosticDentalHistoryMapper;
	}
	
	
}
