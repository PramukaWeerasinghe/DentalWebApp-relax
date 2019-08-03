<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

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
				<div class="right_col" role="main" id="full">

					<s:actionmessage />
					<s:form namespace="/dietary-habits" action="save" method="post">


						<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>

						<div class="form-group">
							<div class="row">
								<div class="col-md-12">
									<s:include
										value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
								</div>
							</div>
							<div class="row">
								<div class="col-md-2 col-sm-3 col-xs-12">
									<label class="control-label" for="name">Sugar
										Consumption</label>
								</div>

								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:select cssClass="form-control"
										name="patientDiagnosticDietaryHabits.sugarConsumption"
										list="#{'High':'High','Moderate':'Moderate','Low':'Low'}" />

								</div>

							</div>
						</div>

						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-2 col-xs-12">
									<label>Consumption of beverages</label>
								</div>


								<div class="col-md-2 col-sm-4 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticDietaryHabits.beverageCarbonicCheck"
											value="CARBONIC" />Carbonic drinks</label>
								</div>
								<div class="col-md-2 col-sm-4 col-xs-12">
									<label><s:checkbox
											name="patientDiagnosticDietaryHabits.beverageFruit" />Fruit
										juice</label>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-2 col-sm-3 col-xs-12">
								<label>Other:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:textarea maxlength="120" cssClass="form-control col-md-3"
									rows="5" id="other" name="patientDiagnosticDietaryHabits.other" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.other}"></s:textarea>
							</div>
						</div>
						<br />

						<div class="row">
							<div class="col-md-2 col-sm-3 col-xs-12">
								<label>Employment</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:textarea maxlength="120" cssClass="form-control col-md-3"
									rows="5" id="employee"
									name="patientDiagnosticDietaryHabits.employment"></s:textarea>
							</div>
						</div>


						<div class="row">
							<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
								<s:if test="patientDiagnosticDietaryHabits.id != null">
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
				<!-- /page content -->
			</div>
		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

	<script>
		$("#diagnosticMenu8").addClass('active');
	</script>

</body>



</html>

