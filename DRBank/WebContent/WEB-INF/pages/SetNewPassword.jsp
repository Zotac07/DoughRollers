<%@include file="Header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/jquery.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
<title>Set New Password</title>
</head>
<body>

	<div class="container" style="margin-top:20px">
		<div class="row">
			<div class="col-md-2">
			</div>
			
			<div class="col-md-8">
				<div class="card">
					<div class="card-header bg-info" >
					Set New Password
					</div>
					
					<div class="card-body">
						<form action="" method="post">
							<div class="form-group">
								<label>Login Password</label>
								<input  type="password" placeholder="Enter Password" name="password" class="form-control" required>
							</div>
			
							<div class="form-group">
								<label>Confirm Login Password</label>
								<input type="password" placeholder="Enter Password" name="confirm_password" class="form-control" required>
							</div>
					
							
						</form>
					</div>
					
					<div class="card-footer">
							<div class="form-group" >
								<button class="btn btn-info"  type="submit" >Proceed</button>
								<button class="btn btn-secondary"  type="submit" >Back</button>
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