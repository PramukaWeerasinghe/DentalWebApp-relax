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
			<div class="right_col" role="main">
			
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>


				<h3>Request for Haematalogical & Biochemical Investigation Report </h3>
				
				<hr />
				
				<div class="p-3 mb-2 bg-success text-white"><s:actionmessage/></div>
				
				<div  class="col-md-8" >
				<s:form namespace="/patient-request-HBI" action="save" method="post">

					<s:hidden name="patientId" value="%{patient.id}"></s:hidden>
					
					<div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">Patient Serial Number:</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
									<s:textfield required="required" title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestHBI.patientId" placeholder="Name"/>
								</div>
								
							</div>
						</div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">Relevant clinical history:</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
									<s:textfield title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestHBI.clinicalHistory" placeholder="Name"/>
								</div>
								
							</div>
						</div>
						
						<hr>
						<div class="form-group">
							<div class="row">
								
								<div class="col-md-12 col-sm-12 col-xs-6">
									<label for="name">Type of test required:</label>
								</div>
							</div>
							
							
							<div class="row">	
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">FBC:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestHBI.typeOfTest" fieldValue="FBC" value="false" label="Check Me for testing"/>
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">ESR:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestHBI.typeOfTest" fieldValue="ESR" value="false" label="Check Me for testing"/>
								</div>								
							</div>					

							<div class="row">	
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">BLOOD PICTURE:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestHBI.typeOfTest" fieldValue="BLOOD PICTURE" value="false" label="Check Me for testing"/>
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">WBC / DC:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestHBI.typeOfTest" fieldValue="WBC / DC" value="false" label="Check Me for testing"/>
								</div>							
							</div>
							
							<div class="row">	
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">BT / CT:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestHBI.typeOfTest" fieldValue="BT / CT" value="false" label="Check Me for testing"/>
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">RBS / FBS / PPBS:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestHBI.typeOfTest" fieldValue="RBS / FBS / PPBS" value="false" label="Check Me for testing"/>
								</div>								
							</div>
																					
							<div class="row">
					
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Liver Function Test (LFT):</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestHBI.typeOfTest" fieldValue="Liver Function Test (LFT)" value="false" label="Check Me for testing"/>
								</div>
															
							</div>						
						</div>
						
						<hr>




						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<label for="name">Other tests:</label>
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-12">
									<s:textfield title="Name" type="text" 
									cssClass="form-control" id="name" name="patientRequestHBI.typeOfTestOther" placeholder="Name"/>
								</div>
								
							</div>
						</div>						



						<br>
						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-4 col-xs-12"></div>
								<s:if test="patientRequestHBI.id != null && !patientRequestHBI.id.empty">
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
