<%@include 
	file="Header.jsp"
%>	

<div class="container" style="margin-top: 20px;">

<div class="row">
<div class="col-md-2"></div>
<div class="col-md-8">
	
		<form action="Login.jsp" method="post">
			<div class="form-group">
				<label>First Name </label>
				<input  type="text" placeholder="First Name" name="firstname" class="form-control" required>
			</div>
			
			<div class="form-group">
				<label>Middle Name</label>
				<input type="text" placeholder="Middle Name" name="middlename" class="form-control" required>
			</div>
			
			<div class="form-group">
				<label>Last Name</label>
				<input type="text" placeholder="Last Name" name="lastname" class="form-control" required>
			</div>
			
			<div class="form-group">
				<label>Father's Name</label>
				<input type="text" placeholder="Father's Name" name="fathername" class="form-control" required>
			</div>
			
			<div class="form-group">
				<label>Mobile</label>
				<input type="number" placeholder="Mobile" name="mobile" class="form-control" required>
			</div>
								
			<div class="form-group">
				<label>Email Id</label>
				<input type="email" placeholder="Email" name="email" class="form-control" required>
			</div>
			
			<div class="form-group">
				<label>Aadhar Card Number</label>
				<input type="number" placeholder="Aadhar Card Number" name="aadhar" class="form-control" required>
			</div>
			
			<div class="form-group">
				<label>Date Of Birth</label>
				<input type="date" placeholder="Date Of Birth" name="dob" class="form-control" required>
			</div><br>
			
			<div class="form-group">
				<label>Residential Address</label><br>
				<textarea rows="4" cols="5" required="required" name="address" class="form-control" ></textarea>		
			</div><br>
			
			
			<div class="form-group">
				<label>Occupation Details</label><br>
				<label>a)Occupation Type</label>
				<input type="text" name="occupation_type" class="form-control" required>
				
				<label>b)Source Of Income</label>
				<input type="text" name="source_of_income" class="form-control" required>
				
				<label>c)Gross Annual Income</label>
				<input type="number" name="gross_annual_income" class="form-control" required>
			</div><br>
			
			<div class="form-group">
				<label>Debit/ATM Card</label><br>
				<label>Do you want a debit card?</label>
				<input type="radio" name="Debit" value="Yes"> Yes
				<input type="radio" name="Debit" value="No"> No
			</div>
			
			<div class="form-group">
				<input type="checkbox" name="net_banking"> Opt for Net Banking</br>
				<input type="checkbox" name="net_banking"> I agree
			</div>
			
								
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
</div>
<div class="col-md-2">
</div>

</div>
</div>
<%@include 
	file="Footer.jsp"
%>	