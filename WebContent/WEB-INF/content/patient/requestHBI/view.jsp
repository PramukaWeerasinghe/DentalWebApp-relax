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
			<div class="right_col" role="main">

				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>


				<h2>HBI request form submitted</h2>

				<s:url var="printA4Url" namespace="/patient-request-xray"
					action="information-pdf">
					<s:param name="id" value="%{patientRequest.id}"></s:param>
				</s:url>

				<s:a href="%{#printA4Url}" cssClass="btn btn-success" target="_blank">	
					<span class="glyphicon glyphicon-print"></span> Print - A4 	</s:a>
				<div>
					
				<hr>		

					<div class="form-group float">

						<div class="container">
						  <ul class="list-group">
						    <li class="list-group-item">Patient Serial: <span class="badge"><s:property value="%{patientRequestHBI.patientId}" /></span></li>
						    <li class="list-group-item">Relevant clinical history: <span class="badge"><s:property value="%{patientRequestHBI.clinicalHistory}" /></span></li>
						    <li class="list-group-item">Tests: <span class="badge"><s:property value="%{patientRequestHBI.typeOfTest}" /></span></li>
<%-- 						    <li class="list-group-item">ESR: <span class="badge"><s:property value="%{patientRequestHBI.typeOfTest}" /></span></li>
						    <li class="list-group-item">Blood picture<span class="badge"><s:property value="%{patientRequestHBI.typeOfTest}" /></span></li>
						    <li class="list-group-item">WBC / DC<span class="badge"><s:property value="%{patientRequestHBI.typeOfTest}" /></span></li>
						    <li class="list-group-item">BT / CT<span class="badge"><s:property value="%{patientRequestHBI.typeOfTest}" /></span></li>
						    <li class="list-group-item">RBs / FBS / PPBS<span class="badge"><s:property value="%{patientRequestHBI.typeOfTest}" /></span></li>
						    <li class="list-group-item">Liver Function Test<span class="badge"><s:property value="%{patientRequestHBI.typeOfTest}" /></span></li> --%>
						    <li class="list-group-item">Other Tests<span class="badge"><s:property value="%{patientRequestHBI.typeOfTestOther}" /></span></li>
											    
 
						  </ul>
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
