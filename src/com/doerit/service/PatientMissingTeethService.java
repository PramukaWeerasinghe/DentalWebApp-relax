/**
 * 
 */
package com.doerit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.doerit.dao.PatientMissingTeethMapper;
import com.doerit.model.PatientMissingTeeth;
import com.doerit.util.Pager;

/**
 * @author Arjuna
 *
 */
@Service
public class PatientMissingTeethService extends AbstractService {

	/**
	 * @param patientMissingTeeth
	 */
	@Autowired
	private PatientMissingTeethMapper patientMissingTeethMapper;

	public void save(PatientMissingTeeth patientMissingTeeth) {
		try {
			patientMissingTeethMapper.insert(patientMissingTeeth);
		} catch (Exception e) {
			System.out.println("service error");
			e.printStackTrace();
		}

		// System.out.println(patientMissingTeeth.toString());
	}

	public Pager viewAllByPagerAndPatientIdAndStatus(Pager p, String patientId,
			byte state) {

		p.setList(patientMissingTeethMapper
				.viewAllByPagerAndPatientIdAndStatus(p, patientId, state));
		p.setTotal(patientMissingTeethMapper
				.countAllByPagerAndPatientIdAndStatus(patientId, state));
		return p;

	}

	/**
	 * @param patientId
	 */
	public PatientMissingTeeth getPatientMissingTeethById(String patientId) {

		PatientMissingTeeth patientMissingTeeth = null;

		if (patientId != null) {
			patientMissingTeeth = patientMissingTeethMapper.selectByPatientIdAndRecentDate(patientId);
			patientMissingTeeth.toString();
		}

		return patientMissingTeeth;

	}

	public int getPatientMissingTeethRecordCount(String patientId,byte state) {
		
		int count = patientMissingTeethMapper.countAllByPatientIdAndStatus(patientId, state);
		return count;
		
	}

	/**
	 * @param patientMissingTeeth
	 */
	public int update(PatientMissingTeeth patientMissingTeeth) {

		return patientMissingTeethMapper
				.updateByPrimaryKeySelective(patientMissingTeeth);

	}

}
