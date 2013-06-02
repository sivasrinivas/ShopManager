<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>

<legend>Add Role</legend>
<jsp:include page="/layout/messages.jsp"></jsp:include>
<s:form action="Role_saveRole" id="addRoleForm"	theme="simple" cssClass="form-horizontal">
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

<div>
	<display:table uid="roleTable" name="roleList" id="row" class="table table-striped table-bordered table-condensed">
		<display:caption><strong>Roles</strong></display:caption>
		<display:column title="Name" property="name"></display:column>
	</display:table>	
</div>