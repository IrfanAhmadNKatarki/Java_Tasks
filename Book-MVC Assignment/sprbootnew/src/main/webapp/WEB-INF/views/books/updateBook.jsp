<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/books/updateBook/${books.id }" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><input type="text" name="Name" value="${books.name }"/></td>
			</tr>
			<tr>
				<td>When Publishing</td>
				<td><input type="text" name="whenPublishing" value="${books.whenPublishing}"/></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="Update"></td>

				<td><input type="submit" name="submit" value="Cancel"></td>
			</tr>
		</table>
	</form>
</body>
</html>