<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div class="container-fluid">
	<div class="row-fluid">
		<div class="span3">
			<tiles:insertAttribute name="sidebar" />
			<br>
			<tiles:insertAttribute name="related" />
		</div>
		<div class="span9">
			<tiles:insertAttribute name="body" />
		</div>
	</div>
</div>
