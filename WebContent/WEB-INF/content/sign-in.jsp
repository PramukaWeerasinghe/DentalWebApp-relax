<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">

<head>
<s:include value="/WEB-INF/content/common/meta-tags.jsp"></s:include>
<title><s:text name="global.application.title" /></title>
<s:include value="common/css-include.jsp"></s:include>
</head>

<body>
	<!-- <body class="login"> -->

	<div class="container">

		<div class="login">
			<div class="form-head">
				<img src="images/sign-in.png" alt="Relax Patients">
			</div>

			<s:actionerror cssStyle="" />

			<div id="signInDentalTitle" style="padding-top: 5px">Faculty of
				Dental Sciences</div>

			<div class="form-body">

				<s:form namespace="/" action="sign-in.html" method="post"
					id="signInFrm">
					<div class="form-group email">
						<input type="text" name="userAccount.userName"
							placeholder='<s:property value="%{getText('user.login.email')}"/>'
							class="form-control"  required autofocus autocomplete="off" value="doctor@dental.lk"  />
					</div>
					<div class="form-group">
						<input type="password" name="userAccount.userPassword"
							class="form-control"
							placeholder="<s:property value="%{getText('user.login.password')}"/>"
							required autocomplete="off" value="abc123" />
					</div>
					<hr />

					<button type="submit" class="btn btn-success btn-block" style="background:#ea6f3f;border:1px solid #ea6f3f">
						Sign In</button>
					<br />
					<s:url var="forgotPasswordtUrl"
						action="forget-password-request.html" namespace="/"
						includeParams="none" />
					<s:a href="%{#forgotPasswordtUrl}"
						cssClass="btn btn-primary btn-block" cssStyle="background:#9b6257;border:1px solid #9b6257">
			 	Forgot my password?
			  </s:a>

					<br />
				</s:form>
			</div>
		</div>

		<%-- <a class="hiddenanchor" id="signup"></a>
		<div class="card card-container">
			<section class="login_content">
				<img id="profile-img" class="profile-img-card" />
				<p id="profile-name" class="profile-name-card"></p>
				
					<s:form namespace="/" action="sign-in.html" method="post"
						cssClass="form-signin" id="signInFrm">

						<h3>
							<s:text name="global.application.name"></s:text>
						</h3>
						<div class="form-group">
							<input type="text" name="userAccount.userName"
								placeholder='<s:property value="%{getText('user.login.email')}"/>'
								class="form-control" required autofocus />
						</div>
						<div class="form-group">
							<input type="password" name="userAccount.userPassword"
								class="form-control"
								placeholder="<s:property value="%{getText('user.login.password')}"/>"
								required />
						</div>
						<div align="left">
							<s:submit cssClass="btn btn-primary btn-md"></s:submit>
							<a class="reset_pass text-primary" href="#">Lost your
								password?</a>
						</div>

						<div class="clearfix"></div>
					</s:form>

			</section>


		</div>
 --%>
		<!-- /card-container -->
	</div>
	<div class="navbar navbar-fixed-bottom">
		<p align='center' class="bg-danger">Please use Google Chrome
			browser (Version 61.0.3163.100 or newest ) to access the system.</p>
		<p align='center' class="bg-info">Visit module was added to record
			patient visits.</p>
	</div>

	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>

</body>

</html>
