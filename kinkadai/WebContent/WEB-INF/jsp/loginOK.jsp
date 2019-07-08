<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出社帰宅確定ページ</title>
</head>
<body>
	<p>ようこそ<c:out value="${name}" />
	</p>
	<form action="/kinkadai/HanteiServlet" method="post">
		 	出/帰:<input type="text" name="hantei"><br>
			<input type="submit"value="ok">
			 <a href="/kinkadai/NewAccount">TOP</a>
	</form>
</body>
</html>