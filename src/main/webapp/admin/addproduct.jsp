<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>

<legend>Add Product</legend>
<jsp:include page="/layout/messages.jsp"></jsp:include>
<s:form namespace="/admin" action="Product_insertProduct" id="addProductForm"	theme="simple" cssClass="form-horizontal pull-left">
	<div class="control-group pull-left">
		<label class="control-label"><s:text name="Name:"></s:text></label>
		<div class="controls">
			<s:textfield name="product.name" id="productName" />
		</div>
		<br />
		<label class="control-label"><s:text name="Color:"></s:text></label>
		<div class="controls">
			<s:textfield name="product.color" id="productColor" />
		</div>
		<br />
		<label class="control-label"><s:text name="Brand:"></s:text></label>
		<div class="controls">
			<s:textfield name="product.brandName" id="productBrand" />
		</div>
		<br />
		<label class="control-label"><s:text name="Countable:"></s:text></label>
		<div class="controls">
  			<input type="radio" name="product.isCountable" id="itemRadio" value="true" checked>
  			Yes
  			<input type="radio" name="product.isCountable" id="quantityRadio" value="false">
  			No
		</div>
		<br> 
		<label class="control-label"><s:text name="Price:"></s:text></label>
		<div class="controls">
			<s:textfield name="product.price" id="productPrice" />
		</div>
		<br>
	</div>
	<div class="control-group pull-left">
		<label class="control-label"><s:text name="Dimensions:"></s:text></label>
		<div class="controls">
			<s:textfield name="product.dimensions" id="productDimensions" />
		</div>
		<br>
		<label class="control-label"><s:text name="New:"></s:text></label>
		<div class="controls">
  			<input type="radio" name="product.isNew" id="itemRadio" value="true" checked>
  			Yes
  			<input type="radio" name="product.isNew" id="quantityRadio" value="false">
  			No
		</div>
		<br>
		<label class="control-label"><s:text name="Deprecated:"></s:text></label>
		<div class="controls">
  			<input type="radio" name="product.isDeprecated" id="itemRadio" value="true">
  			Yes
  			<input type="radio" name="product.isDeprecated" id="quantityRadio" value="false" checked>
  			No
		</div>
		<br>
		<label class="control-label"><s:text name="Image:"></s:text></label>
		<div class="controls">
			<input type="file" />
		</div>
		<br>
		<div class="controls">
			<s:submit type="button" id="addProductBtn" value="Add"	cssClass="btn btn-primary" />
			<input type="reset" id="resetBtn" value="Reset"	class="btn" />
		</div>
	</div>
</s:form>

<div>
	<%-- <display:table uid="productTable" name="productList" id="row" class="table table-striped table-bordered table-condensed">
		<display:caption><strong>Products</strong></display:caption>
		<display:column title="SKU" property="SKU"></display:column>
		<display:column title="Name" property="name"></display:column>
		<display:column title="Price" property="price"></display:column>
	</display:table> --%>	

</div>

