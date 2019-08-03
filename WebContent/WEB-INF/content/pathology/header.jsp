<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="row" style="margin-bottom:2em;">

    <div class="col-md-8 col-md-offset-1 pull-right"> 
		
		<div class="pull-right"> 
			<s:url var="pathologyReportsViewUrl" action="list.html" 
					namespace="/patient-report-pathology"></s:url>
					
			<s:a href="%{#pathologyReportsViewUrl}" cssClass="btn btn-primary" role="button">Refresh List</s:a>
		</div>
	</div>
</div>
