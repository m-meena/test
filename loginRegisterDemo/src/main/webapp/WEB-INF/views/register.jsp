<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTER</title>
</head>
<body>
<%@include file="header.jsp"  %>
<br><br><br><br>

<div class="container col-sm-3">
</div>

<div class = "container col-sm-6">
<br><br><br>
	<section>
		<div class="registermodal-container">
					<h1>Register</h1><br>
				  <form id = "refForm" method = "post" action="registerProcess" modelAttribute = "user">
					<table align="center">
                    <tr>
                        <td>
                            Firstname
                        </td>
                        <td>
                        <input type="text" name="Firstname" id="firstname"placeholder="Firstname">
                             </td>
                    </tr>
                    <tr>
                        <td>
                            Email
                        </td>
                        <td>
                        <input type="text" name="email" id="email"placeholder="Email">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Username
                        </td>
                        <td>
                            <input type="text" name="username" id="username"placeholder="Username">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Password
                        </td>
                        <td>
                            <input type="password" name="password" id="password"placeholder="Password">
                        </td>
                    </tr>
                    <tr>
                        <td>
                            Date-Of-Birth
                        </td>
                        <td>
                            <input type="text" name="dob" id="dob"placeholder="dd-mm-yyyy">
                        </td>
                    </tr>
                    <tr>
                        <td>
                           Address
                        </td>
                        <td>
                            <input type="text" name="address" id="address"placeholder="Address">
                        </td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" name="register" class="register registermodal-submit" value="Register">
                        </td>
                    </tr>
                    
                </table>
                </form>					
				 
				</div>
	
	</section>

</div>


</body>
</html>