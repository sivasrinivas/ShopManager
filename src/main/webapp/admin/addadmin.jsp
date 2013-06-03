<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net" %>

<legend>Add Admin</legend>
<jsp:include page="/layout/messages.jsp"></jsp:include>
<s:form action="Admin_saveAdmin" id="addAdminForm"	theme="simple" cssClass="form-horizontal">
	<div class="control-group pull-left">
		<label class="control-label"><s:text name="First Name:"></s:text></label>
		<div class="controls">
			<s:textfield name="admin.firstName" id="firstName" />
		</div>
		<br /> 
		<label class="control-label"><s:text name="Middle Name:"></s:text></label>
		<div class="controls">
			<s:textfield name="admin.middleName" id="middleName" />
		</div>
		<br />
		<label class="control-label"><s:text name="Last Name:"></s:text></label>
		<div class="controls">
			<s:textfield name="admin.lastName" id="lastName" />
		</div>
		<br />
		<label class="control-label"><s:text name="Phone Number:"></s:text></label>
		<div class="controls">
			<s:textfield name="admin.phoneNumber" id="phoneMunber" />
		</div>
	</div>
	<div class="control-group pull-left">
		<label class="control-label"><s:text name="Email Id:"></s:text></label>
		<div class="controls">
			<s:textfield name="admin.emailId" id="emailId" />
		</div>
		<br />
		<label class="control-label"><s:text name="Password:"></s:text></label>
		<div class="controls">
			<s:password name="admin.password" id="passowrd" />
		</div>
		<br />
		<label class="control-label"><s:text name="Confirm Password:"></s:text></label>
		<div class="controls">
			<s:password name="cnfPassword" id="cnfPassword" />
		</div>
		<br />
		<label class="control-label"><s:text name="Role:"></s:text></label>
		<div class="controls">
			<s:select name="admin.role" id="role" list="roleList" />
		</div>
		<br />
		<div class="controls">
			<button type="submit" class="btn btn-primary">Add Admin</button>
			<button type="reset" class="btn">Reset</button>
		</div>
	</div>
</s:form>

<div>
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