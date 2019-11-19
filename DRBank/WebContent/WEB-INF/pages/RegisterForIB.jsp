<%@include file="Header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<title>Register</title>
</head>
<body>
	<div class="container" style="margin-top: 20px">
		<div class="row">
			<div class="col-md-2"></div>

			<div class="col-md-8">
				<div class="card">
					<div class="card-header bg-info">Register For Internet
						Banking</div>

					<div class="card-body">
						<form action="registerib.do" method="post">
							<div class="form-group">
								<label>Account Number</label> <input type="number"
									placeholder="Account Number" name="account_number"
									class="form-control" required>
							</div>
							<div class="form-group">
								<label>Username</label> <input type="text"
									placeholder="Enter Username" name="Username"
									class="form-control" required>
							</div>

							<div class="form-group">
								<label>Set Login Password</label> <input type="password"
									placeholder="Password" name="set_password" class="form-control"
									required>
							</div>

							<div class="form-group">
								<label>Confirm Login Password</label> <input type="password"
									placeholder="Password" name="confirm_password"
									class="form-control" required>
							</div>

							<div class="form-group">
								<label>Set Transaction Pin</label> <input type="number"
									placeholder="Set Pin" name="Set_Pin"
									class="form-control" required>
							</div>

							<div class="form-group">
								<label>Confirm Transaction Pin</label> <input type="number"
									placeholder="Confirm Pin" name="confirm_pin"
									class="form-control" required>
							</div>


							<div class="form-group">
								<button class="btn btn-info" type="submit">Submit</button>
							</div>
						</form>
					</div>

					<!-- <div class="card-footer">
						First Time User? <a href="Register.jsp">Register</a><br>	
					</div> -->
				</div>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</body>
</html>