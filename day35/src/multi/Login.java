package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	//HttpServlet 내 service()메서드는 get/post 요청을 알아서 구분해 각각 doGet(), doPost() 메서드 호출하도록 되어있음
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    //response 객체 UTF-8로 인코딩
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String find = request.getParameter("find");
		out.print("get요청 >> find : " + find);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		out.print("post요청 >> id : " + id + ", " + "pw : " + pw);
	}

}
