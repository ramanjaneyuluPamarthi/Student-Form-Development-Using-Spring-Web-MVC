<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Student Registration</h2> 
<form:form action="saveDetails" modelAttribute="student" method="post">
<table><tr>
<td>Name :</td>
<td><form:input path="name" /></td>
</tr>
<tr>
<td>Gmail :</td>
<td><form:input path="email" /></td>
</tr>
<tr>
<td>Mobile Number:</td>
<td><form:input path="phNo" /></td>
</tr>
<tr>
<td>Gender :</td>
<td><form:radiobutton path="gender" /></td>
</tr>
<tr>
<td> :</td>
<td><form:input path="name" /></td>
</tr>
</table>
<form:input path="name" />
</form:form>
</body>
</html>