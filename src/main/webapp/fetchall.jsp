<%@page import="dto.Adto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- ${list} --%>
	<%-- <%
	List<Adto> l1 = (List<Adto>) request.getAttribute("list");
	%> --%>
	<table border="1px">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Password</th>
			<th>Confirm Password</th>
			<th>gender</th>
			<th>Country</th>
			<th>State</th>
			<th>Checkbox</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.getId()}</td>
				<td>${dto.getName()}</td>
				<td>${dto.getEmail()}</td>
				<td>${dto.getPassword()}</td>
				<td>${dto.getConfirm_password()}</td>
				<td>${dto.getGender()}</td>
				<td>${dto.getCountry()}</td>
				<td>${dto.getState()}</td>
				<td>${dto.getCheckbox()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>