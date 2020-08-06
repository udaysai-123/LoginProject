<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>Login</b>
	<form:form action="submitlogin" method="post" modelAttribute="login">
		<table>
			<tr>
				<td>Enter the username</td>
				<td><form:input id="username"  path="username" name="username"  /></td>
			</tr>
			<tr>
				<td>Enter the Password</td>
				<td><form:input id="password" path="password" name="password" /></td>
			</tr>
			<tr>
	
				<td><input type="submit" value="Login" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>