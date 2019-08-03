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
			<s:include value="/WEB-INF/content/patient/diagnostic/common/top-bar.jsp"></s:include>
				

				<div style="overflow-x: scroll; height: auto">
					<div class="right_col" role="main" id="full">

						<s:actionmessage />
						<s:form namespace="/patient-investigations" action="save"
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

									<div class="col-lg-2 col-md-2 col-xs-3">

										<label for="name">Blood Pressure</label>
									</div>

									<div class="col-lg-3 col-md-3 col-xs-9">
										<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
											name="patientDiagnosticInvestigation.bloodPresure" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.bloodPresure}"/>
										<h6>mmHg</h6>

									</div>
									<!-- <div class="col-lg-1 col-md-1 col-xs-12">
										

									</div> -->
									<div
										class="col-lg-1 col-lg-offset-1 col-md-1 col-md-offset-1 col-xs-3">
										<label for="name">Date</label>
									</div>
									<div class="col-lg-2 col-md-2 col-xs-9">
										<div class="form-group input-sm">

											<input type="date" class="form-control input-sm" id="bday"
												name="patientDiagnosticInvestigation.bloodPresureDate"
												value="<s:property value='%{patientDiagnosticInvestigation.bloodPresureDate}' />">
										</div>

									</div>



								</div>
							</div>
							<hr>
							<div class="form-group">
								<div class="row">
									<div class="col-lg-2 col-md-2 col-xs-12">
										<label for="name">Haematological</label>
									</div>
									<div class="col-lg-10 col-md-10 col-lg-12">
										<div class="row">

											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">BT</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalBt" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalBt}" />

											</div>
											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">CT</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalCt" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalCt}"/>

											</div>
											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">HBA1C</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalHba1c" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalHba1c}"/>

											</div>
										</div>
										<br>
										<div class="row">

											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">INR</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalInr" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalInr}" />

											</div>
											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">FBS</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalFbs" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalFbs}" />

											</div>
											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">FBC</label>
											</div>

											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalFbc" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalFbc}"/>

											</div>
										</div>

										<br>
										<div class="row">

											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">SGPT</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalSgpt" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalSgpt}"/>

											</div>
											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">Hb</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalHb" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalHb}"/>

											</div>
											<div class="col-lg-1 col-md-1 col-xs-3">
												<label for="name">RBS</label>
											</div>
											<div class="col-lg-2 col-md-2 col-xs-9">
												<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
													name="patientDiagnosticInvestigation.haematologicalRbs" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalRbs}"/>

											</div>

										</div>
										<br>
										<div class="row">

											<div class="col-lg-1 col-md-1 col-xs-3">
												<label
													for="patientDiagnosticInvestigation.haematologicalDate">Date</label>
											</div>
											<div class="col-lg-3 col-md-3 col-xs-9">
												<div class="form-group input-sm">

													<input type="date" class="form-control input-sm" id="bday"
														name="patientDiagnosticInvestigation.haematologicalDate"
														value="<s:property value='%{patientDiagnosticInvestigation.haematologicalDate}' />">
												</div>

											</div>


										</div>

									</div>


								</div>
							</div>

							<hr>
							<div class="form-group">
								<div class="row">

									<div class="col-lg-2 col-md-2 col-xs-3">
										<label for="name">Comments</label>
									</div>

									<div class="col-lg-3 col-md-3 col-xs-9">
										<s:textarea maxlength="500" cssClass="form-control input-sm" id="text1"
											row="2"
											name="patientDiagnosticInvestigation.haematologicalComments" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalComments}"/>
									</div>

								</div>
							</div>


								

							<div class="row">
								<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
									<s:if test="patientDiagnosticInvestigation.id != null">
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
			




			<!-- /page content -->
		
		</div>



	</div>
	<!-- /page content -->


	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

	<script>
		$("#diagnosticMenu5").addClass('active');
	</script>

</body>



</html>
