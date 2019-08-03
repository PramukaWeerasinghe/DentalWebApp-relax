/**
 * 
 */
package com.doerit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.doerit.dao.PatientMapper;
import com.doerit.dao.PatientTeethDisorderMapper;
import com.doerit.model.PatientTeethDisorder;
import com.doerit.model.PatientTeethDisorderExample;
import com.doerit.util.Pager;

/**
 * @author Arjuna
 *
 */
@Service
public class PatientTeethDisorderService extends AbstractService{
  
  @Autowired
  private PatientTeethDisorderMapper patientTeethDisorderMapper;
private PatientTeethDisorderExample example;


  /**
   * 
   */
  public int save(PatientTeethDisorder patientTeethDisorder) {
    return patientTeethDisorderMapper.insert(patientTeethDisorder);
    
  }



/**
 * @param patientId
 * @return 
 */
public Pager getPatientOldRecords(Pager p, String patientId) {

	p.setList(patientTeethDisorderMapper.viewAllByPatientId(p, patientId));
	p.setTotal(patientTeethDisorderMapper.countAllByPatientId(patientId));
	
	return p;
	
}



/**
 * @param patientTeethDisorder
 * @return
 */
public int update(PatientTeethDisorder patientTeethDisorder) {
	 return patientTeethDisorderMapper.updateByPrimaryKeySelective(patientTeethDisorder);
}



/**
 * @param id
 * @return
 */
public PatientTeethDisorder viewById(String id) {
	return patientTeethDisorderMapper.selectByPrimaryKey(id);
}

}
