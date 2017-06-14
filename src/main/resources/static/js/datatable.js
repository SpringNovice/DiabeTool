$(document).ready(function() {
	var table = $('#productTable').DataTable({
		"sAjaxSource" : "/products",
		"sAjaxDataProp" : "",
		"order" : [ [ 0, "asc" ] ],
		"aoColumns" : [  
			{"mData" : "Название"},
			{"mData" : "Белки (гр на 100 гр)"},
			{"mData" : "Жиры (гр на 100 гр)"}, 
			{"mData" : "Углеводы (гр на 100 гр)"},
			{"mData" : "Калории на 100 гр (ккал на 100 гр)"},
			{"mData" : "Хлебные единицы (на 100 гр)"},
			{"mData" : "Пищевые волокна (на 100 гр)"} 
			]
	})
});

