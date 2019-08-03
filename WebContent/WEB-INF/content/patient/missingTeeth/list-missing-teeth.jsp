<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<script type="text/javascript">
<!--
//view.html?patientId=1526589943686
//-->
function reportWindow(id,mstFormId) {

    url="view.html?";
    url+="id="+id;
    winddd = window.open(url,"report",'width=800px,resizable=no, height=400px, menubar=no, toolbar=no, location=no, scrollbars=no');
    winddd.focus();
    }
    
var modal = document.querySelector(".modal");
var trigger = document.querySelector(".trigger");
var closeButton = document.querySelector(".close-button");

function toggleModal() {
    modal.classList.toggle("show-modal");
}

function windowOnClick(event) {
    if (event.target === modal) {
        toggleModal();
    }
}

trigger.addEventListener("click", toggleModal);
closeButton.addEventListener("click", toggleModal);
window.addEventListener("click", windowOnClick);
    
</script>

<style>
<!--

-->
.modal {
    position: fixed;
    left: 0;
    top: 0;
    width: 100%;
    height: 100%;
    background-color: rgba(0, 0, 0, 0.5);
    opacity: 0;
    visibility: hidden;
    transform: scale(1.1);
    transition: visibility 0s linear 0.25s, opacity 0.25s 0s, transform 0.25s;
}
.modal-content {
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    background-color: white;
    padding: 1rem 1.5rem;
    width: 24rem;
    border-radius: 0.5rem;
}
.close-button {
    float: right;
    width: 1.5rem;
    line-height: 1.5rem;
    text-align: center;
    cursor: pointer;
    border-radius: 0.25rem;
    background-color: lightgray;
}
.close-button:hover {
    background-color: darkgray;
}
.show-modal {
    opacity: 1;
    visibility: visible;
    transform: scale(1.0);
    transition: visibility 0s linear 0s, opacity 0.25s 0s, transform 0.25s;
}

</style>

<div class="modal">
    <div class="modal-content">
        <span class="close-button">×</span>
        <h1>Hello, I am a modal!</h1>
    </div>
</div>
				<h4>Previous records</h4>

				<div>
					<s:if
						test="pager != null && pager.list != null && pager.list.size != 0">
						<table class="table table-condensed" id="patient_missingteeth_tbl">
							<tr>
								<th>Index</th>
								<th>Date</th>
								<th>Type</th>
								<th>Missing teeth</th>
								<th>Action</th>

							</tr>
							<s:iterator value="pager.list" status="rowIndex">
								<tr>
									<td><s:property value="%{pager.start + #rowIndex.index + 1}" /></td>
									<td><s:property value="%{insertDatetime}" /></td>
									<td><s:property value="%{teethType}" /></td>
									<td><s:property value="%{teethList}" /></td>
									
									<td>
										<button class="btn btn-default" >view</button>
<%-- 										<button class="btn btn-default" onclick="reportWindow('<s:property value="%{patientId}" />','new')">view</button> --%>
										<s:if test="admin">
											<s:url var="teethDeleteTemporaryUrl" namespace="/patient-missing-teeth" action="deleteTemporary.html">
												<s:param value="%{id}" name="id"></s:param>
											</s:url>
											<s:a href="%{#teethDeleteTemporaryUrl}" cssClass="btn btn-danger"
												role="button"> Delete temporary</s:a>

										</s:if>
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
