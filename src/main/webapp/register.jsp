<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register - ShopManager</title>
<script type="text/javascript" src="/ShopManager/res/js/jquery.js"></script>
<script type="text/javascript" src="/ShopManager/res/js/bootstrap.js"></script>
<link rel="stylesheet" media="screen"
	href="/ShopManager/res/css/bootstrap.css"></link>
<link rel="stylesheet" media="screen"
	href="/ShopManager/res/css/bootstrap-responsive.css"></link>
</head>
<body>

	<div class="container-fluid">
		<div class="page-header">
			<h3>Registration</h3>

			<form class="form-search">
				<input type="text" class="input-medium search-query">
				<button type="submit" class="btn">Search</button>
			</form>

		</div>
		<div class="span3">
			<strong>Categories</strong>
		</div>
		<div class="span9">
			<s:form id="registerForm" action="register" cssClass="form-horizontal">

				<div class="control-group">
					<label class="control-label">Email Id:</label>
					<div class="controls">
						<input type="text" id="inputEmail" placeholder="Email">
					</div>
				</div>
				
				<s:textfield id="userId" label="User Id" key="user.userId" />
				<s:textfield id="emailId" label="Email Id" key="user.emailId" />
				<s:password id="password" label="Password" key="user.password" />
				<s:password id="confPassword" label="Confirm Password" name="confPassword" />
				<s:submit class="btn" value="Register"></s:submit>

			</s:form>
		</div>
	</div>

</body>
</html>