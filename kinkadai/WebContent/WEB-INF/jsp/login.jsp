<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出社・退社</title>
</head>
<body>
	<h1>ログインページ</h1>
	<form action="/kinkadai/LoginServlet" method="post">
		ユーザ名:<input type="text" name="name"><br>
		ぱすわーど:<input	type="password" name="pass"><br>
		 <input type="submit" value="ログイン">
		 </form>
		 <form action="/kinkadai/NewAccount" method="post">
		 <input type="submit" value="登録">
		 </form>
		  <form action="/kinkadai/LoginServlet" method="post">
		 <input type="submit" value="削除">
		  </form>
</body>
</html>