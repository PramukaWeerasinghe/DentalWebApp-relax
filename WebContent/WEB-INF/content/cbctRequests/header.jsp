<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="row" style="margin-bottom:2em;">

    <div class="col-md-8 col-md-offset-1 pull-right"> 
		
		<div class="pull-right"> 
			<s:url var="cbctRequestsViewUrl" action="list.html" namespace="/patient-request-conebeam"></s:url>
					
			<s:a href="%{#cbctRequestsViewUrl}" cssClass="btn btn-primary" role="button">Refresh List</s:a>
		</div>
	</div>
</div>
