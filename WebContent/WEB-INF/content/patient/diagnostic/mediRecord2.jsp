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
			<s:include value="/WEB-INF/content/patient/diagnostic/common/sub-bar2.jsp"></s:include>
			
			<div class="right_col" role="main" id="full">
			
			<s:actionmessage/>
				<s:form namespace="/patient-medical-record2" action="save"
					method="post">
					
				<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>
				
          		<div class="form-group">
          			<div class="row">
								<div class="col-md-12">
									<s:include value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
								</div>
							</div>
    				<div class="row">
      					<div class = "col-md-3 col-sm-4 col-xs-12">
       		 				<label>Bleeding Disorders</label>
          				</div>
          				<div class = "col-md-2 col-sm-2 col-xs-12">
       		 				<label><s:checkbox name="patientDiagnosticMedicalRecord2.heamophilia" />Haemophilia</label>
          				</div>
          				<div class = "col-md-3 col-sm-2 col-xs-12">
       		 				<s:textfield maxlength="120" cssClass = "form-control input-sm" placeholder="Other" name="patientDiagnosticMedicalRecord2.bleedingDisordersOther" />
          				</div>
          			</div>
          		</div>
          						
      			<div class="form-group">
    				<div class="row">
      					<div class = "col-md-2 col-sm-4 col-xs-12">
       		 				<label>Cardiac Disorders</label>
          				</div>
          				<div class = "col-md-5 col-sm-4 col-xs-12">
       		 				<label><s:checkbox id="chka" name="patientDiagnosticMedicalRecord2.cardiacDisordersAngina" />Angina</label>
       		 			</div>
       		 			
       		 			<div class="col-md-4 col-sm-4 col-xs-12">
							<div class="othera" style="display: none;">
								<s:textfield maxlength="120" cssClass="form-control input-sm" placeholder="comments" name="patientDiagnosticMedicalRecord2.anginaOther" />
							</div>
						</div>
						
					</div>
					<div class="row">
						<div class="col-md-5 col-md-offset-2 col-sm-4 col-xs-12">
							<label><s:checkbox id="chk4" name="patientDiagnosticMedicalRecord2.cardiacDisordersValvular" />Valvular problems</label>
						</div>
						
						<div class="col-md-4 col-sm-4 col-xs-12">
							<div class="other4" style="display: none;">
								<s:textfield maxlength="120" cssClass="form-control input-sm" placeholder="comments" name="patientDiagnosticMedicalRecord2.valvularOther" />
							</div>
							
							<div class="other4" style="display: none;">
								<label><s:checkbox name="patientDiagnosticMedicalRecord2.sabeProphylaxis" />Indication for SABE prophylaxis</label>
							</div>
						</div>
					
					</div>	
						
					<div class="row">
					
							<div class="col-md-5 col-md-offset-2 col-sm-4 col-xs-12">
								<label><s:checkbox id="chk5" name="patientDiagnosticMedicalRecord2.cardiacDisordersCarditis" />Rheumatic carditis</label>
       		 			
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<div class="other5" style="display: none;">
									<label><s:checkbox name="patientDiagnosticMedicalRecord2.oralPenicillin" />Regular Oral penicillin?</label>
								</div>
							</div>	
			
						
						
					</div>

						
					
       		 	</div>
       		 				
       		 				<div class="form-group">
       		 					<div class="row">
       		 					
       		 						<div class="col-md-4 col-sm-4 col-xs-12">
		       		 					<label>Prosthetic heart valve</label>
		       		 					<s:radio name="patientDiagnosticMedicalRecord2.prostheticHeartValve" list="#{'Yes':'Yes','No':'No'}" />
		       		 				</div>
		       		 				
		       		 				<div class="col-md-3 col-sm-4 col-xs-12">
			          					<label>Pacemaker</label>
			       		 				<s:radio name="patientDiagnosticMedicalRecord2.pacemaker" list="#{'Yes':'Yes','No':'No'}"  />
			          				</div>
		       		 					
		          					<div class="col-md-4 col-sm-4 col-xs-12">
										<s:textarea maxlength="120" placeholder="Other" cssClass="form-control input-sm" rows="3" name="patientDiagnosticMedicalRecord2.cardiacDisordersOther" />
									</div>
							
		          				</div>
	
		          			</div>
		          			
		          			
		          				<div class="form-group">
		          				
				
			          			</div>								
								
										
							
          			

				<div class="form-group">
    		<div class="row">
    			<div class = "col-md-2 col-sm-2 col-xs-12">
          			<label>Developmental</label>
          		</div>
          		<div class = "col-md-3 col-sm-2 col-xs-12">
          			<label><s:checkbox name="patientDiagnosticMedicalRecord2.developmentalCleftlip" />Cleft Lip/Palate</label><br>
          			<label><s:checkbox name="patientDiagnosticMedicalRecord2.developmentalCerebral" />Cerebral Palsy</label><br>
          			<label><s:checkbox name="patientDiagnosticMedicalRecord2.developmentalSyndromic" />Syndromic</label>
          		</div>
          		
          		<div class = "col-md-2 col-sm-2 col-xs-12">
          			<label>Endocrine</label>
          		</div>
          		<div class = "col-md-2 col-sm-4 col-xs-12">
          			<label><s:checkbox name="patientDiagnosticMedicalRecord2.endocrineDiabetes" />Diabetes</label><br>
          			<label><s:checkbox name="patientDiagnosticMedicalRecord2.endocrineOther" id="chk2" />Other</label>
          		</div>
          		<div class="other1" style="display: none;">
          			<div class = "col-md-3 col-sm-4 col-xs-12">
          				<br><br><s:textfield maxlength="120" cssClass = "form-control input-sm" placeholder="other" name="patientDiagnosticMedicalRecord2.endocrineOtherComments" />
          			</div>
          		</div>
          	</div>
          </div>
          
          <div class="form-group">
          	<div class="row">
          		<div class="col-md-2 col-sm-2 col-xs-12">
							<label>Epilepsy</label>
				</div>
				
				<div class="col-md-2 col-sm-2 col-xs-12">
							<s:radio name="patientDiagnosticMedicalRecord2.epilepsy" list="#{'Yes':'Yes','No':'No'}" /> 
				</div>
			</div>
		</div>
					
				<div class="form-group">
        				
        				<hr>		
        				<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
							<s:if test="patientDiagnosticMedicalRecord2.id != null">
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
      				
	
					<!-- /page content -->
			</div>
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
