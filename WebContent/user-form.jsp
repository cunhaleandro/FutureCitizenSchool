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
			<a href="new">Add New user</a> &nbsp;&nbsp;&nbsp; <a href="list">List
				All user </a>
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
				<th>Name:</th>
				<td><input type="text" name="aName" size="100"
					value="<c:out value='${user.aName}' />" /></td>
			</tr>
			<tr>
				<th>CPF:</th>
				<td><input type="text" name="bCpf" size="11"
					value="<c:out value='${user.bCpf}' />" /></td>
			</tr>
			<tr>
				<th>RG:</th>
				<td><input type="text" name="cRg" size="20"
					value="<c:out value='${user.cRg}' />" /></td>
			</tr>
			<tr>
				<th>Student Birthday:</th>
				<td><input type="text" name="dBirthday" size="10"
					value="<c:out value='${user.dBirthday}' />" /></td>
			</tr>
			<tr>
				<th>Student Register Date:</th>
				<td><input type="text" name="eRegistrionDate" size="10"
					value="<c:out value='${user.eRegistrionDate}' />" /></td>
			</tr>
			<tr>
				<th>Mother Name:</th>
				<td><input type="text" name="fMotherName" size="100"
					value="<c:out value='${user.fMotherName}' />" /></td>
			</tr>
			<tr>
				<th>Father Name:</th>
				<td><input type="text" name="gFatherName" size="100"
					value="<c:out value='${user.gFatherName}' />" /></td>
			</tr>
			<tr>
				<th>Parents Phone:</th>
				<td><input type="text" name="hParentPhone" size="100"
					value="<c:out value='${user.hParentPhone}' />" /></td>
			</tr>
			<tr>
				<th>Parents E-mail:</th>
				<td><input type="text" name="iParentEmail" size="100"
					value="<c:out value='${user.iParentEmail}' />" /></td>
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