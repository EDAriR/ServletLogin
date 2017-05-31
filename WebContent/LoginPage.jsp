<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Login Page</title>
</head>
<body>
		<form action="LoginServlet">

			Please enter your username 		
			<input type="text" name="un"/><br>		
		
			Please enter your password
			<input type="text" name="pw"/>
			
			<input type="submit" value="submit">			
		
		</form>
	</body>
</html>


<!-- Open eclipse
Create a new "Dynamic Web Project"
Name it "LoginExample"
Create the JSP
In the "Web Content" folder, create a new JSP
Name it "LoginPage"
Place this code -->