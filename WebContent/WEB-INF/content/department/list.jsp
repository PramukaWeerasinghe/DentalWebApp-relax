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
			<s:include value="/WEB-INF/content/department/header.jsp"></s:include>
				<h4>Departments</h4>
				
				<s:actionerror cssClass="errorMessage"/>
			
				<s:if test="departments != null && departments.size != 0">
				
					<table class="table table-condensed" id="patient_tbl">
  						<tr>
  							<th>Index</th>
  							<th>Name</th>
  							<th>Comment</th>
  							<th>Action</th>
  						</tr>
						<s:iterator value="departments" status="rowIndex">
						  <tr>
							<td><s:property value="%{#rowIndex.index + 1}" /> </td>
  							<td><s:property value="%{name}" /></td>
  							<td><s:property value="%{comment}" /></td>
  							<td>
  								
  							</td>
  						  </tr>
						</s:iterator>
					</table>
					
				</s:if>
				<s:else>
					<div class="bg-info text-white">No departments found</div>				
				</s:else> 

				
			</div>
			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
