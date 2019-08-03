<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="row" style="margin-bottom:2em;">

    <div class="col-md-8 col-md-offset-1 pull-right"> 
		
		
    </div>
	<div class="col-md-3 pull-right"> 
		<s:url var="userAccountListUrl" namespace="/user-account" action="list.html"></s:url>
		<s:url var="userAccountAddUrl" namespace="/user-account" action="form.html"></s:url>
	
		 <s:a href="%{#userAccountAddUrl}" cssClass="btn btn-primary" role="button">Add New</s:a> 
		<s:a href="%{#userAccountListUrl}" cssClass="btn btn-success" role="button">List</s:a>
	</div>
</div>
