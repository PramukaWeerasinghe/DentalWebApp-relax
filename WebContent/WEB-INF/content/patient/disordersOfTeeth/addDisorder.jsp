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

<script src='<s:url value="/vendors/d3/d3.min.js" includeParams="none"/>' charset="utf-8" type="text/javascript"></script>
<link href='<s:url value="/vendors/jquery-ui-1.12.1.custom/jquery-ui.min.css" includeParams="none"/>' rel="stylesheet" type="text/css"> 
<script src='<s:url value="/vendors/jquery-ui-1.12.1.custom/jquery-ui.min.js" includeParams="none"/>' charset="utf-8" type="text/javascript"></script>


<style type="text/css">
.ui-widget-header {
	background: #f7e16d;
}

#dialog2.ui-dialog-content.ui-widget-content{
    border: 1px solid #ddd;
    background: rgb(255,0,0);
	
}

#dialog2.ui-widget-header {
    background: rgb(255,0,0);
}

#dialog2.ui-dialog-content.ui-widget-header{
    border: 1px solid #ddd;
    background: rgb(255,0,0);
}

.ui-widget-overlay {
	opacity: .50 !important;
	/* Make sure to change both of these, as IE only sees the second one */
	filter: Alpha(Opacity = 50) !important;
	background: rgb(50, 50, 50) !important; /* This will make it darker */
}
</style>

</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col" role="main">
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>

				<%-- 				<s:url var="patientViewUrl" namespace="/patient" action="view.html">
					<s:param value="%{patientId}" name="id"></s:param>
				</s:url>
				<s:a href="%{#patientViewUrl}" cssClass="btn btn-xs btn-primary"
					role="button"> << go to patient profile</s:a>
				<hr>
 --%>

				<h4>Add disorders</h4><hr>
				<div class="form-group">
					<div class="row">
						<div class="col-md-3"> <strong>Selected type:</strong> 
							<span id="teethTypeId"><s:property value="%{patientMissingTeeth.teethType}" /> </span>
						</div>
						
						<div class="col-md-6"> <strong>Missing teeth list: </strong>  
							<span id="teethValues"><s:property value="%{patientMissingTeeth.teethList}" /> </span>
						</div>
					</div><hr>
				</div>

				<div class="form-group">
					<div class="row">
						<div id="div_teethSelect" class="col-md-8 col-xs-12">
						
							<s:if test="%{patientMissingTeeth.teethType == 'decidous'}">
								<s:include value="/WEB-INF/content/patient/missingTeeth/decious_2.svg"></s:include>
							</s:if>
							<s:if test="%{patientMissingTeeth.teethType == 'mixed'}">
								<s:include value="/WEB-INF/content/patient/missingTeeth/mixed_2.svg"></s:include>
							</s:if>
							<s:if test="%{patientMissingTeeth.teethType == 'permenent'}">
								<s:include value="/WEB-INF/content/patient/missingTeeth/permenent.svg"></s:include>
							</s:if>
						</div>
						<div class="col-md-4 col-xs-12">
							<div class="right" id="teeth_area_div">
								<s:include value="/WEB-INF/content/patient/disordersOfTeeth/tooth_area.svg"></s:include>
							</div>

						</div>

					</div>
				</div>

				<div>
					<s:form namespace="/patient-teeth-disorder" action="save"
						method="post" autocomplete="off">

						<s:textfield hidden="true" name="patientTeethDisorder.patientId"
							value="%{patientId}">
						</s:textfield>

						<s:textfield hidden="true" value="%{patientMissingTeeth.id}"
							name="patientTeethDisorder.missingteethId">
						</s:textfield>


						<s:textfield id="patient_disorder_code" required="true"
							hidden="true" name="patientTeethDisorder.teethInfo">
						</s:textfield>

						<s:submit cssClass="btn btn-warning" value="save"
							title="Submit after adding disorders" onclick="validateInputs()">
						</s:submit>
						
						<button id="clear_btn" class="btn btn-default">Clear All
						</button>
						<script type="text/javascript">
							$('#clear_btn').click(function() {
								location.reload();
							});
						</script>
					</s:form>


					<span>

					</span>
				</div>

				<!-- entered data -->
				<s:include
					value="/WEB-INF/content/patient/disordersOfTeeth/preview.jsp"></s:include>


				<div class="form-group">

					<div id="dialog1" title="Disorder code for the tooth Area. " hidden="hidden" >

						<label>Area: </label> <input type="text" class="form-control" name="user" id="dialog1_area" disabled="disabled"> <br> 

						<label>Code</label> <input type="text" class="form-control" id="disorder_code_input" maxlength="120" > <br> 
						<label>Other</label> <input type="text" class="form-control" id="area_other_input"  maxlength="120" > <br>
						<button class="btn btn-success btn-block" onclick="alertSave()">save</button>

					</div>

					<div id="dialog2" title="Error!" hidden="hidden" >

						An Empty form can not be submitted!

					</div>



<script type="text/javascript">

	//var tooth_area_id,mesial,facial,distal,lingual,occlusal;

	var toothInfoObj = {
			"id":"",
			"Mesial":{"disorder":"","other":""},
			"Facial":{"disorder":"","other":""},
			"Distal":{"disorder":"","other":""},
			"Lingual":{"disorder":"","other":""},
			"Occlusal":{"disorder":"","other":""}
		};
	

	
	function validateInputs(){
		if(toothInfoObj.id==""){
			ErrorDialogBox();
		}
		
	}
	
	function saveDisorderCodeToForm(){
		$('#patient_disorder_code').val(createJsonString(toothInfoObj));
			
	}
	
	function updateTeethIdOnTable(){
		var str = toothInfoObj.id;
		$('#teethListValue_tbl').html(str);
	}
	
	function clearInputsOfDialogBox(){
		$('#disorder_code_input').val("");
		$('#area_other_input').val("");
	}
	
	function setTeethListValue(str){
		toothInfoObj.id = str;
	}
	
	function updateDisorderCode(areastr){
		
		//setTeethListValue();
		
		console.log("areastr " + areastr);
		
		if(areastr.toLowerCase() == "mesial"){
			toothInfoObj.Mesial.disorder = $('#disorder_code_input').val();
			$('#mesial_tbl').html(toothInfoObj.Mesial.disorder);
		}
		if(areastr.toLowerCase() =="facial"){
			toothInfoObj.Facial.disorder = $('#disorder_code_input').val();
			$('#facial_tbl').html(toothInfoObj.Facial.disorder);
		}
		if(areastr.toLowerCase() =="distal"){
			toothInfoObj.Distal.disorder = $('#disorder_code_input').val();
			$('#distal_tbl').html(toothInfoObj.Distal.disorder);
		}
		if(areastr.toLowerCase() =="lingual"){
			toothInfoObj.Lingual.disorder = $('#disorder_code_input').val();
			$('#lingual_tbl').html(toothInfoObj.Lingual.disorder);
		}
		if(areastr.toLowerCase() =="occlusal"){
			toothInfoObj.Occlusal.disorder = $('#disorder_code_input').val();
			$('#occlusal_tbl').html(toothInfoObj.Occlusal.disorder);
		}
	}

	function updateDisorderCode_other(areastr){
		if(areastr.toLowerCase() =="mesial"){
			toothInfoObj.Mesial.other = $('#area_other_input').val();
			$('#mesial_tbl_other').html(toothInfoObj.Mesial.other);
		}
		if(areastr.toLowerCase() =="facial"){
			toothInfoObj.Facial.other = $('#area_other_input').val();
			$('#facial_tbl_other').html(toothInfoObj.Facial.other);
		}
		if(areastr.toLowerCase() =="distal"){
			toothInfoObj.Distal.other = $('#area_other_input').val();
			$('#distal_tbl_other').html(toothInfoObj.Distal.other);
		}
		if(areastr.toLowerCase() =="lingual"){
			toothInfoObj.Lingual.other = $('#area_other_input').val();
			$('#lingual_tbl_other').html(toothInfoObj.Lingual.other);
		}
		if(areastr.toLowerCase() =="occlusal"){
			toothInfoObj.Occlusal.other = $('#area_other_input').val();
			$('#occlusal_tbl_other').html(toothInfoObj.Occlusal.other);
		}
	}
	
	function createJsonString(obj){
		var myJSON = JSON.stringify(obj);
		return myJSON;
	}
	
	
	
	function onAreaClick(area_id) {
		
		var selectedArea_dialog = area_id;
		var disorderTemp;
		
		$("#dialog1").dialog({
			autoOpen : false
		});

		document.getElementById("dialog1_area").value = selectedArea_dialog;
		
		$("#dialog1").dialog('open');

	}
	
	function ErrorDialogBox(){
		$("#dialog2").dialog({
			autoOpen : false
		});
		
		$("#dialog2").dialog('open');		
	}

	function getAreaId(id){
		tooth_area_id = id;
		
		console.log("area id " + tooth_area_id);
	}
	
	
	function alertSave() {

		/* getAreaId();
		saveValuesToVariables();
		getValues();
		console.log("tooth info" + createJsonString()); */
		
		updateDisorderCode($('#dialog1_area').val() );
		updateDisorderCode_other($('#dialog1_area').val() );
		clearInputsOfDialogBox();
		
		/* updateTableValues("mesial_tbl",toothInfoObj.Mesial.disorder); */
		
		$( "#dialog1" ).dialog( "close" );

	}
</script>










<!--script select missing teeth and remove from svg rectangle-->
<script type="text/javascript">
	function onloadSelect() {

		var teethTypeFromStruts = '<s:property value="%{patientMissingTeeth.teethType}" />';
		var selectedIds = []; //selected teeth array
		/* var rect_fill_color = "#797171"; //fill color for rect
		var default_fill_color = "#dde9af"; //default color */

		var data = $('#teethValues').text();
		data = data.replace(/ +/g, "");

		selectedIds = data.split(',');

		for (var i = 0; i < selectedIds.length; i++) {
			selectedIds[i] = 'd' + selectedIds[i];
		}

		console.log(data);

		console.log(selectedIds);
		
		

		console.log("teethTypeFromStruts " + teethTypeFromStruts);

		if (selectedIds.length > 0) {
			for (var i = 0; i < selectedIds.length; i++) {
				//d3.select('#' + selectedIds[i]).style('fill',rect_fill_color);

				d3.select('#' + selectedIds[i]).remove();
			}
		}
	}

	window.onload = onloadSelect;
</script>
<!--script select missing teeth function Ends-->



<script type="text/javascript">
	var selectedIds = []; //selected teeth array
	var selectedAreaIds = []; //selected teeth area array

	var rect_fill_color = "#f06292"; //fill color for rect
	var default_fill_color = "#00ff00"; //default color

	
	function include(arr, obj) {
		return (arr.indexOf(obj) != -1);
	}

	//area selection fn
	d3.selectAll('#teeth_area_div svg g g path').on(
			'click',
			function() {

				var id = d3.select(this).attr('id'); //rectangle id selects for each mouse click

				getAreaId(id);
				
				if (d3.event) { // on mouse key

					if (!include(selectedAreaIds, id)) {
						//add to select
						d3.select(this).classed('clicked', true).style('fill',
								rect_fill_color);
						selectedAreaIds.push(id);
						selectedAreaIds.sort();
						
						


						onAreaClick(id);

					} else {
						var index = selectedAreaIds.indexOf(id);
						if (index > -1) {
							selectedAreaIds.splice(index, 1);
						}
						d3.select(this).classed('clicked', true).style('fill',
								default_fill_color);
					}

				}

				//$('span.values').html(selectedIds.join(', '));
				$('#teethAreaValue').val(selectedAreaIds.join(', '));
				saveDisorderCodeToForm();
			});

	//rectangle selection for teeth select
	d3.selectAll('#div_teethSelect svg g rect').on(
			'click',
			function() {

				var id = d3.select(this).attr('id'); //rectangle id selects for each mouse click
				id = id.split('d').join(''); //remove 'd' prefix

				if (d3.event) { // on mouse key

					if (!include(selectedIds, id)) {
						//add to select
						d3.select(this).classed('clicked', true).style('fill',
								rect_fill_color);
						//selectedIds.pop();
						selectedIds.push(id);
						selectedIds.sort();

					} else {
						var index = selectedIds.indexOf(id);
						if (index > -1) {
							selectedIds.splice(index, 1);
						}
						d3.select(this).classed('clicked', true).style('fill',
								default_fill_color);
					}
				
					

				}

				$('span.values').html(selectedIds.join(', '));
				$('#teethListValue').val(selectedIds.join(', '));
				setTeethListValue(selectedIds.join(', '));
				updateTeethIdOnTable();
				
			});

	
</script>





				</div>
				
				

			</div>

		</div>


	</div>
	<!-- /page content -->

	<br>
	<br>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
<%-- 	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include> --%>
</body>
</html>
