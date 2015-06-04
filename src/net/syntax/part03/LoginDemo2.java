package net.syntax.part03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginDemo2
 */
@WebServlet("/part03/login_demo2.do")
public class LoginDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
		
		String id = "admin";
		String pwd = "pass";
		PrintWriter out = response.getWriter();
		if(id.equalsIgnoreCase(request.getParameter("id"))
				&& pwd.equalsIgnoreCase(request.getParameter("pwd"))
				){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/part02/template.jsp");
			dispatcher.forward(request, response);
			/*out.println("<html><body>");
			out.println("당신이 입력한 정보입니다.<br/>");
			out.println("아 이 디 : ");
			out.println(id);
			out.println("<br/> 비밀번호 :");
			out.println(pwd);
			// 자바스크립트로 이전 페이지로 이동하는 링크를 만들어 줌.
			out.println("<br><a href='javascript:history.go(-1)'>뒤로</a>");
			out.println("</body></html>");
			out.close();*/
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/part03/login_fail.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

}
