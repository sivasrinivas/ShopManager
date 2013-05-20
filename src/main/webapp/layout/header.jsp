<%@ taglib prefix="s" uri="/struts-tags"%>
<!-- admin menu nav bar -->
<div class="navbar navbar-fixed-top navbar-inverse">
	<div class="navbar-inner">
		<div class="container">
			<a class="brand" href="#">Shop Manager</a>
			<ul class="nav">
				<li><a href="#"><b>Home</b></a></li>
				<li class="dropdown">
					<a class="dropdown-toggle"	data-toggle="dropdown" href="#"> Products<b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#">Category 2</a></li>
						<li><a href="#">Category 3</a></li>
						<li><a href="#">Category 4</a></li>
					</ul>
				</li>
				<li><a href="#">Accounts</a></li>
				<!-- link to trigger login modal -->
				<li><a href="#loginModal" role="button" data-toggle="modal">Login</a></li>
				<li><a href="./user/account"><i class="icon-user icon-white"></i> Account</a></li>
			</ul>
		</div>
	</div>
</div>
<!-- Login Mdoal -->
<div id="loginModal" class="modal hide fade in" tabindex="-1" role="dialog" 
	aria-labelledby="loginModalLabel" area-hidden="true">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times</button>
    	<h3 id="myModalLabel">Modal header</h3>
	</div>
	<div class="modal-body">
		<s:form id="loginForm" cssClass="form-horizontal">
			<div class="control-group">
				<label class="control-label">Email Id:</label>
				<div class="controls">
					<s:textfield id="emailId" name="user.emailId"></s:textfield>
				</div>
				<label class="control-label">Password:</label>
				<div class="controls">
					<s:password id="password" name="user.password"></s:password>
				</div>
			</div>
		</s:form>
		
	</div>
	<div class="modal-footer">
		<button class="btn btn-primary">Login</button>
		<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
	</div>
</div>
<br><br><br><br>
<!-- Fork me on github ribbon -->
<a href="https://github.com/you"><img style="position: absolute; top: 0; right: 0; border: 0;" src="https://s3.amazonaws.com/github/ribbons/forkme_right_red_aa0000.png" alt="Fork me on GitHub"></a>