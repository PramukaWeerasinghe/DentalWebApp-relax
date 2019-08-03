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
					value="/WEB-INF/content/patient/diagnostic/common/sub-bar1.jsp"></s:include>



				<div class="right_col" role="main" id="full">

					<s:actionmessage />
					<s:form namespace="/patient-medical-record1" action="save"
						method="post">

						<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>


						<div class="form-group">
							<div class="row">
								<div class="col-md-12">
									<s:include
										value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
								</div>
							</div>
							<div class="row">
								<div class="col-md-2 col-sm-2 col-xs-12">
									<h4>Anaemia</h4>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12">
									<br>
									<s:radio name="patientDiagnosticMedicalRecord1.anaemia"
										list="#{'Yes':'Yes','No':'No'}" />
								</div>

								<div class="col-md-2 col-sm-2 col-xs-12">
									<h4>Asthma</h4>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12">
									<br>
									<s:radio name="patientDiagnosticMedicalRecord1.asthma"
										list="#{'Yes':'Yes','No':'No'}" />
								</div>

							</div>
						</div>


						<div class="form-group">
							<div class="row">

								<div class="col-md-1 col-sm-2 col-xs-12">
									<h4>Drug</h4>
								</div>

								<div class="col-md-offset-6 col-sm-4 col-xs-12">
									<h4>Food</h4>
								</div>

							</div>
							<div class="row">
								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:checkbox
										name="patientDiagnosticMedicalRecord1.drugPenicillin" />
									<label>Penicillin/Amoxicillin</label><br>
									<s:checkbox
										name="patientDiagnosticMedicalRecord1.drugParacetamol" />
									<label>Paracetamol</label><br>
									<s:checkbox name="patientDiagnosticMedicalRecord1.drugNsaids" />
									<label>NSAIDS</label>
								</div>

								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:textarea maxlength="120" cssClass="form-control" rows="3"
										placeholder="Other"
										name="patientDiagnosticMedicalRecord1.drugOther" />
								</div>

								<div class="col-md-offset-1 col-sm-2 col-xs-12">
									<s:checkbox
										name="patientDiagnosticMedicalRecord1.foodPineapple" />
									<label>Pineapple</label><br>
									<s:checkbox name="patientDiagnosticMedicalRecord1.foodTomatoe" />
									<label>Tomatoe</label><br>
									<s:checkbox
										name="patientDiagnosticMedicalRecord1.foodCannedfish" />
									<label>Canned Fish</label>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:textarea cssClass="form-control" rows="3"
										placeholder="Other"
										name="patientDiagnosticMedicalRecord1.foodOther" />
								</div>

							</div>
						</div>

						<div class="form-group">
							<div class="row">
								<div class="col-md-3 col-sm-4 col-xs-12">
									<h4>Latex/rubber</h4>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12">
									<s:radio name="patientDiagnosticMedicalRecord1.latexRubber"
										list="#{'Yes':'Yes','No':'No'}" />
								</div>
							</div>
						</div>



						<div class="form-group">
							<div class="row">
								<div class="col-md-3 col-sm-4 col-xs-12">
									<h4>Other</h4>
								</div>

								<div class="col-md-3 col-sm-5 col-xs-12">
									<s:textarea maxlength="250"
										placeholder="Type if any other allergies"
										cssClass="form-control" rows="3"
										name="patientDiagnosticMedicalRecord1.allergiesOther" />
								</div>

							</div>
						</div>


						<hr>
						<div class="form-group">


							<div class="row">
								<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
									<s:if test="patientDiagnosticMedicalRecord1.id != null">
										<s:submit cssClass="btn2" value="Update"></s:submit>
									</s:if>
									<s:else>
										<s:submit cssClass="btn2" value="Submit">
										</s:submit>
									</s:else>
								</div>
							</div>
						</div>

					</s:form>


				</div>



				<!-- /page content -->
			</div>


		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

	<script>
		$("#diagnosticMenu3").addClass('active');
	</script>
</body>



</html>
