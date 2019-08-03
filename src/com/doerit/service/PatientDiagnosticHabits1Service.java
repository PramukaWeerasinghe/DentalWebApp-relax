package com.doerit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientDiagnosticHabits1Mapper;
import com.doerit.dao.PatientMapper;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticHabits1;
import com.doerit.model.PatientExample;

@Service
public class PatientDiagnosticHabits1Service {
	
	@Autowired
	private PatientDiagnosticHabits1Mapper patientDiagnosticHabits1Mapper;

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
	
	public int save(PatientDiagnosticHabits1 patientDiagnosticHabits1) {
		return patientDiagnosticHabits1Mapper.insert(patientDiagnosticHabits1);
	}	
}
