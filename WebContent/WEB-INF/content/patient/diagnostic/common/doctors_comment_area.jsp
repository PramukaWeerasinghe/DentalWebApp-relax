<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>







<s:if
	test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.status == 3">
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-danger">
				<div class="panel-heading">Doctor's Comments</div>
				<div class="panel-body" style="overflow-x: scroll; height: auto">
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.comment != null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.comment.trim().length() != 0">
						<div class="col-lg-12">

							<s:label>Complaint:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticComplaint.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.comment != null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Dental History:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDentalHistory.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.comment != null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Medical Record(Allergies):</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord1.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Medical Record(B-E):</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord2.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Medical Record(G-N):</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord3.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Medical Record(P-T):</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticMedicalRecord4.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Drug History:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDrugHistory.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Investigations:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticInvestigation.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.comment.trim().length !=0">
						<div class="col-lg-12">
							<s:label>Habits1:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits1.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.comment.trim().length !=0">
						<div class="col-lg-12">
							<s:label>Habits2:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticHabits2.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Brushing Habits:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticBrushingHabits.comment}" />
						</div>
					</s:if>
					<s:if
						test="#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.comment !=null && #session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.comment.trim().length() !=0">
						<div class="col-lg-12">
							<s:label>Dietary Habits:</s:label>
							<s:property
								value="%{#session.PATIENT_DIAGNOSTIC.patientDiagnosticDietaryHabits.comment}" />

						</div>
					</s:if>
				</div>
			</div>
		</div>
	</div>
</s:if>

