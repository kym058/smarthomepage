<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>아이디 찾기</title>
</head>
<body>
	<div>
		<form action="${pageContext.request.contextPath}/member/searchPwd.do"
		method="get" >
		<input type="text" name="name" id="name"  />
		<input type="submit" value="비밀번호 찾기" />
	</form>
	</div>
	<div>
		<h5>찾으시는 비밀번호 : </h5>
		<%
			if(request.getAttribute("pwd") == null){
				%>
				
				<%
			}else{
				%>
				<h3><%=request.getAttribute("pwd") %></h3>
				<%
			}
		%>
		
	</div>
</body>
</html>