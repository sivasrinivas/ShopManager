<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form id="loginForm" action="/admin/Login_login"	cssClass="form-horizontal">
	<s:textfield id="emailId" name="emailId" label="Email Id" />
	<s:password id="password" name="password" label="Password" />
	<s:submit />
</s:form>
