package net.syntax.part03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SelectboxDemo
 */
@WebServlet("/part03/selectbox.do")
public class SelectboxDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String job = request.getParameter("job");
		String interests[] = request.getParameterValues("interest");
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("당신이 선택한 직업 : <b>");
		out.print(job);
		out.println("</b><hr>당신이 선택한 관심분야 : <b>");
		if(interests == null){
			out.print("선택한 항목이 없습니다.");
		}else{
			for(String interest : interests){
				out.print(interest + " ");
			}
		}
		// 자바스크립트로 이전 페이지로 이동하는 링크를 만들어 줌.
		out.println("<br><a href='javascript:history.go(-1)'>뒤로</a>");
		out.println("</body></html>");
		out.close();
	}

}
