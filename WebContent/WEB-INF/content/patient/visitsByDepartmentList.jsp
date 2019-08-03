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
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col" role="main">
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
				<h4>Patients</h4>

				<s:actionerror cssClass="errorMessage" />

				<s:if test="pager != null && pager.list != null && pager.list.size != 0">

					<table class="table table-condensed" id="patient_tbl">
						<tr>
							<th>Index</th>
							<th>Patient Serial</th>
							<th>Comment</th>
							<th>Events</th>
						</tr>
						<s:iterator value="pager.list" status="rowIndex">
							<tr>
								<td><s:property	value="%{pager.start + #rowIndex.index + 1}" /></td>
								<td><s:property value="patientId" /></td>
								<td><s:property value="comment" /></td>
								<td>
								
									<s:url var="patientViewUrl" namespace="/patient"
										action="viewBySerial.html">
										<s:param value="%{patientId}" name="serial"></s:param>
									</s:url> <s:a href="%{#patientViewUrl}"
										cssClass="btn btn-xs btn-primary" role="button">View patient</s:a> 
										

											
								</td>
							</tr>
						</s:iterator>
					</table>

					<div class="text-center">
						<s:include value="/WEB-INF/content/common/pager.jsp"></s:include>
					</div>
				</s:if>
				<s:else>
					<div class="bg-info text-white">No patients found</div>
				</s:else>


			</div>
			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
