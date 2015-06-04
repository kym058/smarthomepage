package net.syntax.part03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Checkbox 에서 넘어온 데이터값 보여주기
 */
@WebServlet("/part03/checkbox.do")
public class CheckboxDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		String items[] = request.getParameterValues("item");
		if(items == null){
			out.print("선택한 항목이 없습니다.");
		}else{
			out.println("당신이 선택한 항목입니다.<hr>");
			for(String item : items){
				out.print(item + " ");
			}
		}
		// 자바스크립트로 이전 페이지로 이동하는 링크를 만들어 줌.
		out.println("<br><a href='javascript:history.go(-1)'>뒤로</a>");
		out.println("</body></html>");
		out.close();
		
	}

}
