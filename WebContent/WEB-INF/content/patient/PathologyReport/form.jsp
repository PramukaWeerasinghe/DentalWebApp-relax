<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>	
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col" role="main">
			
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
				<h4>Patient information
					<s:url var="patientViewUrl" namespace="/patient" action="view.html">
						<s:param value="%{patient.id}" name="id"></s:param>
					</s:url>

				 <s:a href="%{#patientViewUrl}" cssClass="btn btn-xs btn-primary" role="button">View</s:a>
  								
				</h4>
				
				<div>
					<table class="table table-condensed" id="patient_tbl">
  						<tr>
  							<th>Name</th>
  							<th>Serial No.</th>
  							<th>Sex</th>
  							<th>Birth</th>
  							<th>Mobile</th>
  							<th>Address</th>
  						</tr>
						<tr>
  							<td><s:property value="patient.firstName" /> <s:property value="patient.surname" /> </td>
  							<td><s:property value="patient.serialNumber" /></td>
  							<td><s:property value="patient.sex" /></td>
  							<td><s:date name="patient.dateOfBirth" nice="true"/></td>
  							<td><s:property value="patient.mobile" /></td>
  							<td><s:property value="patient.address" /></td>
  						  </tr>
					</table>
				
				</div>

				<h3>Pathology report details</h3>
				
				<hr />
				
				<div class="p-3 mb-2 bg-success text-white"><s:actionmessage/></div>
				
				<div  class="col-md-6">
				<s:form namespace="/patient-report-pathology" action="save" method="post" enctype="multipart/form-data">

					<s:hidden name="patientId" value="%{patient.id}"></s:hidden>
					
					<div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-4 col-sm-12 col-xs-6">
									<label for="name">Accession Nunmber:</label>
								</div>
								
								<div class="col-md-6 col-sm-4 col-xs-12">
									<s:textfield required="required" title="Name" type="text" 
									cssClass="form-control" id="name" name="patientReportPathology.accessionNumber" placeholder="" maxlength="15"/>
								</div>
								
							</div>
						</div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-4 col-sm-12 col-xs-6">
									<label for="name">PR Nunmber:</label>
								</div>
								
								<div class="col-md-6 col-sm-4 col-xs-12">
									<s:textfield required="required" title="Name" type="text" 
									cssClass="form-control" id="name" name="patientReportPathology.prNumber" placeholder="" maxlength="15"/>
								</div>
								
							</div>
						</div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-4 col-sm-12 col-xs-6">
									<label for="name">Report Date:</label>
								</div>
								
								<div class="col-md-6 col-sm-4 col-xs-12">
 									<input type="date" class="form-control" id="bday"
										name="patientReportPathology.reportDateString" value="<s:property value='%{patientReportPathology.reportDateString}' />">
								</div>
								
							</div>
						</div>						


						<div class="form-group">
							<div class="row">
								
								<div class="col-md-4 col-sm-12 col-xs-6">
									<label for="name">Verified By:</label>
								</div>
								
								<div class="col-md-6 col-sm-4 col-xs-12">
									<s:textfield required="required" type="text" 
									cssClass="form-control" id="verifiedBy" name="patientReportPathology.verifiedBy" placeholder="" maxlength="15"/>
								</div>
								
							</div>
						</div>

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-4 col-sm-12 col-xs-6">
									<label for="name">Notes:</label>
								</div>
								
								<div class="col-md-6 col-sm-4 col-xs-12">
									<s:textfield required="required" type="text" 
									cssClass="form-control" id="name" name="patientReportPathology.note" placeholder="" maxlength="100"/>
								</div>
								
							</div>
						</div>

 						<div class="form-group">
							<div class="row">
								
								<div class="col-md-4 col-sm-12 col-xs-6">
									<label for="name">file:</label>
								</div>
								
 								<div class="col-md-6 col-sm-4 col-xs-12">
										<s:file type="file" id="fileUploading" name="upload" accept=".pdf, .png, .jpg, .jpeg" cssClass="form-control" label="Select a File to upload" size="20000" />
								</div>
								
							</div>
						</div> 

<%-- file size validation	 --%>		
	<script>
		
		//binds to onchange event of your input field
		$('#fileUploading').bind('change', function() {
	
			//this.files[0].size gets the size of your file.
			
			if(this.files[0].size > 3145728){
				filesize = (this.files[0].size)/1048576;
				alert("file size " + filesize.toFixed(2)+" MB " + "is too large to upload! " + "\nImage should be less than 3 MB.");	
				$('#fileUploading').val("");
			}
	
			
		});
	
		
	</script>

						<br>
						<div class="form-group">
							<div class="row">
								<div class="col-md-4 col-sm-4 col-xs-12"></div>
								<s:if test="patientReportPathology.id != null && !patientReportPathology.id.empty">
									<div class="col-md-3 col-sm-4 col-xs-12">
										<s:submit cssClass="btn btn-warning" value="Update"></s:submit>
									</div>
								</s:if>
								<s:else>
									<div class="col-md-4 col-sm-4 col-xs-12">
										<s:submit cssClass="btn btn-success" value="Insert"></s:submit>
									</div>
								</s:else>							
							</div>
						</div>

					</div>

				</s:form>


			</div>

			<div  class="col-md-6">
				<s:include value="/WEB-INF/content/patient/PathologyReport/report-list.jsp"></s:include>
			</div>
			<!-- /page content -->
				
		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
