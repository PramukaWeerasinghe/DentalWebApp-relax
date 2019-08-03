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
				<s:form namespace="/patient-dental-history" action="save"
					method="post">
					
					<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>
					<div class="row">
								<div class="col-md-12">
									<s:include value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
								</div>
							</div>
				
				<h4><strong>Dental History</strong></h4>
					
					<div class="row">
						<div class="form-group">


							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Extraction:</label>
							</div>

							<div class="col-md-2 col-sm-2 col-xs-12">
								<s:radio name="patientDiagnosticDentalHistory.extraction" list="#{'Yes':'Yes','No':'No'}" value="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.extraction"/> 
								
							</div>


						</div>


						<div class="form-group">
							<div class="compli" style="display: none;">
								<div class="col-md-3 col-sm-4 col-xs-12">
									<label>Complications:</label> 
									<s:radio name="patientDiagnosticDentalHistory.extractionComplications" list="#{'Yes':'Yes','No':'No'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.extractionComplications}"/> 
								</div>
							</div>
							
							<div class="box13" style="display: none;">
								<div class="col-md-3 col-sm-4 col-xs-12">
									<s:textfield maxlength="120" type="text" cssClass="form-control input-sm" name="patientDiagnosticDentalHistory.extractionComplicationsType" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.extractionComplicationsType}"/>
								</div>
							</div>


						</div>
					</div>
				
				
				
				
				<div class="form-group">
					<div class="row">
						<div class="col-md-3 col-sm-4 col-xs-12">
							<label>Other minor/major oral surgery:</label>
						</div>
						<div class="col-md-2 col-sm-2 col-xs-12">
							<s:radio name="patientDiagnosticDentalHistory.oralSurgery" list="#{'Yes':'Yes','No':'No'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.oralSurgery}"/> 
						</div>

					</div>
				</div>

				<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col -xs-12">
								<label>Periodontal Rx:</label>
							</div>
							<div class="col-md-2 col-sm-2 col-xs-12">
								<s:radio name="patientDiagnosticDentalHistory.periodontalRx" list="#{'Yes':'Yes','No':'No'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRx}"/>
							</div>
							<div class="row">
								<div class="options" style="display: none;">
									<div class="col-md-3 col-sm-4 col-xs-12">
										<s:checkbox name="patientDiagnosticDentalHistory.periodontalRxScaling" /> Scaling<br>
										<s:checkbox name="patientDiagnosticDentalHistory.periodontalRxRootdebriment" /> Root Debridement<br> 
										<s:checkbox name="patientDiagnosticDentalHistory.periodontalRxSurgical" /> Surgical Perio Rx<br> 
										<s:checkbox name="patientDiagnosticDentalHistory.periodontalRxMaintenance" /> Maintenance Care
									</div>
								</div>
							</div>
						</div>
					</div>

					<div class = "form-group">
				<div class="row">
					<div class = "col-md-3 col-sm-4 col-xs-12">

       		 			<label for="name">Orthodontic Treatment :</label>

          			</div>
          			
          			<div class = "col-md-2 col-sm-2 col-xs-12">
       		 			<s:radio name="patientDiagnosticDentalHistory.orthodonticTreatment" list="#{'Yes':'Yes','No':'No'}" />
          			</div>
          			
          			
						<div class="box0" style="display: none;">
								<div class="col-md-3 col-sm-4 col-xs-12">
										<s:checkbox name="patientDiagnosticDentalHistory.orthodonticTreatmentFixed" /> Fixed<br>
										<s:checkbox name="patientDiagnosticDentalHistory.orthodonticTreatmentRemovable" /> Removable<br> 
										<s:checkbox name="patientDiagnosticDentalHistory.orthodonticTreatmentFunctional" /> Functional 
										
								</div>

									<div class="row">

										<div class="col-md-2 col-sm-2 col-xs-12">
											<label>Complications :</label>
										</div>
										<div class="col-md-3 col-sm-4 col-xs-12">
											<s:textfield maxlength="120" type="text" cssClass="form-control input-sm"
												name="patientDiagnosticDentalHistory.orthodonticTreatmentComplications" />
										</div>

									</div>

								</div>
						
						
				
          		</div>
			</div>
          	
          	<div class = "form-group">
				<div class="row" >
					<div class = "col-md-3 col-sm-4 col-xs-12">
       		 			<label for="name">Restorative Rx/Prosthesis: </label>
          			</div>
          			<div class = "col-md-2 col-sm-2 col-xs-12">
       		 			<s:radio name="patientDiagnosticDentalHistory.restorativeRx" list="#{'Yes':'Yes','No':'No'}" />
          			</div>
          		
          			<div class="box1" style="display: none;">
								<div class="col-md-3 col-sm-4 col-xs-12">
										<s:checkbox name="patientDiagnosticDentalHistory.restorativeRxEndodontics" /> Endodontics<br>
										<s:checkbox name="patientDiagnosticDentalHistory.restorativeRxFixedprosthesis" /> Fixed Prosthesis<br> 
										<s:checkbox name="patientDiagnosticDentalHistory.restorativeRxRemovableprosthesis" /> Removable Prosthesis<br> 
										<s:checkbox name="patientDiagnosticDentalHistory.restorativeRxRestorations" /> Restorations
								</div>

								<div class="row">

										<div class="col-md-2 col-sm-2 col-xs-12">
											<label>Complications :</label>
										</div>
										<div class="col-md-3 col-sm-4 col-xs-12">
											<s:textfield maxlength="120" type="text" cssClass="form-control input-sm" name="patientDiagnosticDentalHistory.restorativeRxComplications" />
										</div>

									</div>

								</div>
						
          		</div>
          	</div>
          	
        			<div class="form-group">
        				
        				<hr>		
        				<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
							<s:if test="patientDiagnosticDentalHistory.id != null">
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
		$("#diagnosticMenu2").addClass('active');
	</script>
</body>



</html>
