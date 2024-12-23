<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Student Registration</h2>
	<form:form action="saveDetails" modelAttribute="student" method="post">
		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td>Mobile Number:</td>
				<td><form:input path="phNo" /></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><form:radiobuttons items="${genders}" path="gender" /></td>
			</tr>
			<tr>
				<td>Course :</td>
				<td><form:select   path="course" ><form:options items="${courses}"></form:options></form></form:select></td>
			</tr>
			<tr>
				<td>Timings :</td>
				<td><form:checkboxes  items="${timings}" path="timings" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>