<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/addUser" method="post">
		username:<input type="text" name="username"> password:<input
			type="text" name="password"> <input type="submit"
			value="submit">
	</form>
	<br>
	<table>
		<thead>
			<tr>
				<th>username</th>
				<th>password</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="items">
				<tr>
					<td>${items.username }</td>
					<td>${items.password }</td>
					<td><a href="${pageContext.request.contextPath}/delUser/${items.id}">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>