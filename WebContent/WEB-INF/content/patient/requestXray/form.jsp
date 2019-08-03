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


				<h4>REQUEST FOR X-RAY DIAGNOSTIC EXAMINATION</h4>

				<hr />

				<div class="col-md-8">

					<div class="p-3 mb-2 bg-success text-white">
						<s:actionmessage />
					</div>

					<s:form namespace="/patient-request-xray" action="save"
						method="post">

						<%-- <s:hidden name="patientId" value="%{patient.id}"></s:hidden> --%>

						<div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">PATIENT SERIAL NUMBER:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield required="required" title="Name" type="text"
											cssClass="form-control" name="patientRequestXray.patientId"
											placeholder="Scan barcode or type" maxlength="8" 
											value="%{patientRequestXray.patientId}"
											/>
									</div>
									

									
									

								</div>
							</div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Clinical history:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield title="Name" type="text" cssClass="form-control" name="patientRequestXray.clinicalHistory" maxlength="250" placeholder="" />
									</div>
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">IOPA:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:select title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.iopa" list="#{'URGENT':'URGENT','EARLY':'EARLY','ROUTINE':'ROUTINE'}" placeholder="" />


											
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">BITEWING:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.bitewing" maxlength="125" placeholder="" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">OCCLUSAL VIEWS:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:select title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.occlusalView" list="#{'':'','UPPER':'UPPER','LOWER':'LOWER'}" placeholder="" />
																						
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">OPG - Digital:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">							
										<s:checkbox name="patientRequestXray.opg"
											fieldValue="true" value="false" label="Check Me for testing" />	
									</div>

								</div>
							</div>



							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">SIALOGRAM:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:checkbox name="patientRequestXray.sialogram"
											fieldValue="true" value="false" label="Check Me for testing" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">CEPHALOGRAM:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:checkbox name="patientRequestXray.cephalogram"
											fieldValue="true" value="false" label="Check Me for testing" />
									</div>

								</div>
							</div>


							<div class="form-group">
								<div class="row">
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">TMJ VIEW:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:checkbox name="patientRequestXray.tmjView"
											fieldValue="true" value="false" label="Check Me for testing" />
										<%-- <s:select title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.tmjView" list="{'','Transcranial','Transpharyngeal','Tomographic view'}" /> --%>	
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">OM VIEW:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:checkbox name="patientRequestXray.omViewOfSkull"
											fieldValue="true" value="false" label="Check Me for testing" />
									</div>

								</div>
							</div>


							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">MANDIBULAR VIEW:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
<%-- 										<s:textfield title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.mandibularView" maxlength="125" placeholder="" /> --%>
										<s:select title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.mandibularView" list="{'','PA Mandible','Leteral Oblique R/S','Leteral Oblique L/S'}" /> 
									</div>

								</div>
							</div>
							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">SKULL VIEW:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.skullView" maxlength="125" placeholder="" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">REVERSE TOWNS:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:checkbox name="patientRequestXray.reverseTowns"
											fieldValue="true" value="false" label="Check Me for testing" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">CHEST XRAY:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield title="Name" type="text" cssClass="form-control" name="patientRequestXray.chestXray" maxlength="125" placeholder="" />
									</div>

								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">C-SPINE / NECK:</label>
								</div>
								
								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:checkbox name="patientRequestXray.cspineneck"
											fieldValue="true" value="false" />
								</div>

								</div>
							</div>

							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">CBCT:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.cbct" maxlength="125" placeholder="" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">USS:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.uss" maxlength="125" placeholder="" />
									</div>
								</div>
							</div>

							<div class="form-group">
								<div class="row">
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Others:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield title="Name" type="text" cssClass="form-control"
											name="patientRequestXray.comment" maxlength="125" placeholder="" />
									</div>								
								</div>
							</div>	


							<div class="form-group">
								<div class="row">

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Department/ Division* :</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield required="required" title="Name" type="text"
											cssClass="form-control" name="patientRequestXray.department" maxlength="60"
											placeholder="" />
									</div>

									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Requesting Officer* :</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:textfield required="required" title="Name" type="text"
											cssClass="form-control" name="patientRequestXray.officerName" maxlength="60"
											placeholder="" />
									</div>
								</div>
							</div>



							<br>
							<div class="form-group">
								<div class="row">
									<div class="col-md-2 col-sm-4 col-xs-12"></div>
									<s:if
										test="patientRequestXray.id != null && !patientRequestXray.id.empty">
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

				<div class="col-md-4">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<img src='<s:url value="/images/ToothNumberingSystem.png" />'
							style="display: block; margin: 0 auto; width: 100%;"
							alt="Tooth Numbering System" />

					</div>
					
					<div class="col-md-12 col-sm-12 col-xs-12">
						<img src='<s:url value="/images/ToothNumberingSystemFDI2.png" />'
							style="display: block; margin: 0 auto; width: 100%;"
							alt="Tooth Numbering System FDI" />

					</div>

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
