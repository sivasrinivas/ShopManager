<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>

<legend>Add Role</legend>
<jsp:include page="/layout/messages.jsp"></jsp:include>
<s:form action="Role_saveRole" id="addRoleForm"	theme="simple" cssClass="form-horizontal pull-left">
	<div class="control-group">
		<label class="control-label"><s:text name="Role Name:"></s:text></label>
		<div class="controls">
			<s:textfield name="role.name" id="roleName" />
		</div>
		<br /> 
		<div class="controls">
			<button type="submit" class="btn btn-primary">Add Role</button>
			<button type="reset" class="btn">Reset</button>
		</div>
	</div>
</s:form>

<div class="offset1 span5 pull-left">
	<display:table uid="roleTable" name="roleList" id="row" class="table table-striped table-bordered table-condensed">
		<display:caption><strong>Roles</strong></display:caption>
		<display:column title="Name">${row}</display:column>
		<display:column title="Operation">
			<s:a action="Role_removeRole" tooltip="Delete Rule" includeParams="all">
				<s:param name="roleName">${row}</s:param>
				<i class="icon-trash"></i>
			</s:a>
		</display:column>
	</display:table>	
</div>