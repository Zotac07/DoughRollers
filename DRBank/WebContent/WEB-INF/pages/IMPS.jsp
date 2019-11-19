<%@include file="Header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.min.css">
		<script src="js/jquery.min.js"></script>
		<script src="js/popper.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
<title>IMPS</title>
</head>
<body>

	<div class="container" style="margin-top:20px">
		<div class="row">
			<div class="col-md-2">
			</div>
			
			<div class="col-md-8">
				<div class="card">
					<div class="card-header  bg-info" >
					Initiate IMPS Payment
					</div>
					
					<div class="card-body">
						<form action="" method="post">
							<div class="form-group">
								<label>From Account</label>
								<input  type="number" placeholder="Enter your Account Number" name="account_number" class="form-control" required>
							</div>
			
							<div class="form-group">
								<label>To Account</label>
								<input type="number" placeholder="Enter Beneficiary Account Number" name="to_account_number" class="form-control" required>
							</div>
							
							<div class="form-group">
								<label>Amount</label>
								<input type="number" placeholder="Enter Amount " name="amount" class="form-control" required>
							</div>
							
							<div class="form-group">
								<label>Transaction Date</label>
								<input type="date"  name="date" class="form-control" required>
							</div>
							
							<div class="form-group">
								<label>Remark</label>
								<input type="text"  name="remark" class="form-control" required>
							</div>

						</form>
					</div>
					
					<div class="card-footer">
							<div class="form-group">
								<button class="btn btn-success"  type="submit" >Save</button>
								<button class="btn btn-warning"  type="submit" >Reset</button>
								<button class="btn btn-secondary"  type="submit" >Save As Template</button>
								<button class="btn btn-info"  type="submit" >Continue</button>
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