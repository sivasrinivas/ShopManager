<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="page-header">
	<h3>Registration</h3>
</div>

<s:form id="registerForm" action="Account_registerSubmit"
	cssClass="form-horizontal">

	<s:textfield id="userId" label="User Id" key="user.userId" />
	<s:textfield id="emailId" label="Email Id" key="user.emailId" />
	<s:password id="password" label="Password" key="user.password" />
	<s:password id="confPassword" label="Confirm Password"
		name="confPassword" />
	<s:submit class="btn" value="Register"></s:submit>

</s:form>

