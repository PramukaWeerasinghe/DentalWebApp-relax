<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="form-group">
	<div class="row">
		<div class="col-md-8">
			<h5 style="text-decoration: underline;text-align: center;">Entered data: </h5>
			<h6>Tooth id: <span id="teethListValue_tbl">
			</span>
			</h6>
		</div>
	</div>
	<div class="row">
		<div class="col-md-8">
			<table class="table table-condensed">
				<thead>Area</thead>
				<tr>
					<th> </th>
					<th>Mesial</th>
					<th>Facial</th>
					<th>Distal</th>
					<th>Lingual</th>
					<th>Occlusal</th>
				</tr>	
				
				<tr>
					<th>Disorder code</th>
					<td id="mesial_tbl"></td>
					<td id="facial_tbl"></td>					
					<td id="distal_tbl"></td>
					<td id="lingual_tbl"></td>					
					<td id="occlusal_tbl"></td>					
				</tr>			
				<tr>
					<th>Other</th>
					<td id="mesial_tbl_other"></td>
					<td id="facial_tbl_other"></td>					
					<td id="distal_tbl_other"></td>
					<td id="lingual_tbl_other"></td>					
					<td id="occlusal_tbl_other"></td>						
				</tr>	

			</table>
		</div>
	</div>
	
	<script type="text/javascript">
		function updateTextarea(element_from, element_to)
		{
			console.log("elm from " + element_from + " ele to " + element_to);
			document.getElementById(element_to).textContent = document.getElementById(element_from).value;
		}
		
		//setInterval(InputChangeListener, 500);

	</script>
</div>