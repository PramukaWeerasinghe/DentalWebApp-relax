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
				<s:include value="/WEB-INF/content/reportChecking/header.jsp"></s:include>
				<div class="row">
					<span style="font-size:25px">All Reports List</span>
					<br>
					<div style="overflow-x: scroll; height: 460px">
					<s:if
						test="pager != null && pager.list != null && pager.list.size != 0">
					
					<table class="table table-condensed" id="patient_tbl">
						<tr>
							<th>Index</th>
							<th>Date</th>
							<th>Insert By</th>
							<th>Complaint</th>
							<th>Status</th>
							
					
							
						</tr>
							<s:iterator value="pager.list" status="rowIndex">
							<tr>
								<td><s:property value="%{#rowIndex.index + 1}" /></td>
									<td><s:property value="%{insertDatetime}" /></td>
									<td><s:property value="%{insertUserId}" /></td>	
									<td><s:property value="%{complaint}" /></td>
									

								<td>
									<s:if test = "status == 1">
										<s:url var="activateUrl" action="activateDiagnosticDetailsWithComment.html"
											namespace="/patient-diagnostic-report-list">
											<s:param name="commonId" value="id"></s:param>
										</s:url> <s:a href="%{#activateUrl}"
											cssClass="btn btn-success btn-xs">
											Accept
										</s:a>
									</s:if>
									<s:if test = "status == 2">
										<s:url var="dianosticUrl" action="view.html"
											namespace="/patient-diagnostic-report-list">
											<s:param name="commonId" value="id"></s:param>
										</s:url> <s:a href="%{#dianosticUrl}"
											cssClass="btn btn-info btn-xs">
											Pending
										</s:a>
									</s:if>
						
									<s:if test = "status == 3">
										<s:url var="dianosticUrl" action="view.html"
											namespace="/patient-diagnostic-report-list">
											<s:param name="commonId" value="id"></s:param>
										</s:url> <s:a href="%{#dianosticUrl}"
											cssClass="btn btn-danger btn-xs">
											Reject
										</s:a>
									</s:if>
								</td>

							</tr>
						</s:iterator>
					</table>
					<div class="text-center">
						<s:include value="/WEB-INF/content/common/pager.jsp"></s:include>
					</div>
				</s:if>
					</div>
					

				</div>

			</div>
		</div>
	</div>


	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>

</html>
