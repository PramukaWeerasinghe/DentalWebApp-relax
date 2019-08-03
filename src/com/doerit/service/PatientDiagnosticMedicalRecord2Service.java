package com.doerit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientDiagnosticMedicalRecord2Mapper;
import com.doerit.dao.PatientMapper;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticMedicalRecord2;
import com.doerit.model.PatientExample;

@Service
public class PatientDiagnosticMedicalRecord2Service {
	
	@Autowired
	private PatientDiagnosticMedicalRecord2Mapper PatientDiagnosticMedicalRecord2Mapper;

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
	
	public int save(PatientDiagnosticMedicalRecord2 PatientDiagnosticMedicalRecord2) {
		return PatientDiagnosticMedicalRecord2Mapper.insert(PatientDiagnosticMedicalRecord2);
	}	
}
