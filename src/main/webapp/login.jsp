<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

	<s:form id="loginForm" action="Account_login" cssClass="form-horizontal">
		<div class="control-group">
			<label class="control-label">User Id:</label>
			<div class="controls">
				<s:textfield id="userId" name="user.userId" placeholder="User Id"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">Password</label>
			<div class="controls">
				<s:password id="password" name="user.password" placeholder="Password" />
			</div>
		</div>
		<div class="control-group">
			<div class="controls">
				<label class="checkbox"> <input type="checkbox">
					Remember me
				</label>
				<button type="submit" class="btn">Sign in</button>
			</div>
		</div>
	</s:form>
