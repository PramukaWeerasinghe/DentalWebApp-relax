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
			
			<s:actionmessage/>
				<s:form namespace="/brushing-habits" action="save"
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
						<div class="col-md-2 col-sm-3 col-xs-12">
							<label>Tooth brushing tool:</label>
						</div>
						<div class="col-md-3 col-sm-4 col-xs-12">
							<s:select cssClass="form-control"
							name="patientDiagnosticBrushingHabits.brushingTool" list="#{'Manual':'Manual','Electic':'Electric'}" />
						</div>
						
						<div class="col-md-2 col-sm-4 col-xs-12">
							<label>Other tools:</label>
						</div>
						<div class="col-md-3 col-sm-4 col-xs-12">
							<s:textarea maxlength="120" id="textToolOther" cssClass="form-control" rows="2" name="patientDiagnosticBrushingHabits.brushingToolOther"></s:textarea>
						</div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-12">
							<label>Toothpaste:</label>
						</div>
						<div class="col-md-3 col-sm-4 col-xs-12">
							<s:select cssClass="form-control"
							name="patientDiagnosticBrushingHabits.toothpaste" list="#{'Fluoridated':'Fluoridated','Non-fluoridated':'Non-fluoridated','Herbal':'Herbal'}" />
						</div>
						
						<div class="col-md-2 col-sm-4 col-xs-12">
							<label>Other toothpaste:</label>
						</div>
						<div class=" col-md-3 col-sm-4 col-xs-12">
							<s:textarea maxlength="120" id="textToothpasteOther" cssClass="form-control" rows="2" name="patientDiagnosticBrushingHabits.toothpasteOther"></s:textarea>
						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-12">
							<label>Brushing frequency:</label>
						</div>
						<div class="col-md-3 col-sm-4 col-xs-12">
							<s:select cssClass="form-control"
							name="patientDiagnosticBrushingHabits.brushingFrequency"
							 list="#{'twice a day':'twice a day','Less than once a day':'Less than once a day','once a day':'once a day','thrice a day':'thrice a day','More than thrice a day':'More than thrice a day'}" />
						</div>
						
						
						<div class="col-md-2 col-sm-3 col-xs-12">
							<label>Bristles:</label>
						</div>
						<div class="col-md-3 col-sm-4 col-xs-12">
							<s:select cssClass="form-control"
							name="patientDiagnosticBrushingHabits.bristles" 
							list="#{'hard':'hard','medium':'medium','soft':'soft'}" />
						</div>
						
					</div>
				</div>

				

				<div class="form-group">
					<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-12">
							<label>Duration of Brushing:</label>
						</div>
						<div class="col-md-3 col-sm-4 col-xs-12">
							<s:select cssClass="form-control"
							name="patientDiagnosticBrushingHabits.brushingDuration" 
							list="#{'between 1-3 min.':'between 1-3 min.','less than 1 min.':'less than 1 min.','more than 3 min.':'more than 3 min.'}" />
						</div>
					</div>
				</div>

				

				<div class="form-group">
					<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-12">
							<label>supplementary cleaning aids</label>
						</div>

						<div class="col-md-10 col-sm-12 col-xs-12">
							<label class="col-md-4 col-sm-4 col-xs-12"><s:checkbox name="patientDiagnosticBrushingHabits.supplementNone"/>None </label>
							<label class="col-md-4 col-sm-4 col-xs-12"><s:checkbox  name="patientDiagnosticBrushingHabits.supplementFloss"/>Floss </label>
    						<label class="col-md-4 col-sm-4 col-xs-12"><s:checkbox  name="patientDiagnosticBrushingHabits.supplementBottleBrushes"/>Bottle-brushes</label>
    						<label class="col-md-4 col-sm-4 col-xs-12"><s:checkbox  name="patientDiagnosticBrushingHabits.supplementSingleTuft"/>Single-tufted TB</label>
    						<label class="col-md-4 col-sm-4 col-xs-12"><s:checkbox  name="patientDiagnosticBrushingHabits.supplementWoodpicks"/>Wood picks</label>
    						<label class="col-md-4 col-sm-4 col-xs-12"><s:checkbox  name="patientDiagnosticBrushingHabits.supplementIrrigators"/>Irrigators</label>
						</div>
					</div>
				</div>

				<div class="form-group">
					<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-12">
							<label>Other supplementary cleaning aids</label>
						</div>
						<div class=" col-md-3 col-sm-3 col-xs-12">
							<s:textarea maxlength="120" cssClass="form-control" rows="3" name="patientDiagnosticBrushingHabits.supplementOther"></s:textarea>
						</div>
					</div>
				</div>
				
			
				<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
							<s:if test="patientDiagnosticBrushingHabits.id != null">
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

<%-- <script>
	$("#selectTool").change(function() {
		if (this.value == 6) {
			$("#textToolOther").value = "";
			$("#textToolOther").prop("disabled", false);
		} else {
			$("#textToolOther").prop("disabled", true);
		}
	})
</script>
	
	<script>
				$("#selectToothpaste").change(function() {
					if(this.value == 6) {
						$("#textToothpasteOther").value = "";
						$("#textToothpasteOther").prop("disabled", false);
					}else {
						$("#textToothpasteOther").prop("disabled", true);
					}
				})
	</script> --%>
	<script>
		$("#diagnosticMenu7").addClass('active');
	</script>
	
</body>



</html>
