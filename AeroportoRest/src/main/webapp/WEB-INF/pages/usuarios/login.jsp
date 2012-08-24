<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Login</title>
	</head>
	<body>
		<form action="/AeroportoRest/login" method="post">
			Login : <input type="text" name="j_username"/><br/>
			Senha : <input type="text" name="j_password"/><br/>
		<input type="submit" value="Login">		
		</form>
	</body>
</html>