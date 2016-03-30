<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Success</title>
</head>
<body>

<h3>Login Successful!<br>

Please select your workout:

<form>
  <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <select name="location" multiple size=3>
  	<option value="Arms">Arms</option> 
  	<option value="Shoulders">Shoulders</option> 
  	<option value="Legs">Legs</option> 
  </select>
  
  <input type="submit" > <br>
</form>

</body>
</html>