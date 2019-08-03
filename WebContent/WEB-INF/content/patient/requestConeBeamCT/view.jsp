<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col col-md-8" role="main">

				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>


				<h2>ConeBeam request form submitted</h2>

				<s:url var="printA4Url" namespace="/patient-request-conebeam"
					action="information-pdf">
					<s:param name="id" value="%{patientRequestConebeam.id}"></s:param>
				</s:url>

				<s:a href="%{#printA4Url}" cssClass="btn btn-success" target="_blank">	
					<span class="glyphicon glyphicon-print"></span> Print - A4 	</s:a>
				<div>
					
				<hr>		

				<div class="form-group float">
				
				<div class="row">

					<div class="container">
					  <ul class="list-group">
					    <li class="list-group-item">Patient Serial:<span class="badge"><s:property value="%{patientRequestConebeam.patientId}" /></span></li>
					    <li class="list-group-item">Urgent status:<span class="badge"><s:property value="%{patientRequestConebeam.urgent}" /></span></li>
					    <li class="list-group-item">Clinical details:<span class="badge"><s:property value="%{patientRequestConebeam.clinicalNote}" /></span></li>
					    <li class="list-group-item">Details of previous X-rays:<span class="badge"><s:property value="%{patientRequestConebeam.previousXrayInfo}" /></span></li>
					    <li class="list-group-item">Consultant's Name:<span class="badge"><s:property value="%{patientRequestConebeam.consultantName}" /></span></li>
					    <li class="list-group-item">Name of hospital:<span class="badge"><s:property value="%{patientRequestConebeam.hospitalName}" /></span></li>
					    <li class="list-group-item">Consultant's sign:<span class="badge"><s:property value="%{patientRequestConebeam.consultantSign}" /></span></li>
					    <li class="list-group-item">Date of request:<span class="badge"><s:property value="%{patientRequestConebeam.dateRequested}" /></span></li>
					    <li class="list-group-item">Date of appointment: <span class="badge"><s:property value="%{patientRequestConebeam.dateAppointment}" /></span></li>
					    <li class="list-group-item">CD given:<span class="badge"><s:property value="%{patientRequestConebeam.cdGiven}" /></span></li>					    								    

					  </ul>
					</div>
					
					</div>
				</div>


					<br>
					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-4 col-xs-12"></div>
							<s:if
								test="patientRequestXray.id != null && !patientRequestXray.id.empty">
								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:submit cssClass="btn btn-warning" value="Update"></s:submit>
								</div>
							</s:if>
							<s:else>
								<div class="col-md-2 col-sm-4 col-xs-12">
									<s:submit cssClass="btn btn-success" value="Insert"></s:submit>
								</div>
							</s:else>
						</div>
					</div>

				</div>



			</div>
			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
