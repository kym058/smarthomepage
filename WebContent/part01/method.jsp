<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>GET 방식과 POST 방식</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/part01/get_method.do" method="get">
		<input type="submit" value="get 방식으로 호출하기" />
	</form>
	<br /><br />
	<form action="${pageContext.request.contextPath }/part01/post_method.do" method="post">
		<input type="submit" value="post 방식으로 호출하기" />
	</form>
	
</body>
</html>