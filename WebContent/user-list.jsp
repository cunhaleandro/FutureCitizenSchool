<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
</head>
<body>
	<center>
		<h1>User Management</h1>
		<h2>
			<a href="new">Add New User</a> &nbsp;&nbsp;&nbsp; <a href="list">List
				All Users</a>

		</h2>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Users</h2>
			</caption>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>CPF</th>
				<th>RG</th>
				<th>Birthday</th>
				<th>Register Date</th>
				<th>Mother Name</th>
				<th>Father Name</th>
				<th>Parent Phone</th>
				<th>Parent Email</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="user" items="${listUser}">
				<tr>
					<td><c:out value="${user.id}" /></td>
					<td><c:out value="${user.aName}"/></td> 
					<td><c:out value="${user.bCpf}" /></td>
					<td><c:out value="${user.cRg}" /></td>
					<td><c:out value="${user.dBirthday}" /></td>
					<td><c:out value="${user.eRegistrionDate}" /></td>
					<td><c:out value="${user.fMotherName}" /></td>
					<td><c:out value="${user.gFatherName}" /></td>
					<td><c:out value="${user.hParentPhone}" /></td>
					<td><c:out value="${user.iParentEmail}" /></td>
					<td><a href="edit?id=<c:out value='${user.id}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete?id=<c:out value='${user.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>