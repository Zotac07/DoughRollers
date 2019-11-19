<%@include file="Header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/jquery.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
<title>Forget User Password</title>
</head>
<body>

	<div class="container" style="margin-top:20px">
		<div class="row">
			<div class="col-md-2">
			</div>
			
			<div class="col-md-8">
				<div class="card">
					<div class="card-header bg-info" >
					Forget User Password
					</div>
					
					<div class="card-body">
						<form action="SetNewPassword.jsp" method="post">
						
							<div class="form-group">
								<label>Enter User Id</label>
								<input  type="text" placeholder="Enter your User ID" name="user_id" class="form-control" required>
							</div>
			
							<div class="form-group">
								<label>Enter OTP</label>
								<input type="text" placeholder="Enter OTP" name="otp" class="form-control" required>
							</div>
					
							
						</form>
					</div>
					
					<div class="card-footer">
							<div class="form-group">
							
								<a href="SetNewPassword.jsp" class="btn btn-info">Proceed</a>
								<a href="" class="btn btn-secondary">Back</a>
							</div> 
							

					</div>
				</div>

			</div>
			
			<div class="col-md-2">
			</div>

			</div>
			
			
		</div>
	

</body>
</html>