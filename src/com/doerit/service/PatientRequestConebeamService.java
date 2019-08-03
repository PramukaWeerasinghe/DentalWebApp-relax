package com.doerit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientRequestConebeamMapper;
import com.doerit.model.PatientRequestConebeam;
import com.doerit.model.PatientRequestConebeamExample;
import com.doerit.util.Pager;

@Service
public class PatientRequestConebeamService {
	
	private PatientRequestConebeam patientRequestConebeam; 

	@Autowired
	private PatientRequestConebeamMapper patientRequestConebeamMapper;
	
	public int save(PatientRequestConebeam patientRequestConebeam) {
		return patientRequestConebeamMapper.insert(patientRequestConebeam); 
		
	}
	
	public int update(PatientRequestConebeam patientRequestConebeam) {
		return patientRequestConebeamMapper.updateByPrimaryKeySelective(patientRequestConebeam);
	}
		
	public PatientRequestConebeam viewById(String id) {
		return patientRequestConebeamMapper.selectByPrimaryKey(id);
	}
	
	public List<PatientRequestConebeam> viewByPatientId(String patientId){		
		return patientRequestConebeamMapper.findAll(patientId);
	}	
	
	public Pager viewByPatientRequestConebeamId(Pager p, String id) {
		PatientRequestConebeamExample sample = new PatientRequestConebeamExample();
		sample.createCriteria().andPatientIdEqualTo(id);
		p.setList(patientRequestConebeamMapper.selectByExample(sample));
		return p;
	}

	public PatientRequestConebeam getPatientRequestConebeam() {
		return patientRequestConebeam;
	}

	public void setPatientRequestConebeam(PatientRequestConebeam patientRequestConebeam) {
		this.patientRequestConebeam = patientRequestConebeam;
	}

	
	public Pager viewAllByPagerAndStatus(Pager p, byte state) {
		
		p.setList(patientRequestConebeamMapper.viewAllByStatus(p, state));
		p.setTotal(patientRequestConebeamMapper.countAllByStatus(state));
		
		return p;
	}	
	
	
}
