<%@include file="Header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Login</title>
</head>
<body>

	<div class="container" style="margin-top:20px">
		<div class="row">
			<div class="col-md-2">
			</div>
			
			<div class="col-md-8">
				<div class="card">
					<div class="card-header bg-info" >
						User Login
					</div>
					
					<div class="card-body">
						<form action="login.do" method="post">
							<div class="form-group">
								<label>User Id</label>
								<input  type="text" placeholder="User Id" name="username" class="form-control" required>
							</div>
			
							<div class="form-group">
								<label>Password</label>
								<input type="password" placeholder="Password" name="password" class="form-control" required>
							</div>
					
							<div class="form-group">
								<button class="btn btn-info"  type="submit" >Login</button>
							</div>
						</form>
					</div>
					
					<div class="card-footer">
						First Time User? <a href="Register.jsp">Register</a><br>	
					</div>
				</div>
				
				
			</div>
			
			<div class="col-md-2">
			</div>

			
			</div>
			
			
		</div>
	

</body>
</html>