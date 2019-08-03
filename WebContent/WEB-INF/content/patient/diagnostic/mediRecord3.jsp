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
					value="/WEB-INF/content/patient/diagnostic/common/sub-bar3.jsp"></s:include>


				<div class="right_col" role="main" id="full">

					<s:actionmessage />
					<s:form namespace="/patient-medical-record3" action="save"
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
									<label>Gastro-intestinal</label>
								</div>
								<div class="col-md-2 col-sm-2 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.gastroIntestinalUlcers" />Ulcers</label><br>
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.gastroIntestinalGastricreflux" />Gastric
										reflux</label><br> <label><s:checkbox id="chk1"
											name="patientDiagnosticMedicalRecord3.gastroIntestinalOther" />Other</label>
								</div>
								<div class="other" style="display: none;">
									<div class="col-md-3 col-sm-4 col-xs-12">
										<br> <br> <br>
										<s:textfield maxlength="120" cssClass="form-control input-sm"
											placeholder="Other"
											name="patientDiagnosticMedicalRecord3.gastroIntestinalOtherComments" />
									</div>


								</div>
							</div>
						</div>
						<br>
						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-2 col-xs-12">
									<label>Hepatitis</label>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.hepatitisA" /> Hep A</label> <label><s:checkbox
											name="patientDiagnosticMedicalRecord3.hepatitisB" /> Hep B</label> <label><s:checkbox
											name="patientDiagnosticMedicalRecord3.hepatitisC" /> Hep C</label> <label><s:checkbox
											id="chk7"
											name="patientDiagnosticMedicalRecord3.hepatitisOther" />Other</label>
								</div>
								<div class="col-md-3 col-sm-3 col-xs-12">
									<div class="other7" style="display: none;">
										<br> <br>
										<s:textfield maxlength="120" cssClass="form-control input-sm"
											placeholder="Other"
											name="patientDiagnosticMedicalRecord3.hepatitisOtherComments" />
									</div>
								</div>

							</div>
						</div>
						<div class="form-group">
							<div class="row">
								<div class="col-md-4 col-sm-5 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.hiv" />HIV</label><br> <label><s:checkbox
											name="patientDiagnosticMedicalRecord3.hypertension" />Hypertension</label><br>
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.liverDisorders" />Liver
										Disorders</label><br>
								</div>

								<div class="col-md-2 col-sm-2 col-xs-12">
									<label>Musculo-skeletal</label>
								</div>
								<div class="col-md-3 col-sm-4 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.musculoSkeletalArthritis" />Arthritis</label>
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.musculoSkeletalJointreplacement" />Joint
										replacement</label><br> <label><s:checkbox id="chk6"
											name="patientDiagnosticMedicalRecord3.musculoSkeletalOther" />Other</label>
								</div>
								<div class="col-md-3 col-sm-3 col-xs-12">
									<div class="other6" style="display: none;">
										<br>
										<br>
										<br>
										<s:textfield maxlength="120" cssClass="form-control input-sm"
											placeholder="Other"
											name="patientDiagnosticMedicalRecord3.musculoSkeletalOtherComments" />
									</div>
								</div>

							</div>
						</div>


						<div class="form-group">
							<div class="row">
								<div class="col-md-3 col-sm-4 col-xs-12">
									<label>Neurological Disorders</label>
								</div>
								<div class="col-md-2 col-sm-4 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.neurologicalDisordersMigraine" />Migraine</label>
								</div>

								<div class="col-md-3 col-sm-4 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticMedicalRecord3.neurologicalDisordersNeuralgic" />Neuralgic
										Pain</label>
								</div>
							</div>
						</div>

						<div class="form-group">

							<hr>
							<div class="row">
								<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
									<s:if test="patientDiagnosticMedicalRecord3.id != null">
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
