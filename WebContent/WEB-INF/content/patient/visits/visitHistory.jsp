<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
	<link href="<s:url value="/css/dashboard-component.css" includeParams="none"/>" rel="stylesheet" type="text/css">
	
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
				
	

				<div class="form-group">
					<div class="row">
						<div class="col-md-12">
							<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>
						</div>
						
					</div>
				</div>
				
				<div class="form-group">
					<div class="row">
						<div class="col-md-12">
							<s:actionmessage/>
							<s:include value="/WEB-INF/content/patient/visits/list.jsp"></s:include>
						</div>
						
					</div>
				</div>

	
	
			<!-- /page content -->
			
			</div>

		</div>
	</div>
	
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp" ></s:include>

</body>
</html>
