<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



<div class="row" style="margin-bottom:2em;">

	<!-- custom search by serial, mobile ,..etc -->
    <div class="col-md-8 col-md-offset-1 pull-right">

		<s:form autocomplete="off" namespace="/patient" action="search.html"
			id="patientSearchForm" method="post">
			<div class="input-group">

				<div class="input-group-btn search-panel">
					<button type="button" class="btn btn-default dropdown-toggle"
						data-toggle="dropdown">
						<span id="search_concept">Search By</span> <span class="caret"></span>
					</button>
					<ul class="dropdown-menu" role="menu">
						<li><a href="#serial">Serial Number</a></li>
						<li><a href="#surname">Surname</a></li>
						<li><a href="#firstname">First name</a></li>
						<li><a href="#nic">NIC</a></li>

						<li class="divider"></li>
						<li><a href="#mobile">Mobile</a></li>
						<li><a href="#email">Email</a></li>
					</ul>
				</div>
				<input type="hidden" name="searchKey" value="serial"
					id="search_param"> <input type="text" class="form-control"
					name="searchWord" placeholder="default is serial" autofocus>
				<span class="input-group-btn"> <s:submit
						cssClass="btn btn-default" type="button">
						<span class="glyphicon glyphicon-search"></span>
					</s:submit>
				</span>
			</div>
		</s:form>
	</div>
		<div class="col-md-3 pull-right"> 
			<s:url var="patientListUrl" namespace="/patient" action="list.html"></s:url>
			<s:url var="patientAddUrl" namespace="/patient" action="registration-form.html"></s:url>
			<%-- <s:url var="patientHiddenUrl" namespace="/patient" action="hidden-list.html"></s:url>
			 --%>
			 
			<s:if test="admin||doctor||department||reception">
				<s:a href="%{#patientAddUrl}" cssClass="btn btn-primary" cssStyle="background-color: #e67f15;border-color: #d07c24;" role="button">Add New Patient</s:a>
			</s:if>
			
			<s:a href="%{#patientListUrl}" cssClass="btn btn-success" cssStyle="background-color: #c524aa;border-color: #9c0d91;" role="button">List</s:a>
			<%-- <s:a href="%{#patientHiddenUrl}" cssClass="btn btn-info" role="button">Deleted</s:a> --%>

		</div>

</div>

<div class="row" style="margin-bottom:2em;">
	<!-- search by department -->
				
    <div class="col-md-5 col-md-offset-1 pull-right">
		<h4>Search by Department and visited date</h4>
		<s:form namespace="/patient" action="searchVisitsByDepartmentAndDate.html"
			id="searchVisitsByDepartmentAndDateForm" method="post">
			<div class="input-group">

				<div class="input-group-btn search-panel">
					<s:select
						list="#{
						'HN88741U22':'OPD',
						'HN88741U23':'ORAL SURGERY', 
						'HN88741U24':'ORAL MEDICINE', 
						'HN88741U25':'PERIODONTOLOGY', 
						'HN88741U26':'RESTORATIVE DENTISTRY', 
						'HN88741U27':'PROSTHETIC DENTISTRY', 
						'HN88741U28':'PAEDODONTICS', 
						'HN88741U29':'ORTHODONTICS', 
						'HN88741U30':'OMF'}"
						cssClass="form-control" name="departmentId"></s:select>
				</div>
				
				
				<div class="input-group-btn search-panel">
					<label>Visit date</label> 					
						<input type="date" required="required" name="visitDate" class="form-control">		
				</div>

				<span class="input-group-btn"> 
					<s:submit
						cssClass="btn btn-default" type="button">
						<span class="glyphicon glyphicon-search"></span>
					</s:submit>
				</span>
			</div>
		</s:form>
	</div>
</div> 
