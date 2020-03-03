<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
</head>
<body>
	<center>
		<h1>Students Management</h1>
		<h2>
			<a href="new">Add New Students</a> &nbsp;&nbsp;&nbsp; <a href="list">List
				All Students </a>
		</h2>

	</center>
	<div align="center">
		<c:if test="${user != null}">
			<form action="update" method="post">
		</c:if>
		<c:if test="${user == null}">
			<form action="insert" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${user != null}">
               Edit User
              </c:if>
					<c:if test="${user == null}">
               Add New User
              </c:if>
				</h2>
			</caption>
			<c:if test="${user != null}">
				<input type="hidden" name="id" value="<c:out value='${user.id}' />" />
			</c:if>
			<tr>
				<th>Student:</th>
				<td><input type="text" name="student" size="100"
					value="<c:out value='${user.student}' />" /></td>
			</tr>
			<tr>
				<th>CPF:</th>
				<td><input type="text" name="cpf" size="11"
					value="<c:out value='${user.cpf}' />" /></td>
			</tr>
			<tr>
				<th>RG:</th>
				<td><input type="text" name="rg" size="20"
					value="<c:out value='${user.rg}' />" /></td>
			</tr>
			<tr>
				<th>Student Birthday:</th>
				<td><input type="text" name="birthday" size="10"
					value="<c:out value='${user.birthday}' />" /></td>
			</tr>
			<tr>
				<th>Student Register Date:</th>
				<td><input type="text" name="registrionDate" size="10"
					value="<c:out value='${user.registrionDate}' />" /></td>
			</tr>
			<tr>
				<th>Mother Name:</th>
				<td><input type="text" name="motherName" size="100"
					value="<c:out value='${user.motherName}' />" /></td>
			</tr>
			<tr>
				<th>Father Name:</th>
				<td><input type="text" name="fatherName" size="100"
					value="<c:out value='${user.fatherName}' />" /></td>
			</tr>
			<tr>
				<th>Parents Phone:</th>
				<td><input type="text" name="parentPhone" size="100"
					value="<c:out value='${user.parentPhone}' />" /></td>
			</tr>
			<tr>
				<th>Parents E-mail:</th>
				<td><input type="text" name="parentEmail" size="100"
					value="<c:out value='${user.parentEmail}' />" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save" /></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>