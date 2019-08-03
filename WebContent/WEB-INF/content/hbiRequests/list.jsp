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
			<s:include value="/WEB-INF/content/xrayRequests/header.jsp"></s:include>
				<div class="row">
						<h3>Pending HBI Requests <span style="font-size:0.6em">
							(Number of Reports: <s:property value="%{pager.list.size}"/> )</span></h3>

  								<s:url var="acceptedXrayRequestUrl" namespace="/patient-request-xray" action="listAccepted.html">
			  						<s:param name="id" value="%{id}"></s:param>
			  					</s:url>
						
								<s:a href="%{#acceptedXrayRequestUrl}" cssClass="btn btn-xs btn-primary" role="button">Accepted requests</s:a>
	
				</div>
				<hr>
				
				<s:actionerror cssClass="errorMessage"/>
			
				<s:if test="pager != null && pager.list != null && pager.list.size != 0">
				
					<table class="table table-condensed" id="patient_tbl">
  						<tr>
  							<th>Index</th>
  							<th>Patient</th>
  							<th>Patient serial</th>  							
  							<th>Department</th>
  							<th>Requested date</th>
  							<th>Status</th>
  							<th>Options</th>
  						</tr>
						<s:iterator value="pager.list" status="rowIndex">
						  <tr>
							<td><s:property value="%{pager.start + #rowIndex.index + 1}" /> </td>
  							<td>
  								<s:url var="patientViewBySerialUrl" namespace="/patient" action="viewBySerial.html">
  									<s:param value="%{patientId}" name="serial"></s:param>
  								</s:url>
  								<s:a href="%{#patientViewBySerialUrl}" cssClass="btn btn-xs btn-success" role="button">Patient</s:a>
							</td>  
							<td><s:property value="%{patientId}"/></td>							
  							<td><s:property value="%{department}"/></td>
  							
  							<td><s:property value="%{insertDatetime}" /></td>
  							<td><s:property value="%{status}" />
  								<s:if test="status==2"> (Pending)</s:if>
  								<s:if test="status==1"> (Completed)</s:if>
  							</td>
  							
  							<td>
  								<s:url var="viewXrayRequestUrl" namespace="/patient-request-xray" action="view.html">
			  						<s:param name="id" value="%{id}"></s:param>
			  					</s:url>
						
								<s:a href="%{#viewXrayRequestUrl}" cssClass="btn btn-xs btn-primary" role="button">view</s:a>

  								<s:url var="acceptXrayRequestUrl" namespace="/patient-request-xray" action="setAcceptedStatus.html">
			  						<s:param name="id" value="%{id}"></s:param>
			  					</s:url>
						
															
								<s:if test="status == 2">
								<s:a href="%{#acceptXrayRequestUrl}" cssClass="btn btn-xs btn-info" role="button">accept</s:a>
								 </s:if>
			  							
  							</td>
  						  </tr>
						</s:iterator>
					</table>
					
					<div class="text-center">
	                   <s:include value="/WEB-INF/content/common/pager.jsp" ></s:include>
	                </div>
				</s:if>
				<s:else>
					<div class="bg-info text-white">No reports found</div>				
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
