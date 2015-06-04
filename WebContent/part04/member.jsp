<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Statement" %>
<!-- 위 4가지 import 는 DB 내용 출력시 반드시 필요하다. -->
<%@ page import="net.syntax.part04.MemberDAO" %>
<%@ page import="net.syntax.part04.MemberVO" %>
<%!  /* 선언부는 첫 방문자에 의해 단 한번만 수행됩니다. */
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	String driver = "jdbc:oracle:thin:@localhost:1521/xe";
	String userId = "system";
	String password = "oracle";
	String sql = "select * from member";
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Member </title>
</head>
<body>
	<table style="border: 1px solid blue;width: 100%;height: 300px;background-color: yellow;
	 border-collapse: collapse;" >
		<tr class="row" style="border: 1px solid blue;height: 20%;">
			<th>이름</th>
			<th>아이디</th>
			<th>나이</th>
			<th>성별</th>
		</tr>
		<%
		/* try{}catch(){}finally{} */
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn =  DriverManager.getConnection(driver,userId,password); 
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				out.println("<tr>");
				out.println("<td>"+rs.getString("name")+"</td>");
				out.println("<td>"+rs.getString("id")+"</td>");
				out.println("<td>"+rs.getString("age")+"</td>");
				out.println("<td>"+rs.getString("gender")+"</td>");
				out.println("</tr>");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try{
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(conn != null){
					conn.close();
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
		} 
		%>
	</table>
	
</body>
</html>