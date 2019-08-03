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
			<s:include
				value="/WEB-INF/content/patient/diagnostic/common/top-bar.jsp"></s:include>
			<div class="right_col" role="main" id="full">
				<div class="row">

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">

								<span class="col-md-6 col-sm-6"> Complaint </span> <span>

									<s:url var="addDiagnostic" namespace="/patient-complaint"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info btn-sm">edit</s:a>

								</span>

							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaint!=''">
									<div class="form-group">
										<div class="row">

											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:label>Complaint:</s:label>
											</div>



											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaint}" />
											</div>
										</div>
									</div>

								</s:if>


								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<s:label>Type:</s:label>
										</div>

										<div class="col-md-4 col-sm-6 col-xs-12">
											<s:property
												value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaintType}" />
										</div>
									</div>
								</div>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaintHistory!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:label>History of presenting complaint:</s:label>
											</div>


											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaintHistory}" />
											</div>
										</div>
									</div>

								</s:if>

							</div>
						</div>

					</div>

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">

						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Dental History</span> <span>
									<s:url var="addDiagnostic" namespace="/patient-dental-history"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info btn-sm">edit</s:a>
								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.extraction!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Extraction:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.extraction}" />
											</div>
										</div>
									</div>



									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Extraction Complications:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.extractionComplications}" />
											</div>
										</div>
									</div>

									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Extraction Complications Type:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.extractionComplicationsType}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.oralSurgery!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other minor/major oral surgery:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.oralSurgery}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRx!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Periodontal Rx:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRx}" />
											</div>
										</div>
									</div>

									<s:if
										test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxScaling=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxRootdebriment=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxSurgical=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxMaintenance=='true'">
										<div class="form-group">
											<div class="row">
												<div class="col-lg-12">
													<s:label>
														<strong>Periodontal Rx Type:</strong>
													</s:label>
												</div>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxScaling=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Scsling</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxRootdebriment=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Root debriment</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxSurgical=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Surgical Perio Rx</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.periodontalRxMaintenance=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Maintenance Care</s:label>
													</div>
												</s:if>
											</div>
										</div>
									</s:if>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatment!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Orthodontic Treatment:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatment}" />
											</div>
										</div>
									</div>

									<s:if
										test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatmentFixed=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatmentRemovable=='true' || #session.PATIENT_DIAGNOSTIC.orthodonticTreatmentFunctional=='true'">
										<div class="form-group">
											<div class="row">
												<div class="col-lg-12">
													<s:label>
														<strong>Orthodontic Treatment Type:</strong>
													</s:label>
												</div>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatmentFixed=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Fixed</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatmentRemovable=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Removable</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatmentRemovable=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Functional</s:label>
													</div>
												</s:if>
											</div>
										</div>
									</s:if>

									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Orthodontic Treatment Complications:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.orthodonticTreatmentComplications}" />
											</div>
										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRx!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Restorative Rx/Prosthesis :</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRx}" />
											</div>
										</div>
									</div>

									<s:if
										test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxEndodontics=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxFixedprosthesis=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxRemovableprosthesis=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxRestorations=='true'">
										<div class="form-group">
											<div class="row">
												<div class="col-lg-12">
													<s:label>
														<strong>Periodontal Rx Type:</strong>
													</s:label>
												</div>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxEndodontics=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Endodontics</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxFixedprosthesis=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Fixed Prosthesis</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxRemovableprosthesis=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Removable Prosthesis</s:label>
													</div>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxRestorations=='true'">
													<div class="col-lg-10 col-lg-offset-2">
														<s:label>Restorations</s:label>
													</div>
												</s:if>
											</div>
										</div>
									</s:if>

									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Restorative Rx/Prosthesis Complications :</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.restorativeRxComplications}" />
											</div>
										</div>
									</div>
								</s:if>

							</div>
						</div>

					</div>

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Medical Record(Allergies)</span>
								<span> <s:url var="addDiagnostic"
										namespace="/patient-medical-record1" action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info btn-sm">edit</s:a>
								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.anaemia!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Anaemia:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.anaemia}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.asthma!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Asthma:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.asthma}" />
											</div>
										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugPenicillin=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugParacetamol=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugNsaids=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Drug Allergies:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugPenicillin=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Penicillin/Amoxicillin</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugParacetamol=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Paracetamol</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugNsaids=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>NSAIDS</s:label>
												</div>
											</s:if>

										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugOther!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:label>Other Drug Allergies:</s:label>
											</div>

											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.drugOther}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodPineapple || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodTomatoe=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodCannedfish=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Food Allergies:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodPineapple=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Pineapple</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodTomatoe=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Tomatoe</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodCannedfish=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Canned Fish</s:label>
												</div>
											</s:if>

										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodOther!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Food Allergies:</label>
											</div>

											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.foodOther}" />
											</div>
										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.latexRubber!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Latex/Rubber:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.latexRubber}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.allergiesOther!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Allergies:</label>
											</div>

											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.allergiesOther}" />
											</div>
										</div>
									</div>
								</s:if>

							</div>
						</div>

					</div>
				</div>

				<div class="row">

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Medical Record(B-E)</span> <span>
									<s:url var="addDiagnostic" namespace="/patient-medical-record2"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info btn-sm">edit</s:a>
								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.heamophilia=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-3">
												<s:label>
													<strong>Haemophilia:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.heamophilia=='true'">
												<div class="col-lg-3">
													<s:label>Yes</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.bleedingDisordersOther!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Bleeding disorders:</label>
											</div>

											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.bleedingDisordersOther}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersAngina=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersValvular=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersCarditis=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Cardiac disorders:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersAngina=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Angina</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersValvular=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Valvular problems</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersCarditis=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Rheumatic carditis</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersAngina=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Angina Comments:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.anginaOther}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersValvular=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Valvular Problems Comments:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.valvularOther}" />
											</div>
										</div>
									</div>

									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Indication of SABE prohylaxis:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.sabeProphylaxis}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersCarditis=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Regular Oral penicillin:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.oralPenicillin}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.prostheticHeartValve!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Prosthetic heart valve:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.prostheticHeartValve}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.pacemaker!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Pacemaker:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.pacemaker}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersOther!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Cardiac disorders:</label>
											</div>

											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.cardiacDisordersOther}" />
											</div>
										</div>
									</div>

								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.developmentalCleftlip=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.developmentalCerebral=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.developmentalSyndromic=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Developmental disorders:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.developmentalCleftlip=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Cleft Lip/Palate</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.developmentalCerebral=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Cerebral Palsy</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.developmentalSyndromic=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Syndromic</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.endocrineDiabetes=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-3">
												<s:label>
													<strong>Diabetes:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.endocrineDiabetes=='true'">
												<div class="col-lg-3">
													<s:label>Yes</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.endocrineOther=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Endocrine disorders:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.endocrineOtherComments}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.epilepsy!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Epilepsy:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.epilepsy}" />
											</div>
										</div>
									</div>
								</s:if>
							</div>
						</div>
					</div>

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Medical Record(G-N)</span> <span>

									<s:url var="addDiagnostic" namespace="/patient-medical-record3"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info btn-sm">edit</s:a>

								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.gastroIntestinalUlcers=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.gastroIntestinalGastricreflux=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Gastro-intestinal disorders:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.gastroIntestinalUlcers=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Ulcers</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.gastroIntestinalGastricreflux=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Gastric reflux</s:label>
												</div>
											</s:if>

										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.gastroIntestinalOther=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Gastro-intestinal disorders:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.gastroIntestinalOtherComments}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisA=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisB=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisC=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Hepatitis:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisA=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Hep A</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisB=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Hep B</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisC=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Hep C</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisOther=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Hepatitis Other:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hepatitisOtherComments}" />
											</div>
										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hiv=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-3">
												<s:label>
													<strong>HIV:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hiv=='true'">
												<div class="col-lg-3">
													<s:label>Yes</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hypertension">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-3">
												<s:label>
													<strong>Hypertension:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.hypertension=='true'">
												<div class="col-lg-3">
													<s:label>Yes</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.liverDisorders=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-3">
												<s:label>
													<strong>Liver disorders:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.liverDisorders=='true'">
												<div class="col-lg-3">
													<s:label>Yes</s:label>
												</div>
											</s:if>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.musculoSkeletalArthritis=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.musculoSkeletalJointreplacement=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Musculo-skeletal disorders:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.musculoSkeletalArthritis=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Arthrtis</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.musculoSkeletalJointreplacement=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Joint replacement</s:label>
												</div>
											</s:if>

										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.musculoSkeletalOther=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Musculo-skeletal disorders:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.musculoSkeletalOtherComments}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.neurologicalDisordersMigraine=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.neurologicalDisordersNeuralgic=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Neurological disorders:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.neurologicalDisordersMigraine=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Migraine</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.neurologicalDisordersNeuralgic=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Neuralgic Pain</s:label>
												</div>
											</s:if>

										</div>
									</div>
								</s:if>

							</div>
						</div>
					</div>

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Medical Record(P-T)</span> <span>
									<s:url var="addDiagnostic" namespace="/patient-medical-record4"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info btn-sm">edit</s:a>

								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.onHormonalContraceptives!='none'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>On hormonal contraceptives:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.onHormonalContraceptives}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.pregnancy!='none'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Pregnancy:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.pregnancy}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.behaviouralDisorders!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Psychiatric/Behavioural disorders:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.behaviouralDisorders}" />
											</div>
										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.tmd!='No'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>TMD:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.tmd}" />
											</div>
										</div>
									</div>


									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>TMD Comments:</label>
											</div>
											<div class="col-md-4 col-sm-6 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.tmdOther}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersChronicinfections=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersKidneyfailure=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersTransplant=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Renal disorders:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersChronicinfections=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Chronic infections</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersKidneyfailure=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Kidney failure</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersTransplant=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Transplant</s:label>
												</div>
											</s:if>

										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersOther!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other Renal Disorders:</label>
											</div>

											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.renalDisordersOther}" />
											</div>
										</div>
									</div>

								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.otherComments==''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:label>Comments:</s:label>
											</div>

											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.otherComments}" />
											</div>
										</div>
									</div>
								</s:if>

							</div>
						</div>
					</div>
				</div>


				<div class="row">

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Drug History(Phase1)</span> <span>
									<s:url var="addDiagnostic" namespace="/patient-drug-history"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info">edit</s:a>
								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarin=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrel=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirin=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOther=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Anticoagulant Details:</strong>
												</s:label>


												<table class="table table-striped">
													<thead>
														<tr>
															<th>Name</th>
															<th>Dose</th>
															<th>Frequency</th>
															<th>Duration</th>
														</tr>
													</thead>
													<tbody>
														<tr>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarin=='true'">
																	<s:label>Warfarin</s:label>
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarin=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarinDose}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarin=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarinFrequency}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarin=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantWarfarinDuration}" />
																</s:if></td>
														</tr>
														<tr>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrel=='true'">
																	<s:label>Clopidogrel</s:label>
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrel=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrelDose}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrel=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrelFrequency}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrel=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantClopidogrelDuration}" />
																</s:if></td>

														</tr>
														<tr>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirin=='true'">
																	<s:label>Aspirin</s:label>
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirin=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirinDose}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirin=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirinFrequency}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirin=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantAspirinDuration}" />
																</s:if></td>
														</tr>
														<tr>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOther=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOtherDetail}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOther=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOtherDose}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOther=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOtherFrequency}" />
																</s:if></td>
															<td><s:if
																	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOther=='true'">
																	<s:property
																		value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.anticoagulantOtherDuration}" />
																</s:if></td>
														</tr>
													</tbody>
												</table>
											</div>

										</div>
										<div class="row">
											<div class="col-lg-12">

												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.radiationtherapy=='true'">
													<div class="form-group">
														<div class="row">
															<div class="col-lg-6">

																<strong><s:label>Radiation therapy duration:</s:label></strong>


															</div>
															<div class="col-lg-6">



																<s:property
																	value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.radiationtherapyDuration}" />

															</div>
														</div>
													</div>
												</s:if>
											</div>
											<div class="col-lg-12">

												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.comments!=''">
													<div class="form-group">
														<div class="row">
															<div class="col-lg-4">

																<strong><s:label>Comments:</s:label></strong>


															</div>
															<div class="col-lg-8">



																<s:property
																	value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.comments}" />

															</div>
														</div>
													</div>
												</s:if>
											</div>
										</div>




									</div>

								</s:if>


							</div>
						</div>
					</div>


					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Drug History(Phase2)</span> <span>
									<s:url var="addDiagnostic" namespace="/patient-drug-history"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info">edit</s:a>
								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<table class="table">
									<thead>
										<tr>
											<th>Category Name</th>
											<th>DrugName</th>
											<th>Dose</th>
											<th>Frequency</th>
											<th>Duration</th>
										</tr>
									</thead>


									<tbody>
										<s:iterator
											value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.drugs}"
											status="rowNumber">
											<tr>
												<td><s:property value="categoryName" /></td>
												<td><s:property value="categoryDrugName" /></td>
												<td><s:property value="categoryDrugDose" /></td>
												<td><s:property value="categoryDrugFrequency" /></td>
												<td><s:property value="categoryDrugDuration" /></td>
											</tr>
										</s:iterator>
									</tbody>
								</table>

							</div>
						</div>
					</div>



					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Investigations</span> <span>
									<s:url var="addDiagnostic" namespace="/patient-investigations"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info">edit</s:a>

								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.bloodPresure!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">

												<strong><s:label>Blood Pressure:</s:label></strong>


											</div>
											<div class="col-lg-6">



												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.bloodPresure}" />

											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.bloodPresureDate!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">

												<strong><s:label>Blood pressure tested date:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.bloodPresureDate}" />

											</div>
										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalBt!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>Bleeding Time:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalBt}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalCt!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>Clotting Time:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalCt}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalHba1c!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>HBA1C:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalHba1c}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalInr!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>INR:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalInr}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalFbs!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>FBS:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalFbs}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalFbc!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>FBC:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalFbc}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalSgpt!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>SGPT:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalSgpt}" />
											</div>
										</div>
									</div>
								</s:if>
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalHb!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>Hb:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalHb}" />
											</div>
										</div>
									</div>
								</s:if>
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalRbs!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>Rbs:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalRbs}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalDate!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>Haemotological tested date:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalDate}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalComments!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-6">
												<strong><s:label>Comments:</s:label></strong>
											</div>
											<div class="col-lg-6">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.haematologicalComments}" />
											</div>
										</div>
									</div>
								</s:if>


							</div>

						</div>



					</div>
				</div>

				<div class="row">

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12"></div>
				</div>

				<div class="row">
					<div class="col-lg-4">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Habits1</span> <span> <s:url
										var="addDiagnostic" namespace="/patient-habits1"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info">edit</s:a>
								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsBetel=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsLime=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsTobacco=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsArecaProducts=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsArecanut=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsTobaccoProducts=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Betel Quid Ingredients:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsBetel=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Betel</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsLime=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Lime</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsTobacco=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Tobacco</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsArecaProducts=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Commercial areca products</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsArecanut=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Arecanut</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsTobaccoProducts=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>Commercial tobacco products</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsOther!=''">
												<div class="col-lg-10 col-lg-offset-2">
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsOther}" />
												</div>
											</s:if>
											<br>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidFrequency!=''">
												<div class="col-lg-10 col-lg-offset-1">
													<s:label>
														<i>Frequency:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidFrequency}" />
												</div>

											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidDuration!=''">
												<div class="col-lg-10 col-lg-offset-1">
													<s:label>
														<i>Duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidDuration}" />
												</div>

											</s:if>
										</div>
									</div>

								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smoking=='Yes'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Smoking details:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarettes=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Cigarettes:</s:label>
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Frequency:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarettesFrequency}" />
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarettesDuration}" />
												</div>

											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigar=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Cigar:</s:label>
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Frequency:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarFrequency}" />
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarDuration}" />
												</div>

											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingBeedi=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Beedi:</s:label>
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Frequency:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingBeediFrequency}" />
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingBeediDuration}" />
												</div>

											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingPipe=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Pipe:</s:label>
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Frequency:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingPipeFrequency}" />
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingPipeDuration}" />
												</div>

											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarettes=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Roll up:</s:label>
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Frequency:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingRollupFrequency}" />
												</div>
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingRollupDuration}" />
												</div>

											</s:if>


										</div>
									</div>
								</s:if>


							</div>
						</div>
					</div>

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Habits2</span> <span> <s:url
										var="addDiagnostic" namespace="/patient-habits2"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#addDiagnostic}" cssClass="btn btn-info">edit</s:a>
								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcohol=='Regular Drinker' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcohol=='Frequent Drinker' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcohol=='Occasional Drinker'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Alcohol details</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholSpirits=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Spirits:</s:label>
													<i>Duration:</i>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholSpiritsDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholWine=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Wine:</s:label>
													<i>Duration:</i>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholWineDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholBeer=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Beer:</s:label>
													<i>Duration:</i>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholBeerDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholLocal=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Local brews:</s:label>
													<i>Duration:</i>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholLocalDuration}" />
												</div>
											</s:if>

										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBruxism=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalClenching=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNailLipBiting=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBitingObjects=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalChewing=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveSucking=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-lg-12">
												<s:label>
													<strong>Parafunctional habits:</strong>
												</s:label>
											</div>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBruxism=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Bruxism duration:</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBruxismDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalClenching=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Clenching duration:</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalClenchingDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNailLipBiting=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Lip/finger nail biting duration:</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNailLipBitingDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBitingObjects=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Objects biting duration:</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBitingObjectsDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalChewing=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>Unilateral chewing duration:</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalChewingDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveSucking=='true'">
												<div class="col-lg-11 col-lg-offset-1">
													<s:label>
														<strong>Non nutrive sucking details:</strong>
													</s:label>
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveFingerSucking=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Finger sucking duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveFingerSuckingDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveThumbSucking=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Thumb sucking duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveThumbSuckingDuration}" />
												</div>
											</s:if>
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveDummySucking=='true'">
												<div class="col-lg-10 col-lg-offset-2">
													<s:label>
														<i>Dummy sucking duration:</i>
													</s:label>
													<s:property
														value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveDummySuckingDuration}" />
												</div>
											</s:if>

										</div>
									</div>

								</s:if>

							</div>
						</div>
					</div>

					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading" style="height: 50px">
								<span class="col-md-6 col-sm-6">Brushing Habits</span> <span>
									<s:url var="brushingHabits" namespace="/brushing-habits"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#brushingHabits}" cssClass="btn btn-info">edit</s:a>
								</span>

							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">
								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<label>Tooth brushing tool:</label>
										</div>
										<div class="col-md-3 col-sm-4 col-xs-12">
											<s:property
												value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.brushingTool}" />
										</div>
										<s:if
											test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.brushingToolOther!=''">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Brushing tool other:</label>
											</div>
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.brushingToolOther}" />
											</div>
										</s:if>
									</div>
								</div>



								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<label>Toothpaste:</label>
										</div>
										<div class="col-md-3 col-sm-6 col-xs-12">
											<s:property
												value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.toothpaste}" />
										</div>
										<s:if
											test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.toothpasteOther!=''">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Toothpaste other:</label>
											</div>
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.toothpasteOther}" />
											</div>
										</s:if>
									</div>
								</div>

								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<label>Brushing frequency:</label>
										</div>
										<div class="col-md-4 col-sm-4 col-xs-12">
											<s:property
												value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.brushingFrequency}" />
										</div>
									</div>
								</div>

								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<label>Bristles:</label>
										</div>
										<div class="col-md-4 col-sm-4 col-xs-12">
											<s:property
												value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.bristles}" />
										</div>
									</div>
								</div>

								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<label>Duration of Brushing:</label>
										</div>
										<div class="col-md-4 col-sm-4 col-xs-12">
											<s:property
												value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.brushingDuration}" />
										</div>
									</div>
								</div>

								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<label>Supplementary cleaning aids:</label>
										</div>
										<div class="col-md-6 col-sm-6 col-xs-12">
											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementNone=='true'">
												<s:label>None</s:label>
												<br>
											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementFloss=='true'">
												<s:label>Floss</s:label>
												<br>
											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementBottleBrushes=='true'">
												<s:label>Bottle brushes</s:label>
												<br>
											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementSingleTuft=='true'">
												<s:label>Single tufted TB</s:label>
												<br>
											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementWoodpicks=='true'">
												<s:label>Wood picks</s:label>
												<br>
											</s:if>

											<s:if
												test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementIrrigators=='true'">
												<s:label>Irrigators</s:label>
												<br>
											</s:if>


										</div>
									</div>
								</div>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementOther!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other supplementary cleaning aids:</label>
											</div>
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.supplementOther}" />
											</div>
										</div>
									</div>
								</s:if>
							</div>

						</div>
					</div>
				</div>

				<div class="row">
					<div class="col-lg-4 col-md-12 col-sm-12 col-xs-12">
						<div class="panel panel-success">
							<div class="panel-heading">
								<span class="col-md-6 col-sm-6">Dietary Habits</span> <span>

									<s:url var="dietaryHabits" namespace="/dietary-habits"
										action="form.html">
										<s:param name="patientId" value="%{patient.id}"></s:param>
									</s:url> <s:a href="%{#dietaryHabits}" cssClass="btn btn-info">edit</s:a>

								</span>
							</div>
							<div class="panel-body" style="overflow-x: scroll; height: 300px">

								<div class="form-group">
									<div class="row">
										<div class="col-md-3 col-sm-4 col-xs-12">
											<label>Sugar Consumption:</label>
										</div>
										<div class="col-md-3 col-sm-4 col-xs-12">
											<s:property
												value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.sugarConsumption}" />
										</div>
									</div>
								</div>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.beverageFruit=='true' || #session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.beverageCarbonic=='true'">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Consumption of beverages:</label>
											</div>
											<div class="col-md-3 col-sm-4 col-xs-12">
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.beverageCarbonic=='true'">
													<s:label>Carbonic beaverages</s:label>
													<br>
												</s:if>
												<s:if
													test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.beverageFruit=='true'">
													<s:label>Fruit juice</s:label>
												</s:if>

											</div>
										</div>
									</div>
								</s:if>


								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.other!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Other:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.other}" />
											</div>
										</div>
									</div>
								</s:if>

								<s:if
									test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.employment!=''">
									<div class="form-group">
										<div class="row">
											<div class="col-md-3 col-sm-4 col-xs-12">
												<label>Employment:</label>
											</div>
											<div class="col-md-4 col-sm-4 col-xs-12">
												<s:property
													value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.employment}" />
											</div>
										</div>
									</div>
								</s:if>



							</div>

						</div>
					</div>

					<div class="row">
						<div class="col-md-3 col-md-12 col-sm-12 col-xs-12">


							<s:if
								test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaint != null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.status != 3">
								<s:url var="saveDiagnosticRecords"
									namespace="/patient-diagnostic" action="save-all">
									<s:param name="commonId" value="id"></s:param>
									</s:url>

								<s:a href="%{#saveDiagnosticRecords}"
									cssClass="btn btn-success btn-md">Save All</s:a>
							</s:if>
							<s:if
								test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.complaint != null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.status == 3">
								<s:url var="saveDiagnosticRecords"
									namespace="/patient-diagnostic" action="save-all"></s:url>

								<s:a href="%{#saveDiagnosticRecords}"
									cssClass="btn btn-danger btn-md">Resubmit</s:a>
							</s:if>
						</div>
					</div>
				</div>
			</div>
		</div>
		<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
		<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	</div>
</body>
</html>