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
			<div class="right_col" role="main" id="full">
			<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
			
			<div class="row">	
			<span style="font-size:25px">Diagnostic Report List</span>
			<span class="col-md-8 pull-right">
					<s:url var="addDiagnostic" namespace="/patient-complaint"
						action="form.html">
						<s:param name="patientId" value="%{patientId}"></s:param>
					</s:url>
					<s:a href="%{#addDiagnostic}" cssClass="btn btn-info">Add Diagnostic Report</s:a>
				
			</span>
			</div>
			<br>
				<div>
				<div style="overflow-x: scroll; height: 460px">
					<table class="table table-condensed" id="patient_tbl">
						<tr>
							<th>Index</th>
							<th>Date</th>
							<th>Insert By</th>
							<th>Complaint</th>
							<th>Status</th>
							<th>Complaint Type</th>
							<!-- <th>Complaint History</th> -->
							<th>View</th>
							<th>Print</th>
							
						</tr>
						<s:iterator value="complaintList" status="rowIndex">
							<tr>
								<td><s:property
										value="%{#rowIndex.index + 1}" /></td>
								<td><s:property value="%{insertDatetime}" /></td>	
								
								<td><s:property value="%{insertUserName}" /></td>
								
									
								<td><s:property value="%{complaint}" /></td>
								<td>
									<s:property value="%{status}"/>
								</td>
								<td><s:property value="%{complaintType}" /></td>
								<%-- <td><s:property value="%{complaintHistory}" /></td> --%>
								<td>
									<s:url var="dianosticUrl" action="view.html" namespace="/patient-diagnostic-report-list">
										<s:param name="commonId" value="id"></s:param>
									</s:url>
									
									<s:a href="%{#dianosticUrl}" cssClass="btn btn-success btn-xs">
										Details
									</s:a>
								</td>
								<td>
									<s:url var="pdfPrint" action="patient-diagnostic-information-pdf" namespace="/patient-diagnostic">
										<s:param name="id" value="id"></s:param>
									</s:url>
									
									<s:a href="%{#pdfPrint}" cssClass="btn btn-success btn-xs" target="_blank">
										Print
									</s:a>
									
								</td>
							</tr>
						</s:iterator>
					</table>
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
