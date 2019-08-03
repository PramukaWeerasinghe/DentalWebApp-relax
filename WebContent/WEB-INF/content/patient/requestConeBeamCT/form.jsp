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
			<div class="right_col" role="main" >
			
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>


				<h3>Request for Cone Beam CT Scan</h3>
				
				<hr />
				
				<div  class="col-md-8" >
				
					<div class="p-3 mb-2 bg-success text-white">
						<s:actionmessage />
					</div>				
				<s:form namespace="/patient-request-conebeam" action="save" method="post">

<%-- 					<s:hidden name="patientId" value="%{patient.id}"></s:hidden> --%>
					
					<div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">Patient Serial Number* :</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
									<s:textfield required="required" title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestConebeam.patientId" placeholder="Serial number"/>
								</div>
								
							</div>
						</div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">Urgent:</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
								
									<s:select cssClass="form-control" name="patientRequestConebeam.urgent" list="#{'URGENT':'URGENT','EARLY':'EARLY','ROUTINE':'ROUTINE'}" />
								</div>
								
							</div>
						</div>
			<hr>
			<h3>clinical details</h3>
			
						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">Details of previous X-rays:</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
									<s:textfield title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestConebeam.previousXrayInfo" placeholder=""/>
								</div>
								
							</div>
						</div>						


						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">Clinical notes and provisional diagnosis:</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
									<s:textfield title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestConebeam.clinicalNote" placeholder=""/>
								</div>
								
							</div>
						</div>

						<hr>
						<div class="form-group">
							<div class="row">
								
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Consultant's Name* :</label>
								</div>
								
								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:textfield required="required" title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestConebeam.consultantName" placeholder=""/>
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Name of hospital:</label>
								</div>
								
								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:textfield title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestConebeam.hospitalName" placeholder=""/>
								</div>								
							</div>
						</div>

						
						<hr>
						<div class="form-group">
							<div class="row">
								
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Date of request:</label>
								</div>
								
								<div class="col-md-4 col-sm-12 col-xs-12">
								<input type="date" id="datetimepicker-input" class="form-control" name="patientRequestConebeam.dateRequestedString"/>
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Appointment date:</label>
								</div>
								
								<div class="col-md-4 col-sm-12 col-xs-12">
									<input type="date"  class="form-control" name="patientRequestConebeam.dateAppointmentString"/>
								</div>								
							</div>
						</div>	



						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">CD given:</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
								
									<s:select cssClass="form-control" name="patientRequestConebeam.cdGiven" list="#{'No':'No','Yes':'Yes','':''}" />
								</div>
								
							</div>
						</div>																
						<hr>
						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-4 col-xs-12"></div>
								<s:if test="patientRequestConebeam.id != null && !patientRequestConebeam.id.empty">
									<div class="col-md-3 col-sm-4 col-xs-12">
										<s:submit cssClass="btn btn-warning" value="Update"></s:submit>
									</div>
								</s:if>
								<s:else>
									<div class="col-md-2 col-sm-4 col-xs-12">
										<s:submit cssClass="btn btn-success" value="Insert"></s:submit>
									</div>
								</s:else>							
							</div>
						</div>

					</div>

				</s:form>


			</div>

			<div  class="col-md-4">
			</div>





			</div>
			<!-- /page content -->
				
		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
