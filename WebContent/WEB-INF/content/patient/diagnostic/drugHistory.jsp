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
					value="/WEB-INF/content/patient/diagnostic/common/sub-bar-drughistory1.jsp"></s:include>


				<div class="container">

					<div class="col-lg-9">
						<div class="row">


							<div class="right_col" role="main" id="full">
								<s:actionmessage />
								<s:actionerror />
								<s:form namespace="/patient-drug-history" action="save"
									method="post">

									<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>
									<div class="box1" style="display: none;">
										<div class="row">
											<div class="col-md-12">
												<s:include
													value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
											</div>
										</div>
										<div class="row">
											<div class="col-lg-2 col-lg-offset-4 col-xs-12">
												<span>Dose Regime/mg</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Frequency/perday</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Duration/days</span>
											</div>
										</div>
									</div>

									<div class="row">

										<div class="col-lg-2 col-xs-2">

											<label for="name">Anticoagulant</label>
										</div>
										<div class="col-lg-2 col-xs-12">
											<s:checkbox
												name="patientDiagnosticDrugHistory.anticoagulantWarfarin"
												id="cbx1" />
											Warfarin
										</div>
										<div class="box1" style="display: none;">
											<div class="col-lg-2 col-xs-12">
												<s:textfield maxlength="120" type="text"
													placeholder="Dose regime" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantWarfarinDose" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Frequency" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantWarfarinFrequency" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Duration" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantWarfarinDuration" />
											</div>

										</div>

									</div>
									<div class="box2" style="display: none;">
										<div class="row">
											<div class="col-lg-2 col-lg-offset-4 col-xs-12">
												<span>Dose Regime/mg</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Frequency/perday</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Duration/days</span>
											</div>
										</div>
									</div>
									<div class="row">

										<div class="col-lg-2 col-lg-offset-2 col-xs-12">
											<s:checkbox
												name="patientDiagnosticDrugHistory.anticoagulantClopidogrel"
												id="cbx2" />
											Clopidogrel
										</div>
										<div class="box2" style="display: none;">
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Dose regime" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantClopidogrelDose" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Frequency" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantClopidogrelFrequency" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Duration" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantClopidogrelDuration" />
											</div>
										</div>
									</div>
									<div class="box3" style="display: none;">
										<div class="row">
											<div class="col-lg-2 col-lg-offset-4 col-xs-12">
												<span>Dose Regime/mg</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Frequency/perday</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Duration/days</span>
											</div>
										</div>
									</div>
									<div class="row">

										<div class="col-lg-2 col-lg-offset-2 col-xs-12">
											<s:checkbox
												name="patientDiagnosticDrugHistory.anticoagulantAspirin"
												id="cbx3" />
											Aspirin
										</div>
										<div class="box3" style="display: none;">
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Dose regime" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantAspirinDose" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Frequency" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantAspirinFrequency" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Duration" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantAspirinDuration" />
											</div>
										</div>
									</div>
									<div class="drughistory_other_details" style="display: none;">
										<div class="row">
											<div class="col-lg-2 col-lg-offset-6 col-xs-12">
												<span>Dose Regime/mg</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Frequency/perday</span>
											</div>
											<div class="col-lg-2 col-xs-12">
												<span>Duration/days</span>
											</div>
										</div>
									</div>
									<div class="row">

										<div class="col-lg-2 col-lg-offset-2 col-xs-12">
											<s:checkbox
												name="patientDiagnosticDrugHistory.anticoagulantOther"
												id="drughistory_other" />
											Other
										</div>

										<div class="drughistory_other_details" style="display: none;">
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Other details"
													cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantOtherDetail" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Dose regime" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantOtherDose" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Frequency" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantOtherFrequency" />
											</div>
											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Duration" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.anticoagulantOtherDuration" />
											</div>

										</div>
									</div>

									<hr>
									<div class="row">
										<div class="col-lg-3 col-xs-12">
											<s:checkbox
												name="patientDiagnosticDrugHistory.radiationtherapy"
												id="cbx14" />
											<label for="name">Radiation Therapy</label>
										</div>

										<div class="box14" style="display: none;">

											<div class="col-lg-2 col-xs-12">

												<s:textfield maxlength="120" type="text"
													placeholder="Duration" cssClass="form-control input-sm"
													name="patientDiagnosticDrugHistory.radiationtherapyDuration" />
											</div>


										</div>

									</div>
									<div class="row">
										<div class="col-md-3 col-xs-12">
											<label>Comments</label>
										</div>
										<div class="col-md-4 col-xs-12">
											<s:textarea maxlength="255" cssClass="form-control col-md-3"
												rows="2" name="patientDiagnosticDrugHistory.comments"></s:textarea>
										</div>

									</div>
									<div class="row">
										<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
											<s:if test="patientDiagnosticDrugHistory.id != null">
												<s:submit cssClass="btn2" value="Update"></s:submit>
											</s:if>
											<s:else>
												<s:submit cssClass="btn2" value="Submit">
												</s:submit>
											</s:else>
										</div>
									</div>

								</s:form>
							</div>
						</div>
					</div>
				</div>


			</div>
			<!-- /page content -->
		</div>
	</div>

	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

	<script>
		$("#diagnosticMenu4").addClass('active');
	</script>

</body>



</html>
