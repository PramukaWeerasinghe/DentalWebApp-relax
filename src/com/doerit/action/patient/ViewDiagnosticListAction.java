package com.doerit.action.patient;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.doerit.model.DiagnosticReportComments;
import com.doerit.model.PatientDiagnosticBrushingHabits;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.PatientDiagnosticDentalHistory;
import com.doerit.model.PatientDiagnosticDietaryHabits;
import com.doerit.model.PatientDiagnosticDrug;
import com.doerit.model.PatientDiagnosticDrugHistory;
import com.doerit.model.PatientDiagnosticHabits1;
import com.doerit.model.PatientDiagnosticHabits2;
import com.doerit.model.PatientDiagnosticInvestigation;
import com.doerit.model.PatientDiagnosticMedicalRecord1;
import com.doerit.model.PatientDiagnosticMedicalRecord2;
import com.doerit.model.PatientDiagnosticMedicalRecord3;
import com.doerit.model.PatientDiagnosticMedicalRecord4;
import com.doerit.model.ActivityLogger.MessageType;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.service.PatientDiagnosticComplaintService;
import com.doerit.service.PatientDiagnosticService;
import com.doerit.util.State;

public class ViewDiagnosticListAction extends AbstractPatientDiagnosticAction {

	private static final long serialVersionUID = 1L;
	
	@Autowired private PatientDiagnosticService patientDiagnosticService;
	@Autowired private PatientDiagnosticComplaintService patientDiagnosticComplaintService;

	private List<PatientDiagnosticComplaint> complaintList;
	
	private DiagnosticReportComments diagnosticReportComments;	//comments object
	
	private PatientDiagnosticWrapper patientDiagnosticWrapper;
	private String patientId;
	private String commonId;

	

    public String writeJSON() {
    	
    	String complaint = diagnosticReportComments.getPatientDiagnosticComplaint_comment();
    
        try {
            
            System.out.println("Execute Method complaint" + complaint);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SUCCESS;
    }
	
	


	public DiagnosticReportComments getData() {
		return diagnosticReportComments;
	}



	public void setData(DiagnosticReportComments data) {
		this.diagnosticReportComments = data;
		System.out.println(data);
	}



	public String form() {
		return SUCCESS;
	}
	

	public String clearSessionCache() {
		clearSessionVariables();
		return SUCCESS;
	}

	
	public String back() {
		if(this.patientId != null && !this.patientId.isEmpty()) {
			this.complaintList = patientDiagnosticComplaintService.viewByPatientId(patientId);
			clearSessionVariables();
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	//patient's reports
	public String viewComplaintList() {
		
		try {
			if(this.patientId != null && !this.patientId.isEmpty()) {
				clearSessionCache();
				this.complaintList = patientDiagnosticComplaintService.viewAllByPatientId(patientId);
				
				return SUCCESS;
			} else {
				return INPUT;
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;

	}

	
	
	//for doctors view all pending
	public String viewAllComplaintList() {

		try {
			clearSessionCache();
			beforeAction();
			pager = patientDiagnosticComplaintService.viewAllByPagerAndStatusPending(pager, State.PENDING.getDatabaseValue());
			pager = setActionContext(pager);
			
		} catch (Exception e) {
			addActionError("Exception occur");
			e.printStackTrace();
		}
		return SUCCESS;		
	}	
	
	public String viewDiagnosticDetails() {
		if(this.commonId != null && !this.commonId.isEmpty()) {
			
			this.patientDiagnosticWrapper = patientDiagnosticService.viewByCommonId(commonId);
			this.patientId = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint().getPatientId();
			updatePatientDiagnosticSession(patientDiagnosticWrapper);

			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	//activate records from pending list
	public String activateDiagnosticDetails() {

		try {
			if (this.commonId != null && !this.commonId.isEmpty()) {

				this.patientDiagnosticWrapper = patientDiagnosticService.viewByCommonId(commonId);
				this.patientId = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint().getPatientId();
				
				if (this.patientDiagnosticWrapper != null) {
					PatientDiagnosticComplaint patientDiagnosticComplaint = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint();
					patientDiagnosticComplaint.setStatus(State.ACTIVE.getDatabaseValue());	
					addUpdateSettings(patientDiagnosticComplaint);
					this.patientDiagnosticWrapper.setPatientDiagnosticComplaint(patientDiagnosticComplaint);
					pdw = getPatientDiagnosticWrapper();
					pdw.setPatientDiagnosticComplaint(patientDiagnosticComplaint);			
					
					updatePatientDiagnosticSession(pdw);		
					
					int updated = 0;
							
					updated =	patientDiagnosticComplaintService.update(patientDiagnosticComplaint);				
					addLoggerMessage("tbl_diagnostic_complaint", MessageType.PATIENT_DIAGNOSTIC.toString(), "SUCCESS", "PatientId: "
							+ patientId + ", Host: " + ServletActionContext.getRequest().getRemoteHost());	
					
					if(updated == 1 ) {
						return SUCCESS;
					
					} else {
						
						return INPUT;
					}			
					
				} else {
					return INPUT;

				}
				

			} 			
		} catch (Exception e) {
			e.printStackTrace();
		}

			
		return INPUT;
		

	}
	
	//activate records with comment
	public String activateDiagnosticDetailsWithComment() {
		
		try {
			if (this.commonId != null && !this.commonId.isEmpty()) {
				
				this.patientDiagnosticWrapper = patientDiagnosticService.viewByCommonId(commonId);
				this.patientId = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint().getPatientId();
				
				if (this.patientDiagnosticWrapper != null) {
					//complaint comment set
					PatientDiagnosticComplaint patientDiagnosticComplaint = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint();
					patientDiagnosticComplaint.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticComplaint);					
					patientDiagnosticComplaint.setComment(diagnosticReportComments.getPatientDiagnosticComplaint_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticComplaint(patientDiagnosticComplaint);

					//diag history comment
					PatientDiagnosticDentalHistory patientDiagnosticDentalHistory = this.patientDiagnosticWrapper.getPatientDiagnosticDentalHistory();
					patientDiagnosticDentalHistory.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDentalHistory);
					patientDiagnosticDentalHistory.setComment(diagnosticReportComments.getPatientDiagnosticDentalHistory_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDentalHistory(patientDiagnosticDentalHistory);
					
					//mediacl rec1 comment
					PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1();
					patientDiagnosticMedicalRecord1.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord1);
					patientDiagnosticMedicalRecord1.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord1_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord1(patientDiagnosticMedicalRecord1);
					
					//mediac rec2 comment
					PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2();
					patientDiagnosticMedicalRecord2.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord2);
					patientDiagnosticMedicalRecord2.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord2_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord2(patientDiagnosticMedicalRecord2);

					//mediac rec3 comment
					PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3();
					patientDiagnosticMedicalRecord3.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord3);
					patientDiagnosticMedicalRecord3.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord3_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord3(patientDiagnosticMedicalRecord3);
					
					//mediac rec4 comment
					PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4();
					patientDiagnosticMedicalRecord4.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord4);
					patientDiagnosticMedicalRecord4.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord4_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord4(patientDiagnosticMedicalRecord4);
					
					//PatientDiagnosticDrugHistory comment
					PatientDiagnosticDrugHistory patientDiagnosticDrugHistory = this.patientDiagnosticWrapper.getPatientDiagnosticDrugHistory();
					patientDiagnosticDrugHistory.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDrugHistory);
					patientDiagnosticDrugHistory.setComment(diagnosticReportComments.getPatientDiagnosticDrugHistory_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDrugHistory(patientDiagnosticDrugHistory);
					
					//PatientDiagnosticDrug comment
					PatientDiagnosticDrug patientDiagnosticDrug = this.patientDiagnosticWrapper.getPatientDiagnosticDrug();
					patientDiagnosticDrug.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDrug);
					patientDiagnosticDrug.setComment(diagnosticReportComments.getPatientDiagnosticDrugHistory_comment2());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDrug(patientDiagnosticDrug);
					
					//PatientDiagnosticInvestigation comment
					PatientDiagnosticInvestigation patientDiagnosticInvestigation = this.patientDiagnosticWrapper.getPatientDiagnosticInvestigation();
					patientDiagnosticInvestigation.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticInvestigation);
					patientDiagnosticInvestigation.setComment(diagnosticReportComments.getPatientDiagnosticInvestigation_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticInvestigation(patientDiagnosticInvestigation);
					
					//PatientDiagnosticHabits1 comment
					PatientDiagnosticHabits1 patientDiagnosticHabits1 = this.patientDiagnosticWrapper.getPatientDiagnosticHabits1();
					patientDiagnosticHabits1.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticHabits1);
					patientDiagnosticHabits1.setComment(diagnosticReportComments.getPatientDiagnosticHabits1_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticHabits1(patientDiagnosticHabits1);
					
					
					//PatientDiagnosticHabits2 comment
					PatientDiagnosticHabits2 patientDiagnosticHabits2 = this.patientDiagnosticWrapper.getPatientDiagnosticHabits2();
					patientDiagnosticHabits2.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticHabits2);
					patientDiagnosticHabits2.setComment(diagnosticReportComments.getPatientDiagnosticHabits2_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticHabits2(patientDiagnosticHabits2);
					
					
					//PatientDiagnosticBrushingHabits comment
					PatientDiagnosticBrushingHabits patientDiagnosticBrushingHabits = this.patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits();
					patientDiagnosticBrushingHabits.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticBrushingHabits);
					patientDiagnosticBrushingHabits.setComment(diagnosticReportComments.getPatientDiagnosticBrushingHabits_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticBrushingHabits(patientDiagnosticBrushingHabits);
					
			
					//PatientDiagnosticDietaryHabits comment
					PatientDiagnosticDietaryHabits patientDiagnosticDietaryHabits = this.patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits();
					patientDiagnosticDietaryHabits.setStatus(State.ACTIVE.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDietaryHabits);
					patientDiagnosticDietaryHabits.setComment(diagnosticReportComments.getPatientDiagnosticDietaryHabits_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDietaryHabits(patientDiagnosticDietaryHabits);
					
					/*pdw = getPatientDiagnosticWrapper();
					pdw.setPatientDiagnosticComplaint(patientDiagnosticComplaint);			
					
					updatePatientDiagnosticSession(pdw);*/		
					
					int updated = 0;
					
					//[todo] 
					patientDiagnosticService.updateAll(patientDiagnosticWrapper);
					
					//updated =	patientDiagnosticComplaintService.update(patientDiagnosticComplaint);				
					addLoggerMessage("tbl_diagnostic_complaint", MessageType.PATIENT_DIAGNOSTIC.toString(), "SUCCESS", "PatientId: "
							+ patientId + ", Host: " + ServletActionContext.getRequest().getRemoteHost());	
					
					updatePatientDiagnosticSession(patientDiagnosticWrapper);
					if(updated == 1 ) {
						return SUCCESS;
						
					} else {
						
						return INPUT;
					}			
					
				} else {
					return INPUT;
					
				}
				
				
			} 			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return INPUT;
		
		
	}
	
	
	
public String rejectDiagnosticDetailsWithComment() {
		
		try {
			if (this.commonId != null && !this.commonId.isEmpty()) {
				
				this.patientDiagnosticWrapper = patientDiagnosticService.viewByCommonId(commonId);
				this.patientId = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint().getPatientId();
				
				if (this.patientDiagnosticWrapper != null) {
					//complaint comment set
					PatientDiagnosticComplaint patientDiagnosticComplaint = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint();
					patientDiagnosticComplaint.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticComplaint);					
					patientDiagnosticComplaint.setComment(diagnosticReportComments.getPatientDiagnosticComplaint_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticComplaint(patientDiagnosticComplaint);

					//diag history comment
					PatientDiagnosticDentalHistory patientDiagnosticDentalHistory = this.patientDiagnosticWrapper.getPatientDiagnosticDentalHistory();
					patientDiagnosticDentalHistory.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDentalHistory);
					patientDiagnosticDentalHistory.setComment(diagnosticReportComments.getPatientDiagnosticDentalHistory_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDentalHistory(patientDiagnosticDentalHistory);
					
					//mediacl rec1 comment
					PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1();
					patientDiagnosticMedicalRecord1.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord1);
					patientDiagnosticMedicalRecord1.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord1_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord1(patientDiagnosticMedicalRecord1);
					
					//mediac rec2 comment
					PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2();
					patientDiagnosticMedicalRecord2.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord2);
					patientDiagnosticMedicalRecord2.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord2_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord2(patientDiagnosticMedicalRecord2);

					//mediac rec3 comment
					PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3();
					patientDiagnosticMedicalRecord3.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord3);
					patientDiagnosticMedicalRecord3.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord3_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord3(patientDiagnosticMedicalRecord3);
					
					//mediac rec4 comment
					PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4();
					patientDiagnosticMedicalRecord4.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord4);
					patientDiagnosticMedicalRecord4.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord4_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord4(patientDiagnosticMedicalRecord4);
					
					//PatientDiagnosticDrugHistory comment
					PatientDiagnosticDrugHistory patientDiagnosticDrugHistory = this.patientDiagnosticWrapper.getPatientDiagnosticDrugHistory();
					patientDiagnosticDrugHistory.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDrugHistory);
					patientDiagnosticDrugHistory.setComment(diagnosticReportComments.getPatientDiagnosticDrugHistory_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDrugHistory(patientDiagnosticDrugHistory);
					
					//PatientDiagnosticDrug comment
					PatientDiagnosticDrug patientDiagnosticDrug = this.patientDiagnosticWrapper.getPatientDiagnosticDrug();
					patientDiagnosticDrug.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDrug);
					patientDiagnosticDrug.setComment(diagnosticReportComments.getPatientDiagnosticDrugHistory_comment2());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDrug(patientDiagnosticDrug);
					
					//PatientDiagnosticInvestigation comment
					PatientDiagnosticInvestigation patientDiagnosticInvestigation = this.patientDiagnosticWrapper.getPatientDiagnosticInvestigation();
					patientDiagnosticInvestigation.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticInvestigation);
					patientDiagnosticInvestigation.setComment(diagnosticReportComments.getPatientDiagnosticInvestigation_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticInvestigation(patientDiagnosticInvestigation);
					
					//PatientDiagnosticHabits1 comment
					PatientDiagnosticHabits1 patientDiagnosticHabits1 = this.patientDiagnosticWrapper.getPatientDiagnosticHabits1();
					patientDiagnosticHabits1.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticHabits1);
					patientDiagnosticHabits1.setComment(diagnosticReportComments.getPatientDiagnosticHabits1_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticHabits1(patientDiagnosticHabits1);
					
					
					//PatientDiagnosticHabits2 comment
					PatientDiagnosticHabits2 patientDiagnosticHabits2 = this.patientDiagnosticWrapper.getPatientDiagnosticHabits2();
					patientDiagnosticHabits2.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticHabits2);
					patientDiagnosticHabits2.setComment(diagnosticReportComments.getPatientDiagnosticHabits2_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticHabits2(patientDiagnosticHabits2);
					
					
					//PatientDiagnosticBrushingHabits comment
					PatientDiagnosticBrushingHabits patientDiagnosticBrushingHabits = this.patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits();
					patientDiagnosticBrushingHabits.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticBrushingHabits);
					patientDiagnosticBrushingHabits.setComment(diagnosticReportComments.getPatientDiagnosticBrushingHabits_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticBrushingHabits(patientDiagnosticBrushingHabits);
					
			
					//PatientDiagnosticDietaryHabits comment
					PatientDiagnosticDietaryHabits patientDiagnosticDietaryHabits = this.patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits();
					patientDiagnosticDietaryHabits.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDietaryHabits);
					patientDiagnosticDietaryHabits.setComment(diagnosticReportComments.getPatientDiagnosticDietaryHabits_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDietaryHabits(patientDiagnosticDietaryHabits);
					
					/*pdw = getPatientDiagnosticWrapper();
					pdw.setPatientDiagnosticComplaint(patientDiagnosticComplaint);			
					
					updatePatientDiagnosticSession(pdw);*/		
					
					int updated = 0;
					
					//[todo] 
					patientDiagnosticService.updateAll(patientDiagnosticWrapper);
					
					//updated =	patientDiagnosticComplaintService.update(patientDiagnosticComplaint);				
					addLoggerMessage("tbl_diagnostic_complaint", MessageType.PATIENT_DIAGNOSTIC.toString(), "SUCCESS", "PatientId: "
							+ patientId + ", Host: " + ServletActionContext.getRequest().getRemoteHost());	
					
					updatePatientDiagnosticSession(patientDiagnosticWrapper);
					if(updated == 1 ) {
						return SUCCESS;
						
					} else {
						
						return INPUT;
					}			
					
				} else {
					return INPUT;
					
				}
				
				
			} 			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return INPUT;
		
		
	}
	
	//reject records with comment
	/*public String rejectDiagnosticDetailsWithComment() {
		
		try {
			if (this.commonId != null && !this.commonId.isEmpty()) {
				
				this.patientDiagnosticWrapper = patientDiagnosticService.viewByCommonId(commonId);
				this.patientId = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint().getPatientId();
				
				if (this.patientDiagnosticWrapper != null) {
					//complaint comment set
					PatientDiagnosticComplaint patientDiagnosticComplaint = this.patientDiagnosticWrapper.getPatientDiagnosticComplaint();
					patientDiagnosticComplaint.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticComplaint);					
					patientDiagnosticComplaint.setComment(diagnosticReportComments.getPatientDiagnosticComplaint_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticComplaint(patientDiagnosticComplaint);

					//diag history comment
					PatientDiagnosticDentalHistory patientDiagnosticDentalHistory = this.patientDiagnosticWrapper.getPatientDiagnosticDentalHistory();
					patientDiagnosticDentalHistory.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDentalHistory);
					patientDiagnosticDentalHistory.setComment(diagnosticReportComments.getPatientDiagnosticDentalHistory_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDentalHistory(patientDiagnosticDentalHistory);
					
					//mediacl rec1 comment
					PatientDiagnosticMedicalRecord1 patientDiagnosticMedicalRecord1 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1();
					patientDiagnosticMedicalRecord1.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord1);
					patientDiagnosticMedicalRecord1.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord1_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord1(patientDiagnosticMedicalRecord1);
					
					//mediac rec2 comment
					PatientDiagnosticMedicalRecord2 patientDiagnosticMedicalRecord2 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2();
					patientDiagnosticMedicalRecord2.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord2);
					patientDiagnosticMedicalRecord2.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord2_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord2(patientDiagnosticMedicalRecord2);

					//mediac rec3 comment
					PatientDiagnosticMedicalRecord3 patientDiagnosticMedicalRecord3 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3();
					patientDiagnosticMedicalRecord3.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord3);
					patientDiagnosticMedicalRecord3.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord3_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord3(patientDiagnosticMedicalRecord3);
					
					//mediac rec4 comment
					PatientDiagnosticMedicalRecord4 patientDiagnosticMedicalRecord4 = this.patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4();
					patientDiagnosticMedicalRecord4.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticMedicalRecord4);
					patientDiagnosticMedicalRecord4.setComment(diagnosticReportComments.getPatientDiagnosticMedicalRecord4_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord4(patientDiagnosticMedicalRecord4);
					
					//PatientDiagnosticDrugHistory comment
					PatientDiagnosticDrugHistory patientDiagnosticDrugHistory = this.patientDiagnosticWrapper.getPatientDiagnosticDrugHistory();
					patientDiagnosticDrugHistory.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDrugHistory);
					patientDiagnosticDrugHistory.setComment(diagnosticReportComments.getPatientDiagnosticDrugHistory_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDrugHistory(patientDiagnosticDrugHistory);
					
					//PatientDiagnosticDrug comment
					PatientDiagnosticDrug patientDiagnosticDrug = this.patientDiagnosticWrapper.getPatientDiagnosticDrug();
					patientDiagnosticDrug.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDrug);
					patientDiagnosticDrug.setComment(diagnosticReportComments.getPatientDiagnosticDrugHistory_comment2());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDrug(patientDiagnosticDrug);
					
					//PatientDiagnosticInvestigation comment
					PatientDiagnosticInvestigation patientDiagnosticInvestigation = this.patientDiagnosticWrapper.getPatientDiagnosticInvestigation();
					patientDiagnosticInvestigation.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticInvestigation);
					patientDiagnosticInvestigation.setComment(diagnosticReportComments.getPatientDiagnosticInvestigation_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticInvestigation(patientDiagnosticInvestigation);
					
					//PatientDiagnosticHabits1 comment
					PatientDiagnosticHabits1 patientDiagnosticHabits1 = this.patientDiagnosticWrapper.getPatientDiagnosticHabits1();
					patientDiagnosticHabits1.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticHabits1);
					patientDiagnosticHabits1.setComment(diagnosticReportComments.getPatientDiagnosticHabits1_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticHabits1(patientDiagnosticHabits1);
					
					
					//PatientDiagnosticHabits2 comment
					PatientDiagnosticHabits2 patientDiagnosticHabits2 = this.patientDiagnosticWrapper.getPatientDiagnosticHabits2();
					patientDiagnosticHabits2.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticHabits2);
					patientDiagnosticHabits2.setComment(diagnosticReportComments.getPatientDiagnosticHabits2_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticHabits2(patientDiagnosticHabits2);
					
					
					//PatientDiagnosticBrushingHabits comment
					PatientDiagnosticBrushingHabits patientDiagnosticBrushingHabits = this.patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits();
					patientDiagnosticBrushingHabits.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticBrushingHabits);
					patientDiagnosticBrushingHabits.setComment(diagnosticReportComments.getPatientDiagnosticBrushingHabits_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticBrushingHabits(patientDiagnosticBrushingHabits);
					
			
					//PatientDiagnosticDietaryHabits comment
					PatientDiagnosticDietaryHabits patientDiagnosticDietaryHabits = this.patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits();
					patientDiagnosticDietaryHabits.setStatus(State.REJECTED.getDatabaseValue());
					addUpdateSettings(patientDiagnosticDietaryHabits);
					patientDiagnosticDietaryHabits.setComment(diagnosticReportComments.getPatientDiagnosticDietaryHabits_comment());
					
					this.patientDiagnosticWrapper.setPatientDiagnosticDietaryHabits(patientDiagnosticDietaryHabits);
					
					*/
					
					/*pdw = getPatientDiagnosticWrapper();
					pdw.setPatientDiagnosticComplaint(patientDiagnosticComplaint);			
					
					updatePatientDiagnosticSession(pdw);*/		
					
					/*int updated = 0;
					
					patientDiagnosticService.updateAll(patientDiagnosticWrapper);
					
					//updated =	patientDiagnosticComplaintService.update(patientDiagnosticComplaint);				
					addLoggerMessage("tbl_diagnostic_complaint", MessageType.PATIENT_DIAGNOSTIC.toString(), "REJECTED", "PatientId: "
							+ patientId + ", Host: " + ServletActionContext.getRequest().getRemoteHost());	
					
					if(updated == 1 ) {
						return SUCCESS;
						
					} else {
						
						return INPUT;
					}			
					
				} else {
					return INPUT;
					
				}
				
				
			} 			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		return INPUT;
		
		
	}
		
	*/
	
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public List<PatientDiagnosticComplaint> getComplaintList() {
		return complaintList;
	}

	public void setComplaintList(List<PatientDiagnosticComplaint> complaintList) {
		this.complaintList = complaintList;
	}

	public String getCommonId() {
		return commonId;
	}

	public void setCommonId(String commonId) {
		this.commonId = commonId;
	}


	public PatientDiagnosticComplaintService getPatientDiagnosticComplaintService() {
		return patientDiagnosticComplaintService;
	}


	public void setPatientDiagnosticComplaintService(PatientDiagnosticComplaintService patientDiagnosticComplaintService) {
		this.patientDiagnosticComplaintService = patientDiagnosticComplaintService;
	}




	public DiagnosticReportComments getDiagnosticReportComments() {
		return diagnosticReportComments;
	}




	public void setDiagnosticReportComments(DiagnosticReportComments diagnosticReportComments) {
		this.diagnosticReportComments = diagnosticReportComments;
	}

	
	
	
}