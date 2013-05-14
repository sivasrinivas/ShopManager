<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>

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
