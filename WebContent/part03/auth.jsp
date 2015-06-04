<%@ page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = "admin";
	String pwd = "pass";
	String name = "홍길동";
	request.setCharacterEncoding("UTF-8");
	if(id.equalsIgnoreCase(
			request.getParameter("id"))
			&& pwd.equalsIgnoreCase(request.getParameter("pwd"))){
		response.sendRedirect("../part02/template.jsp");
	}else{
		response.sendRedirect("login_form.jsp");
	}
%>