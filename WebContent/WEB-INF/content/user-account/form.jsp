<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="/WEB-INF/content/common/css-include.jsp"></s:include>
<s:head />

<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</head>

<body class="nav-md">
	<div class="container body">
		<div class="main_container">

			<s:include value="/WEB-INF/content/common/title-bar.jsp"></s:include>
			<s:include value="/WEB-INF/content/common/top-bar.jsp"></s:include>

			<!-- page content -->
			<div class="right_col col-md-8" role="main">
				<s:include value="/WEB-INF/content/user-account/header.jsp"></s:include>
				<h4>Add new users</h4>


					

					<div class="p-3 mb-2 bg-success text-white">
						<s:actionmessage />
					</div>

				<s:form namespace="/user-account" action="save" method="post">
				


					<%-- <s:hidden name="patient.id" value="%{patient.id}"></s:hidden> --%>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-6">
								<label class="control-label" for="name">Title:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:select list="{'Mr','Miss','Ms','Rev'}" name="employee.title"
									cssClass="form-control"></s:select>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-6">
								<label class="control-label" for="name">Name:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield title="User name" type="text"
									cssClass="form-control" id="name" name="employee.surname"
									placeholder="Surname"/>
							</div>
							<div class="col-md-2 col-sm-6 col-xs-12">
								<s:textfield title="User name" type="text"
									cssClass="form-control" id="name" name="employee.initials"
									placeholder="Initials" />
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield title="User name" type="text"
									cssClass="form-control" id="name" name="employee.firstName"
									placeholder="FirstName" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">NIC:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield type="text" cssClass="form-control"
									name="employee.nic" placeholder="User nic" />
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">Designation:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:select
									list="#{'DENTAL_DOCTOR':'DENTAL DOCTOR','HEALTH_MINISTRY_DOCTOR':'HEALTH MINISTRY DOCTOR','DENTAL_NURSE':'DENTAL NURSE','HEALTH_MINISTRY_NURSE':'HEALTH MINISTRY NURSE','CLERK':'CLERK','TECHNICIAN':'TECHNICIAN','POSTGRADUATE_STUDENT':'POSTGRADUATE STUDENT','STUDENT':'STUDENT'}"
									name="employee.userRole" cssClass="form-control" />
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield name="employee.designation"
									placeholder="Student's registration number (d/11/230)"
									cssClass="form-control"></s:textfield>
							</div>
						</div>
					</div>

					<!-- user designation, if needed -->
					<%-- 					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">User Designation:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:select list="#{'DOCTOR':'DOCTOR','POSTGRADUATE_STUDENT':'POSTGRADUATE_STUDENT','STUDENT':'STUDENT','HEALTH_MINISTRY_DOCTOR':'HEALTH_MINISTRY_DOCTOR','DENTAL_NURSE':'NURSE','HEALTH_MINISTRY_NURSE':'HEALTH_MINISTRY_NURSE','CLERK':'CLERK','TECHNICIAN':'TECHNICIAN'}" name="employee.designation" cssClass="form-control"/>
							</div>
						</div>
					</div> --%>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label id="deptlebel" class="control-label">Department:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:select cssClass="form-control" listKey="id" listValue="name"
									list="departments" name="employee.department"></s:select>
							</div>
						</div>
					</div>

					<hr>
					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-6">
								<label class="control-label" for="name">User Name:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield title="User name" type="text" required="required"
									cssClass="form-control" id="userName" name="userAccount.userName"
									placeholder="Username" maxlength="8" />
							</div>
						</div>
					</div>

<%-- 					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">Password:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:textfield type="password" cssClass="form-control"
									name="userAccount.userPassword" placeholder="User password" />
							</div>
						</div>
					</div>  --%>

					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">User Category (Dashboard will change accordingly):</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:select list="#{'DOCTOR':'Doctor','STUDENT':'Student','RECEPTION':'Reception','DEPARTMENT':'Department','EMPLOYEE':'Other Employee'}"
									name="userAccount.categoryRelationId" cssClass="form-control" />
							</div>
						</div>
					</div>

					
<%-- 					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">Activation date:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<input type="datetime-local" name="userAccount.activateDatetimeType" value="<s:property value='%{userAccount.activateDatetimeType}' />" class="form-control" > 
								<s:textfield name="userAccount.activateDatetime" class="form-control" />
							</div>
						</div>
					</div> --%>
					
<%-- 					<div class="form-group">
						<div class="row">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<label class="control-label">Termination date:</label>
							</div>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<input type="datetime-local" name="userAccount.terminateDatetimeType" value="<s:property value='%{userAccount.terminateDatetimeType}' />" class="form-control" > 
								<s:textfield name="userAccount.terminateDatetime" class="form-control"/>
							</div>
						</div>
					</div>  --%>


					<div class="form-group">
						<div class="row">



							<s:if test="employee.id != null && !employee.id.empty">
								<div class="col-md-3 col-sm-2 col-xs-12">
									<s:submit cssClass="btn btn-warning" value="Update account"></s:submit>
								</div>
							</s:if>
							<s:else>
								<div class="col-md-3 col-sm-2 col-xs-12">
									<s:submit cssClass="btn btn-warning" value="save"></s:submit>
								</div>
							</s:else>

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
