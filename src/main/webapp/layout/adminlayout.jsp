<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="/ShopManager/assets/js/jquery.js"></script>
<script type="text/javascript" src="/ShopManager/assets/js/bootstrap.js"></script>
<link rel="stylesheet" media="screen"
	href="/ShopManager/assets/css/bootstrap.css"></link>
<link rel="stylesheet" media="screen"
	href="/ShopManager/assets/css/bootstrap-responsive.css"></link>
<!-- custom defined css -->
<link rel="stylesheet" href="assets/css/basic.css"></link>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="row">
				<tiles:insertAttribute name="header" />
			</div>
			<div id="main-container" class="row">
				<div class="span9 center">
					<tiles:insertAttribute name="body" />
				</div>
			</div>
			<div class="row">
				<tiles:insertAttribute name="footer" />
			</div>
		</div>
	</div>

</body>
</html>