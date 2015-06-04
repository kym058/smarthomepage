<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인 실패시 보여주는 페이지</title>
</head>
<body>
	<div>
		잘못된 아이디 혹은 비밀번호입니다<br/>
		다시 로그인하세요.<br/>
		<br><a href="${pageContext.request.contextPath}/part03/login_form2.do">로그인폼으로 가기</a>
	</div>
	
</body>
</html>