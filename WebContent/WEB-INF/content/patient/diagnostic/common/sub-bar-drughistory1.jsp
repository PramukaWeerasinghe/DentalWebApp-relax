<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- sub-bar5  -->
<style>
/* Style the buttons */
.btn1 {
    border: none;
    outline: none;
    padding: 10px 16px;
    background-color: #f1f1f1;
    cursor: pointer;
    font-size: 18px;
}

/* Style the active class, and buttons on mouse-over */
.active, .btn1:hover {
    background-color: #42f4a1;
    color: white;
}
</style>
<div class="top_nav btn-group">
	<nav>

		<div id="myDIV">
			<button class="btn active btn1">
				<s:url var="drughistory" action="form.html" namespace="/patient-drug-history">
					<s:param name="patientId" value="%{patient.id}"></s:param>
				</s:url>
				<s:a href="%{#drughistory}">
					<i></i>Phase1
				</s:a>
			</button>
			<button class="btn btn1">
				<s:url var="drughistory2" action="formPhase2.html" namespace="/patient-drug-history">
					<s:param name="patientId" value="%{patient.id}"></s:param>
				</s:url>
				<s:a href="%{#drughistory2}">
					<i></i>Phase2
				</s:a>
			</button>

		</div>

		<script>
// Add active class to the current button (highlight it)
var header = document.getElementById("myDIV");
var btns = header.getElementsByClassName("btn");
for (var i = 0; i < btns.length; i++) {
  btns[i].addEventListener("click", function() {
    var current = document.getElementsByClassName("active");
    current[0].className = current[0].className.replace(" active", "");
    this.className += " active";
  });
}
</script>



	</nav>
</div>
<!-- /sub-bar5 menu -->

