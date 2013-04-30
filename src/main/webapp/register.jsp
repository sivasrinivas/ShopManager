<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register - ShopManager</title>
</head>
<body>

	<div class="title">
		<h2>Register</h2>
	</div>

	<s:form id="registerForm" action="register">
		<s:textfield id="userId" label="User Id" key="user.userId"/>
		<s:textfield id="emailId" label="Email Id" key="user.emailId"/>
		<s:password id="password" label="Password" key="user.password"/>
		<s:password id="confPassword" label="Confirm Password" name="confPassword"/>
		<s:submit value="Register"></s:submit>
	</s:form>

</body>
</html>