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
		<form action="${pageContext.request.contextPath}/member/searchId.do"
		method="get" >
		<input type="text" name="name" id="name"  />
		<input type="submit" value="아이디 찾기" />
	</form>
	</div>
	<div>
		<h5>찾으시는 아이디 : </h5>
		<%
			if(request.getAttribute("id") == null){
				%>
				
				<%
			}else{
				%>
				<h3><%=request.getAttribute("id") %></h3>
				<%
			}
		%>
	</div>
	
</body>
</html>