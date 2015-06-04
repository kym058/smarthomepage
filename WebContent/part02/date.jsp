<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>날짜 보여주기</title>
</head>
<body>
<!-- 스크립트릿에 날짜 관련 로직  -->
	<%
		Calendar date = Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat now = new SimpleDateFormat("hh시 mm분 ss초");
	%>
	<!-- 아래식은 표현식이라고 부른다. -->
	오늘은 <b> <%= today.format(date.getTime()) %> </b> 입니다.
	지금 시각은 <b><%= now.format(date.getTime()) %></b> 입니다.
	
</body>
</html>