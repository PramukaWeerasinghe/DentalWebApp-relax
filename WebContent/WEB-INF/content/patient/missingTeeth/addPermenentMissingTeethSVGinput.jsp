<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>

<style type="text/css">
span.values {
	color: #428bca;
}
</style>
<meta content="utf-8" http-equiv="encoding">
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

				<!-- svg image import -->
				<div class="container">

					<div class="panel panel-default">
						<!-- <div class="panel-heading">Select teeth</div> -->
						<div class="panel-body">


							<div class="container" id="svg_cont">
								<div class="row">

									<div class="col-md-12" style="fill: red;">
										<span
											style="display: block; margin-top: 10px; align: center; color: red;">Selected
											Missing teeth list: <span class="values" id="span_data"></span>
										</span>
										<!-- <button type="button" id="finalSelection">Finish</button> -->
										<!-- <button type="button" class="btn btn-default" >View Previous Records</button> -->
										

										<div class="form-group">
											<s:form namespace="/patient-missing-teeth" action="save"
												method="post">

												<s:textfield name="patientId" value="%{patientId}"
													id="patientId" hidden="true"></s:textfield>
												<s:textfield name="teethType" value="permenent" id="teethType"
													hidden="true"></s:textfield>
												<s:textfield name="teethVal" id="teethValue" hidden="true"></s:textfield>

												<s:submit cssClass="btn btn-warning" value="Save"></s:submit>
											</s:form>
										</div>

									</div>
									<div id="teeth_div" class="col-md-12">
										
										<s:include
											value="/WEB-INF/content/patient/missingTeeth/permenent.svg"></s:include>

									</div>



								</div>
							</div>



						</div>
					</div>

					<%-- 					<div class="form-group">
						<s:form namespace="/patient-missing-teeth" action="save" method="post">
								
							<s:textfield name="patientId" value="%{patientId}" id="patientId" hidden="true"></s:textfield>							
							<s:textfield name="teethType" value="decious" id="teethType" hidden="true"></s:textfield>							
							<s:textfield name="teethVal" id="teethValue" hidden="true"></s:textfield>

							<s:submit cssClass="btn btn-warning" value="Save"></s:submit>
						</s:form>					
					</div> --%>
				</div>


				<script type="text/javascript">

					var selectedIds = []; //selected teeth array

					var rect_fill_color = "#f06292"; //fill color for rect
					var default_fill_color = "#dde9af"; //default color

/* 					function onloadSelect() {
						console.log(selectedIds);

						if (selectedIds.length > 0) {
							for (var i = 0; i < selectedIds.length; i++) {
								d3.select("#" + selectedIds[i]).style('fill',
										'blue');
							}
						}
					} */

					function include(arr,obj) {
					    return (arr.indexOf(obj) != -1);
					}
					
					d3.selectAll('#teeth_div svg g rect').on('click',
							function() {

								var id = d3.select(this).attr('id'); //rectangle id selects for each mouse click
								id = id.split('d').join(''); //remove 'd' prefix

								//onloadSelect();

								
								if (d3.event) { // on mouse key


									
									if( !include(selectedIds,id) ){
										//add to select
										d3.select(this).classed('clicked',true).style('fill',rect_fill_color);
										selectedIds.push(id);
										selectedIds.sort();
										
									}
									else{
										var index = selectedIds.indexOf(id);
										if (index > -1) {
											selectedIds.splice(index, 1);
										}				
										d3.select(this).classed('clicked',true).style('fill',default_fill_color);
									}

								} 

								$('span.values').html(selectedIds.join(', '));
								$('#teethValue').val(selectedIds.join(', '));
							});

					$('button#finalSelection').click(function() {
						$('span.values').html(selectedIds.join(', '));
						console.log("compare!")
					});
				</script>



			</div>

		</div>


	</div>
	<!-- /page content -->

	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
