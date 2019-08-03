package com.doerit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientReportXrayMapper;
import com.doerit.model.PatientReportXrayWithBLOBs;
import com.doerit.util.Pager;

@Service
public class PatientReportXrayService {

	@Autowired
	private PatientReportXrayMapper patientReportXrayMapper;

	public int save(PatientReportXrayWithBLOBs patientReportXray) {
		return patientReportXrayMapper.insert(patientReportXray); 
	}	
	
	public int update(PatientReportXrayWithBLOBs patientReportXray) {
		return patientReportXrayMapper.updateByPrimaryKeySelective(patientReportXray);
	}
	
	public List<PatientReportXrayWithBLOBs> viewByPatientId(String patientId){		
		return patientReportXrayMapper.findByPatientId(patientId);
	}
	
	public PatientReportXrayWithBLOBs viewById(String id) {
		return patientReportXrayMapper.selectByPrimaryKey(id);
	}

	public Pager viewAllByPagerAndStatus(Pager p, byte state) {
		p.setList(patientReportXrayMapper.viewAllByStatus(p,state));
		p.setTotal(patientReportXrayMapper.countByStatus(state));
		return p;
	}



/*	public Pager viewAllByPagerAndStatus(Pager p, byte state) {
		
		p.setList(patientReportXrayMapper.viewAllByStatus(p, state));
		p.setTotal(patientReportXrayMapper.countAllByStatus(state));
		
		return p;
	}

	public Pager search(Pager p, String searchKey, String searchWord) { 
		
		List<PatientReportXrayWithBLOBs> patientReportXrays = new ArrayList<>(0); 
		
		switch (searchKey) {
			case "serial":
				patientReportXrays = patientReportXrayMapper.searchBySerial("%" + searchWord + "%", State.ACTIVE.getDatabaseValue());
				break;
		}
		
		p.setList(patientReportXrays);
		p.setTotal(patientReportXrays.size());
		return p;
		
	}*/

}
