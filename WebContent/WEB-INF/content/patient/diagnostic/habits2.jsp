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
			<s:include value="/WEB-INF/content/patient/diagnostic/common/sub-bar6.jsp"></s:include>

			<div class="container">
				<div class="row">
					
						<div class="right_col" role="main" id="full">


							<s:actionmessage />
							<s:form namespace="/patient-habits2" action="save" method="post">

								<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>
								<div class="row">
									<div class="col-md-12">
										<s:include
											value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
									</div>
								</div>

								<div class="row">
									
									<div class="col-lg-12 col-xs-12">

										<label for="name">Alcohol</label>
									</div>


									<div class="col-lg-10 col-lg-offset-2 col-xs-12">
										<!-- <input type="radio" value="No"
											name="patientDiagnosticHabits2.alcohol" checked /> None -->
											
										<s:radio name="patientDiagnosticHabits2.alcohol" list="#{'No':'None'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcohol}"/>	

									</div>
									<div class="col-lg-10 col-lg-offset-2 col-xs-12">
										<!-- <input type="radio" value="Regular Drinker"
											name="patientDiagnosticHabits2.alcohol" /> Regular
										drinker(>4 days a week) -->
										<s:radio name="patientDiagnosticHabits2.alcohol" list="#{'Regular Drinker':'Regular drinker(>4 days a week)'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcohol}"/>
									</div>
									<div class="col-lg-10 col-lg-offset-2 col-xs-12">
										<!-- <input type="radio" value="Frequent Drinker"
											name="patientDiagnosticHabits2.alcohol" /> Frequent
										drinker(1-4 days a week) -->
										<s:radio name="patientDiagnosticHabits2.alcohol" list="#{'Frequent Drinker':'Frequent drinker(1-4 days a week)'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcohol}"/>

									</div>
									<div class="col-lg-10 col-lg-offset-2 col-xs-12">
										<!-- <input type="radio" value="Occasional Drinker"
											name="patientDiagnosticHabits2.alcohol" /> Occasional
										drinker(<=3 days a month) -->
										<s:radio name="patientDiagnosticHabits2.alcohol" list="#{'Occasional Drinker':'Occasional drinker(<=3 days a month)'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcohol}"/>
									</div>
									

								</div>
								<div class="row">
									<div class="box5" style="display: none;">
										<div class="col-lg-12 col-xs-11 col-xs-offset-1">
											<s:checkbox name="patientDiagnosticHabits2.alcoholSpirits" id="cbx23" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholSpirits}"/> Spirits
										</div>
										<div class="box23" style="display: none;">
											<div class="col-lg-4 col-xs-10 col-xs-offset-2">
												<s:textfield maxlength="120" placeholder="Duration"
													cssClass="form-control input-sm"
													name="patientDiagnosticHabits2.alcoholSpiritsDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholSpiritsDuration}"/>
											</div>
										</div>
									</div>
									
									<div class="box5" style="display: none;">
										<div class="col-lg-12 col-xs-11 col-xs-offset-1">
											<s:checkbox name="patientDiagnosticHabits2.alcoholWine" id="cbx24" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholWine}" /> Wine
										</div>
										<div class="box24" style="display: none;">
											<div class="col-lg-4 col-xs-10 col-xs-offset-2">
												<s:textfield maxlength="120" placeholder="Duration"
													cssClass="form-control input-sm"
													name="patientDiagnosticHabits2.alcoholWineDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholWineDuration}"/>
											</div>
										</div>
									</div>
									<div class="box5" style="display: none;">
										<div class="col-lg-12 col-xs-11 col-xs-offset-1">
											<s:checkbox name="patientDiagnosticHabits2.alcoholBeer" id="cbx25" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholBeer}"/> Beer
										</div>
										<div class="box25" style="display: none;">
											<div class="col-lg-4 col-xs-10 col-xs-offset-2">
												<s:textfield maxlength="120" placeholder="Duration"
													cssClass="form-control input-sm"
													name="patientDiagnosticHabits2.alcoholBeerDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholBeerDuration}"/>
											</div>
										</div>
									</div>
									
									<div class="box5" style="display: none;">

										<div class="col-lg-12 col-xs-11 col-xs-offset-1">
											<s:checkbox name="patientDiagnosticHabits2.alcoholLocal" id="cbx26" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholLocal}"/> Local Brews
										</div>
										<div class="box26">
											<div class="col-lg-4 col-xs-10 col-xs-offset-2">
												<s:textfield maxlength="120" placeholder="Duration"
													cssClass="form-control input-sm"
													name="patientDiagnosticHabits2.alcoholLocalDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.alcoholLocalDuration}"/>
		
		
											</div>
										</div>	

									</div>

								</div>
								<div class="row">

									
									

								</div>
								<div class="row">

									

									
								</div>

								<%-- <div class="row box5" style="display: none;">
									<div class="col-lg-2 col-lg-offset-2 col-xs-4">
										<label for="name">Frequency</label>
									</div>
									<div class="col-lg-3 col-xs-6">
										<s:textfield type="text" cssClass="form-control input-sm"
											name="patientDiagnosticInvestigation.alcoholFrequency" />

									</div>
								</div> --%>
								<hr>
								<div class="row">
									<div class="col-lg-3 col-xs-12">
										<label for="name">Parafunctional habits</label>
									</div>
									<div class="col-lg-4 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalBruxism" id="cbx15" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBruxism}"/> Bruxism
									</div>
									<div class="box15" style="display: none;">
										<div class="col-lg-3 col-xs-12">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalBruxismDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBruxismDuration}"/>
										</div>
									</div>

								</div>
								<div class="row">

									<div class="col-lg-4 col-lg-offset-3 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalClenching" id="cbx16" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalClenching}"/> Clenching
									</div>
									<div class="box16" style="display: none;">
										<div class="col-lg-3 col-xs-12">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalClenchingDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalClenchingDuration}"/>
										</div>
									</div>

								</div>
								<div class="row">

									<div class="col-lg-4 col-lg-offset-3 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalNailLipBiting" id="cbx17" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNailLipBiting}"/> Lip/finger nail biting
									</div>
									<div class="box17" style="display: none;">
										<div class="col-lg-3 col-xs-12">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalNailLipBitingDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNailLipBitingDuration}"/>
										</div>
									</div>

								</div>
								<div class="row">

									<div class="col-lg-4 col-lg-offset-3 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalBitingObjects" id="cbx18" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBitingObjects}"/> Biting objects
									</div>
									<div class="box18" style="display: none;">
										<div class="col-lg-3 col-xs-12">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalBitingObjectsDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalBitingObjectsDuration}"/>
										</div>
									</div>

								</div>
								<div class="row">

									<div class="col-lg-4 col-lg-offset-3 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalChewing" id="cbx19" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalChewing}"/> Unilateral chewing
									</div>
									<div class="box19" style="display: none;">
										<div class="col-lg-3 col-xs-12">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalChewingDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalChewingDuration}"/>
										</div>
									</div>

								</div>
								<div class="row">

									<div class="col-lg-4 col-lg-offset-3 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalNonNutriveSucking" id="cbx6" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveSucking}"/> Non-nutrive sucking
									</div>


								</div>
								<div class="row box6" style="display: none;">

									<div class="col-lg-2 col-lg-offset-4 col-xs-11 col-xs-offset-1">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalNonNutriveFingerSucking" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveFingerSucking}" id="cbx20" /> Finger Sucking

									</div>
									<div class="box20" style="display: none;">
										<div class="col-lg-3 col-xs-10 col-xs-offset-2">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalNonNutriveFingerSuckingDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveFingerSuckingDuration}"/>

										</div>
									</div>




								</div>
								<div class="row box6" style="display: none;">
									<div class="col-lg-2 col-lg-offset-4 col-xs-11 col-xs-offset-1">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalNonNutriveThumbSucking" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.parafunctionalNonNutriveThumbSucking}" id="cbx21" /> Thumb Sucking

									</div>
									<div class="box21" style="display: none;">
										<div class="col-lg-3 col-xs-10 col-xs-offset-2">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalNonNutriveThumbSuckingDuration" value="%{#session.PATIENT_DIAGNOSTIC.parafunctionalNonNutriveThumbSuckingDuration}" />

										</div>
									</div>


								</div>
								<div class="row box6" style="display: none;">
									<div class="col-lg-2 col-lg-offset-4 col-xs-11 col-xs-offset-1">
										<s:checkbox name="patientDiagnosticHabits2.parafunctionalNonNutriveDummySucking" value="%{#session.PATIENT_DIAGNOSTIC.parafunctionalNonNutriveDummySucking}" id="cbx22" /> Dummy Sucking
									</div>
									<div class="box22" style="display: none;">
										<div class="col-lg-3 col-xs-10 col-xs-offset-2">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits2.parafunctionalNonNutriveDummySuckingDuration" value="%{#session.PATIENT_DIAGNOSTIC.parafunctionalNonNutriveDummySuckingDuration}"/>

										</div>
									</div>
								</div>

								<div class="row">
						<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
							<s:if test="patientDiagnosticHabits2.id != null">
								<s:submit cssClass="btn2" value="Update"></s:submit>
							</s:if>
							<s:else>
								<s:submit cssClass="btn2" value="Submit">
								</s:submit>
							</s:else>
						</div>
					</div>

								<hr>
							</s:form>
							
						</div>





						<!-- /page content -->
						</div>
				
			
					</div>
				</div>
			</div>
		</div>
	

	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

	<script>
		$("#diagnosticMenu6").addClass('active');
	</script>

</body>



</html>
