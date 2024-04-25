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

<form:form action="modify" modelAttribute="employee">
<form:label path="id">ID</form:label> <br>
<form:input path="id"/>

<form:label path="name">NAME</form:label> <br>
<form:input path="name"/>

<form:label path="designation">DESIGNATION</form:label> <br>
<form:input path="designation"/>

<form:label path="salary">SALARY</form:label> <br>
<form:input path="salary"/>

<input type="submit" value="SAVE EMPLOYEE">
</form:form>

</body>
</html>