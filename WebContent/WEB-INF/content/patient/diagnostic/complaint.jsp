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
				<s:form namespace="/patient-complaint" action="save" method="post">
				
					
					<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>

						<div class="form-group">
							<div class="row">
								<div class="col-md-12">
									<s:include value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
								</div>
							</div>
							<div class="row">
								
								<div class="col-md-2 col-sm-3 col-xs-12">
									<label class="control-label" for="name">Department</label>
								</div>

								<div class="col-md-3 col-sm-4 col-xs-12" onchange="showSupervisor(this.value)">
									<s:select cssClass="form-control"  name="patientDiagnosticComplaint.department" listKey="id" listValue="name" list="departments" headerKey="-1" headerValue="Please select"/>

								</div>

								<div class="col-md-2 col-sm-3 col-xs-12">
									<label class="control-label" for="name">Supervisor</label>
								</div>

								<div class="col-md-3 col-sm-4 col-xs-12" id="supervisorHint">
									<s:select cssClass="form-control"  name="patientDiagnosticComplaint.supervisor" listKey="id" listValue="firstName + \" \" + surname" list="employees" headerKey="-1" headerValue="Please select"/>

								</div>

							</div>
						</div>
						
						<h4><strong>Complaint</strong></h4>					
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Complaint:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textarea maxlength="128" required="required" cssClass="form-control col-md-3" rows="2" id="text1" name="patientDiagnosticComplaint.complaint"></s:textarea>
							</div>
						</div>
					</div>


					
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Type:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">							
									<s:select  cssClass = "selectpicker" multiple="true" data-width="610px" name="patientDiagnosticComplaint.complaintType"  list="#{'Abnormal taste':'Abnormal taste','Abnormally shaped teeth':'Abnormally shaped teeth','Abscess':'Abscess','Aquired oral defects':'Aquired oral defects','Bad breath':'Bad breath','Black patches of mucosa':'Black patches of mucosa','Bleeding from Gums':'Bleeding from Gums','Blood filled blisters':'Blood filled blisters','Burning sensation':'Burning sensation','Burning sensation of mouth':'Burning sensation of mouth','Cavitation':'Cavitation','Changing color of lips':'Changing color of lips','Clicking sound during mouth opening':'Clicking sound during mouth opening','Completely edentulous':'Completely edentulous','Congenital oral defects':'Congenital oral defects','Congenitally missing tooth/teeth':'Congenitally missing tooth/teeth','Cracking of lips':'Cracking of lips','Cracking sound during mouth opening':'Cracking sound during mouth opening','Cross bite':'Cross bite','Crowding of teeth':'Crowding of teeth','Dental pain':'Dental pain','Dental Trauma':'Dental Trauma','Deviation of angle of mouth':'Deviation of angle of mouth','Difficulty in mouth opening':'Difficulty in mouth opening','Difficulty in opening mouth':'Difficulty in opening mouth','Difficulty to close the jaw':'Difficulty to close the jaw','Difficulty to eat':'Difficulty to eat','Difficulty to put the tongue out':'Difficulty to put the tongue out','Difficulty to speak':'Difficulty to speak','Difficulty to swallow':'Difficulty to swallow','Discharge from gums':'Discharge from gums','Discolouration of teeth â€“ General':'Discolouration of teeth â€“ General','Disturbances in taste':'Disturbances in taste','Drifting of teeth':'Drifting of teeth','Drooling saliva':'Drooling saliva','Dryness of lips':'Dryness of lips','Dryness of mouth':'Dryness of mouth','Facial asymmetry':'Facial asymmetry','Growth':'Growth','headache':'headache','Increased salivation':'Increased salivation','Jaw dislocation':'Jaw dislocation','Jaw jerking during mouth opening':'Jaw jerking during mouth opening','Locking of the jaw':'Locking of the jaw','Loss of taste sensation':'Loss of taste sensation','lumps':'lumps','Malaligned teeth':'Malaligned teeth','Missing tooth/teeth':'Missing tooth/teeth','Mobility of Teeth':'Mobility of Teeth','Numbness':'Numbness','Oral Growth':'Oral Growth','Oral Ulceration':'Oral Ulceration','Pain':'Pain','Pain on mouth opening':'Pain on mouth opening','Painful gums':'Painful gums','Peeling off of lips':'Peeling off of lips','Proclined teeth':'Proclined teeth','Recession/ papilla loss':'Recession/ papilla loss','Red Lesion':'Red Lesion','Red patches of the mucosa':'Red patches of the mucosa','Reduced mouth opening':'Reduced mouth opening','Referral from another clinic':'Referral from another clinic','Root Exposure':'Root Exposure','Roughness of mucosa':'Roughness of mucosa','Sensitivity of teeth':'Sensitivity of teeth','Spacing of teeth':'Spacing of teeth','Swelling':'Swelling','Swelling and pain during meals':'Swelling and pain during meals','Swelling of the face':'Swelling of the face','Swelling of the lip':'Swelling of the lip','Swellings of the neck':'Swellings of the neck','Thrush':'Thrush','TMJ dislocation':'TMJ dislocation','TMJ pain':'TMJ pain','Toothwear':'Toothwear','Ulceration':'Ulceration','Ulceration at angles of mouth':'Ulceration at angles of mouth','Vesiculation/blistering of mouth':'Vesiculation/blistering of mouth','White Lesion':'White Lesion','White patches of mucosa':'White patches of mucosa'}"/>									
							</div>
						</div>
					</div>
					

					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-3 col-xs-12">
								<label>History of presenting complaint:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:textarea maxlength="500" cssClass="form-control col-md-3" rows="8"
									placeholder="Insert here" name="patientDiagnosticComplaint.complaintHistory" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaintHistory}"> </s:textarea>
							</div>
						</div>
					</div>
					
					<hr>
					
					<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
							<s:if test="patientDiagnosticComplaint.id != null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.status != 3">
								<s:submit cssClass="btn2" value="Update"></s:submit>
							</s:if>
							
							<s:elseif
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.status == 3">
									<s:url var="resubmitPatientComplaint" namespace="/patient-dental-history" action="form.html">
										<s:param name="patientId" value="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.patientId"></s:param>
									</s:url>
									
									<s:submit cssClass="btn2" value="Update"></s:submit>
									<%-- <s:a href="%{#resubmitPatientComplaint}" cssClass="btn btn-info btn-sm">UPDATE</s:a> --%>
							</s:elseif>
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
			<!-- /page content -->

		</div>


	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

	<script>
		$("#diagnosticMenu1").addClass('active');
		
		
		function showshowSupervisor(str) {
		  var xhttp;    
		  if (str == "") {
		    document.getElementById("supervisorHint").innerHTML = "";
		    return;
		  }
		  xhttp = new XMLHttpRequest();
		  xhttp.onreadystatechange = function() {
		    if (this.readyState == 4 && this.status == 200) {
		      document.getElementById("supervisorHint").innerHTML = this.responseText;
		    }
		  };
		  xhttp.open("GET", "getsupervisor.java?q="+str, true);
		  xhttp.send();
		}
	
	</script>
</body>



</html>
