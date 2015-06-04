<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%-- 
<%@ 로 시작하고 다음에 디렉티브 이름이 위치한다.
	여기서는 page 가 디렉티브 이름이다.
	 language, contentType, pageEncoding 를 속성이라고 하고
	  "java", "text/html; charset=UTF-8","UTF-8" 을 속성값이라고 한다.  
--%>
    
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>ADD_DEMO 2</title>
</head>
<body>
	<%-- 
		<% %> 를 스크립트릿 이라고 한다. 
	--%>
	
	<%
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
	%>
	
	<%-- 
		<%=  %> 은 표현식 이라고 한다. 
	--%>
	<%= num1 %> + <%= num2 %> = <%= add %>
	
</body>
</html>