<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<h4>Previous records</h4>

<div>
	<s:if
		test="pager != null && pager.list != null && pager.list.size != 0">
		<table class="table table-condensed" id="patient_missingteeth_tbl">
			<tr>
				<th>Index</th>
				<th>Date</th>
				<th>teethInfo</th>
				<th>Action</th>

			</tr>
			<s:iterator value="pager.list" status="rowIndex">
				<tr>
					<td><s:property value="%{pager.start + #rowIndex.index + 1}" /></td>
					<td><s:property value="%{patientTeethDisorder.insertDatetime}" /></td>
					<td><s:property value="%{patientTeethDisorder.teethInfo}" /></td>

					<td>
						<button class="btn btn-default">view</button>

					</td>

				</tr>
			</s:iterator>
		</table>

		<div class="text-center">
			<s:include value="/WEB-INF/content/common/pager.jsp"></s:include>
		</div>

	</s:if>
	<s:else>
		<p>No results found</p>
	</s:else>



</div>