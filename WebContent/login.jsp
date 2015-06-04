<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function move() {
		location.href = "info.jsp";
	}
	function popup() {
		window.open("info.jsp")
	}
	function login() {
		location.href = "main.jsp";
	}
	function mypage() {
		location.href = "mypage.html";
	}
</script>
</head>
<body>
	<div>
		<!-- 스크립트릿에 날짜 관련 로직  -->
	<%
		Calendar date = Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat now = new SimpleDateFormat("hh시 mm분 ss초");
	%>
	<!-- 아래식은 표현식이라고 부른다. -->
	오늘은 <b> <%= today.format(date.getTime()) %> </b> 입니다.
	지금 시각은 <b><%= now.format(date.getTime()) %></b> 입니다.
	</div>
	<div style="width: 100%" align="center">
		
		<h1>로그인</h1>
		<img src="images/logo.png" alt="" />
		<div>
			<p><h4>ITBANK</h4></p>
			<h5>MULTICAMPUS</h5>에 오신걸 환영합니다.
		</div>
		<div style="margin-top: 20px">
			<input type="text" placeholder="아이디를 입력해주세요"/><br />
			<input type="text" placeholder="비밀번호를 입력해주세요"/>
		</div>
		<div>
			<p>최초 비밀번호는 회원님의 생년월일 6자리(YYMMDD)로 설정되어 있습니다.</p>
			로그인후 비밀번호를 반드시 변경 해주세요. <font color="red">단, 직원은 제외</font>
		</div>
		<div style="margin-top: 20px">
			<img src="images/btn_login.gif" alt="" onclick="javascript:login()"/>
		</div>
		<div> <a href="#" onclick="javascript:move()">
		아이디 찾기</a> | <a href="">비밀번호 찾기</a></div>
		
		<div>
			<button onclick="mypage()" >팝업</button>
		</div>
	</div>
</body>
</html>