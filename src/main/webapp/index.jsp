<%@ taglib prefix="s" uri="/struts-tags" %>

<!-- <div id="myCarousel" class="carousel slide">
  <ol class="carousel-indicators">
    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
    <li data-target="#myCarousel" data-slide-to="1"></li>
    <li data-target="#myCarousel" data-slide-to="2"></li>
    <li data-target="#myCarousel" data-slide-to="3"></li>
  </ol>
  Carousel items
  <div class="carousel-inner">
    <div class="active item">
    	<img alt="Img 0" src="./assets/img/0.jpg"></img>
    </div>
    <div class="item">
    	<img alt="Img 1" src="./assets/img/1.jpg"></img>
    </div>
    <div class="item">
    	<img alt="Img 2" src="./assets/img/2.jpg"></img>
    </div>
    <div class="item">
    	<img alt="Img 3" src="./assets/img/3.jpg"></img>
    </div>
  </div>
  Carousel nav
  <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
  <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
</div> -->

<div id="products">
	<s:iterator value="productList" status="status">
			<div id="product" class="pull-left well">
				<s:url id="url" action="Product_show" includeParams="get">
					<s:param name="product.id" value="id"/>
				</s:url>
				<s:a value="%{url}">
					<img src="/shop/assets/img/download.png" class="img-polaroid"/><br>
				</s:a>
				<s:a value="%{url}">
					<s:property value="name"/>&nbsp;<s:property value="color" /><br>
				</s:a>
				<b><s:property value="Price"/></b><br>
			</div>
	</s:iterator>
</div>
