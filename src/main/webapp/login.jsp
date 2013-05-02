<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lgin - ShopManager</title>
<script type="text/javascript"	src="/ShopManager/res/js/jquery.js"></script>
<script type="text/javascript"	src="/ShopManager/res/js/bootstrap.js"></script>
<link rel="stylesheet" media="screen" href="/ShopManager/res/css/bootstrap.css"></link>
<link rel="stylesheet" media="screen" href="/ShopManager/res/css/bootstrap-responsive.css"></link>
</head>
<body>
	<div class="title">
		<h2>Login</h2>
	</div>
	<s:form id="loginForm" action="login">
		<s:textfield id="userId" key="user.userId" label="User Id" />
		<s:password id="password" key="user.password" label="Password" />
		<s:submit id="loginBtn" value="Login"></s:submit>
	</s:form>
</body>
</html>