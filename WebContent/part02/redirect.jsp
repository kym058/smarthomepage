<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>리다이렉트 샘플</title>
</head>
<body>
	<h3> 네이버로 이동시키는 페이지</h3>
	<%
		response.sendRedirect("http://www.naver.com");
	%>
	
</body>
</html>