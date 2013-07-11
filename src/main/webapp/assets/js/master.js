function addToCart(prodId){
	var count=$.cookie('cartCount');
	if(isNaN(count)){
		count=1;
	}
	else{
		count++;
	}
	$.cookie('cartCount', count, { expires: 7, path: '/' });
	$('#cartCount').text(getCartCount());
}

function getCartCount(){
	var count=$.cookie('cartCount');
	return count;
}

function removeCookies(){
	$.removeCookie('cartCount', { path: '/' });
}