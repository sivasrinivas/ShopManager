<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/shop/assets/js/jquery.js"></script>
<script type="text/javascript" src="/shop/assets/js/bootstrap.js"></script>
<!-- jEditable plugin -->
<script type="text/javascript" src="/shop/assets/js/jquery.jeditable.js"></script>
<link rel="stylesheet" media="screen" type="text/css"	href="/shop/assets/css/bootstrap.css"></link>
<link rel="stylesheet" media="screen" type="text/css"	href="/shop/assets/css/bootstrap-responsive.css"></link>
<!-- custom defined css -->
<link rel="stylesheet" href="/shop/assets/css/basic.css"></link>

<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div id="main-wrapper" class="container">
		<div class="row">
			<div id="main-header">
				<tiles:insertAttribute name="header" />
			</div>
			<div id="main-container">
				<tiles:insertAttribute name="body" />
			</div>
			<footer class="footer span12" id="main-footer">
				<tiles:insertAttribute name="footer" />
			</footer>
		</div>
	</div>
</body>
</html>