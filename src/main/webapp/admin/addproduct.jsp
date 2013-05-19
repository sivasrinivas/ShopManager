<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>
<div class="page-header">
<h2>Add Product</h2>
</div>

<s:form action="Product_insertProduct" id="addProductForm"	theme="simple" cssClass="form-horizontal pull-left">
	<div class="control-group">
		<label class="control-label"><s:text name="Name:"></s:text></label>
		<div class="controls">
			<s:textfield name="product.name" id="productName" />
		</div>
		<br /> 
		<label class="control-label">
			<s:text name="Price:"></s:text>
		</label>
		<div class="controls">
			<s:textfield name="product.price" id="productPrice" />
		</div>
		<br>
		<div class="controls">
			<s:submit type="button" id="addProductBtn" value="Add"	cssClass="btn btn-primary" />
			<input type="reset" id="resetBtn" value="Reset"	class="btn" />
		</div>
	</div>
</s:form>

<div>
	<display:table uid="productTable" name="productList" id="row" class="table table-striped table-bordered table-condensed">
		<display:caption><strong>Products</strong></display:caption>
		<display:column title="SKU" property="SKU"></display:column>
		<display:column title="Name" property="name"></display:column>
		<display:column title="Price" property="price"></display:column>
	</display:table>	

</div>

