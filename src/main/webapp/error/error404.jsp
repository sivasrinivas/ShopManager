<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<tiles:insertTemplate template="/layout/adminlayout.jsp" flush="true">
	<tiles:putAttribute name="header" value="/layout/adminheader.jsp"></tiles:putAttribute>
	<tiles:putAttribute name="body">
		<br><br>
		<img src="/shop/assets/img/404.jpeg" />	
	</tiles:putAttribute>
	<tiles:putAttribute name="footer" value="/layout/footer.jsp"></tiles:putAttribute>
</tiles:insertTemplate>

