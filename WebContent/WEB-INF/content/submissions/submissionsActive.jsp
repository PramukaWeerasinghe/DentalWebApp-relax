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






			<div class="right_col" role="main" id="full">

				<div class="container">
					<div class="row">

						<span style="font-size: 25px">Accepted Reports list</span> <br>
						<div style="overflow-x: scroll; height: auto">




							<s:actionerror cssClass="errorMessage" />
							<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>

							<s:if
								test="pager != null && pager.list != null && pager.list.size != 0">

								<table class="table table-condensed table-responsive"
									id="patient_tbl">
									<tr>
										<th>Index</th>
										<th>Date</th>
										<th>Patient Name</th>
										<th>Complaint</th>

										<th>Complaint Type</th>
										<th>Status</th>
										<!-- <th>Insert by</th> -->
										<!-- <th>Complaint History</th> -->
										<th>Options</th>

									</tr>
									<s:iterator value="pager.list" status="rowIndex">
										<tr>
											<td class="col-md-1"><s:property
													value="%{#rowIndex.index + 1}" /></td>
											<td class="col-md-1"><s:property
													value="%{insertDatetime}" /></td>
											<td class="col-md-1"><s:property value="%{fullName}" /></td>
											<td class="col-md-3"><s:property value="%{complaint}" /></td>

											<td class="col-md-2"><s:property
													value="%{complaintType}" /></td>
											<td class="col-md-1"><s:if test="status == 2"> pending : </s:if>
												<s:if test="status == 1"> active : </s:if> <s:property
													value="%{status}" /></td>



											<td class="col-md-2"><s:url var="dianosticUrl"
													action="view.html"
													namespace="/patient-diagnostic-report-list">
													<s:param name="commonId" value="id"></s:param>
												</s:url> <s:a href="%{#dianosticUrl}"
													cssClass="btn btn-success btn-xs">Details</s:a></td>

										</tr>
									</s:iterator>
								</table>

								<div class="text-center">
									<s:include value="/WEB-INF/content/common/pager.jsp"></s:include>
								</div>
							</s:if>
							<s:else>
								<div class="bg-info text-white">No Submissions found</div>
							</s:else>






						</div>
					</div>

<!-- 					<div class="container" id="pop_up_1"> -->

<!-- 						Modal -->
<!-- 						<div class="modal fade" id="myModal" role="dialog"> -->
<!-- 							<div class="modal-dialog"> -->

<!-- 								Modal content -->
<!-- 								<div class="modal-content"> -->
<!-- 									<div class="modal-header"> -->
<!-- 										<button type="button" class="close" data-dismiss="modal">&times;</button> -->
<!-- 										<h2 class="modal-title">Confirmation</h2> -->
<!-- 									</div> -->
<!-- 									<div class="modal-body"> -->
<!-- 										<div align="center" style="border: 1px solid red"> -->
<%-- 											<s:a href="%{#activateUrl}" cssClass="btn btn-warning btn-md">Accept</s:a> --%>
<!-- 										</div> -->




<!-- 									</div> -->
<!-- 									<div class="modal-footer"> -->
<!-- 										<button type="button" class="btn btn-default" -->
<!-- 											data-dismiss="modal">Close</button> -->
<!-- 									</div> -->
<!-- 								</div> -->

<!-- 							</div> -->
<!-- 						</div> -->

<!-- 					</div> -->






				</div>
			</div>


		</div>
	</div>


	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>



</html>
