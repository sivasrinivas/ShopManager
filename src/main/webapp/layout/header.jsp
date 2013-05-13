<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="span3">
	<h1>Logo</h1>
</div>
<div class="span6">
	<s:form id="searchForm" cssClass="form">
		<div class="input-append">
			<input type="text" class="input-xlarge">
			<select>
  				<option>1</option>
  				<option>2</option>
  				<option>3</option>
  				<option>4</option>
  				<option>5</option>
			</select>
  			<button class="btn" type="button">Search</button>
		</div>
	</s:form>
</div>
<div class="span3">
	<s:a href="/ShopManager/user/login">Login</s:a>
</div>
