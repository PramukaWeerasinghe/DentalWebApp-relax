package com.doerit.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doerit.dao.PatientVisitMapper;
import com.doerit.model.PatientVisit;
import com.doerit.model.PatientVisitExample;
import com.doerit.util.Pager;
import com.doerit.util.State;

@Service
public class PatientVisitService extends AbstractService{

	@Autowired private PatientVisitMapper patientVisitMapper;
	
	public List<PatientVisit> viewAll() {
		return patientVisitMapper.findAllActive(State.ACTIVE.getDatabaseValue());
	}
	
	public int save(PatientVisit patientVisit) {
		return patientVisitMapper.insert(patientVisit);
	}
	
	public int update(PatientVisit patientVisit) {
		return patientVisitMapper.updateByPrimaryKeySelective(patientVisit);
	}
	
	public PatientVisit viewById(String id) {
		return patientVisitMapper.selectByPrimaryKey(id);
	}
	
	public Pager viewByPatientId(Pager p, String id){
		PatientVisitExample sample = new PatientVisitExample();
		sample.createCriteria().andPatientIdEqualTo(id);
		p.setList(patientVisitMapper.selectByExample(sample));
		
		p.setList(patientVisitMapper.findByIdWithDepartment(id));
		p.setTotal(patientVisitMapper.countByExample(sample));
		
		return p;
	}

	
	//search by departmentId and date 
	public Pager searchByDepartmentAndDate(Pager pg, String departmentId, Date date){

		//List<PatientVisit> patientVisits = new ArrayList<>(0); 
		String dateString = new SimpleDateFormat("yyyy-MM-dd").format(date);		
		//System.out.println("date " + dateString + " department " + departmentId +"/n");
		
		//patientVisits = patientVisitMapper.viewAllByVisitDepartmentAndDate(p,departmentId,dateString);
		

		pg.setList(patientVisitMapper.viewAllByVisitDepartmentAndDate(pg,departmentId,dateString));
		pg.setTotal(patientVisitMapper.countAllByVisitDepartmentAndDate(departmentId, dateString));
		
		return pg;
	}
	
	
		
}
