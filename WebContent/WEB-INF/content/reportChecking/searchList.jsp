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
			<div class="right_col" role="main" id="full">
				


				<h1>Search by complaint list</h1>
				

				<div>
					<s:if
						test="pager != null && pager.list != null && pager.list.size != 0">
						<table class="table table-condensed" id="patient_tbl">
							<tr>
								<th>Index</th>
								<th>Date</th>
								<th>Complaint</th>
								<th>Complaint Type</th>
								
								<th>Action</th>

							</tr>
							<s:iterator value="pager.list" status="rowIndex">
								<tr>
									<td><s:property value="%{#rowIndex.index + 1}" /></td>
									<td><s:property value="%{insertDatetime}" /></td>
									<td><s:property value="%{complaint}" /></td>

									<td><s:property value="%{complaintType}" /></td>
									
									<td><s:url var="dianosticUrl" action="view.html"
											namespace="/patient-diagnostic-report-list">
											<s:param name="commonId" value="id"></s:param>
										</s:url> <s:a href="%{#dianosticUrl}"
											cssClass="btn btn-success btn-xs">
											Details
										</s:a></td>
								</tr>
							</s:iterator>
						</table>

					</s:if>


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
