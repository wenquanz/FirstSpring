<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
	<title>redirect</title>
</head>
<body>
	<h2>Spring Page Direction</h2>
	<p>Click the button below to redirect the result to the other page</p>
<%-- 	<form:form action="redirect" method="GET">
		<input type="submit" value="Redirect">
	</form:form> --%>
	
	<form:form action="staticPage" method="GET">
		<input type="submit" value="Redirect-to-static">
	</form:form>
</body>
</html>