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

<body onload="window.print();">
<div class="wrapper">
  <!-- Main content -->
  <section class="invoice">
    <!-- title row -->
    <div class="row">
      <div class="col-xs-12">
        <h2 class="page-header" align="center">
			<u>
				Allergy Details 
			</u>
        </h2>		
        <small class="pull-right">Date: 26/04/2018</small>
		<hr>
      </div>
      <!-- /.col -->
    </div>

    <!-- Table row -->
    <div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Anaemia:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.anaemia}"/>
							</div>
						</div>
					</div>



					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Asthma:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.asthma}"/>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Bleeding disorders:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.bleedingDisorders}"/>
							</div>
						</div>
					</div>
					

					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Other Bleeding disorders:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.bleedingDisordersOther}"/>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Cardiac disorders:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.cardiacDisorders}"/>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Indication of SABE prohylaxis:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.sabeProphylaxis}"/>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Regular Oral penicillin:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.oralPenicillin}"/>
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Prosthetic heart valve:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.prostheticHeartValve}"/>
							</div>
						</div>
					</div>
										
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Pacemaker:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.pacemaker}"/>
							</div>
						</div>
					</div>
				
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Other Cardiac disorders:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.cardiacDisordersOther}"/>
							</div>
						</div>
					</div>
				
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Developmental disorders:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.developmental}"/>
							</div>
						</div>
					</div>
				
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Endocrine disorders:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.endocrine}"/>
							</div>
						</div>
					</div>
				
					<div class="form-group">
						<div class="row">
							<div class="col-md-3 col-sm-4 col-xs-12">
								<label>Other Endocrine disorders:</label>
							</div>
							<div class="col-md-4 col-sm-4 col-xs-12">
								<s:property value="%{patientDiagnosticMedicalRecord2.endocrineOther}"/>
							</div>
						</div>
					</div>

	  <hr>
      <!-- /.col -->
  	</section>
    </div>

  
  <!-- /.content -->

<!-- ./wrapper -->

	<script>
		$("#diagnosticMenu4").addClass('active');
	</script>
</body>
</html>
