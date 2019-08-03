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
			
	<div class="right_col" role="main" id="full">
	<h1>Page under construction</h1>
	<h2>Occlusal Relationship</h2>
          
   

       
        	
      		<div class="col-xs-2">
					<s:url var="hardTissue" namespace="/hard-tissue-examination"
						action="form.html">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url>
					<s:a href="%{#hardTissue}" cssClass="btn btn-info">Previous</s:a>
				</div>

				<div class="col-md-2 col-sm-3 col-xs-3 pull-right ">
					<s:url var="treatmentPlan" namespace="/treatment-plan"
						action="form.html">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url>
					<s:a href="%{#treatmentPlan}" cssClass="btn btn-info">Next</s:a>
				</div>


				<!-- /page content -->
		</div>
	</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>



</html>
