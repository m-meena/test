<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>
 <link rel="stylesheet" href="./resources/logincss.css">
</head>
<body>
<%@include file="header.jsp"  %>
<br><br><br><br>

<div class="container col-sm-6">

<div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner" role="listbox" style="width:100%; height:500px !important">
    <div class="item active">
      <img src="./resources/img1.jpg" alt="First slide" style="width:100%;height:500px">
    </div>
    <div class="item">
      <img src="./resources/img2.jpg" alt="Second slide" style="width:100%;height:500px">
    </div>
    <div class="item">
      <img src="./resources/img3.jpg" alt="Third slide" style="width:100%;height:500px">
    </div>
  </div>
  <a class="left carousel-control" href="#carouselExampleIndicators" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#carouselExampleIndicators" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
</div></div>

<div class = "container col-sm-1"></div>

<div class = "container col-sm-4">
<br><br><br>
	<section>
		<div class="loginmodal-container">
					<h1>Login to Your Account</h1><br>
				  <form method = "post"modelAttribute="login" action="loginProcess">
					<input type="text" name="user" placeholder="Username">
					<input type="password" name="pass" placeholder="Password">
					<input type="submit" name="login" class="login loginmodal-submit" value="Login">
				  </form>					
				 
				</div>
	
	</section>

</div>
<%@include file="footer.jsp"  %>
</body>
</html>