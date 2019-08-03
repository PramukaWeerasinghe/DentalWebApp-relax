<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
<script
	src="<s:url value="/vendors/d3/d3.min.js" includeParams="none"/>"
	charset="utf-8"></script>


</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col" role="main">
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>

				<s:url var="patientViewUrl" namespace="/patient" action="view.html">
					<s:param value="%{patientId}" name="id"></s:param>
				</s:url>
				<s:a href="%{#patientViewUrl}" cssClass="btn btn-xs btn-primary"
					role="button"> << go to patient profile</s:a>
				<hr>




				<div class="form-group">
					<div class="row">
						<h4>Add / View Disorders of teeth:</h4>
						<div class="col-md-4">
							<div class="row">
								<s:url var="addDisorderUrl"
									namespace="/patient-teeth-disorder" action="addDisorder">
									<s:param name="patientId" value="%{patientId}"></s:param>
								</s:url>
								<s:a href="%{#addDisorderUrl}"
									cssClass="btn btn-info btn-block">
									<i class="fa fa-clone" aria-hidden="true"></i>
											Add Disorder
											</s:a>
							</div>
							<br>

						</div>
						<div class="col-md-6">
							 <s:include	value="/WEB-INF/content/patient/disordersOfTeeth/list.jsp"></s:include> 

						</div>


					</div>
					<div class="row"></div>
				</div>

			</div>

		</div>


	</div>
	<!-- /page content -->

	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
