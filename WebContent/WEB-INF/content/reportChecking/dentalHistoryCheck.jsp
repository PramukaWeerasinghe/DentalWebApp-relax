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
			<s:include value="/WEB-INF/content/reportChecking/common/top-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/reportChecking/common/sub-bar.jsp"></s:include>
			
			<div class="right_col" role="main" id="full">
		
			
			<h1>Page two...</h1>

				 <div class="col-xs-2">
					<s:url var="complaint" namespace="/complaint-check"
						action="form.html">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url>
					<s:a href="%{#complaint}" cssClass="btn btn-info">Previous</s:a>
				</div> 


				<div class="col-md-2 col-sm-3 col-xs-3 pull-right">
					<s:url var="mediRecordCheck" namespace="/"
						action="form.html">
						<s:param name="patientId" value="%{patient.id}"></s:param>
					</s:url>
					<s:a href="%{#mediRecordCheck}" cssClass="btn btn-info">Next</s:a>
				</div>
			</div>
		</div>
		</div>


	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>



</html>
