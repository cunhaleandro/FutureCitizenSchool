<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Login</title>
</head>
<body>
 <center>
<form method="post" action="CustomerServlet.do">
<table>
    <tr>
        <td>User</td>
        <td><input type="text" name="login" /></td>
    </tr>
    <tr>
        <td>Pass</td>
        <td><input type="password" name="pass" /></td>
    </tr>
    <tr>
        <td><input type="submit" value="submit" /></td>
    </tr>
</table>
 
</form>
 </center>
</body>
</html>