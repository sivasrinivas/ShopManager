<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span3">
			<jsp:include page="sidebar.jsp"></jsp:include>
			<br>
			<jsp:include page="related.jsp"></jsp:include>
		</div>
		<div class="span9">
			<jsp:include page="body.jsp"></jsp:include>
		</div>
	</div>
</div>
