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
			  <h2 id="time"></h2>
		      <script>
    time();
    function time(){
        var now = new Date();
        document.getElementById("time").innerHTML = now.toLocaleString();
    }
    setInterval('time()',1000);
    </script>
	</p>
	<form action="/kinkadai/HanteiServlet" method="post">
		 	出:<input type="radio" name="lol" value="syu">
		 	帰:<input type="radio" name="lol" value="ki"><br>
			<input type="submit"value="ok"><br>
			 <a href="/kinkadai/NewAccount">TOP</a>
	</form>

</body>
</html>