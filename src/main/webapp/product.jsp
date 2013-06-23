<%@ taglib prefix="s" uri="/struts-tags"%>

<div id="product">
	<legend>Product</legend>
	<div id="product" class="pull-left well">
		<img src="/shop/assets/img/download.png" class="img-polaroid" /> <br>
		<s:property value="product.name" />
		&nbsp;
		<s:property value="product.color" />
		<br> <b><s:property value="product.price" /></b><br>
	</div>
</div>
