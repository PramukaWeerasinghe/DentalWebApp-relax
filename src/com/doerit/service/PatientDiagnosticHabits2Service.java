package com.doerit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientDiagnosticHabits2Mapper;
import com.doerit.dao.PatientMapper;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticHabits2;
import com.doerit.model.PatientExample;

@Service
public class PatientDiagnosticHabits2Service {
	
	@Autowired
	private PatientDiagnosticHabits2Mapper patientDiagnosticHabits2Mapper;

	@Autowired
	private PatientMapper patientMapper;

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
	
	public int save(PatientDiagnosticHabits2 patientDiagnosticHabits2) {
		return patientDiagnosticHabits2Mapper.insert(patientDiagnosticHabits2);
	}	
}
