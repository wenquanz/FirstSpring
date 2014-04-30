<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
	<title>Spring MVC Form Handling </title>
</head>
<body>
	<h2>Student Information</h2>
	<form:form action="addStudent">
		<table>
			<tr>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name"/></td>
			</tr>
			<tr>
				<td><form:label path="age">Age</form:label></td>
				<td><form:input path="age"/></td>
			</tr>
			<tr>
				<td><form:label path="id">ID</form:label></td>
				<td><form:input path="id"/></td>
			</tr>
		</table>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>
