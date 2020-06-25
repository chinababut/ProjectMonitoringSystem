<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>login page</title>
	<!-- <link  rel="stylesheet" href="login.css"> -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/login.css" />
	
</head>
<body>
	<p align="center"><font color="red" font-family: sans-serif>${errMsg}</font></p>
	<p align="center"><font color="red">${invalid}</font></p>
	<br>
	<br>
	
	 
<form action="LoginCheckerController" method="POST">
<div class="loginBox"> 
 <img src="logo.jpg" class="user"> 
 <h2>Log In Here</h2> 
 
  <p>User Name</p> 
  <input type="text" name="userId" placeholder="Enter User Name"> 
  <p>Password</p> 
  <input type="password" name="password" placeholder="Enter Password"> 
  <input type="submit" value="Sign In"> 
  <a href="#">Forget Password</a> &nbsp; &nbsp; &nbsp; &nbsp;<a href="#">Sign Up</a>
 </div>
 </form> 

</body>
</html>