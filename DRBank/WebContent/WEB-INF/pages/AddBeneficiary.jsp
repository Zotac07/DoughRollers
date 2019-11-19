<%@include file="Header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/jquery.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
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
						Add New Beneficiary
					</div>
					
					<div class="card-body">
						<form action="" method="post">
							<div class="form-group">
								<label>Beneficiary Name</label>
								<input  type="text" placeholder="User Id" name="beneficiary_name" class="form-control" required>
							</div>
			
							<div class="form-group">
								<label>Beneficiary Account Number</label>
								<input type="number" placeholder="Enter Beneficiary Account Number" name="beneficiary_account_number" class="form-control" required>
							</div>
							
							<div class="form-group">
								<label>Re-Enter Account Number</label>
								<input type="number" placeholder="Re-Enter Account Number" name="re-enter_account_number" class="form-control" required>
							</div>
							
							<div class="form-group">
								<label>Nick Name</label>
								<input type="text" placeholder="Enter Nickname" name="re-enter_account_number" class="form-control" required>
							</div>
					
							<div class="form-group">
								<button class="btn btn-info"  type="submit" >Save As Beneficiary</button>
							</div>
						</form>
					</div>
					
					
				</div>
				
				
			</div>
			
			<div class="col-md-2">
			</div>
		
			</div>
			
			
		</div>
	

</body>
</html>