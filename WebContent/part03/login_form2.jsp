<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Calendar" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 권한 허용 샘플</title>
	<script type="text/javascript">
		function move() {
			location.href = "";
		}
		function idSearch() {
			location.href = "";
		}
		function pwSearch(){
			location.href = "";
		}
		function join() {
			location.href = "join_form.jsp";
		}
		function loginCheck() {
			if(document.frm.userid.value.length == 0){
				alert("아이디를 써주세요.");
				frm.userid.focus(); /* 커서를 인풋텍스트 칸에 위치시킨다. */
				return false;
			}
			if(document.frm.pwd.value == ""){
				alert("비밀번호는 반드시 입력해야 합니다.");
				frm.pwd.focus(); /* 커서를 인풋텍스트 칸에 위치시킨다. */
				return false;
			}
			return true;
		}
	</script>
</head>
<body>
	
	<div style="width: 100%" align="center">
		<div>
		<!-- 스크립트릿에 날짜 관련 로직  -->
	<%
		Calendar date = Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat now = new SimpleDateFormat("hh시 mm분 ss초");
	%>
	<!-- 아래식은 표현식이라고 부른다. -->
	오늘은 <b> <%= today.format(date.getTime()) %> </b> 입니다. <br />
	지금 시각은 <b><%= now.format(date.getTime()) %></b> 입니다.
	</div>
		<h1>로그인</h1>
		<img src="../images/naver_logo.gif" alt="" />
		<div style="margin-top: 20px">
			<form name="frm" action="${pageContext.request.contextPath}/part03/login_demo2.do"
					onsubmit="return loginCheck()">
				<label for="userid">아이디2 :</label>
				<input type="text" name="id" id="id" placeholder="아이디를 입력해주세요"/><br />
				<label for="password">암 호</label>
				<input type="password" name="pwd" id="pwd" placeholder="비밀번호를 입력해주세요"/><br />
				<input type="submit" value="로그인" />
			</form>			
		</div>
		<div style="margin-top: 20px">
			<img src="../images/btn_login.gif" alt="" onclick=""/>
		</div>
		<div> <a href="#" onclick="javascript:move()">
		아이디 찾기</a> | <a href="">비밀번호 찾기</a></div>
		<div>
			<p>최초 비밀번호는 회원님의 생년월일 6자리(YYMMDD)로 설정되어 있습니다.</p>
			로그인후 비밀번호를 반드시 변경 해주세요. <font color="red">단, 직원은 제외</font>
		</div>
		
		
		<div style="margin-top: 30px;">
			<img src="../images/b_join.gif" alt="" onclick="join()"/>
		</div>
	</div>
</body>
</html>