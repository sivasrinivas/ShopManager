<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="page-header">
<h2>Add Category</h2>
</div>
<s:form id="addCategoryForm" action="/admin/Category_addCategory"	cssClass="form-horizontal">
	<s:textfield id="name" name="emailId" label="Name" />
	<s:textarea id="description" name="description" label="Description" />
	<s:textarea id="subCategories" name="subCategories" label="Sub Categories"></s:textarea>
	<s:submit />
</s:form>
