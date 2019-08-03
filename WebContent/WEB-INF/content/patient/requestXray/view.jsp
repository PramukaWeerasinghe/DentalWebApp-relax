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

				<s:include value="/WEB-INF/content/patient/header.jsp"></s:include>


				<h2>Radiology Request Form</h2>

				<s:url var="printXrayRequestUrl" namespace="/patient-request-xray"
					action="information-pdf.html">
					<s:param name="id" value="%{id}"></s:param>
				</s:url>
				<s:a href="%{#printXrayRequestUrl}" cssClass="btn btn-success"
					target="_blank">
					<span class="glyphicon glyphicon-print"></span> Print-Radiology Request
				</s:a>

				<s:url var="acceptXrayRequestUrl" namespace="/patient-request-xray"
					action="setAcceptedStatus.html">
					<s:param name="id" value="%{id}"></s:param>
				</s:url>


				<s:if test= "%{patientRequestXray.status==2}">
					<s:a href="%{#acceptXrayRequestUrl}" cssClass="btn btn-xs btn-info"
						role="button">accept</s:a>
				</s:if>
				<div>					
				<hr>		

					<div class="form-group float">

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Patient Serial Number:
							
									</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestXray.patientId}" />
								</div>							
							</div>
							
							<div class="row">
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label for="name">Clinical history:
									</label>
								</div>
								
								<div class="col-md-4 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestXray.clinicalHistory}" />
								</div>	

																						
							</div>

						</div>

							<div class="form-group">
								<div class="row">
									<div class="col-md-2 col-sm-12 col-xs-6">
										<label for="name">Others:</label>
									</div>

									<div class="col-md-4 col-sm-12 col-xs-12">
										<s:property value="%{patientRequestXray.comment}"/>
									</div>								
								</div>
							</div>					

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-6 col-sm-12 col-xs-6">
								
									<div class="container">
									  <ul class="list-group">
									    <li class="list-group-item">IOPA: <span class="badge"><s:property value="%{patientRequestXray.iopa}" /></span></li>
									    <s:if test="%{!patientRequestXray.bitewing.isEmpty()}">
									    	<li class="list-group-item">BITEWING: <span class="badge"><s:property value="%{patientRequestXray.bitewing}" /></span></li>
									    </s:if>
									    
									    <li class="list-group-item">OCCLUSAL VIEWS: <span class="badge"><s:property value="%{patientRequestXray.occlusalView}" /></span></li>
									 
									    <s:if test="%{patientRequestXray.opg.equals('true')}">
									   		<li class="list-group-item">OPG: <span class="badge">Digital</span></li>									 
									    </s:if>
									    
									     <li class="list-group-item">Views: 
									    
									    	<s:if test="%{patientRequestXray.sialogram.equals('true')}"><span class="badge">Sialogram</span></s:if>
								    		<s:if test="%{patientRequestXray.cephalogram.equals('true')}"><span class="badge">Cephalogram</span></s:if>
								    		<s:if test="%{patientRequestXray.tmjView.equals('true')}"><span class="badge">TMJ view</span></s:if>
								    		<s:if test="%{patientRequestXray.omViewOfSkull.equals('true')}"><span class="badge">OM view</span></s:if>								    	
									    	<s:if test="%{patientRequestXray.cspineneck.equals('true')}"><span class="label label-success">C-SPINE / NECK</span></s:if>
									    </li>
									        
									  </ul>
									  
									  <ul class="list-group">
									  									    
									    <s:if test="%{!patientRequestXray.mandibularView.isEmpty()}">
									     	<li class="list-group-item">MANDIBULAR VIEW: <span class="badge"><s:property value="%{patientRequestXray.mandibularView}" /></span></li>
									    </s:if>
									    <s:if test="%{!patientRequestXray.skullView.isEmpty()}">
									    	<li class="list-group-item">SKULL VIEW: <span class="badge"><s:property value="%{patientRequestXray.skullView}" /></span></li>
									    </s:if>
									    
									    <s:if test="%{!patientRequestXray.chestXray.isEmpty()}">
									    	<li class="list-group-item">CHEST_XRAY: <span class="badge"><s:property value="%{patientRequestXray.chestXray}" /></span></li>
									    
									    </s:if>
									    

									    
									    <s:if test="%{!patientRequestXray.cbct.isEmpty()}">
									   		<li class="list-group-item">CBCT:<span class="badge"><s:property value="%{patientRequestXray.cbct}" /></span></li>
									   
									    </s:if>
									    
									    <s:if test="%{!patientRequestXray.uss.isEmpty()}">
									   		<li class="list-group-item">USS:<span class="badge"><s:property value="%{patientRequestXray.uss}" /></span></li>										
									    </s:if>
									     										
									
									  </ul>
									  
									  
									  
									  
									  
									</div>
								
								</div>
								
								<div class="col-md-6 col-sm-12 col-xs-6">
									<div class="container">

									</div>

									<div class="col-md-8 col-sm-12 col-xs-12">
										<img src='<s:url value="/images/ToothNumberingSystem.png" />'
											style="display: block; margin: 0 auto; width: 100%;"
											alt="Tooth Numbering System" />
									</div>
								
								</div>
								
								
							</div>
						</div>							
							

						<div class="form-group">
							<div class="row">
								
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label>Department/ Division:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">					
									<s:property value="%{patientRequestXray.department}" />
								</div>

								
								<div class="col-md-2 col-sm-12 col-xs-6">
									<label>Requesting Officer:</label>
								</div>
								
								<div class="col-md-2 col-sm-12 col-xs-12">
									<s:property value="%{patientRequestXray.officerName}" />
								</div>								
							</div>
						</div>


						
					</div>





					<br>
					<div class="form-group">
						<div class="row">
											
						
						
							<div class="col-md-2 col-sm-4 col-xs-12"></div>
							<s:if test="patientRequestXray.id != null && !patientRequestXray.id.empty">
								<div class="col-md-3 col-sm-4 col-xs-12">
										<s:url var="patientRadiologyEditUrl" namespace="/patient-request-xray" action="edit.html">
											<s:param name="id" value="%{patientRequestXray.id}"></s:param>
										</s:url>
										<s:a href="%{#patientRadiologyEditUrl}" cssClass="btn btn-success" cssStyle="width:120px">
											<i class="fa fa-pencil-square-o" aria-hidden="true"></i> Edit </s:a>								
								
								</div>
							</s:if>
							<s:else>
								<div class="col-md-2 col-sm-4 col-xs-12">
									<s:submit cssClass="btn btn-success" value="Insert"></s:submit>
								</div>
							</s:else>
						</div>
					</div>

				</div>

			<br>

			</div>
			<!-- /page content -->

		</div>
	</div>
	<s:include value="/WEB-INF/content/common/footer.jsp"></s:include>
	<!-- Custom Theme Scripts -->
	<s:include value="/WEB-INF/content/common/js-include.jsp"></s:include>
</body>
</html>
