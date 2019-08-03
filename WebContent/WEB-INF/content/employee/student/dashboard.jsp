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
				<h2>Student's Dashboard</h2>
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
				<hr>



				<div class="row" style="margin-top: 50px">
					<div class="col-md-4 col-sm-6 col-xs-12 clientes">
						<div class="clientes-content">
							<div class="content-title">
								<span style="padding-left: 10px">Accepted Submissions</span>
							</div>
							<div class="number">
								<span> <s:property value="%{acceptedReportCount}" />
								</span>
							</div>
							<div class="line">
								<div class="line-1"></div>
								<div class="line-2"></div>
							</div>
							<div class="analysis">
								<div class="">
									<s:url var="patientSubmissionUrl"
										namespace="/patient-submission" action="active-submits"></s:url>
									<s:a href="%{#patientSubmissionUrl}" cssClass="see-more">
				        			
									More <i class="glyphicon glyphicon-circle-arrow-right"></i>
									</s:a>
								</div>
								<%-- <a href="#" class="see-more">More<span class="glyphicon glyphicon-circle-arrow-right"></span></a> --%>


							</div>
						</div>
					</div>

					<div class="col-md-4 col-sm-6 col-xs-12 clientes">
						<div class="clientes-content">
							<div class="content-title" style="background:#ca487e">
								<span style="padding-left: 10px">Pending Submissions</span>
							</div>
							<div class="number">
								<span style="color:#ca487e"> <s:property value="%{pendingReportCount}" />
								</span>
							</div>
							<div class="line">
								<div class="line-1" style="background:#ca487e"></div>
								<div class="line-2"></div>
							</div>
							<div class="analysis">
								<div class="">
									<s:url var="patientSubmissionUrl"
										namespace="/patient-submission" action="submit"></s:url>
									<s:a href="%{#patientSubmissionUrl}" cssClass="see-more">
				        			
									More <i class="glyphicon glyphicon-circle-arrow-right"></i>
									</s:a>
								</div>
								<%-- <a href="#" class="see-more">More<span class="glyphicon glyphicon-circle-arrow-right"></span></a> --%>


							</div>
						</div>
					</div>


					<div class="col-md-4 col-sm-6 col-xs-12 concorrentes"
						style="padding: 0 10px">
						<div class="concorrentes-content">
							<div class="content-title">
								<span style="padding-left: 10px">Rejected Submissions</span>
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


					<%-- 				  <div class="col-md-4 col-sm-6 col-xs-12 clientes">
				    <div class="clientes-content">
				    	<div class="content-title">
				            <span style="padding-left:10px">Planed Surgeries (Today)</span>
				    	</div>
				        <div class="number"><span>4</span></div>
				        <div class="line">
				            <div class="line-1"></div>
				            <div class="line-2"></div>
				        </div>
				        <div class="analysis">
				            <div class="quote"><b></b></div>
				            <a href="#" class="see-more">More<span class="glyphicon glyphicon-circle-arrow-right"></span></a>
				        </div>
				    </div>
				  </div> --%>
				</div>



			</div>
			<br> <br>
			<!-- /page content -->

		</div>
	</div>

	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>
</html>
