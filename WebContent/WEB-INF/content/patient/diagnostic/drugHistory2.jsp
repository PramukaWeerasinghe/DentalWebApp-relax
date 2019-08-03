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
			<s:include
				value="/WEB-INF/content/patient/diagnostic/common/top-bar.jsp"></s:include>
			<div style="overflow-x: scroll; height: auto">
				<s:include
					value="/WEB-INF/content/patient/diagnostic/common/sub-bar-drughistory2.jsp"></s:include>

				<div class="container">


					<div class="row">


						<div class="right_col" role="main" id="full">
							<s:actionmessage />
							<s:form id="drugHistoryForm" namespace="/patient-drug-history"
								action="savePhase2" method="post">

								<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>
								<div class="row">
									<div class="col-md-12">
										<s:include
											value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
									</div>
								</div>

								<div class="row">
									<div class="col-lg-12 col-xs-12">
										<s:label>
											<strong>Drugs</strong>
										</s:label>
									</div>
									<br>
									<div class="col-lg-3 col-xs-12">
										<%-- <s:select name="patientDiagnosticHabits1"
											cssClass="form-input input-sm"
											list="#{'none':'None','antibiotics':'Antibiotics','antidiabetes':'Antidiabetes','antiepileptic':'Anti Epileptic','antihypertensives':'Antihypertensives','analgesics':'Analgesics','steroids':'Steroids','chemotherapy':'Chemotherapy'}" /> --%>
										<s:select id="drugTypeId" label="Select a drug"
											name="patientDiagnosticDrug.categoryName" headerKey="-1"
											headerValue="None" cssClass="form-input input-sm"
											list="#{'antibiotics':'Antibiotics','antidiabetes':'Antidiabetes','antiepileptic':'Anti Epileptic','antihypertensives':'Antihypertensives','analgesics':'Analgesics','steroids':'Steroids','chemotherapy':'Chemotherapy'}" />
									</div>
									<div id="data_insertion" style="display: none;">
										<div class="col-lg-2 col-xs-12">

											<s:textfield maxlength="120" type="text" id="input_data"
												placeholder="Name" cssClass="form-control input-sm"
												name="patientDiagnosticDrug.categoryDrugName" value="" />
										</div>
										<div class="col-lg-2 col-xs-12">

											<s:textfield maxlength="120" type="text" id="input_data"
												placeholder="Dose regime/mg"
												cssClass="form-control input-sm"
												name="patientDiagnosticDrug.categoryDrugDose" value="" />
										</div>
										<div class="col-lg-2 col-xs-12">

											<s:textfield maxlength="120" type="text" id="input_data"
												placeholder="Frequency/perday"
												cssClass="form-control input-sm"
												name="patientDiagnosticDrug.categoryDrugFrequency" value="" />
										</div>
										<div class="col-lg-2 col-xs-12">

											<s:textfield maxlength="120" type="text" id="input_data"
												placeholder="Duration/days" cssClass="form-control input-sm"
												name="patientDiagnosticDrug.categoryDrugDuration" value="" />
										</div>
										<div class="col-lg-1 col-xs-12">
											<%-- <button class="btn btn-success input-sm" name="btn_tweet"
											id="btn_tweet">
											<span class="glyphicon glyphicon-plus-sign"></span>
										</button> --%>

											<%-- 	<s:url var="addDrug" namespace="/patient-drug-history"
											action="saveDrugs">
											<s:param name="patientId" value="%{patient.id}"></s:param>
										</s:url> --%>

											<s:submit value="Add Drug" cssClass="btn btn-info btn-sm"></s:submit>
											<%-- <s:a href="%{#addDrug}" cssClass="btn btn-success input-sm">
											<span class="glyphicon glyphicon-plus-sign"></span>

										</s:a> --%>

										</div>


									</div>


								</div>
							</s:form>
							<hr>
							<div class="col-lg-12 col-xs-12">
								<table class="table">
									<thead>
										<tr>
											<th>Category Name</th>
											<th>DrugName</th>
											<th>Dose/mg</th>
											<th>Frequency/perday</th>
											<th>Duration/days</th>
										</tr>
									</thead>


									<tbody>
										<s:iterator
											value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.drugs}"
											status="rowNumber">
											<tr>
												<td><s:property value="categoryName" /></td>
												<td><s:property value="categoryDrugName" /></td>
												<td><s:property value="categoryDrugDose" /></td>
												<td><s:property value="categoryDrugFrequency" /></td>
												<td><s:property value="categoryDrugDuration" /></td>
											</tr>
										</s:iterator>
									</tbody>
								</table>

							</div>

							<hr>
							<div class="col-md-6">
								<s:url var="investigations" namespace="/patient-investigations"
									action="form.html">
									<s:param name="patientId" value="%{patient.id}"></s:param>
								</s:url>
								<s:a href="%{#investigations}" cssClass="btn btn-warning">
								Submit
							</s:a>
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

	<script>
		$("#diagnosticMenu4").addClass('active');
	</script>
</body>



</html>
