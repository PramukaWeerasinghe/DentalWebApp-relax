package com.doerit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientDiagnosticDrugHistoryMapper;
import com.doerit.dao.PatientMapper;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticDrugHistory;
import com.doerit.model.PatientExample;

@Service
public class PatientDiagnosticDrugHistoryService {
	
	@Autowired private PatientDiagnosticDrugHistoryMapper patientDiagnosticDrugHistoryMapper;
	@Autowired private PatientMapper patientMapper;

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
	
	public int save(PatientDiagnosticDrugHistory patientDiagnosticDrugHistory) {
		return patientDiagnosticDrugHistoryMapper.insert(patientDiagnosticDrugHistory);
	}	
	
}
