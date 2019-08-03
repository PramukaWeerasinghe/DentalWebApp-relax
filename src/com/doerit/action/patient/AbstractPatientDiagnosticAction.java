package com.doerit.action.patient;

import java.io.ByteArrayInputStream;

import org.apache.log4j.Logger;

import com.doerit.action.AbstractManagementAction;
import com.doerit.exception.SessionNotExist;
import com.doerit.model.Patient;
import com.doerit.model.wrapper.PatientDiagnosticWrapper;
import com.doerit.util.SessionKey;

public class AbstractPatientDiagnosticAction extends AbstractManagementAction {

	private static final long serialVersionUID = 1L;
	private static Logger logger = Logger.getLogger(AbstractPatientDiagnosticAction.class);
	
	protected ByteArrayInputStream fileInputStream;
	protected String fileName;
	public ByteArrayInputStream getFileInputStream() {
		return fileInputStream;
	}

	public void setFileInputStream(ByteArrayInputStream fileInputStream) {
		this.fileInputStream = fileInputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	protected PatientDiagnosticWrapper pdw;
	protected static final String PREVIEW = "preview";
	private Patient patient;
	private String priviewMode = "STUDENT_INPUT";

	protected PatientDiagnosticWrapper getPatientDiagnosticWrapper() {

		PatientDiagnosticWrapper pdw = new PatientDiagnosticWrapper();
		
		try {
			if (session.get(SessionKey.PATIENT_DIAGNOSTIC) == null) {
				session.put(SessionKey.PATIENT_DIAGNOSTIC, pdw);
				//System.out.println("New session created");
			} else {
				pdw = (PatientDiagnosticWrapper) session.get(SessionKey.PATIENT_DIAGNOSTIC);
				//System.out.println(pdw);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return pdw;
	}
	
	protected void updatePatientDiagnosticSession(PatientDiagnosticWrapper pdw) {
		session.put(SessionKey.PATIENT_DIAGNOSTIC, pdw);
	}
	
	protected boolean isPreviewVisited() {
		try {
			if (session.get(SessionKey.PREVIEW_VISITED) != null) {
				return (boolean)session.get(SessionKey.PREVIEW_VISITED);
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
	
		}
	}
	
	protected void clearSessionVariables() {
		try {
			removeSessionVariable(SessionKey.PATIENT_DIAGNOSTIC);
			removeSessionVariable(SessionKey.PREVIEW_VISITED);
		} catch (SessionNotExist e) {
			logger.error(e);
		}
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

}
