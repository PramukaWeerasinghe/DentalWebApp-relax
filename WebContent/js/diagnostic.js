

jQuery(document).ready(function($) {
	$("#chk1").change(function() {
		if ($(this).is(':checked'))
			$(".other").show('slow');
		else
			$(".other").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chka").change(function() {
		if ($(this).is(':checked'))
			$(".othera").show('slow');
		else
			$(".othera").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chk2").change(function() {
		if ($(this).is(':checked'))
			$(".other1").show('slow');
		else
			$(".other1").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chk3").change(function() {
		if ($(this).is(':checked'))
			$(".other3").show('slow');
		else
			$(".other3").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chk4").change(function() {
		if ($(this).is(':checked'))
			$(".other4").show('slow');
		else
			$(".other4").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chk5").change(function() {
		if ($(this).is(':checked'))
			$(".other5").show('slow');
		else
			$(".other5").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chk6").change(function() {
		if ($(this).is(':checked'))
			$(".other6").show('slow');
		else
			$(".other6").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chk7").change(function() {
		if ($(this).is(':checked'))
			$(".other7").show('slow');
		else
			$(".other7").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#chk8").change(function() {
		if ($(this).is(':checked'))
			$(".other8").show('slow');
		else
			$(".other8").hide('slow');
	}).change();
});



$(document).ready(function() {
	$("input[name$='patientDiagnosticHabits1.smoking']").click(function() {
		var radio_value = $(this).val();
		if (radio_value == 'Yes') {
			$(".box4").show('slow');

		} else if (radio_value == 'No') {

			$(".box4").hide('slow');
		}

	});
});
$(document).ready(function() {
	$("input[name$='patientDiagnosticHabits2.alcohol']").click(function() {
		var radio_value = $(this).val();
		if (radio_value == 'Regular Drinker') {
			$(".box5").show('slow');

		} else if (radio_value == 'Frequent Drinker') {

			$(".box5").show('slow');
		} else if (radio_value == 'Occasional Drinker') {

			$(".box5").show('slow');
		} else if (radio_value == 'No') {

			$(".box5").hide('slow');
		}

	});
});

$(document)
		.ready(
				function() {
					$(
							"input[name$='patientDiagnosticDentalHistory.orthodonticTreatment']")
							.click(function() {
								var radio_value = $(this).val();
								if (radio_value == "Yes") {
									$(".box0").show('slow');

								} else if (radio_value == "No") {

									$(".box0").hide('slow');
								}

							});
				});

$(document).ready(
		function() {
			$("input[name$='patientDiagnosticDentalHistory.restorativeRx']")
					.click(function() {
						var radio_value = $(this).val();
						if (radio_value == "Yes") {
							$(".box1").show('slow');

						} else if (radio_value == "No") {

							$(".box1").hide('slow');
						}

					});
		});

$(document).ready(
		function() {
			$("input[name$='patientDiagnosticDentalHistory.periodontalRx']")
					.click(function() {
						var radio_value = $(this).val();
						if (radio_value == "Yes") {
							$(".options").show('slow');

						} else if (radio_value == "No") {

							$(".options").hide('slow');
						}

					});
		});

$(document)
		.ready(
				function() {
					$(
							"input[name$='patientDiagnosticDentalHistory.extractionComplications']")
							.click(function() {
								var radio_value = $(this).val();
								if (radio_value == "Yes") {
									$(".box13").show('slow');

								} else if (radio_value == "No") {

									$(".box13").hide('slow');
								}

							});
				});

$(document).ready(
		function() {
			$("input[name$='patientDiagnosticDentalHistory.extraction']")
					.click(function() {
						var radio_value = $(this).val();
						if (radio_value == "Yes") {
							$(".compli").show('slow');

						} else if (radio_value == "No") {

							$(".compli").hide('slow');
							$(".box13").hide('slow');
						}

					});
		});


$(document).ready(
		function() {
			$("input[name$='patientDiagnosticMedicalRecord4.tmd']")
					.click(function() {
						var radio_value = $(this).val();
						if (radio_value == "Yes") {
							$(".tmdtext").show('slow');

						} else if (radio_value == "No") {

							$(".tmdtext").hide('slow');
							
						}

					});
		});


jQuery(document).ready(function($) {
	$("#cbx1").change(function() {
		if ($(this).is(':checked'))
			$(".box1").show('slow');
		else
			$(".box1").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx2").change(function() {
		if ($(this).is(':checked'))
			$(".box2").show('slow');
		else
			$(".box2").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx3").change(function() {
		if ($(this).is(':checked'))
			$(".box3").show('slow');
		else
			$(".box3").hide('slow');
	}).change();
});

jQuery(document).ready(function($) {
	$("#cbx6").change(function() {
		if ($(this).is(':checked'))
			$(".box6").show('slow');
		else
			$(".box6").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx7").change(function() {
		if ($(this).is(':checked'))
			$(".box7").show('slow');
		else
			$(".box7").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx8").change(function() {
		if ($(this).is(':checked'))
			$(".box8").show('slow');
		else
			$(".box8").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx9").change(function() {
		if ($(this).is(':checked'))
			$(".box9").show('slow');
		else
			$(".box9").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx10").change(function() {
		if ($(this).is(':checked'))
			$(".box10").show('slow');
		else
			$(".box10").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx11").change(function() {
		if ($(this).is(':checked'))
			$(".box11").show('slow');
		else
			$(".box11").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx12").change(function() {
		if ($(this).is(':checked'))
			$(".box12").show('slow');
		else
			$(".box12").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx13").change(function() {
		if ($(this).is(':checked'))
			$(".box13").show('slow');
		else
			$(".box13").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx14").change(function() {
		if ($(this).is(':checked'))
			$(".box14").show('slow');
		else
			$(".box14").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx15").change(function() {
		if ($(this).is(':checked'))
			$(".box15").show('slow');
		else
			$(".box15").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx16").change(function() {
		if ($(this).is(':checked'))
			$(".box16").show('slow');
		else
			$(".box16").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx17").change(function() {
		if ($(this).is(':checked'))
			$(".box17").show('slow');
		else
			$(".box17").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx18").change(function() {
		if ($(this).is(':checked'))
			$(".box18").show('slow');
		else
			$(".box18").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx19").change(function() {
		if ($(this).is(':checked'))
			$(".box19").show('slow');
		else
			$(".box19").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx20").change(function() {
		if ($(this).is(':checked'))
			$(".box20").show('slow');
		else
			$(".box20").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx21").change(function() {
		if ($(this).is(':checked'))
			$(".box21").show('slow');
		else
			$(".box21").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx22").change(function() {
		if ($(this).is(':checked'))
			$(".box22").show('slow');
		else
			$(".box22").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx23").change(function() {
		if ($(this).is(':checked'))
			$(".box23").show('slow');
		else
			$(".box23").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx24").change(function() {
		if ($(this).is(':checked'))
			$(".box24").show('slow');
		else
			$(".box24").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx25").change(function() {
		if ($(this).is(':checked'))
			$(".box25").show('slow');
		else
			$(".box25").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx26").change(function() {
		if ($(this).is(':checked'))
			$(".box26").show('slow');
		else
			$(".box26").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx27").change(function() {
		if ($(this).is(':checked'))
			$(".box27").show('slow');
		else
			$(".box27").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx28").change(function() {
		if ($(this).is(':checked'))
			$(".box28").show('slow');
		else
			$(".box28").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx29").change(function() {
		if ($(this).is(':checked'))
			$(".box29").show('slow');
		else
			$(".box29").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx30").change(function() {
		if ($(this).is(':checked'))
			$(".box30").show('slow');
		else
			$(".box30").hide('slow');
	}).change();
});
jQuery(document).ready(function($) {
	$("#cbx31").change(function() {
		if ($(this).is(':checked'))
			$(".box31").show('slow');
		else
			$(".box31").hide('slow');
	}).change();
});


