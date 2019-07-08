<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>出社・帰社</title>
</head>
<body>
	<h1>ログインページ</h1>
	<form action="/kinkadai/Login" method="post">
		ユーザ名:<input type="text" name="name"><br>
		ぱすわーど:<input	type="text" name="password"><br>
		 <input type="submit"value="ログイン">
		  <input type="submit" value="新規">
	</form>
</body>
</html>