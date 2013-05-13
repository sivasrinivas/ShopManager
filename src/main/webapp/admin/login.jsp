<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<s:form id="loginForm" action="/admin/Login_login" cssClass="form-horizontal">

		<s:textfield id="emailId" name="emailId" label="Email Id" />
		<s:password id="password" name="password" label="Password" />
		<s:submit />
		
	</s:form>
