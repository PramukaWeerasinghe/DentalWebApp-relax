<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<s:form namespace="/patient-teeth-disorder" action="confirm" method="post" autocomplete="off">

	<s:property value="%{patientTeethDisorder.id}"></s:property>
	<s:property value="%{patientId}"></s:property>
	<s:label>Treatment plan: </s:label>
	<s:textfield name="patientTeethDisorder.treatmentPlan"  ></s:textfield>

	<s:label>Comments: </s:label>
	<s:textfield name="patientTeethDisorder.comment" ></s:textfield>
	
	<s:submit cssClass="btn btn-info" value="confirm & save" title="Entered data will be save and confirm"></s:submit>
	<s:reset cssClass="btn btn-submit"></s:reset>

</s:form>
