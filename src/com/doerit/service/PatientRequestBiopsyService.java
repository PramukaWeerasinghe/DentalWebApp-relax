package com.doerit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientRequestBiopsyMapper;
import com.doerit.model.PatientRequestBiopsy;
import com.doerit.model.PatientRequestBiopsyExample;
import com.doerit.util.Pager;

@Service
public class PatientRequestBiopsyService {
	
	@Autowired
	private PatientRequestBiopsyMapper patientRequestBiopsyMapper;
	
	public int save(PatientRequestBiopsy patientRequestBiopsy) {
		return patientRequestBiopsyMapper.insert(patientRequestBiopsy); 
		
	}
	
	public int update(PatientRequestBiopsy patientRequestBiopsy) {
		return patientRequestBiopsyMapper.updateByPrimaryKeySelective(patientRequestBiopsy);
	}
		
	public PatientRequestBiopsy viewById(String id) {
		return patientRequestBiopsyMapper.selectByPrimaryKey(id);
	}
	
	public List<PatientRequestBiopsy> viewByPatientId(String patientId){		
		return patientRequestBiopsyMapper.findByPatientId(patientId);
	}	
	
	public Pager viewByPatientRequestBiopsyId(Pager p, String id) {
		PatientRequestBiopsyExample sample = new PatientRequestBiopsyExample();
		sample.createCriteria().andPatientSerialNumberEqualTo(id);
		p.setList(patientRequestBiopsyMapper.selectByExample(sample));
		return p;
	}

	public Pager viewAllByPagerAndStatus(Pager p, byte state) {
		p.setList(patientRequestBiopsyMapper.viewAllByStatus(p,state));
		p.setTotal(patientRequestBiopsyMapper.countAllByStatus(state));
		return p;
	}
}
