<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>

<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.2.0/css/all.css"
	integrity="sha384-hWVjflwFxL6sNzntih27bfxkr27PmbbK/iSvJ+a4+0owXq79v+lsFkW54bOGbiDQ"
	crossorigin="anonymous">

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
					<div class="col-sm-4">
						<h3>Patient Registration Summary</h3>
					</div>
					<div class="col-sm-4">
						<img id="barcodeImage" style="width: 200px; height: 50px"
							src="<s:url namespace="/image" action='bar-code.html?q=%{patient.serialNumber}' />" />
					</div>
				</div>
				<hr>
				<section id="info">
					<div class="row" style="padding: 0 0 10px 0px">
						<div class="col-8">
							<%-- <div class="col-xs-3">
								<s:url var="printUrl" namespace="/patient" action="view-print.jsp">
									<s:param name="patientId" value="%{patient.id}"></s:param>
								</s:url>
								<s:a href="/view-print.jsp" cssClass="btn btn-info">Print A4</s:a>							
							</div> --%>

							<s:url var="printA4Url" namespace="/patient"
								action="information-pdf">
								<s:param name="id" value="%{patient.id}"></s:param>
							</s:url>

							<s:a href="%{#printA4Url}" cssClass="btn btn-success"
								target="_blank">
								<span class="glyphicon glyphicon-print"></span> Print - A4 
							</s:a>

							<s:url var="printStickerUrl" namespace="/patient"
								action="sticker-pdf">
								<s:param name="id" value="%{patient.id}"></s:param>
							</s:url>

							<s:a href="%{#printStickerUrl}" cssClass="btn btn-success"
								target="_blank">
								<span class="glyphicon glyphicon-barcode"></span>
								<span class="glyphicon glyphicon-print"></span>
						       Card Sticker 
							</s:a>

						</div>
					</div>


					<div class="row">
						<div class="col-lg-7 col-sm-7">

							<div class="form-group">
								<div class="row" id="serialNo">
									<div class="col-xs-3" id="serialNo1">
										<label>Serial Number:</label>
									</div>
									<div class="col-xs-4" id="serialNo2">
										<s:property value="%{patient.serialNumber}" />
									</div>

									<%-- <div class="col-xs-4" id="barcode">
										<img id="barcodeImage" style="width: 200px; height: 50px" src="<s:url namespace="/image" action='bar-code.html?q=%{patient.serialNumber}' />" />									
									</div>		 --%>
								</div>
							</div>

							<div id="patient-full">
								<div class="form-group">
									<div class="row" id="name">
										<div class="col-xs-3">
											<label for="name">Patient Name:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.printName}" />
											(First name:
											<s:property value="%{patient.firstName}" />
											)
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="fileNo">
										<div class="col-xs-3">
											<label for="name">Phy. File No.:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.fileNumber}" />
										</div>
									</div>
								</div>

								<div class="form-group">
									<div class="row" id="nic">
										<div class="col-xs-3">
											<label for="nic">NIC number:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.nic}" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="dob">
										<div class="col-xs-3">
											<label for="name">Date of Birth:</label>
										</div>
										<div class="col-xs-4">
											<s:date name="%{patient.dateOfBirth}" format="yyyy-MM-dd" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="sex">
										<div class="col-xs-3">
											<label for="name">Sex:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.sex}" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="ethnicity">
										<div class="col-xs-3">
											<label for="ethnicity">Ethnicity:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.ethnicity}" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="disProv">
										<div class="col-xs-3">
											<label for="district">District:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.districtName}" />
											(<b>Province</b>:
											<s:property value="%{patient.provinceName}" />
											)
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="country">
										<div class="col-xs-3">
											<label for="country">Nationality:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.country}" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="phone">
										<div class="col-xs-3">
											<label for="phoneNumber">Phone number:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.mobile}" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="email">
										<div class="col-xs-3">
											<label for="email">E-mail:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.email}" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="address">
										<div class="col-xs-3">
											<label for="address">Address:</label>
										</div>
										<div class="col-xs-4">
											<s:property value="%{patient.address}" />
										</div>

									</div>
								</div>

								<div class="form-group">
									<div class="row" id="dob">
										<div class="col-xs-3">
											<label for="name">Date of Registration:</label>
										</div>
										<div class="col-xs-4">
											<s:date name="%{patient.insertDatetime}" format="yyyy-MM-dd" />
										</div>

									</div>
								</div>
							</div>


							<div class="form-group">
								<s:actionmessage cssClass="alert alert-success" />
								<div class="row" style="margin-bottom: 30px">
									<!-- <div class="col-xs-6">
										<div class="btn-group">
										  <button type="button" class="btn btn-default" onclick="PopupPatientCard()">Print full detail</button>
										  <button type="button" class="btn btn-default" onclick="PrintPatientCard2(full)">Print label for file</button>
										  <button type="button" class="btn btn-default" onclick="">Print label for card</button>
										</div>									
									</div> -->
									<div class="col-xs-3">

										<s:if test="!student">
											<s:url var="patientEditUrl" namespace="/patient"
												action="edit.html">
												<s:param name="id" value="%{patient.id}"></s:param>
											</s:url>
											<s:a href="%{#patientEditUrl}" cssClass="btn btn-success"
												cssStyle="width:120px">
												<i class="fa fa-pencil-square-o" aria-hidden="true"></i> Edit </s:a>
										</s:if>

									</div>

									<div class="col-xs-3">
										<s:url var="addGuardianUrl" namespace="/patient-guardian"
											action="form.html">
											<s:param name="patientId" value="%{patient.id}"></s:param>
										</s:url>
										<s:a href="%{#addGuardianUrl}" cssClass="btn btn-primary btn-block">Add Guardian</s:a>
									</div>

									<%--									
									<div class="col-xs-1">
										<s:url var="patietDeleteUrl" namespace="/patient" action="delete.html">
											<s:param name="id" value="%{patient.id}"></s:param>
										</s:url>
										<s:a href="%{#patietDeleteUrl}" cssClass="btn btn-danger" data-toggle="confirmation">Delete</s:a>							
									</div> --%>
								</div>
							</div>
						</div>
						<div class="col-lg-5 col-md-5 col-sm-5 col-xs-12" id="barcode">

							<div class="row">
								<div class="col-md-12 col-sm-12 col-xs-12" id="pathology">
									<s:url var="addReportPathologyUrl"
										namespace="/patient-report-pathology" action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url>
									<s:a href="%{#addReportPathologyUrl}"
										cssClass="btn btn-info btn-block">
										<i class="fa fa-tint" aria-hidden="true"></i>
											Add / View Pathology Report
										</s:a>
								</div>
								
								
								<div class="col-md-12 col-sm-12 col-xs-12">
									<s:url var="addReportXrayUrl" namespace="/patient-report-xray"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url>
									<s:a href="%{#addReportXrayUrl}"
										cssClass="btn btn-success btn-block">
										<i class="fa fa-file-excel-o" aria-hidden="true"></i>
											Add / View X-ray Report
										</s:a>
								</div>
							
								<div class="col-md-12 col-sm-12 col-xs-12">
									<s:url var="viewList"
										namespace="/patient-diagnostic-report-list" action="list.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url>
									<s:a href="%{#viewList}" cssClass="btn btn-warning btn-block">
										<i class="fa fa-clone" aria-hidden="true"></i>
										Add / View Diagnostic Report
										</s:a>
								</div>
							</div>
							<br>

							<div class="row">
								<div class="col-md-12 col-sm-12 col-xs-12">
									<%-- 										<s:url var="addMissingTeethUrl" namespace="/patient-missing-teeth" action="addMissingTeeth">
											<s:param name="patientId" value="%{patient.id}"></s:param>
										</s:url>
										<s:a href="%{#addMissingTeethUrl}" cssClass="btn btn-info">
										<i class="fa fa-clone" aria-hidden="true"></i>
										Add Missing teeth
										</s:a> --%>

									<s:url var="viewHistoryMissingTeethUrl"
										namespace="/patient-missing-teeth" action="view">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url>
									<s:a href="%{#viewHistoryMissingTeethUrl}"
										cssClass="btn btn-danger btn-block" title="Add missing teeth">
										<i class="fas fa-teeth-open"></i>
										<i class="fas fa-tooth"></i>
										Add/view Missing teeth
										</s:a>
								</div>
								<div class="col-md-12 col-sm-12 col-xs-12">


									<s:if test="%{missingTeethStatus=='true'}">
										<s:url var="viewTeethDisorderUrl"
											namespace="/patient-teeth-disorder" action="view">
											<s:param name="patientId" value="%{patient.id}"></s:param>
										</s:url>
										<s:a href="%{#viewTeethDisorderUrl}"
											cssClass="btn btn-info btn-block">
											<i class="fas fa-tooth"></i>
										Add/view Teeth Disorder
										</s:a>
									</s:if>
									<s:else>
										<button type="button"
											class="btn btn-primary btn-block disabled"
											title="No missing teeth were marked. first add missing teeth ">
											<i class="fas fa-tooth"></i> Add/view Teeth Disorder
										</button>
									</s:else>


								</div>
							</div>
							<br>

							<div class="row">
								<div class="col-md-6 col-xs-12">


									<s:url var="viewVisitsUrl" namespace="/patient"
										action="viewVisits">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url>
									<s:a href="%{#viewVisitsUrl}" title="department visit history"
										cssClass="btn btn-default btn-block">
										<i class="glyphicon glyphicon-list-alt" aria-hidden="true"></i>
										View patient visits 
										</s:a>



								</div>
							</div>


							<div class="row">

								<div class="col-xs-12">
									<h4>Additional Information</h4>
								</div>

								<div class="col-xs-12">
									<s:if test="patientAdditionalProperties.size > 0">
										<table class="table table-condensed">
											<tr>
												<td></td>
												<th>Information</th>
												<th>Value</th>
											</tr>
											<s:iterator value="patientAdditionalProperties"
												status="rowIndex">
												<tr>
													<td><s:property value="%{#rowIndex.index + 1}" /></td>
													<td><s:property value="%{nameKey}" /></td>
													<td><s:property value="%{propertyValue}" /></td>
												</tr>
											</s:iterator>
										</table>
									</s:if>
									<s:else>
										There is no additional information
									</s:else>
								</div>
								</div>
								<div class="row">
									<div class="col-xs-12">
										<h4>Guardian Information</h4>
									</div>
									<div class="col-xs-12">
										<s:if test="patientGuardians.size > 0">
											<table class="table table-condensed">
												<tr>
													<td></td>
													<th>Relationship</th>
													<th>Name</th>
													<th>Mobile</th>
													<th>Address</th>
												</tr>
												<s:iterator value="patientGuardians" status="rowIndex">
													<tr>
														<td><s:property value="%{#rowIndex.index + 1}" /></td>
														<td><s:property value="%{relationship}" /></td>
														<td title='<s:property value="%{nic}"/>'><s:property
																value="%{name}" /></td>
														<td><s:property value="%{telephoneMobile}" /></td>
														<td><s:property value="%{address}" /></td>
													</tr>
												</s:iterator>
											</table>
										</s:if>
										<s:else>
											There is no guardian information.
										</s:else>
									</div>
								</div>
								<br>

							
						</div>




					</div>



				</section>

				<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
			</div>

			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>



</html>
