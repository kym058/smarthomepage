package com.smarthomepage.join;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionActivationListener;


@WebServlet("/member/mypage.do")
public class DatailMemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean bean = new MemberBean();
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		bean = DatailMemberServiceImpl.getInstance().getMemberInfo(id);
		//"MemberBean" 에다가 bean 에 할당된 쿼리 리턴값을 담아서 보내라
		request.setAttribute("name", bean.getName());
		request.setAttribute("id", bean.getId());
		request.setAttribute("age", bean.getAge());
		request.setAttribute("gender", bean.getGender());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/mypage.jsp");
		dispatcher.forward(request, response);
	}


}
