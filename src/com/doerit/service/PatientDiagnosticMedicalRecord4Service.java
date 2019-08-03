package com.doerit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientDiagnosticMedicalRecord4Mapper;
import com.doerit.dao.PatientMapper;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticMedicalRecord4;
import com.doerit.model.PatientExample;

@Service
public class PatientDiagnosticMedicalRecord4Service {
	
	@Autowired
	private PatientDiagnosticMedicalRecord4Mapper PatientDiagnosticMedicalRecord4Mapper;

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
	
	public int save(PatientDiagnosticMedicalRecord4 PatientDiagnosticMedicalRecord4) {
		return PatientDiagnosticMedicalRecord4Mapper.insert(PatientDiagnosticMedicalRecord4);
	}	
}
