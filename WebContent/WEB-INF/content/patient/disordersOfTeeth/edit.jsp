<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<link href="<s:url value="/css/dashboard-component.css" includeParams="none"/>" rel="stylesheet" type="text/css">
	
	<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
    <title><s:text name="global.application.title" /></title>
	<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
	<s:include value="/WEB-INF/content/common/js-include.jsp" ></s:include>
	
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>
			
			<!-- page content -->
			<div class="right_col" role="main">
				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
	
				<s:actionmessage/> 
				
			
				<div id="teethInfor_to_save2" hidden="true"><s:property value="%{patientTeethDisorder.getTeethInfo()}"/></div>
				
		
				<br>
				
				<s:include value="/WEB-INF/content/patient/disordersOfTeeth/preview.jsp"></s:include>
				
				<script type="text/javascript">
					var teethInfo_json;
					var teethInfo_json_obj;
				
					//getTeethInfo();
	
					$(document).ready(getTeethInfo());


					function getTeethInfo() {
						teethInfo_json = $('#teethInfor_to_save2').html();
						teethInfo_json_obj = JSON.parse(teethInfo_json);
						console.log("teethInfo_json :" + teethInfo_json_obj.id);

						updateTable(teethInfo_json_obj);
					}

					function updateTable(toothInfoObj) {

						$('#teethListValue_tbl').html(toothInfoObj.id);

						$('#mesial_tbl').html(toothInfoObj.Mesial.disorder);
						$('#facial_tbl').html(toothInfoObj.Facial.disorder);
						$('#distal_tbl').html(toothInfoObj.Distal.disorder);
						$('#lingual_tbl').html(toothInfoObj.Lingual.disorder);
						$('#occlusal_tbl').html(toothInfoObj.Occlusal.disorder);

						$('#mesial_tbl_other').html(toothInfoObj.Mesial.other);
						$('#facial_tbl_other').html(toothInfoObj.Facial.other);
						$('#distal_tbl_other').html(toothInfoObj.Distal.other);
						$('#lingual_tbl_other').html(toothInfoObj.Lingual.other);
						$('#occlusal_tbl_other').html(toothInfoObj.Occlusal.other);

					}
				</script>
				
				<br>
				
				<s:include value="/WEB-INF/content/patient/disordersOfTeeth/addTreatementPlan.jsp"></s:include>
			<!-- /page content -->
			
			</div>

		</div>
	</div>
	
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<%-- <s:include value="/WEB-INF/content/common/js-include.jsp" ></s:include> --%>

</body>
</html>
