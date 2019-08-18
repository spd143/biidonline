$(document).ready(function(){
	$('.banner-slider').slick({
	  autoplay: false,
	  autoPlaySpeed:300,
	  dots: false,
	  useTransform: false,
	  infinite: true,
	  prevArrow: $('.prev-banner'),
      nextArrow: $('.next-banner'),
	})
});