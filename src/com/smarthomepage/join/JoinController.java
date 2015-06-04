package com.smarthomepage.join;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinDemo
 */
@WebServlet("/member/join.do")
public class JoinController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String gender = request.getParameter("gender");		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		String check_mail = request.getParameter("check_mail");
		String content = request.getParameter("content");
		
		MemberBean bean = new MemberBean();
		bean.setId(id);
		bean.setPwd(pwd);
		bean.setName(name);
		bean.setAge(age);
		bean.setGender(gender);
		
		int num = MemberServiceImpl.getInstance().joinMember(bean);
		System.out.println("서비스 단에서 넘어온 값 :"+ num);
		
	
	}

}











