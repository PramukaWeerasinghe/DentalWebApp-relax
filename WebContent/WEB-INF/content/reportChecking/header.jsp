<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>

<div class="row" style="margin-bottom:2em;">

	<!-- custom search by serial, mobile ,..etc -->
    <div class="col-md-7 col-md-offset-1 pull-right">

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
		<div class="col-md-4 "> 
			<s:url var="pendingReports" namespace="/pending-reports-check" action="form"></s:url>
			<s:url var="departmentReports" namespace="/department-reports-check" action="form"></s:url>
			<s:url var="allReports" namespace="/all-reports-check" action="form"></s:url>
			
			 
			
				<s:a href="%{#pendingReports}" cssClass="btn btn-warning" role="button">Pending</s:a>
				<s:a href="%{#departmentReports}" cssClass="btn btn-danger" role="button">View By Department</s:a>
				<s:a href="%{#allReports}" cssClass="btn btn-success" role="button">All</s:a>
			

		</div>

</div>
<div class="row" style="margin-bottom: 2em;">
	<s:form autocomplete="off" namespace="/complaint-search" action="search"
		id="patientSearchForm" method="post">
		<div class="input-group">

			<div class="input-group-btn search-panel">
				<button type="button" class="btn btn-default dropdown-toggle"
					data-toggle="dropdown">
					<span id="search_concept">Search By</span> <span class="caret"></span>
				</button>
				<ul class="dropdown-menu" role="menu">
					<li><a href="#complaint">Complaint</a></li>
					<li><a href="#complaint_type">Complaint Type</a></li>
					
					
				</ul>
			</div>
			<input type="hidden" name="searchKey" value="serial"
				id="search_param"> <input type="text" class="form-control"
				name="searchWord"  placeholder="default is complaint" autofocus>
			<span class="input-group-btn"> <s:submit
					cssClass="btn btn-default" type="button">
					<span class="glyphicon glyphicon-search"></span>
				</s:submit>
			</span>
		</div>
	</s:form>

</div>
