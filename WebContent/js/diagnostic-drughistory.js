jQuery(document).ready(function($) {
	$("#drughistory_other").change(function() {
		if ($(this).is(':checked'))
			$(".drughistory_other_details").show('slow');
		else
			$(".drughistory_other_details").hide('slow');
	}).change();
});

$("#drugTypeId").click(function() {
	var dropdown_value = $(this).val();
	console.log(dropdown_value);
	if (dropdown_value=='antibiotics'|| dropdown_value=='antidiabetes'|| dropdown_value=='antiepileptic'|| dropdown_value=='antihypertensives'|| dropdown_value=='analgesics'|| dropdown_value=='steroids'|| dropdown_value=='chemotherapy' ) {
		console.log('in');
		$("#data_insertion").show('slow');

	}else{
		$("#data_insertion").hide('slow');
	} 

});

/*$(document).ready(function() {
	$("input[id$='drugTypeId']").click(function() {
		alert('click event triggered');
	});
});*/


/*

 

*/