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
					value="/WEB-INF/content/patient/diagnostic/common/sub-bar4.jsp"></s:include>


				<div class="right_col" role="main" id="full">

					<s:actionmessage />
					<s:form namespace="/patient-medical-record4" action="save"
						method="post">

						<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>
						<div class="row">
									<div class="col-md-12">
										<s:include
											value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
									</div>
								</div>

						<s:if test="patient.sex!='Male'">
							<div class="form-group">
								
								<div class="row">

									<div class="col-md-2 col-sm-2 col-xs-12">
										<label>On hormonal contraceptives</label>
									</div>

									<div class="col-md-3 col-sm-4 col-xs-12">
										<s:select
											name="patientDiagnosticMedicalRecord4.onHormonalContraceptives"
											cssClass="form-control input-sm"
											list="#{'none':'None','pills':'Pills','injections':'Injections','contraceptiveImplants':'Contraceptive implants'}" />

									</div>

									<div class="col-md-2 col-sm-2 col-xs-12">
										<label>Pregnancy</label>
									</div>

									<div class="col-md-3 col-sm-4 col-xs-12">
										<s:select name="patientDiagnosticMedicalRecord4.pregnancy"
											cssClass="form-control input-sm"
											list="#{'none':'None','first trimester':'1st Trimester','second trimester':'2nd Trimester','third':'3rd Trimester'}" />

									</div>

								</div>
							</div>
						</s:if>

						<div class="form-group">
							<div class="row">

								<div class="col-md-3 col-sm-4 col-xs-12">
									<label>Psychiatric/Behavioral disorders</label>
								</div>

								<div class="col-md-2 col-sm-2 col-xs-12">
									<s:radio
										name="patientDiagnosticMedicalRecord4.behaviouralDisorders"
										list="#{'Yes':'Yes','No':'No'}" />
								</div>

							</div>
						</div>

						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-2 col-xs-12">
									<label>Renal Disorders</label>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord4.renalDisordersChronicinfections" />Chronic
										infections</label><br> <label><s:checkbox
											name="patientDiagnosticMedicalRecord4.renalDisordersKidneyfailure" />Kidney
										failure</label><br> <label><s:checkbox
											name="patientDiagnosticMedicalRecord4.renalDisordersTransplant" />Transplant</label><br>
									<s:textfield maxlength="100" cssClass="form-control input-sm"
										placeholder="Other"
										name="patientDiagnosticMedicalRecord4.renalDisordersOther" />
								</div>

							</div>
						</div>

						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-2 col-xs-12">
									<label>TMD</label>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:radio name="patientDiagnosticMedicalRecord4.tmd"
										list="#{'Yes':'Yes','No':'No'}" />
								</div>

								<div class="tmdtext" style="display: none;">
									<div class="col-md-3 col-sm-4 col-xs-12">
										<s:textfield maxlength="100" cssClass="form-control input-sm"
											placeholder="comments"
											name="patientDiagnosticMedicalRecord4.tmdOther" />
									</div>
								</div>

							</div>
						</div>

						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-4 col-xs-12">
									<label>Comment</label>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:textarea maxlength="100" cssClass="form-control input-sm"
										placeholder="any other diseases" rows="3"
										name="patientDiagnosticMedicalRecord4.otherComments" />
								</div>
							</div>
						</div>

						<div class="form-group">

							<hr>
							<div class="row">
								<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
									<s:if test="patientDiagnosticMedicalRecord4.id != null">
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
