<%@ taglib uri="/struts-tags" prefix="s"%>

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
