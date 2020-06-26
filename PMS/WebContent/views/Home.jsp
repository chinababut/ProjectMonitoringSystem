<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>Home Page</title>
	
	
		<link  rel="stylesheet" href="home.css">
		
		<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
		
				
</head>
<body>
	<div class="menu-bar">
	<ul>
		<li class="active"><a href="#"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>
		<li><a href="#"><i class="fa fa-product-hunt" aria-hidden="true"></i>Projects</a>
			<div class="sub-menu-1">
				<ul>
					<li><a href="/projectcreation">New Projects</a></li>
					
					<li class="hover-me"><a href="#">Existing Projects</a><i class="fa fa-angle-right" aria-hidden="true"></i>
						<div class="sub-menu-2">
							<ul>
							<li><a href="/modulecreation">Create Module</a></li>
							<li><a href="#">Modules List</a></li>
							</ul>
						</div>
					</li>
				</ul>
				
			</div>
		</li>
		<li><a href="#"><i class="fa fa-bars" aria-hidden="true"></i>Reports</a></li>
		<li><a href="dashboard.jsp"><i class="fa fa-th-large" aria-hidden="true"></i>DashBoard</a></li>
		<li><a href="contact.jsp"><i class="fa fa-address-book" aria-hidden="true"></i>Contact Us</a></li>
		<li><a href="signout.jsp"><i class="fa fa-sign-out" aria-hidden="true"></i>LogOut</a></li>

</ul>
</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
		
</body>
</html> 