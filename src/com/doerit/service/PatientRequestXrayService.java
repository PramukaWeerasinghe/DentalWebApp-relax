package com.doerit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientRequestXrayMapper;
import com.doerit.model.PatientRequestXray;
import com.doerit.model.PatientRequestXrayExample;
import com.doerit.util.Pager;

@Service
public class PatientRequestXrayService {

	@Autowired
	private PatientRequestXrayMapper patientRequestXrayMapper;
	
	public int save(PatientRequestXray patientRequestXray) {
		return patientRequestXrayMapper.insert(patientRequestXray); 
		
	}
	
	public int update(PatientRequestXray patientReportPathology) {
		return patientRequestXrayMapper.updateByPrimaryKeySelective(patientReportPathology);
	}
		
	public PatientRequestXray viewById(String id) {
		return patientRequestXrayMapper.selectByPrimaryKey(id);
	}
	
	public List<PatientRequestXray> viewByPatientId(String patientId){		
		return patientRequestXrayMapper.findByPatientId(patientId);
	}	
	
	public Pager viewByPatientRequestXrayId(Pager p, String id) {
		PatientRequestXrayExample sample = new PatientRequestXrayExample();
		sample.createCriteria().andPatientIdEqualTo(id);
		p.setList(patientRequestXrayMapper.selectByExample(sample));
		return p;
	}

	public Pager viewAllByPagerAndStatus(Pager p, byte state) {
		p.setList(patientRequestXrayMapper.viewAllByStatus(p,state));
		p.setTotal(patientRequestXrayMapper.countAllByStatus(state));
		return p;
	}	
}
