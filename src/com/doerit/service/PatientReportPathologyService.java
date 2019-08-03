package com.doerit.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientReportPathologyMapper;
import com.doerit.model.PatientReportPathologyExample;
import com.doerit.model.PatientReportPathologyWithBLOBs;
import com.doerit.util.Pager;

@Service
public class PatientReportPathologyService {

	@Autowired
	private PatientReportPathologyMapper patientReportPathologyMapper;

	public Pager viewAllByPagerAndStatus(Pager p, byte state) {
		
		p.setList(patientReportPathologyMapper.viewAllByStatus(p, state));
		p.setTotal(patientReportPathologyMapper.countAllByStatus(state));
		
		return p;
	}

	public int save(PatientReportPathologyWithBLOBs patientReportPathology) {
		return patientReportPathologyMapper.insert(patientReportPathology);
	}
	
	public int update(PatientReportPathologyWithBLOBs patientReportPathology) {
		return patientReportPathologyMapper.updateByPrimaryKeySelective(patientReportPathology);
	}
	
	public PatientReportPathologyWithBLOBs viewById(String id) {
		return patientReportPathologyMapper.selectByPrimaryKey(id);
	}

	public List<PatientReportPathologyWithBLOBs> viewByPatientId(String patientId) {
		return patientReportPathologyMapper.findByPatientId(patientId);
	}
	
	public Pager viewByPatientReportPathologyId(Pager p, String id) {
		PatientReportPathologyExample sample = new PatientReportPathologyExample();
		sample.createCriteria().andPatientIdEqualTo(id);
		p.setList(patientReportPathologyMapper.selectByExample(sample));
		return p;
	}

  /**
   * @param pager
   * @param searchKey
   * @param searchWord
   * @return
   */
  public Pager search(Pager pager, String searchKey, String searchWord) {
    // TODO Auto-generated method stub
    return null;
  }

}
