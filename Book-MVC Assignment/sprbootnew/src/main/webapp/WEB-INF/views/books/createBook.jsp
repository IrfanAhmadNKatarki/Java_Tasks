<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="createBook" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="Name" /></td>
			</tr>
			<tr>
				<td>When Publishing</td>
				<td><input type="text" name="whenPublishing" /></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Save"></td>

				<td><input type="submit" name="submit" value="Cancel"></td>
			</tr>
		</table>
	</form>
</body>
</html>