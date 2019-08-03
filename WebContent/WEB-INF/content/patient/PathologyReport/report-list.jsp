<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<h4>Previous Reports: Number of Reports: <s:property value="pathologyReports.size" /></h4>

<s:if test="pathologyReports != null && pathologyReports.size != 0" >
	<table class="table table-condensed" id="patient_tbl">
		<tr>
			<th></th>
			<th>Accession No.</th>
			<th>PR No.</th>
			<th>Verified by</th>
			<th>Note</th>
			<th>Report date</th>
			<th>File</th>
		</tr>
		<s:iterator value="pathologyReports" status="rowIndex">
			<tr>
				<td><s:property value="%{#rowIndex.index + 1}"/></td>
				<td><s:property value="%{accessionNumber}"/></td>
				<td><s:property value="%{prNumber}"/></td>
				<td><s:property value="%{verifiedBy}"/></td>
				<td><s:property value="%{note}"/></td>
				<td title="<s:date name='%{reportDate}' nice='true'/>">
					<s:date name="%{reportDate}" format="yyyy-MM-dd"/> 
					
				</td>
				<td>
					<s:url var="downloadPathologyUrl" namespace="/document" action="download-pathology-report.html">
  						<s:param name="entityId" value="%{id}"></s:param>
  					</s:url>
			
					<s:a href="%{#downloadPathologyUrl}" cssClass="btn btn-xs btn-primary" role="button">Download</s:a>
  								
				</td>
			</tr>
		</s:iterator>
	</table>
</s:if>
<s:else>
	<h4><i>No previous reports.</i></h4>
</s:else>