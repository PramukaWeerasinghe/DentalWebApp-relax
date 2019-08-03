package com.doerit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientDiagnosticComplaintMapper;
import com.doerit.dao.PatientMapper;
import com.doerit.model.Patient;
import com.doerit.model.PatientDiagnosticComplaint;
import com.doerit.model.PatientExample;
import com.doerit.util.Pager;
import com.doerit.util.State;

@Service
public class PatientDiagnosticComplaintService {
	
	@Autowired
	private PatientDiagnosticComplaintMapper patientDiagnosticComplaintMapper;

	@Autowired
	private PatientMapper patientMapper;
	

	public Patient viewById(String id) {
		return patientMapper.viewByPrimaryKey(id);
	}
	
	/*public Patient viewById(String id) {
		return patientMapper.viewByPrimaryKey(id);
	}*/
	
	public Patient viewBySerial(String serial) {
		
		PatientExample sample = new PatientExample();
		sample.createCriteria().andSerialNumberEqualTo(serial);
		
		if(!patientMapper.selectByExample(sample).isEmpty()){
			return patientMapper.selectByExample(sample).get(0);
		}
		return null;
		
	}	 
	
	public int save(PatientDiagnosticComplaint patientDiagnosticComplaint) {
		return patientDiagnosticComplaintMapper.insert(patientDiagnosticComplaint);
	}
	
	public int update(PatientDiagnosticComplaint patientDiagnosticComplaint) {
		return patientDiagnosticComplaintMapper.updateByPrimaryKey(patientDiagnosticComplaint);
	}

	public List<PatientDiagnosticComplaint> viewByPatientId(String patientId) {
		return patientDiagnosticComplaintMapper.findByPatientId(patientId, State.ACTIVE.getDatabaseValue());
	}

	public List<PatientDiagnosticComplaint> viewAllByPatientId(String patientId) {
		return patientDiagnosticComplaintMapper.findAllByPatientId(patientId );
	}
	
/*	public List<PatientDiagnosticComplaint> viewAllByStatusActive() {
		return patientDiagnosticComplaintMapper.findAllByStatus(State.ACTIVE.getDatabaseValue());
	}
	
	public List<PatientDiagnosticComplaint> viewAllByStatusPending() {
		return patientDiagnosticComplaintMapper.findAllByStatus(State.PENDING.getDatabaseValue());
	}*/

	/**
	 * @param pager 
	 * @return
	 */
	//getname by patient Id
	public List<PatientDiagnosticComplaint> viewNameByPatientId(String patientId) {
		return patientDiagnosticComplaintMapper.getNameByPatientId(patientId );
	}
	
	
	public Pager viewAllByPagerUserIdAndStatus(Pager p, String userId, byte state) {
		p.setList(patientDiagnosticComplaintMapper.findAllByUserAndStatus(p, userId, state));
		p.setTotal(patientDiagnosticComplaintMapper.countStudentSubmissions(state, userId));
		return p;
	}	
	
	public Pager viewAllByPagerAndStatusPending(Pager p, byte state) {
		p.setList(patientDiagnosticComplaintMapper.findAllByStatus(p,state));
		p.setTotal(patientDiagnosticComplaintMapper.countAllByStatus(state));
		return p;
	}
	
	public Pager viewAllByPagerAndStatusPendingAndDepartment(Pager p, byte state, String department) {
		p.setList(patientDiagnosticComplaintMapper.findAllByDepartmentPending(p, state, department));
		p.setTotal(patientDiagnosticComplaintMapper.countAllByState(state));
		return p;
	}
	
	public Pager viewAllPending(Pager p, byte state) {
		p.setList(patientDiagnosticComplaintMapper.findAllByStatus(p, state));
		p.setTotal(patientDiagnosticComplaintMapper.countAllByStatus(state));
		return p;
	}	
	
	public Pager viewAll(Pager p, byte state, byte state1) {
		p.setList(patientDiagnosticComplaintMapper.findAll(p, state,state1));
		return p;
	}	
	
	public Pager search(Pager p,String searchKey,String searchWord) { 
		
		List<Patient> patient = new ArrayList<>(0);
		switch (searchKey) {
		case "complaint":
					patient = patientDiagnosticComplaintMapper.searchByComplaint("%" + searchWord + "%");
					break;
		case "complaint_type":
					patient = patientDiagnosticComplaintMapper.searchByComplaintType("%" + searchWord + "%");
					break;
		
		}
		p.setList(patient);
		p.setTotal(patient.size());
		return p;
	}
}
