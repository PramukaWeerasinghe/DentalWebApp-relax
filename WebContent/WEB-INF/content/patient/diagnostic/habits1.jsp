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
			<s:include value="/WEB-INF/content/patient/diagnostic/common/sub-bar5.jsp"></s:include>

					
					<div class="right_col" role="main" id="full">


						<s:actionmessage />
						<s:form namespace="/patient-habits1" action="save" method="post">

							<s:hidden name="patient.id" value="%{patient.id}"></s:hidden>
							<div class="form-group">
								<div class="row">
									<div class="col-md-12">
										<s:include
											value="/WEB-INF/content/patient/diagnostic/common/doctors_comment_area.jsp"></s:include>
									</div>
								</div>
								<div class="row">

									<div class="col-lg-2 col-xs-12">

										<label for="name">Betel quid</label>
									</div>
									<div class="col-lg-2 col-xs-12">
										<label>Ingredients</label>
									</div>
									<div class="col-lg-3 col-xs-12">
										
										<s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredientsBetel" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsBetel}"/>
										Betel
									</div>
									<div class="col-lg-3 col-xs-12">
										<%-- <s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredients" />
										Lime --%>
										<s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredientsLime" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsLime}"/>
										Lime
									</div>


								</div>
							</div>
							<div class="form-group">
								<div class="row">

									<div class="col-lg-3 col-lg-offset-4 col-xs-12">
										<%-- <s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredients" />
										Tobacco --%>
										<s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredientsTobacco" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsTobacco}"/>
										Tobacco
									</div>
									<div class="col-lg-3 col-xs-12">
										<%-- <s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredients" />
										Commercial Areca Products --%>
										<s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredientsArecaProducts" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsArecaProducts}"/>
										Commercial Areca Products
									</div>

								</div>
							</div>
							<div class="form-group">
								<div class="row">

									<div class="col-lg-3 col-lg-offset-4 col-xs-12">
										<s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredientsArecanut" />
										Arecanut
									</div>
									<div class="col-lg-3 col-xs-12">
										<s:checkbox
											name="patientDiagnosticHabits1.betelQuidIngredientsTobaccoProducts" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsTobaccoProducts}"/>
										Commercial Tobacco Products
									</div>

								</div>
							</div>
							<div class="form-group">
								<div class="row">

									<div class="col-lg-3 col-lg-offset-4 col-xs-10 col-xs-offset-2">
										<s:textarea maxlength="120" cssClass="form-control input-sm"
											placeholder="Other products"
											name="patientDiagnosticHabits1.betelQuidIngredientsOther" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidIngredientsOther}"></s:textarea>
									</div>



								</div>
							</div>
							<br>
							<div class="form-group">
								<div class="row">
									<div class="col-lg-2 col-lg-offset-2 col-xs-4">
										<label>Frequency</label>
									</div>
									<div class="col-lg-2 col-xs-8">
										<s:textfield maxlength="120" placeholder="No of qiuds/day"
											cssClass="form-control input-sm"
											name="patientDiagnosticHabits1.betelQuidFrequency" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidFrequency}"/>
									</div>
								</div>
							</div>
							<div class="form-group">
								<div class="row">

									<div class="col-lg-2 col-lg-offset-2 col-xs-4">
										<label> Duration</label>
									</div>

									<div class="col-lg-2 col-xs-8">

										<s:textfield maxlength="120" type="text" placeholder="Duration"
											cssClass="form-control input-sm"
											name="patientDiagnosticHabits1.betelQuidDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.betelQuidDuration}"/>
									</div>


								</div>
							</div>
							<hr>
							<div class="form-group">
								<div class="row">
									<div class="col-lg-2 col-xs-12">
										<label for="name">Smoking</label>
									</div>
									<div class="col-lg-2 col-xs-12">

										<!-- Yes <input type="radio" value="Yes" id="yes"
											name="patientDiagnosticHabits1.smoking" /> No <input
											type="radio" value="No" id="no"
											name="patientDiagnosticHabits1.smoking" /> -->
										<s:radio name="patientDiagnosticHabits1.smoking"
											list="#{'Yes':'Yes','No':'No'}" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smoking}"/>

									</div>
									<div class="box4" style="display: none;">

										<div class="col-lg-2 col-xs-12">
											<s:checkbox name="patientDiagnosticHabits1.smokingCigarettes"
												id="cbx27" />
											Cigarettes
										</div>
										<div class="box27" style="display: none;">
											<div class="col-lg-2 col-xs-12" id="cigarettes_duration">
												<s:textfield maxlength="120" placeholder="Duration"
													cssClass="form-control input-sm"
													name="patientDiagnosticHabits1.smokingCigarettesDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarettesDuration}"/>
											</div>
											<div class="col-lg-2 col-xs-12" id="cigarettes_frequency">
												<s:textfield maxlength="120" placeholder="Frequency"
													cssClass="form-control input-sm"
													name="patientDiagnosticHabits1.smokingCigarettesFrequency" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarettesFrequency}" />
											</div>
										</div>
									</div>

								</div>
							</div>

							<div class="form-group">
								<div class="row box4" style="display: none;">

									<div class="col-lg-2 col-lg-offset-4 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits1.smokingCigar"
											id="cbx28" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigar}"/>
										Cigar
									</div>
									<%-- <div class="col-lg-3 col-xs-3">
										<s:textfield placeholder="Duration"
											cssClass="form-control input-sm"
											name="patientDiagnosticHabits1.smokingCigarDuration" />
									</div> --%>
									<div class="box28" style="display: none;">
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingCigarDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarDuration}"/>
										</div>
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Frequency"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingCigarFrequency" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingCigarFrequency}"/>
										</div>
									</div>

								</div>
							</div>
							<div class="form-group">
								<div class="row box4" style="display: none;">

									<div class="col-lg-2 col-lg-offset-4 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits1.smokingBeedi"
											id="cbx29" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingBeedi}"/>
										Beedi
									</div>
									<%-- <div class="col-lg-3 col-xs-3">
										<s:textfield placeholder="Duration"
											cssClass="form-control input-sm"
											name="patientDiagnosticHabits1.smokingBeediDuration" />
									</div> --%>
									<div class="box29" style="display: none;">
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingBeediDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingBeediDuration}" />
										</div>
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Frequency"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingBeediFrequency" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingBeediFrequency}"/>
										</div>
									</div>

								</div>
							</div>
							<div class="form-group">
								<div class="row box4" style="display: none;">

									<div class="col-lg-2 col-lg-offset-4 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits1.smokingPipe"
											id="cbx30" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingPipe}"/>
										Pipe
									</div>
									<%-- <div class="col-lg-3 col-xs-3">
										<s:textfield placeholder="Duration"
											cssClass="form-control input-sm"
											name="patientDiagnosticHabits1.smokingPipeDuration" />
									</div> --%>
									<div class="box30" style="display: none;">
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingPipeDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingPipeDuration}"/>
										</div>
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Frequency"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingPipeFrequency" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingPipeFrequency}"/>
										</div>
									</div>

								</div>
							</div>
							<div class="form-group">
								<div class="row box4" style="display: none;">

									<div class="col-lg-2 col-lg-offset-4 col-xs-12">
										<s:checkbox name="patientDiagnosticHabits1.smokingRollup"
											id="cbx31" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingRollup}"/>
										Roll up
									</div>
									<%-- <div class="col-lg-3 col-xs-3">
										<s:textfield placeholder="Duration"
											cssClass="form-control input-sm"
											name="patientDiagnosticHabits1.smokingRollupDuration" />
									</div> --%>
									<div class="box31" style="display: none;">
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Duration"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingRollupDuration" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingRollupDuration}"/>
										</div>
										<div class="col-lg-2 col-xs-12" id="box4">
											<s:textfield maxlength="120" placeholder="Frequency"
												cssClass="form-control input-sm"
												name="patientDiagnosticHabits1.smokingRollupFrequency" value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.smokingRollupFrequency}" />
										</div>
									</div>

								</div>
							</div>
						<div class="row">
							<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
								<s:if test="patientDiagnosticHabits1.id != null">
									<s:submit cssClass="btn2" value="Update"></s:submit>
								</s:if>
								<s:else>
									<s:submit cssClass="btn2" value="Submit">
									</s:submit>
								</s:else>
							</div>
						</div>
					</s:form>
							
								
								</div>
				
						

				



				
			</div>
			<!-- /page content -->
			</div>
		</div>



	</div>
	<!-- /page content -->


	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>


</body>



</html>
