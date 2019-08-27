<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "servlet.LoginServlet" %>
<%@ page import = "mod.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規</title>
</head>
<body>
<p><c:out value="${name}" />新規登録できました</p>
<a href="/kinkadai/LoginServlet" >TOP</a>
</body>
</html>