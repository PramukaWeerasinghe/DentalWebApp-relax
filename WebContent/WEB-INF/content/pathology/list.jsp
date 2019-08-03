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
				<s:include value="/WEB-INF/content/pathology/header.jsp"></s:include>
				<div class="row">
					<h3>
						Pathology Reports <span style="font-size: 0.6em"> (Number
							of Reports: <s:property value="%{pager.list.size}" /> )
						</span>
					</h3>
				</div>

				<s:actionerror cssClass="errorMessage" />

				<s:if
					test="pager != null && pager.list != null && pager.list.size != 0">

					<table class="table table-condensed" id="patient_tbl">
						<tr>
							<th>Index</th>
							<th>Patient</th>
							<th>PR Number</th>
							<th>Accession Number</th>
							<th>Report Date</th>
							<th>Uploaded Date</th>
							<th>Verified By</th>
							<th>Note</th>
							<th>File</th>
						</tr>
						<s:iterator value="pager.list" status="rowIndex">
							<tr>
								<td><s:property
										value="%{pager.start + #rowIndex.index + 1}" /></td>
								<td><s:url var="patientViewUrl" namespace="/patient"
										action="view.html">
										<s:param name="id" value="%{patientId}"></s:param>
									</s:url> <s:a href="%{#patientViewUrl}"
										cssClass="btn btn-xs btn-success" role="button">Patient</s:a>
								</td>
								<td><s:property value="%{prNumber}" /></td>

								<td><s:property value="accessionNumber" /></td>
								<td title="<s:date name='reportDate' nice='true' />"><s:date
										name="reportDate" format='yyyy/MM/dd' /></td>
								<td><s:date name="insertDatetime" format="yyyy/MM/dd hh:mm" /></td>
								<td><s:property value="verifiedBy" /></td>
								<td><s:property value="note" /></td>
								<td><s:url var="downloadPathologyUrl" namespace="/document"
										action="download-pathology-report.html">
										<s:param name="entityId" value="%{id}"></s:param>
									</s:url> <s:a href="%{#downloadPathologyUrl}"
										cssClass="btn btn-xs btn-primary" role="button">Download</s:a>

								</td>
							</tr>
						</s:iterator>
					</table>

					<div class="text-center">
						<s:include value="/WEB-INF/content/common/pager.jsp"></s:include>
					</div>
				</s:if>
				<s:else>
					<div class="bg-info text-white">No reports found</div>
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
