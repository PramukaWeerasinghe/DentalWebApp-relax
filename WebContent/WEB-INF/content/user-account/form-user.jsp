<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>



<link href="https://code.jquery.com/ui/1.9.2/themes/base/jquery-ui.css" rel="stylesheet" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://code.jquery.com/ui/1.9.2/jquery-ui.js"></script>

</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col col-md-8" role="main">
				<s:include value="/WEB-INF/content/user-account/header.jsp"></s:include>
				<h4>New User Account</h4>

				<s:actionerror cssClass="errorMessage" />


				<s:form namespace="/user-account" action="saveUserAccountInSession" method="post">

					<%-- <s:hidden name="patient.id" value="%{patient.id}"></s:hidden> --%>


					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-6">
								<label class="control-label" for="name">User Name:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield title="User name" type="text"
									cssClass="form-control" id="name" 
									placeholder="Username" style="text-transform:capitalize" />
							</div>							
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">Password:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield type="password" cssClass="form-control" 
									placeholder="User password" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">User Category:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
									<s:select list="#{'EMPLOYEE':'Doctor','STUDENT':'Student'}" cssClass="form-control" />
							</div>
						</div>
					</div>


					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">Activation date:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<input type="date" class="form-control" >
							</div>
						</div>
					</div>
					
					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">Termination date:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<input type="date" class="form-control">
							</div>
						</div>
					</div>


					<div class="form-group">
						<div class="row">

							<div class="col-md-3 col-sm-2 col-xs-12">
								<s:submit cssClass="btn btn-warning" value="Next"></s:submit>
							</div>


						</div>
					</div>

				</s:form>
			</div>
			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
