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
			<s:include value="/WEB-INF/content/user-account/header.jsp"></s:include>
				<h4>Users (Accounts)</h4>
				
				<s:actionerror cssClass="errorMessage"/>
			
				<s:if test="pager != null && pager.list != null && pager.list.size != 0">
				
					<table class="table table-condensed" id="patient_tbl">
  						<tr>
  							<th>Index</th>
  							<th>User Name</th>
  							<th>User Category</th>
  							<th>Relation Id</th>
  							<th>Status</th>
  							<th>Options</th>
  						</tr>
						<s:iterator value="pager.list" status="rowIndex">
						  <tr>
							<td><s:property	value="%{pager.start + #rowIndex.index + 1}" /></td>
  							<td><s:property value="%{userName}" /></td>
  							<td><s:property value="%{categoryRelationId}" /></td>
  							<td>
  								<s:property value="%{relationId}" />
  							</td>
  							<td><s:property value="%{status}" />
  								<s:if test="status==2"> (Pending)</s:if>
  								<s:if test="status==1"> (Active)</s:if>
  							</td>
  							<td>
  								<s:url var="viewUserAccountUrl" namespace="/user-account" action="view.html">
			  						<s:param name="id" value="%{id}"></s:param>
			  					</s:url>
						
								<s:a href="%{#viewUserAccountUrl}" cssClass="btn btn-xs btn-primary" role="button">view</s:a>
											
								<s:if test="status == 1">
	  								<s:url var="disableUserAccountUrl" namespace="/user-account" action="#">
				  						<s:param name="id" value="%{id}"></s:param>
				  					</s:url>
									<s:a href="%{#disableUserAccountUrl}" cssClass="btn btn-xs btn-danger" role="button">disable</s:a>
								 </s:if>  	

								<!-- edit user account -->
  								<s:url var="editUserAccountUrl" namespace="/user-account" action="edit.html">
			  						<s:param name="id" value="%{id}"></s:param>
			  					</s:url>
						
								<s:a href="%{#editUserAccountUrl}" cssClass="btn btn-xs btn-primary" role="button">Edit</s:a>	

								<!-- reset password		 -->						 
  								<s:url var="viewUserAccountUrl" namespace="/user-account" action="view.html">
			  						<s:param name="id" value="%{id}"></s:param>
			  					</s:url>
						
								<s:a href="%{#viewUserAccountUrl}" cssClass="btn btn-xs btn-primary" role="button">Reset Pwd</s:a>								 
								 						
  							</td>
  						  </tr>
						</s:iterator>
					</table>
					
				</s:if>
				<s:else>
					<div class="bg-info text-white">No user accounts found</div>				
				</s:else> 
				
				<div class="text-center">
						<s:include value="/WEB-INF/content/common/pager.jsp"></s:include>
				</div>

				
			</div>
			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
