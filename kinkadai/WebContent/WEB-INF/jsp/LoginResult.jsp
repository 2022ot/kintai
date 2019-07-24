<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "servlet.HanteiServlet" %>
<%@ page import = "mod.User" %>
<%
User name=(User)session.getAttribute("name");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認ページ</title>
</head>
</head>
<body>
<% if(name != null){ %>
<p>保存しました<%=name.getName() %>さん</p>
<a href="/kinkadai/NewAccount" >TOP</a>
<% }else{ %>
<p>保存できませんでした</p>
<a href="/kinkadai/NewAccount" >TOP</a>
<% } %>
</body>
</html>