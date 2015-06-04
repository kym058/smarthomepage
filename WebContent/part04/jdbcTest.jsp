<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="net.syntax.part04.MemberDAO" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>JDBC TEST</title>
</head>
<body>
	<%
		MemberDAO dao = MemberDAO.getInstance();
		Connection conn = dao.getConnection();
		out.print("DBCP 연동 성공");
	%>
</body>
</html>