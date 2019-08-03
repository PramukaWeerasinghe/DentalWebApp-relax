<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="row" style="margin-bottom:2em;">

    <div class="col-md-8 col-md-offset-1 pull-right"> 
		
		
    </div>
	<div class="col-md-3 pull-right"> 
		<s:url var="departmentListUrl" namespace="/department" action="list.html"></s:url>
		<s:url var="departmentAddUrl" namespace="/department" action="form.html"></s:url>
	
		<%-- <s:a href="%{#departmentAddUrl}" cssClass="btn btn-primary" role="button">Add New</s:a> --%>
		<s:a href="%{#departmentListUrl}" cssClass="btn btn-success" role="button">List</s:a>
	</div>
</div>
