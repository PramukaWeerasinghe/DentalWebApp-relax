<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<h4><i class="glyphicon glyphicon-list-alt" aria-hidden="true"></i> Previous visits records</h4>

<div>
	<s:if
		test="pager != null && pager.list != null && pager.list.size != 0">

		<table class="table table-condensed" id="patient_visit_tbl">
			<tr>
				<th>Date</th>
				<th>Department</th>
				<th>Comments</th>
			</tr>
			<s:iterator value="pager.list" status="rowIndex">
				<tr>
					<td><s:date	name='insertDatetime' format="yyyy MMMM dd - HH:mm:ss a"/></td>
					
					<td><s:property value="%{department}" /></td>

					<td><s:property value="%{comment}" /></td>

				</tr>
			</s:iterator>
		</table>

		<div class="text-center">
			<s:include value="/WEB-INF/content/common/pager.jsp"></s:include>
		</div>
	</s:if>
	<s:else>
		<div class="bg-info text-white">No Visits found</div>
	</s:else>



</div>