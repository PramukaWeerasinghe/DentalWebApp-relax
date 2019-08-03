package com.doerit.model.wrapper;

import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.PatientDiagnosticDentalHistory;
import com.doerit.model.PatientDiagnosticMedicalRecord1;
import com.doerit.model.PatientDiagnosticMedicalRecord2;
import com.doerit.model.PatientDiagnosticMedicalRecord3;
import com.doerit.model.PatientDiagnosticMedicalRecord4;
import com.doerit.util.State;
import com.doerit.model.PatientDiagnosticDrugHistory;
import com.doerit.model.PatientDiagnosticInvestigation;
import com.doerit.model.PatientDiagnosticHabits1;
import com.doerit.model.PatientDiagnosticHabits2;

import javax.management.RuntimeErrorException;

import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticBrushingHabits;
import com.doerit.model.PatientDiagnosticDietaryHabits;
import com.doerit.model.PatientDiagnosticDrug;

public class PatientDiagnosticWrapper {
	
	private String patientId;
	private String previousCommonId;
	private boolean reworked = false;
	public String getPreviousCommonId() {
		return previousCommonId;
	}

	public void setPreviousCommonId(String previousCommonId) {
		this.previousCommonId = previousCommonId;
	}

	public boolean isReworked() {
		return reworked;
	}

	public void setReworked(boolean reworked) {
		this.reworked = reworked;
	}


	private Patient patient;
	private PatientDiagnosticComplaint patientDiagnosticComplaint = new PatientDiagnosticComplaint();
	private PatientDiagnosticDentalHistory patientDiagnosticDentalHistory = new PatientDiagnosticDentalHistory();
	private PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1 = new PatientDiagnosticMedicalRecord1();
	private PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2 = new PatientDiagnosticMedicalRecord2();
	private PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3 = new PatientDiagnosticMedicalRecord3();
	private PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4 = new PatientDiagnosticMedicalRecord4();
	private PatientDiagnosticDrugHistory patientDiagnosticDrugHistory = new PatientDiagnosticDrugHistory();
	private PatientDiagnosticDrug patientDiagnosticDrug = new PatientDiagnosticDrug();
	private PatientDiagnosticInvestigation patientDiagnosticInvestigation = new PatientDiagnosticInvestigation();
	private PatientDiagnosticHabits1 patientDiagnosticHabits1 = new PatientDiagnosticHabits1();
	private PatientDiagnosticHabits2 patientDiagnosticHabits2 = new PatientDiagnosticHabits2();
	private PatientDiagnosticBrushingHabits patientDiagnosticBrushingHabits = new PatientDiagnosticBrushingHabits();
	private PatientDiagnosticDietaryHabits patientDiagnosticDietaryHabits = new PatientDiagnosticDietaryHabits();
	
	public String getDrugHistoryId() {
		return this.patientDiagnosticDrug.getDrughistoryId();
	}
	
	public PatientDiagnosticDrug getPatientDiagnosticDrug() {
		return patientDiagnosticDrug;
	}

	public void setPatientDiagnosticDrug(PatientDiagnosticDrug patientDiagnosticDrug) {
		this.patientDiagnosticDrug = patientDiagnosticDrug;
	}
	
	public PatientDiagnosticDrugHistory getPatientDiagnosticDrugHistory() {
		return patientDiagnosticDrugHistory;
	}

	public void setPatientDiagnosticDrugHistory(PatientDiagnosticDrugHistory patientDiagnosticDrugHistory) {
		this.patientDiagnosticDrugHistory = patientDiagnosticDrugHistory;
	}

	public PatientDiagnosticInvestigation getPatientDiagnosticInvestigation() {
		return patientDiagnosticInvestigation;
	}

	public void setPatientDiagnosticInvestigation(PatientDiagnosticInvestigation patientDiagnosticInvestigation) {
		this.patientDiagnosticInvestigation = patientDiagnosticInvestigation;
	}

	public PatientDiagnosticHabits1 getPatientDiagnosticHabits1() {
		return patientDiagnosticHabits1;
	}

	public void setPatientDiagnosticHabits1(PatientDiagnosticHabits1 patientDiagnosticHabits1) {
		this.patientDiagnosticHabits1 = patientDiagnosticHabits1;
	}

	public PatientDiagnosticHabits2 getPatientDiagnosticHabits2() {
		return patientDiagnosticHabits2;
	}

	public void setPatientDiagnosticHabits2(PatientDiagnosticHabits2 patientDiagnosticHabits2) {
		this.patientDiagnosticHabits2 = patientDiagnosticHabits2;
	}

	public PatientDiagnosticBrushingHabits getPatientDiagnosticBrushingHabits() {
		return patientDiagnosticBrushingHabits;
	}

	public void setPatientDiagnosticBrushingHabits(PatientDiagnosticBrushingHabits patientDiagnosticBrushingHabits) {
		this.patientDiagnosticBrushingHabits = patientDiagnosticBrushingHabits;
	}

	public PatientDiagnosticDietaryHabits getPatientDiagnosticDietaryHabits() {
		return patientDiagnosticDietaryHabits;
	}

	public void setPatientDiagnosticDietaryHabits(PatientDiagnosticDietaryHabits patientDiagnosticDietaryHabits) {
		this.patientDiagnosticDietaryHabits = patientDiagnosticDietaryHabits;
	}


	public PatientDiagnosticComplaint getPatientDiagnosticComplaint() {
		return patientDiagnosticComplaint;
	}

	public PatientDiagnosticMedicalRecord1 getPatientDiagnosticMedicalRecord1() {
		return patientDiagnosticMedicalRecord1;
	}

	public void setPatientDiagnosticMedicalRecord1(PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1) {
		this.patientDiagnosticMedicalRecord1 = patientDiagnosticMedicalRecord1;
	}

	public PatientDiagnosticMedicalRecord2 getPatientDiagnosticMedicalRecord2() {
		return patientDiagnosticMedicalRecord2;
	}

	public void setPatientDiagnosticMedicalRecord2(PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2) {
		this.patientDiagnosticMedicalRecord2 = patientDiagnosticMedicalRecord2;
	}

	public PatientDiagnosticMedicalRecord3 getPatientDiagnosticMedicalRecord3() {
		return patientDiagnosticMedicalRecord3;
	}

	public void setPatientDiagnosticMedicalRecord3(PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3) {
		this.patientDiagnosticMedicalRecord3 = patientDiagnosticMedicalRecord3;
	}

	public PatientDiagnosticMedicalRecord4 getPatientDiagnosticMedicalRecord4() {
		return patientDiagnosticMedicalRecord4;
	}

	public void setPatientDiagnosticMedicalRecord4(PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4) {
		this.patientDiagnosticMedicalRecord4 = patientDiagnosticMedicalRecord4;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setPatientDiagnosticComplaint(PatientDiagnosticComplaint patientDiagnosticComplaint) {
		this.patientDiagnosticComplaint = patientDiagnosticComplaint;
	}

	public PatientDiagnosticDentalHistory getPatientDiagnosticDentalHistory() {
		return patientDiagnosticDentalHistory;
	}

	public void setPatientDiagnosticDentalHistory(PatientDiagnosticDentalHistory patientDiagnosticDentalHistory) {
		this.patientDiagnosticDentalHistory = patientDiagnosticDentalHistory;
	}
	
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setCommonIdForAllRecords() {
		if(this.getPatientDiagnosticComplaint().getId() != null) {
			String id = this.getPatientDiagnosticComplaint().getId();
			setCommonIdForAllRecords(id);
		} else {
			throw new RuntimeErrorException(null, "there is no compaint");
		}
	}
/*	
	public void setCommonIdForAllRecordsWhenResubmit() {
		//[TODO]
		if(this.getPatientDiagnosticComplaint().getId() != null) {
			String id = this.getPatientDiagnosticComplaint().getId();
			setCommonIdForAllRecords(id);
		} else {
			throw new RuntimeErrorException(null, "there is no compaint");
		}
	}
	
	*/

	
	public void setStatusForAllRecords(byte status) {
			this.patientDiagnosticComplaint.setStatus(status);
			this.patientDiagnosticDentalHistory.setStatus(status);
			this.patientDiagnosticMedicalRecord1.setStatus(status);
			this.patientDiagnosticMedicalRecord2.setStatus(status);
			this.patientDiagnosticMedicalRecord3.setStatus(status);
			this.patientDiagnosticMedicalRecord4.setStatus(status);
			this.patientDiagnosticDrugHistory.setStatus(status);
			this.patientDiagnosticDrug.setStatus(status);
			this.patientDiagnosticInvestigation.setStatus(status);
			this.patientDiagnosticHabits1.setStatus(status);
			this.patientDiagnosticHabits2.setStatus(status);
			this.patientDiagnosticBrushingHabits.setStatus(status);
			this.patientDiagnosticDietaryHabits.setStatus(status);
	}
	
	public void setCommonIdForAllRecords(String id) {
		if(id != null) {
			this.patientDiagnosticDentalHistory.setId(id);
			this.patientDiagnosticMedicalRecord1.setId(id);
			this.patientDiagnosticMedicalRecord2.setId(id);
			this.patientDiagnosticMedicalRecord3.setId(id);
			this.patientDiagnosticMedicalRecord4.setId(id);
			this.patientDiagnosticDrugHistory.setId(id);
			this.patientDiagnosticInvestigation.setId(id);
			this.patientDiagnosticHabits1.setId(id);
			this.patientDiagnosticHabits2.setId(id);
			this.patientDiagnosticBrushingHabits.setId(id);
			this.patientDiagnosticDietaryHabits.setId(id);
		} else {
			throw new RuntimeErrorException(null, "there is no compaint");
		}
	}
}
