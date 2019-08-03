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

<script type="text/javascript">
function myFunction() {
    var x = document.getElementById("divHideID");
  
    if (x.style.display == "none") {
        x.style.display = "block";
    } else {
        x.style.display = "none";
    }
    
    
}
</script>
</head>

<body class="nav-md">
	<div class="container body">

		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col" role="main">

				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>


				<h4>REQUEST FOR BIOPSY</h4>

				<hr />

				<div class="col-md-10">

					<div class="p-3 mb-2 bg-success text-white">
						<s:actionmessage />
					</div>

					<s:form namespace="/patient-request-biopsy" action="save"
						method="post">


						<div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Patient Serial Number:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield required="required" title="Name" type="text"
											cssClass="form-control" name="patientRequestBiopsy.patientSerialNumber"
											placeholder="Scan barcode or type" maxlength="8" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Date of surgery:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<input type="date" class="form-control" id="surgerydate"
											name="patientRequestBiopsy.dateOfSurgeryString"
											value="<s:property value='%{patientRequestBiopsy.dateOfSurgeryString}' />">

									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="row"></div>
							</div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Clinic:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield type="text" cssClass="form-control"
											name="patientRequestBiopsy.clinic" maxlength="120"
											placeholder="" />
									</div>
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Clinician:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield type="text" cssClass="form-control"
											name="patientRequestBiopsy.clinician" maxlength="120"
											placeholder="" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Type of biopsy:</label>
									</div>
									 <div class="col-md-4 col-sm-12 col-xs-12">
										 <s:checkboxlist label="Type of biopsy" list="biopsyTypes"
											 name="patientRequestBiopsy.typeOfBiopsy" value="defaultBiopsyType" /> 
									</div> 

								</div>

								<div class="row">
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Site of Biopsy:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield type="text" cssClass="form-control"
											name="patientRequestBiopsy.siteOfBiopsy" maxlength="120"
											placeholder="" />
									</div>
								</div>
								<hr>
							</div>

							<!-- checkbox act to hide previous result input -->

							<div class="form-group">
								<div class="checkbox">
								  <label><input type="checkbox" value="false" id="infoHide_check" onclick="myFunction()" >Add previous biopsy info</label>
								</div>
							</div>


							<div class="form-group" id="divHideID" 
								style="display: none;background-color: rgb(235, 235, 224);">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Diagnosis:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield type="text" cssClass="form-control"
											name="patientRequestBiopsy.previousBiopsyDiagnosis" maxlength="125"
											placeholder="" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Path number:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield type="text" cssClass="form-control"
											name="patientRequestBiopsy.previousBiopsyPathNumber" maxlength="125"
											placeholder="" />
									</div>


								</div>

								<div class="row">
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Type of biopsy:</label>
									</div>
									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:checkboxlist label="Type of biopsy" list="biopsyTypes"
											name="patientRequestBiopsy.previousBiopsyType" value="defaultBiopsyType" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Site of Biopsy:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield type="text" cssClass="form-control"
											name="patientRequestBiopsy.previousBiopsySite" maxlength="125"
											placeholder="" />
									</div>

								</div>

								<div class="row"></div>
							</div>
							<hr>

						</div>

						<div class="form-group">

							<div class="row">
								<!-- 						added two columns for better view of form -->
								<div class="col-md-6">
									<div class="form-group">
										<div class="row">

											<div class="col-md-2 col-sm-12 col-xs-6">
												<label for="name">Duration:</label>
											</div>

											<div class="col-md-4 col-sm-12 col-xs-12">
												<s:textfield type="text" cssClass="form-control"
													name="patientRequestBiopsy.duration" maxlength="125"
													placeholder="" />
											</div>
											<div class="col-md-2 col-sm-12 col-xs-6">
												<label for="name">Site of lesion:</label>
											</div>

											<div class="col-md-4 col-sm-12 col-xs-12">
												<s:textfield type="text" cssClass="form-control"
													name="patientRequestBiopsy.siteOfLession" />
											</div>
										</div>

										<div class="row">
											<div class="col-md-2 col-sm-12 col-xs-6">
												<label for="name">Type of lesion:</label>
											</div>
											<div class="col-md-8 col-sm-12 col-xs-12">
												 <s:checkboxlist label="Type of biopsy" list="lesionTypes"
													 name="patientRequestBiopsy.typeOfLession"  value="defaultBiopsyType" />
											</div> 
										</div>
									</div>

								</div>
								<div class="col-md-6">

									<div class="form-group">
										<div class="row">

											<h5>Description of lesion/s</h5>

											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:textfield title="Size" type="text"
													cssClass="form-control" id="size"
													name="patientRequestBiopsy.sizeOfLession"
													placeholder="Size" style="text-transform:capitalize" />
											</div>
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:textfield title="Color" type="text"
													cssClass="form-control" id="color"
													name="patientRequestBiopsy.colorOfLession"
													placeholder="Color" style="text-transform:capitalize" />
											</div>
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:textfield title="Shape" type="text"
													cssClass="form-control" id="shape"
													name="patientRequestBiopsy.shapeOfLession"
													placeholder="shape" style="text-transform:capitalize" />
											</div>
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:textfield title="Consistency" type="text"
													cssClass="form-control" id="Consistency"
													name="patientRequestBiopsy.consistencyOfLession"
													placeholder="Consistency" style="text-transform:capitalize" />
											</div>
										</div>
									</div>


									<div class="form-group">
										<div class="row">

											<div class="col-md-6 col-sm-12 col-xs-12">
												<s:textfield type="text" placeholder="Clinical impression"
													cssClass="form-control"
													name="patientRequestBiopsy.clinicalImpression" />
											</div>

											<div class="col-md-6 col-sm-12 col-xs-12">
												<s:textfield type="text"
													placeholder="Radiological findings"
													cssClass="form-control"
													name="patientRequestBiopsy.radiologicalFinding" />
											</div>
										</div>
									</div>


								</div>
							</div>



						</div>


						<hr>
						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-4 col-xs-12"></div>
								<s:if
									test="patientRequestBiopsy.id != null && !patientRequestBiopsy.id.empty">
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
							-
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
</body>
</html>
