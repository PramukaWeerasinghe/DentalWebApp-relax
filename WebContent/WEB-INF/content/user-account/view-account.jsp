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
			<div class="right_col col-md-8" role="main">
				<s:include value="/WEB-INF/content/user-account/header.jsp"></s:include>
				<h4>New User Account</h4>

				<s:actionmessage cssClass="alert alert-success" />

					<div class="form-group">
						<div class="row" id="dvContainer">
							<div class="col-md-12 col-sm-6 col-xs-12">
								<s:label>Employee name:</s:label>	<s:property value="%{employee.surname}"/>
							</div>
							<br>
							<div class="col-md-12 col-sm-6 col-xs-12">
								<s:label>NIC:</s:label>	<s:property value="%{employee.nic}"/>
							</div>
						</div>					
						<div class="row" id="dvContainer">
							<div class="col-md-2 col-sm-6 col-xs-12">
								<s:label>User name:</s:label>	<s:property value="%{userAccount.userName}"/>
							</div>
							<br>
							<div class="col-md-4 col-sm-6 col-xs-12">
								<s:label>User password:</s:label>	<s:property value="%{userAccount.userPassword}"/>
							</div>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-4 col-sm-6 col-xs-12">
							    <input type="button" class="btn btn-warning" value="Print" id="btnPrint" />
							</div>								
						</div>			
					</div>
				
			</div>
			
			
    <script type="text/javascript">
        $("#btnPrint").live("click", function () {
            var divContents = $("#dvContainer").html();
            var printWindow = window.open('', '', 'height=400,width=800');
            printWindow.document.write('<html><head><title>DIV Contents</title>');
            printWindow.document.write('</head><body >');
            printWindow.document.write(divContents);
            printWindow.document.write('</body></html>');
            printWindow.document.close();
            printWindow.print();
        });
    </script>			
			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
