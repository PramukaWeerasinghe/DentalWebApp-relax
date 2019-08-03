package com.doerit.action.xray;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import com.doerit.action.AbstractDownloadManamentAction;
import com.doerit.action.patient.PatientAction;
import com.doerit.service.PatientReportXrayService;
import com.doerit.util.State;

public class XrayReportAction extends AbstractDownloadManamentAction {

  private static final long serialVersionUID = 1L;
  private static Logger logger = Logger.getLogger(XrayReportAction.class);

  public static Logger getLogger() {
    return logger;
  }

  public static void setLogger(Logger logger) {
    XrayReportAction.logger = logger;
  }

  @Autowired
  PatientReportXrayService patientReportXrayService;

  public String list() {
    try {
        beforeAction();
        pager = patientReportXrayService.viewAllByPagerAndStatus(pager,State.ACTIVE.getDatabaseValue());
        pager = setActionContext(pager);
        
    } catch (Exception e) {
      addActionError("Exception occur " + e.getMessage());
      // logger
      e.printStackTrace();
    }
    return SUCCESS;
  }


}
