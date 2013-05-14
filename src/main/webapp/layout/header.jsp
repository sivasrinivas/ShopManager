<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="span3">
	<img src="assets/img/logo.png" style="width:200px;"></img>
</div>
<div class="span6">
	<s:form id="searchForm" action="#"cssClass="navbar-form pull-left">
  		<input type="text" class="span2">
  		<button type="submit" class="btn">Submit</button>
	</s:form>
</div>
<div class="span3">
	<s:a href="/ShopManager/user/login">Login</s:a>
</div>
