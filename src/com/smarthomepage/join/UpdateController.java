package com.smarthomepage.join;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/member/updatePwd.do")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		String pwd = request.getParameter("pwd");
		System.out.println("파라미터로 넘어온 PWD : "+ pwd);
		UpdateServiceImpl.getInstance().updateMember(id, pwd);
		System.out.println("수성정공!!");
	}

}
