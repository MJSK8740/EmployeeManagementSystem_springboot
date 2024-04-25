<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter Employee Details</h1>
<form:form action="save" modelAttribute="employee">
<form:label path="id">ID</form:label> <br>
<form:input path="id"/> <br>

<form:label path="name">NAME</form:label> <br>
<form:input path="name"/> <br>

<form:label path="designation">DESIGNATION</form:label> <br>
<form:input path="designation"/> <br>

<form:label path="salary">SALARY</form:label> <br>
<form:input path="salary"/> <br>

<input type="submit" value="SAVE EMPLOYEE">


</form:form>
</body>
</html>