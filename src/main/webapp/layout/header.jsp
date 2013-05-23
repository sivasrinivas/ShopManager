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
	<!--  <div class="modal-header"></div> -->
	<div class="modal-body">
	<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times</button>
	<!-- Login section and Signup section -->
		<div class="tabbable">
	  		<ul class="nav nav-tabs">
	    		<li class="active">
	    			<a href="#login" data-toggle="tab">Login</a>
	    		</li>
	    		<li>
	    			<a href="#signup" data-toggle="tab">Sign Up</a>
	    		</li>
	  		</ul>
	  		<div class="tab-content">
	    		<div class="tab-pane active" id="login">
				      <s:form id="loginForm" action="user/Login_login" theme="simple" cssClass="form-horizontal">
						<div class="control-group">
							<label class="control-label">Email Id:</label>
							<div class="controls">
								<s:textfield id="emailId" name="user.emailId"></s:textfield>
							</div><br>
							<label class="control-label">Password:</label>
							<div class="controls">
								<s:password id="password" name="user.password"></s:password>
							</div>
							<br>
							<div class="controls">
								<a href="./user/forgot">forgot password?</a>
								<s:submit value="Login" cssClass="btn btn-primary"/>
								<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
							</div>
						</div>
					</s:form>
	    		</div>
	    		<div class="tab-pane" id="signup">
	      			<s:form id="signupForm" action="user/Signup_createAccount" theme="simple" cssClass="form-horizontal">
						<div class="control-group">
							<label class="control-label">Email Id:</label>
							<div class="controls">
								<s:textfield id="emailId" name="user.emailId"></s:textfield>
							</div><br>
							<label class="control-label">Password:</label>
							<div class="controls">
								<s:password id="password" name="user.password"></s:password>
							</div>
							<br>
							<label class="control-label">Confirm Password:</label>
							<div class="controls">
								<s:password id="confPassword" name="confPassword"></s:password>
							</div>
							<br>
							<div class="controls">
								<s:submit value="Sign Up" cssClass="btn btn-primary"/>
								<button class="btn" data-dismiss="modal" aria-hidden="true">Close</button>
							</div>
						</div>
					</s:form>
	    		</div>
	  		</div>
		</div>
	</div>
	<!-- <div class="modal-footer">	</div> -->
</div>
<br><br><br><br>
<!-- Fork me on github ribbon -->
<a href="https://github.com/you"><img style="position: absolute; top: 0; right: 0; border: 0;" src="https://s3.amazonaws.com/github/ribbons/forkme_right_red_aa0000.png" alt="Fork me on GitHub"></a>