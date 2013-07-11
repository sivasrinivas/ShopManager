<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<script type="text/javascript" src="./assets/js/jquery.js"></script>
<script type="text/javascript" src="./assets/js/bootstrap.js"></script>
<script type="text/javascript" src="./assets/js/master.js"></script>
<script type="text/javascript" src="./assets/js/jquery.cookie.js"></script>

<link rel="stylesheet"	href="./assets/css/bootstrap.css"></link>
<link rel="stylesheet"	href="./assets/css/bootstrap-responsive.css"></link>
<!-- custom defined css -->
<link rel="stylesheet" media="screen"	href="./assets/css/basic.css"></link>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<jsp:include page="/layout/user-navbar.jsp"/>
	
	<section id="main-container">
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span3">
					<tiles:insertAttribute name="sidebar" />
					<tiles:insertAttribute name="related" />
				</div>
				<div class="span9">
					<tiles:insertAttribute name="body" />
				</div>		
			</div>
		</div>
	</section>
	<footer id="main-footer" class="footer"> 
		<tiles:insertAttribute	name="footer" /> 
	</footer>

</body>
</html>