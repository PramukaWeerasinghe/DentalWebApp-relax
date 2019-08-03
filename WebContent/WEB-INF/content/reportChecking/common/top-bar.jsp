<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- top-bar  -->
<div class="top_nav">
	<nav>


		<ul class=" nav nav-pills nav-justified alert alert-danger">
			<li><s:url var="complaint" action="form.html"
					namespace="/complaint-check"></s:url> <s:a href="%{#complaint}">
					<i></i>Complaint
				</s:a></li>
			<li><s:url var="dentalHistory" action="form.html"
					namespace="/dental-history-check"></s:url> <s:a
					href="%{#dentalHistory}">
					<i></i>Dental History
				</s:a></li>
			<li><s:url var="medicalRecord1" action="form.html" namespace="/"></s:url>
				<s:a href="%{#medicalRecord1}">
					<i></i>Medical Record
				</s:a>
			<li><s:url var="drugHistory" action="form.html" namespace="/"></s:url>
				<s:a href="%{#drugHistory}">
					<i></i>Drug History
				</s:a></li>
			<li><s:url var="investigations" action="form.html" namespace="/"></s:url>
				<s:a href="%{#investigations}">
					<i></i>Investigations
				</s:a></li>
			<li><s:url var="habits" action="form.html" namespace="/"></s:url>
				<s:a href="%{#habits}">
					<i></i>Habits
				</s:a></li>
			<li><s:url var="brushingHabits" action="form.html" namespace="/"></s:url>
				<s:a href="%{#brushingHabits}">
					<i></i>Brushing Habits
				</s:a></li>
			<li><s:url var="dietaryHabits" action="form.html" namespace="/"></s:url>
				<s:a href="%{#dietaryHabits}">
					<i></i>Dietary Habits
				</s:a></li>
			<li><s:url var="hardTissue" action="form.html" namespace="/"></s:url>
				<s:a href="%{#hardTissue}">
					<i></i>Hard Tissue Examination
				</s:a></li>
			<li><s:url var="occlusalRelation" action="form.html"
					namespace="/"></s:url> <s:a href="%{#occlusalRelation}">
					<i></i>Occlusal Relationship
				</s:a></li>
			<li><s:url var="treatmentPlan" action="form.html" namespace="/"></s:url>
				<s:a href="%{#treatmentPlan}">
					<i></i>Treatment Plan
				</s:a></li>
		</ul>

	</nav>
</div>

<!-- /top-bar menu -->
