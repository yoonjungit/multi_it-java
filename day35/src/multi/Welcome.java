package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 메소드가 호출됨");
		String id = request.getParameter("data");
		System.out.println("데이터는 " + id + "입니다.");
		
		PrintWriter out = response.getWriter();		//response : 서버가 브라우저에 응답할 때 사용
		//PrintWriter는 브라우저에 응답할 때 문자를 줄 수 있는 부품
		out.print("I am a web Programmer");
		out.close();
	}

}
