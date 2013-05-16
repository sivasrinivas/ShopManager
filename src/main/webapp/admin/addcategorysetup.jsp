<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="page-header">
<h2>Add Category</h2>
</div>

<s:form action="Category_addCategory" id="addCategoryForm"	theme="simple" cssClass="form-horizontal">
	<div class="control-group">
		<label class="control-label"><s:text name="Name"></s:text></label>
		<div class="controls">
			<s:textfield name="category.name" id="categoryName" />
		</div>
		<br /> 
		<label class="control-label"><s:text name="Description"></s:text></label>
		<div class="controls">
			<s:textarea name="category.description" id="categoryDescription" />
		</div>
		<br />
		 <div class="controls">
			<p id="text">Sample Text</p>
		</div>
		<br />
		<div class="controls">
			<s:submit type="button" id="addCategoryBtn" value="Add"
				cssClass="btn btn-primary" />
		</div>
	</div>
</s:form>

<script type="text/javascript">
$(document).ready(function (){
	$("#text").editable("/ShopManager/admin/Category_addCategory.action",{
		indicator : "<img src='img/indicator.gif'>",
		type      : "textarea",
		submit    : "OK",
		cancel    : "Cancel",
	});
});
</script>
