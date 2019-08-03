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


				<h3>Biopsy Request Form </h3>

				<hr />

				<div class="col-md-10">

					<div class="p-3 mb-2 bg-success text-white">
						<s:actionmessage />
					</div>


					<div>

						<div class="form-group">
							<div class="row">

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Patient Serial Number:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%patientRequestBiopsy.patientSerialNumber" />
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Date of surgery:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.dateOfSurgeryString}" />

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
									<s:property value="%{patientRequestBiopsy.clinic}" />
								</div>
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Clinician:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.clinician}" />
								</div>

							</div>

						</div>


						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Type of biopsy:</label>
								</div>
								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.typeOfBiopsy}" />
								</div>
							</div>

						</div>

						<div class="form-group">
							<div class="row">
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Site of Biopsy:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.siteOfBiopsy}" />
								</div>
							</div>
						</div>




						<div class="form-group" id="divHideID"
							style="color: infotext; background-color: rgb(235, 235, 224);">

							<h5 style="color: captiontext;">Previous biopsy report data</h5>

							<div class="row">

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Diagnosis:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property
										value="%{patientRequestBiopsy.previousBiopsyDiagnosis}" />
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Path number:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property
										value="%{patientRequestBiopsy.previousBiopsyPathNumber}" />
								</div>


							</div>

							<div class="row">
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Type of biopsy:</label>
								</div>
								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.previousBiopsyType}" />
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Site of Biopsy:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.previousBiopsySite}" />
								</div>

							</div>

							<div class="row"></div>
						</div>



						<div class="form-group" id=""
							style="display: none; background-color: rgb(235, 235, 224);">
							<div class="row">

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Diagnosis:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property
										value="%{patientRequestBiopsy.previousBiopsyDiagnosis}" />
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Path number:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property
										value="%{patientRequestBiopsy.previousBiopsyPathNumber}" />
								</div>


							</div>

							<div class="row">
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Type of biopsy:</label>
								</div>
								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.previousBiopsyType}" />
								</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Site of Biopsy:</label>
								</div>

								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestBiopsy.previousBiopsySite}" />
								</div>

							</div>

							<div class="row"></div>
						</div>
						<hr>

					</div>

					<div class="form-group">

						<div class="row">

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Duration:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:property value="%{patientRequestBiopsy.duration}" />
									</div>
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Site of lesion:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:property value="%{patientRequestBiopsy.siteOfLession}" />
									</div>
								</div>

								<div class="row">
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Type of lesion:</label>
									</div>
									<div class="col-md-8 col-sm-12 col-xs-12">
										<s:property value="%{patientRequestBiopsy.lesionType}" />
									</div>
								</div>
							</div>


							<div class="form-group">
								<h4>Description of lesion/s</h4>
								<div class="row">

									<div class="col-md-3 col-sm-4 col-xs-12">Size of Lesion:
										<s:property value="%{patientRequestBiopsy.sizeOfLession}" />
									</div>
									<div class="col-md-3 col-sm-4 col-xs-12">Color of Lesion:
										<s:property value="%{patientRequestBiopsy.colorOfLession}" />
									</div>
									<div class="col-md-3 col-sm-4 col-xs-12">Shape of Lesion:
										<s:property value="%{patientRequestBiopsy.shapeOfLession}" />
									</div>
									<div class="col-md-3 col-sm-4 col-xs-12">Consistency of Lesion:
										<s:property	value="%{patientRequestBiopsy.consistencyOfLession}" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-6 col-sm-12 col-xs-12">
									<label for="name">clinical Impressions:</label>
									
										<s:property value="%{patientRequestBiopsy.clinicalImpression}" />
									</div>

								</div>
								
								<div class="row">
									<div class="col-md-6 col-sm-12 col-xs-12">
									<label for="name">Radiological Findings:</label>
									
										<s:property	value="%{patientRequestBiopsy.radiologicalFinding}" />
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
