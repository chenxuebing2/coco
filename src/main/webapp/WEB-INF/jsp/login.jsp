<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="x-ua-compatible" content="ie=edge">
</head>
<body>

	<h2>用户登录!</h2>
	<form action="${pageContext.request.contextPath}/login" method="post">
		<input type="text" name="username"> <input type="password"
			name="password">
		<button type="submit">登录</button>
	</form>
</body>
</html>
