<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出社・退社</title>
</head>
<body>
<form action="/kinkadai/NewAccount" method="post">
		ユーザ名:<input type="text" name="name"><br>
		ぱすわーど:<input	type="password" name="pass"><br>
		 <input type="submit" value="新規追加">
		  </form>
<a href="/kinkadai/LoginServlet">ログイン</a>
</body>
</html>