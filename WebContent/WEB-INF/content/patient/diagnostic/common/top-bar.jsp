<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- top-bar  -->
<style>
.nav-pills {
	font-size: 13px;
	margin: 0px;
	padding: 0px;
}
</style>



<div class="top_nav row" style="margin-bottom: 2em;">



	<div class="collapse navbar-collapse"
		id="topbar-menu collapse navbar-collapse">
		<nav>


			<ul class=" nav nav-pills nav-justified alert alert-success"
				id="myNavbar" style="background:#f9d09d" > <!-- #f5c694#fbbae9 -->

				<li id="diagnosticMenu1"><s:url var="complaint"
						action="form.html" namespace="/patient-complaint">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#complaint}">
						<i></i>Complaint
				</s:a></li>

				<li id="diagnosticMenu2"><s:url var="dentalHistory"
						action="form.html" namespace="/patient-dental-history">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#dentalHistory}">
						<i></i>Dental History
				</s:a></li>

				<li id="diagnosticMenu3"><s:url var="medicalRecord1"
						action="form.html" namespace="/patient-medical-record1">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#medicalRecord1}">
						<i></i>Medical Record
				</s:a>
				<li id="diagnosticMenu4"><s:url var="drugHistory"
						action="form.html" namespace="/patient-drug-history">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#drugHistory}">
						<i></i>Drug History
				</s:a></li>
				<li id="diagnosticMenu5"><s:url var="investigation"
						action="form.html" namespace="/patient-investigations">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#investigation}">
						<i></i>Investigations
				</s:a></li>
				<li id="diagnosticMenu6"><s:url var="habits1"
						action="form.html" namespace="/patient-habits1">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#habits1}">
						<i></i>Habits
				</s:a></li>
				<li id="diagnosticMenu7"><s:url var="brushingHabits"
						action="form.html" namespace="/brushing-habits">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#brushingHabits}">
						<i></i>Brushing Habits
				</s:a></li>
				<li id="diagnosticMenu8"><s:url var="dietaryHabits"
						action="form.html" namespace="/dietary-habits">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url> <s:a href="%{#dietaryHabits}">
						<i></i>Dietary Habits
				</s:a></li>
		
				<s:if test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.status != 3">

					<li id="diagnosticMenu9" style="background: #e88de1"><s:url
							var="sessionClearUrl" action="clear.html"
							namespace="/clear-session"></s:url> <s:a
							href="%{#sessionClearUrl}">
							<i></i>Clear
					</s:a></li>
				</s:if>	

				<%-- <li id="diagnosticMenu1">
					<s:url var="hardTissue" action="form.html" namespace="/hard-tissue-examination">
					<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url>
				<s:a href="%{#hardTissue}">
					<i></i>Hard Tissue Examination
				</s:a>
				</li>
				<li>
					<s:url var="occlusalRelation" action="form.html" namespace="/occlusal-relation">
					<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url>
				<s:a href="%{#occlusalRelation}">
					<i></i>Occlusal Relationship
				</s:a>
				</li>
				<li>
					<s:url var="treatmentPlan" action="form.html" namespace="/treatment-plan">
					<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url>
				<s:a href="%{#treatmentPlan}">
					<i></i>Treatment Plan
				</s:a>
				</li>  --%>
			</ul>

		</nav>


	</div>
</div>

<!-- /top-bar menu -->
