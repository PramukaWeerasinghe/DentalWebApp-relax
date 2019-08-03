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


				<h4>REQUEST FOR BIOPSY</h4>
				<h5>Mark regions and submit</h5>
				<hr />

				<div class="col-md-8">
				
				

<canvas id="myCanvas" width="200" height="100" style="border:1px solid #d3d3d3;">
Your browser does not support the HTML5 canvas tag.</canvas>

<script>
var c = document.getElementById("myCanvas");
var ctx = c.getContext("2d");
ctx.beginPath();
ctx.arc(95,50,40,0,2*Math.PI);
ctx.stroke();
</script> 				
				
				
						<div id="canvasDiv"></div>
						<!--[if IE]><script type="text/javascript" src="excanvas.js"></script><![endif]-->
						<script type="text/javascript" src="html5-canvas-drawing-app.js"></script>
						<script type="text/javascript">
							drawingApp.init();
						</script>
					<div class="p-3 mb-2 bg-success text-white">
						<s:actionmessage />
					</div>

					<s:form namespace="/patient-request-biopsy" action="save"
						method="post">
						<div id="canvasDiv"></div>
						<!--[if IE]><script type="text/javascript" src="excanvas.js"></script><![endif]-->
						<script type="text/javascript" src="html5-canvas-drawing-app.js"></script>
						<script type="text/javascript">
							drawingApp.init();
						</script>

					</s:form>

				</div>
			</div>





		</div>
		<!-- /page content -->

	</div>

	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
	<script
		src="<s:url value="/WEB-INF/content/patient/requestBiopsy/excanvas.js" includeParams="none"/>"></script>
	<script
		src="<s:url value="/WEB-INF/content/patient/requestBiopsy/html5-canvas-drawing-app.js" includeParams="none"/>"></script>

</body>
</html>
