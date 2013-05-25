<%@ taglib prefix="s" uri="/struts-tags"%>

<s:if test="hasActionErrors() || hasFieldErrors()">
	<div class="alert alert-error">
		<button type="button" class="close" data-dismiss="alert">&times;</button>
		<s:actionerror />
		<s:fielderror />
	</div>
</s:if>
<s:elseif test="hasActionMessages()">
	<div class="alert alert-success">
		<button type="button" class="close" data-dismiss="alert">&times;</button>
		<s:actionmessage />
	</div>
</s:elseif>

