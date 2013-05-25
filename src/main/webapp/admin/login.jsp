<%@ taglib prefix="s" uri="/struts-tags"%>
<div class="page-header">
	<h3>Login</h3>
</div>
<jsp:include page="/layout/messages.jsp"></jsp:include>
<s:form id="loginForm" action="/admin/Login_login.action"	theme="simple" cssClass="form-horizontal offset3 well span6">
	<div class="control-group">
		<label class="control-label">Email Id:</label>
		<div class="controls">
			<s:textfield id="emailId" name="admin.emailId" />	
		</div>
		<br/>
		<label class="control-label">Password:</label>
		<div class="controls">
			<s:password id="password" name="admin.password" />	
		</div>
		<br/>
		<div class="controls">
			<s:submit id="submit" value="Login" cssClass="btn btn-primary"/>
			<button type="reset" class="btn">Reset</button>	
		</div>
	</div>
</s:form>
