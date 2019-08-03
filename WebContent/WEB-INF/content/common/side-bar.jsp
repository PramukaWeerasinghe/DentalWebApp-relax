<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- sidebar menu -->
<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
	<div class="menu_section">
		<h3>
			<s:text name="global.menu.module"></s:text>
		</h3>
		<ul class="nav side-menu">

			<s:if test="Doctor">
				<li><s:url var="dashboardUrl" action="dashboard.html"
						namespace="/"></s:url> <s:a href="%{#dashboardUrl}">
						<i class="fa fa-line-chart"></i>Dashboard
				</s:a></li>
				<li><s:url var="registrationFormUrl"
						action="registration-form.html" namespace="/patient"></s:url> <s:a
						href="%{#registrationFormUrl}">
						<i class="fa fa-user-plus"></i>Registration
				</s:a></li>
				<li><s:url var="patientListUrl" action="list.html"
						namespace="/patient"></s:url> <s:a href="%{#patientListUrl}">
						<i class="fa fa-users"></i>Patients
				</s:a></li>

	 			<li>
	 				<s:url var="reports" action="list.html" namespace="/patient-report-checking"></s:url>
	 				<s:a href="%{#reports}">
	 					<!-- <i class="fa fa-file"></i> -->
	 					<i class="glyphicon glyphicon-hourglass"></i>
	 					
	 					Diagnostic Reports
	 				</s:a>
	 			</li>	

				<li><s:url var="xrayReportsUrl" action="list.html"
						namespace="/patient-report-xray"></s:url> <s:a
						href="%{#xrayReportsUrl}">
						<i class="fa fa-file-excel-o"></i> X-ray Reports
				</s:a></li>
				<li><s:url var="pathologyReportsUrl" action="list.html"
						namespace="/patient-report-pathology"></s:url> <s:a
						href="%{#pathologyReportsUrl}">
						<i class="fa fa-tint"></i> Pathology Reports
				</s:a></li>


				<li><s:url var="xrayRequestUrl" action="listRequests.html"
						namespace="/patient-request-xray"></s:url> <s:a
						href="%{#xrayRequestUrl}">
						<i class="fa fa-bell-o"></i> Radiology Requests
				</s:a></li>
				<li><s:url var="cbctRequestsUrl" action="listRequests.html"
						namespace="/patient-request-conebeam"></s:url> <s:a
						href="%{#cbctRequestsUrl}">
						<i class="fa fa-bell-o"></i> ConeBeam Requests
				</s:a></li>

				<li><s:url var="hbiRequestUrl" action="list.html"
						namespace="/patient-request-HBI"></s:url> <s:a
						href="%{#hbiRequestUrl}">
						<i class="fa fa-bell-o"></i> HBI Requests
				</s:a></li>

				<li><s:url var="reportDashboardUrl" action="dashboard.html"
						namespace="/report"></s:url> <s:a href="%{#reportDashboardUrl}">
						<i class="fa fa-file"></i>Report
				</s:a></li>


			</s:if>


			<s:if test="student">
				<li><s:url var="dashboardUrl" action="dashboard.html"
						namespace="/"></s:url> <s:a href="%{#dashboardUrl}">
						<i class="fa fa-line-chart"></i>Dashboard
				</s:a></li>

				<li><s:url var="patientListUrl" action="list.html"
						namespace="/patient"></s:url> <s:a href="%{#patientListUrl}">
						<i class="fa fa-users"></i>Patients
				</s:a></li>

			</s:if>

			<s:if test="Reception">
				<li><s:url var="dashboardUrl" action="dashboard.html"
						namespace="/"></s:url> <s:a href="%{#dashboardUrl}">
						<i class="fa fa-line-chart"></i>Dashboard
				</s:a></li>
				<li><s:url var="registrationFormUrl"
						action="registration-form.html" namespace="/patient"></s:url> <s:a
						href="%{#registrationFormUrl}">
						<i class="fa fa-user-plus"></i>Registration
				</s:a></li>
				<li><s:url var="patientListUrl" action="list.html"
						namespace="/patient"></s:url> <s:a href="%{#patientListUrl}">
						<i class="fa fa-users"></i>Patients
				</s:a></li>
			</s:if>

			<s:if test="Department">
				<li><s:url var="dashboardUrl" action="dashboard.html"
						namespace="/"></s:url> <s:a href="%{#dashboardUrl}">
						<i class="fa fa-line-chart"></i>Dashboard
				</s:a></li>
				<li><s:url var="registrationFormUrl"
						action="registration-form.html" namespace="/patient"></s:url> <s:a
						href="%{#registrationFormUrl}">
						<i class="fa fa-user-plus"></i>Registration
				</s:a></li>
				<li><s:url var="patientListUrl" action="list.html"
						namespace="/patient"></s:url> <s:a href="%{#patientListUrl}">
						<i class="fa fa-users"></i>Patients
				</s:a></li>
				
				<li><s:url var="xrayRequestUrl" action="listRequests.html"
						namespace="/patient-request-xray"></s:url> <s:a
						href="%{#xrayRequestUrl}">
						<i class="fa fa-bell-o"></i> Radiology Requests
				</s:a></li>			
					
				<li><s:url var="reportDashboardUrl" action="dashboard.html"
						namespace="/report"></s:url> <s:a href="%{#reportDashboardUrl}">
						<i class="fa fa-file"></i>Report
				</s:a></li>
			</s:if>

			<s:if test="dentalDoctor">
	 			<li>
	 				<s:url var="reports" action="form.html" 
	 					namespace="/patient-report-checking"></s:url>
	 				<s:a href="%{#reports}">
	 					<i class="fa fa-file"></i>Diagnostic Reports
	 				</s:a>
	 			</li>
			</s:if>

			<s:if test="admin">
				<li><s:url var="dashboardUrl" action="dashboard.html"
						namespace="/"></s:url> <s:a href="%{#dashboardUrl}">
						<i class="fa fa-line-chart"></i>Dashboard
				</s:a></li>
				<li><s:url var="registrationFormUrl"
						action="registration-form.html" namespace="/patient"></s:url> <s:a
						href="%{#registrationFormUrl}">
						<i class="fa fa-user-plus"></i>Registration
				</s:a></li>
				<li><s:url var="patientListUrl" action="list.html"
						namespace="/patient"></s:url> <s:a href="%{#patientListUrl}">
						<i class="fa fa-users"></i>Patients
				</s:a></li>

				<li><s:url var="viewList" action="list.html"
						namespace="/patient-diagnostic-report-list">
					</s:url> <s:a href="%{#viewList}">
						<i class="fa fa-file"></i>Diagnostic Reports
				</s:a></li>

				<li><s:url var="xrayReportsUrl" action="list.html"
						namespace="/patient-report-xray"></s:url> <s:a
						href="%{#xrayReportsUrl}">
						<i class="fa fa-file-excel-o"></i> X-ray Reports
				</s:a></li>
				<li><s:url var="pathologyReportsUrl" action="list.html"
						namespace="/patient-report-pathology"></s:url> <s:a
						href="%{#pathologyReportsUrl}">
						<i class="fa fa-tint"></i> Pathology Reports
				</s:a></li>


				<li><s:url var="xrayRequestUrl" action="listRequests.html"
						namespace="/patient-request-xray"></s:url> <s:a
						href="%{#xrayRequestUrl}">
						<i class="fa fa-bell-o"></i> Radiology Requests
				</s:a></li>
				<li><s:url var="cbctRequestsUrl" action="listRequests.html"
						namespace="/patient-request-conebeam"></s:url> <s:a
						href="%{#cbctRequestsUrl}">
						<i class="fa fa-bell-o"></i> ConeBeam Requests
				</s:a></li>

				<li><s:url var="hbiRequestUrl" action="list.html"
						namespace="/patient-request-HBI"></s:url> <s:a
						href="%{#hbiRequestUrl}">
						<i class="fa fa-bell-o"></i> HBI Requests
				</s:a></li>

				<li><s:url var="reportDashboardUrl" action="dashboard.html"
						namespace="/report"></s:url> <s:a href="%{#reportDashboardUrl}">
						<i class="fa fa-file"></i>Report
				</s:a></li>
				
	 			<li>
	 				<s:url var="reports" action="form.html" 
	 					namespace="/patient-report-checking"></s:url>
	 				<s:a href="%{#reports}">
	 					<i class="fa fa-file"></i>Diagnostic Reports
	 				</s:a>
	 			</li>				
				
				<li><s:url var="departmentListUrl" action="list.html"
						namespace="/department"></s:url> <s:a href="%{#departmentListUrl}">
						<i class="fa fa-institution"></i> Departments
				</s:a></li>
				<li><s:url var="userAccountListUrl" action="list.html"
						namespace="/user-account"></s:url> <s:a
						href="%{#userAccountListUrl}">
						<i class="fa fa-user"></i>Users
				</s:a></li>
			</s:if>


		</ul>
	</div>
</div>
<!-- /sidebar menu -->
