<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
<link
	href="<s:url value="/css/dashboard-component.css" includeParams="none"/>"
	rel="stylesheet" type="text/css">

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
				<h2>Dashboard</h2>
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
				<hr>


				<div class="form-group">
					<div class="row">
						<div class="col-md-6">
							<div class="row">
								<s:url var="patientListUrl" namespace="/patient"
									action="list.html"></s:url>
								<s:a href="%{#patientListUrl}" cssClass="mainSelect green">
									<i class="glyphicon glyphicon-edit" style="padding: 10px;"></i>Patients' Modifications
								</s:a>
							</div>
							<div class="row">
								<div class="col-md-6 col-sm-6 col-xs-12" style="padding: 10px;">
									<s:url var="patientXrayAddUrl"
										namespace="/patient-request-xray" action="form.html"></s:url>
									<s:a href="%{#patientXrayAddUrl}" cssClass="mainSelect purple">
										<i class="glyphicon glyphicon-comment" style="padding: 10px;"></i>Request for Radiographs
									</s:a>
								</div>
								<div class="col-md-6 col-sm-6 col-xs-12" style="padding: 10px;">
									<s:url var="patientCTAddUrl"
										namespace="/patient-request-conebeam" action="form.html"></s:url>
									<s:a href="%{#patientCTAddUrl}" cssClass="mainSelect purple">
										<i class="glyphicon glyphicon-comment" style="padding: 10px;"></i>Request for Cone Beam CT
						</s:a>
								</div>

							</div>

							<div class="row">
								<div class="col-md-6 col-sm-6 col-xs-12" style="padding: 10px;">
									<s:url var="patientHBIAddUrl" namespace="/patient-request-HBI"
										action="form.html"></s:url>
									<s:a href="%{#patientHBIAddUrl}" cssClass="mainSelect purple">
										<i class="glyphicon glyphicon-comment" style="padding: 10px;"></i>Request for Haematology
						</s:a>
								</div>

								<div class="col-md-6 col-sm-6 col-xs-12" style="padding: 10px;">
									<s:url var="patientBiopsyAddUrl"
										namespace="/patient-request-biopsy" action="form.html"></s:url>
									<s:a href="%{#patientBiopsyAddUrl}"
										cssClass="mainSelect purple">
										<i class="glyphicon glyphicon-comment" style="padding: 10px;"></i>Request for Biopsy
						</s:a>
								</div>
							</div>



						</div>
						<div class="col-md-6">
							<div class="col-md-12 col-sm-6 col-xs-12 clientes">
								<div class="clientes-content">
									<div class="content-title">
										<span style="padding-left: 10px">Pending diagnostic
											submissions </span>
									</div>
									<div class="number">
										<span> <s:property value="%{diagReportCount}" />
										</span>
									</div>
									<div class="line">
										<div class="line-1"></div>
										<div class="line-2"></div>
									</div>
									<div class="analysis">
										<div class="quote">
											<b></b>
										</div>
										<s:url var="reports" action="list.html"
											namespace="/patient-report-checking"></s:url>

										<s:a href="%{#reports}" cssClass="text-primary"> View Diagnostic Reports → </s:a>

									</div>
								</div>
							</div>

							<div class="col-md-12 col-sm-6 col-xs-12 concorrentes"
								style="padding: 10px 10px">
								<div class="concorrentes-content">
									<div class="content-title">
										<span style="padding-left: 10px">Resubmitted Submissions</span>
									</div>
									<div class="number">
										<span><s:property value="%{rejectedReportCount}" /></span>
									</div>
									<div class="line">
										<div class="line-1"></div>
										<div class="line-2"></div>
									</div>
									<div class="analysis">
										<!-- <div class="quote"><b>0 new comments</b></div> -->
										<%-- <a href="#" class="see-more">More <span class="glyphicon glyphicon-circle-arrow-right"></span></a> --%>
										<%-- <s:a href="%{#patientListUrl}" cssClass="see-more">
									More <i class="glyphicon glyphicon-circle-arrow-right" ></i>
							</s:a> --%>
										<div class="">
											<s:url var="patientSubmissionUrl"
												namespace="/patient-submission" action="rejected-submits"></s:url>
											<s:a href="%{#patientSubmissionUrl}" cssClass="see-more">
				        			
									More <i class="glyphicon glyphicon-circle-arrow-right"></i>
											</s:a>
										</div>
									</div>
								</div>
							</div>
						</div>



					</div>
				</div>






			</div>


		</div>
		<!-- /page content -->

	</div>

	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>
</html>
