<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
<script
	src="<s:url value="/vendors/d3/d3.min.js" includeParams="none"/>"
	charset="utf-8"></script>

</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col" role="main">
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
				
				<div class="form-group">
				<s:url var="patientViewUrl" namespace="/patient" action="view.html">
					<s:param value="%{patientId}" name="id"></s:param>
				</s:url>
				<s:a href="%{#patientViewUrl}" cssClass="btn btn-xs btn-primary"
					role="button"> << BACK-TO PATIENT'S PROFILE</s:a>


				<s:url var="patientMissingTeethViewUrl" namespace="/patient-missing-teeth" action="view.html">
					<s:param value="%{patientId}" name="patientId"></s:param>
				</s:url>
				<s:a href="%{#patientMissingTeethViewUrl}" cssClass="btn btn-xs btn-info"
					role="button"> << BACK-TO PATIENT'S MISSING TEETH HISTORY</s:a>
					
					<br>				
				</div>


					
					<div class="panel panel-default">
						<!-- <div class="panel-heading">Select teeth</div> -->
						<div class="panel-body">


							<div class="container" id="svg_cont">
								<div class="row">

									<h3>Missing teeth: <span id="teethValues" style="color: #f06292;"><s:property value="%{teethVal}" /></span> </h3>
									<hr>
									<%-- <h4 style="color: fuchsia;" id="teethValues"><s:property value="%{teethVal}" /></h4> --%>
					
					
									<div class="form-group">
										<div class="row">
											<div class="col-md-12">
												<s:if test="%{teethType == 'decidous'}">
													<s:include
														value="/WEB-INF/content/patient/missingTeeth/decious_2.svg"></s:include>
												</s:if>
												<s:if test="%{teethType == 'mixed'}">
													<s:include
														value="/WEB-INF/content/patient/missingTeeth/mixed_2.svg"></s:include>
												</s:if>
												<s:if test="%{teethType == 'permenent'}">
													<s:include
														value="/WEB-INF/content/patient/missingTeeth/permenent.svg"></s:include>
												</s:if>
											</div>
											<div class="col-md-6"></div>
					
										</div>
									</div>								
								
								</div>
							</div>
						</div>
					</div>			



				<script type="text/javascript">

		

					function onloadSelect() {

						var selectedIds = []; //selected teeth array
						var rect_fill_color = "#f06292"; //fill color for rect
						var default_fill_color = "#dde9af"; //default color

						
						var data = $('#teethValues').text();
						data = data.replace(/ +/g, "");
						
						
						selectedIds = data.split(',');
						
						for(var i = 0; i<selectedIds.length; i++){
							selectedIds[i] = 'd' + selectedIds[i];
						}
						
						console.log(data);
						
						console.log(selectedIds);

						if (selectedIds.length > 0) {
							for (var i = 0; i < selectedIds.length; i++) {
								d3.select('#' + selectedIds[i]).style('fill',rect_fill_color);
							}
						} 
					}
	
					window.onload = onloadSelect;
				</script>



			</div>

		</div>


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
