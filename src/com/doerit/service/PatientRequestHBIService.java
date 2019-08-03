package com.doerit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientRequestHBIMapper;
import com.doerit.model.PatientRequestHBI;
import com.doerit.util.Pager;

@Service
public class PatientRequestHBIService {

	@Autowired
	private PatientRequestHBIMapper patientRequestHBIMapper;
	
	public int save(PatientRequestHBI patientRequestHBI) {
		return patientRequestHBIMapper.insert(patientRequestHBI); 
		
	}
	
	public int update(PatientRequestHBI patientRequestHBI) {
		return patientRequestHBIMapper.updateByPrimaryKeySelective(patientRequestHBI);
	}
		
	public PatientRequestHBI viewById(String id) {
		return patientRequestHBIMapper.selectByPrimaryKey(id);
	}
	
/*	public List<PatientRequestHBI> viewByPatientId(String patientId){		
		return patientRequestHBIMapper.findAll(patientId);
	}	
	
	public Pager viewByPatientRequestXrayId(Pager p, String id) {
		PatientRequestXrayExample sample = new PatientRequestXrayExample();
		sample.createCriteria().andPatientIdEqualTo(id);
		p.setList(patientRequestHBIMapper.selectByExample(sample));
		return p;
	}*/

	public PatientRequestHBIMapper getPatientRequestHBIMapper() {
		return patientRequestHBIMapper;
	}

	public void setPatientRequestHBIMapper(PatientRequestHBIMapper patientRequestHBIMapper) {
		this.patientRequestHBIMapper = patientRequestHBIMapper;
	}

  /**
   * @param pager
   * @param databaseValue
   * @return
   */
  public Pager viewAllByPagerAndStatus(Pager pager, byte databaseValue) {
    pager.setList(patientRequestHBIMapper.viewAllByStatus(databaseValue));
    pager.setTotal(patientRequestHBIMapper.countAllByStatus(databaseValue));
    return pager;
  }	
}
