package com.doerit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.util.Pager;
import com.doerit.util.State;
import com.doerit.dao.PatientDiagnosticComplaintMapper;
import com.doerit.dao.PatientDiagnosticDentalHistoryMapper;
import com.doerit.dao.PatientDiagnosticMedicalRecord1Mapper;
import com.doerit.dao.PatientDiagnosticMedicalRecord2Mapper;
import com.doerit.dao.PatientDiagnosticMedicalRecord3Mapper;
import com.doerit.dao.PatientDiagnosticMedicalRecord4Mapper;
import com.doerit.dao.PatientDiagnosticInvestigationMapper;
import com.doerit.dao.PatientDiagnosticHabits1Mapper;
import com.doerit.dao.PatientDiagnosticHabits2Mapper;
import com.doerit.action.AbstractAction;
import com.doerit.dao.PatientDiagnosticBrushingHabitsMapper;
import com.doerit.dao.PatientDiagnosticDietaryHabitsMapper;
import com.doerit.dao.PatientDiagnosticDrugHistoryMapper;
import com.doerit.dao.PatientDiagnosticDrugMapper;
import com.doerit.dao.PatientMapper;
import com.doerit.exception.SessionNotExist;
import com.doerit.model.Employee;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.PatientDiagnosticDrug;
import com.doerit.model.PatientExample;

@Service
public class PatientDiagnosticService {

	/**
	 * extends AbstractAction
	 */
	//private static final long serialVersionUID = 1L;
	//@Autowired private Employee employee;
	
	@Autowired private PatientMapper patientMapper;
	@Autowired private PatientDiagnosticComplaintMapper patientDiagnosticComplaintMapper;
	@Autowired private PatientDiagnosticDentalHistoryMapper patientDiagnosticDentalHistoryMapper;
	@Autowired private PatientDiagnosticMedicalRecord1Mapper patientDiagnosticMedicalRecord1Mapper;
	@Autowired private PatientDiagnosticMedicalRecord2Mapper patientDiagnosticMedicalRecord2Mapper;
	@Autowired private PatientDiagnosticMedicalRecord3Mapper patientDiagnosticMedicalRecord3Mapper;
	@Autowired private PatientDiagnosticMedicalRecord4Mapper patientDiagnosticMedicalRecord4Mapper;
	@Autowired private PatientDiagnosticInvestigationMapper patientDiagnosticInvestigationMapper;
	@Autowired private PatientDiagnosticHabits1Mapper patientDiagnosticHabits1Mapper;
	@Autowired private PatientDiagnosticHabits2Mapper patientDiagnosticHabits2Mapper;
	@Autowired private PatientDiagnosticBrushingHabitsMapper patientDiagnosticBrushingHabitsMapper;
	@Autowired private PatientDiagnosticDietaryHabitsMapper patientDiagnosticDietaryHabitsMapper;
	@Autowired private PatientDiagnosticDrugHistoryMapper patientDiagnosticDrugHistoryMapper;
	@Autowired private PatientDiagnosticDrugMapper patientDiagnosticDrugMapper;
	
	public Patient viewById(String id) {
		return patientMapper.viewByPrimaryKey(id);
	}
	
	public Patient viewBySerial(String serial) {
		PatientExample sample = new PatientExample();
		sample.createCriteria().andSerialNumberEqualTo(serial);
		
		if(!patientMapper.selectByExample(sample).isEmpty()){
			return patientMapper.selectByExample(sample).get(0);
		}
		return null;
		
	}	
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveAll(PatientDiagnosticWrapper patientDiagnosticWrapper) {
		
		patientDiagnosticWrapper.setCommonIdForAllRecords();
		saveAllNewRecord(patientDiagnosticWrapper);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveResubmit(PatientDiagnosticWrapper patientDiagnosticWrapper) {
		
		patientDiagnosticWrapper.setCommonIdForAllRecords();
		
		patientDiagnosticComplaintMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticComplaint());
		patientDiagnosticDentalHistoryMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory());
		patientDiagnosticMedicalRecord1Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1());
		patientDiagnosticMedicalRecord2Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2());
		patientDiagnosticMedicalRecord3Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3());
		patientDiagnosticMedicalRecord4Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4());
		patientDiagnosticInvestigationMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticInvestigation());
		patientDiagnosticHabits1Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticHabits1());
		patientDiagnosticHabits2Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticHabits2());
		patientDiagnosticBrushingHabitsMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits());
		patientDiagnosticDietaryHabitsMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits());
		
		patientDiagnosticDrugHistoryMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory());
		
		for(PatientDiagnosticDrug drug: patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs()) {
			drug.setDrughistoryId(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getId());
			patientDiagnosticDrugMapper.insert(drug);
		}
		
		
	}

	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void saveAllNewRecord(PatientDiagnosticWrapper patientDiagnosticWrapper) {
		
		patientDiagnosticWrapper.setCommonIdForAllRecords();
		
		patientDiagnosticComplaintMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticComplaint());
		patientDiagnosticDentalHistoryMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory());
		patientDiagnosticMedicalRecord1Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1());
		patientDiagnosticMedicalRecord2Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2());
		patientDiagnosticMedicalRecord3Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3());
		patientDiagnosticMedicalRecord4Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4());
		patientDiagnosticInvestigationMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticInvestigation());
		patientDiagnosticHabits1Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticHabits1());
		patientDiagnosticHabits2Mapper.insert(patientDiagnosticWrapper.getPatientDiagnosticHabits2());
		patientDiagnosticBrushingHabitsMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits());
		patientDiagnosticDietaryHabitsMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits());
		patientDiagnosticDrugHistoryMapper.insert(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory());
		
		for(PatientDiagnosticDrug drug: patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs()) {
			drug.setDrughistoryId(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getId());
			patientDiagnosticDrugMapper.insert(drug);
		}
		
		
	}


	//[TODO]
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateCommentsAll(PatientDiagnosticWrapper patientDiagnosticWrapper) {
		
		patientDiagnosticWrapper.setCommonIdForAllRecords();
		
		patientDiagnosticComplaintMapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticComplaint());
		patientDiagnosticDentalHistoryMapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory());
		patientDiagnosticMedicalRecord1Mapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1());
		patientDiagnosticMedicalRecord2Mapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2());
		patientDiagnosticMedicalRecord3Mapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3());
		patientDiagnosticMedicalRecord4Mapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4());
		patientDiagnosticInvestigationMapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticInvestigation());
		patientDiagnosticHabits1Mapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticHabits1());
		patientDiagnosticHabits2Mapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticHabits2());
		patientDiagnosticBrushingHabitsMapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits());
		patientDiagnosticDietaryHabitsMapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits());
		patientDiagnosticDrugHistoryMapper.updateByPrimaryKey(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory());
		
		//[TODO]
		for(PatientDiagnosticDrug drug: patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs()) {
			drug.setDrughistoryId(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getId());
			patientDiagnosticDrugMapper.updateByPrimaryKey(drug);
		}
		
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateAll(PatientDiagnosticWrapper patientDiagnosticWrapper) {
		
		patientDiagnosticWrapper.setCommonIdForAllRecords();
		
		patientDiagnosticComplaintMapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticComplaint());
		patientDiagnosticDentalHistoryMapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticDentalHistory());
		patientDiagnosticMedicalRecord1Mapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord1());
		patientDiagnosticMedicalRecord2Mapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord2());
		patientDiagnosticMedicalRecord3Mapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord3());
		patientDiagnosticMedicalRecord4Mapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticMedicalRecord4());
		patientDiagnosticInvestigationMapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticInvestigation());
		patientDiagnosticHabits1Mapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticHabits1());
		patientDiagnosticHabits2Mapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticHabits2());
		patientDiagnosticBrushingHabitsMapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticBrushingHabits());
		patientDiagnosticDietaryHabitsMapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticDietaryHabits());
		patientDiagnosticDrugHistoryMapper.updateByPrimaryKeySelective(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory());
		
/*		for(PatientDiagnosticDrug drug: patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getDrugs()) {
			drug.setDrughistoryId(patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getId());
			patientDiagnosticDrugMapper.insert(drug);
		}*/
		
	}	
	
	public PatientDiagnosticWrapper viewByCommonId(String complainId) { //complaint id = (all other ids)
		
		PatientDiagnosticWrapper patientDiagnosticWrapper = new PatientDiagnosticWrapper();
		
		PatientDiagnosticComplaint complaint = patientDiagnosticComplaintMapper.selectByPrimaryKey(complainId);
		
		if(complaint == null) {
			throw new RuntimeException("Complaint was not found. (complaint id is null");
		}
		
		patientDiagnosticWrapper.setPatient(patientMapper.viewByPrimaryKey(complaint.getPatientId()));
		patientDiagnosticWrapper.setPatientDiagnosticComplaint(patientDiagnosticComplaintMapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticDentalHistory(patientDiagnosticDentalHistoryMapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord1(patientDiagnosticMedicalRecord1Mapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord2(patientDiagnosticMedicalRecord2Mapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord3(patientDiagnosticMedicalRecord3Mapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticMedicalRecord4(patientDiagnosticMedicalRecord4Mapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticInvestigation(patientDiagnosticInvestigationMapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticDrugHistory(patientDiagnosticDrugHistoryMapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticHabits1(patientDiagnosticHabits1Mapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticHabits2(patientDiagnosticHabits2Mapper.selectByPrimaryKey(complainId));
		
		patientDiagnosticWrapper.setPatientDiagnosticBrushingHabits(patientDiagnosticBrushingHabitsMapper.selectByPrimaryKey(complainId));
		patientDiagnosticWrapper.setPatientDiagnosticDietaryHabits(patientDiagnosticDietaryHabitsMapper.selectByPrimaryKey(complainId));
		
		try {
			patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().setDrugs(
					patientDiagnosticDrugMapper.findByDrugHistoryId(
							patientDiagnosticWrapper.getPatientDiagnosticDrugHistory().getId()));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return patientDiagnosticWrapper;
	}

	/**
	 * 
	 */
	public int viewTodayCount() {
		int count = patientDiagnosticComplaintMapper.countAllByState(State.PENDING.getDatabaseValue());
		return count;
		
	}
	
	public int countReportCountByUserAndState(String userId, byte state) throws SessionNotExist {
		return patientDiagnosticComplaintMapper.countStudentSubmissions(state, userId);
		
	}
	

	
}
