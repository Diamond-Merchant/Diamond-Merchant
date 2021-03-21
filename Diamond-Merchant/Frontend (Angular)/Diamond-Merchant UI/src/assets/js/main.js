function mobileCheck() {
	var winWidth = $(window).width();
	if (winWidth <= 768) {
		$("#sidebar").after($("#body .pagination:first"))
	} else {
		$(".products-wrap").before($("#body .pagination:first"))
	}
}
$(document).ready(function () {
	$("input[type=checkbox]").crfi();
	$("select").crfs();
	$("#slider ul").bxSlider({
		controls: false,
		auto: true,
		mode: 'fade',
		preventDefaultSwipeX: false
	});
	$(".last-products .products").bxSlider({
		pager: false,
		minSlides: 1,
		maxSlides: 5,
		slideWidth: 235,
		slideMargin: 0
	});
	$(".tabs .nav a").click(function () {
		var container = $(this).parentsUntil(".tabs").parent();
		if (!$(this).parent().hasClass("active")) {
			container.find(".nav .active").removeClass("active")
			$(this).parent().addClass("active")
			container.find(".tab-content").hide()
			$($(this).attr("href")).show();
		};
		return false;
	});


	mobileCheck();
	$(window).resize(function () {
		mobileCheck();
	});
});