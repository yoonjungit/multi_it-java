package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "check", urlPatterns = { "/check" })
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("★서블릿 등장★");
	}
	@Override
	public void destroy() {
		System.out.println("★서블릿 퇴장★");
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");		//	브라우저 출력 시 인코딩 방법(객체 출력 메소드-out 실행전에 인코딩해주기) 
		PrintWriter out = response.getWriter();		//out객체(HTML에 write) 생성
		out.print("Get 요청>><br>");				//브라우저 출력할 내용 입력
		
		String weather = request.getParameter("weather");
		out.print("그럼 오늘 ");
		if (weather.equals("맑음")) {
			out.print("나가자");
		} else if(weather.equals("흐림")){
			out.print("코딩");
		} else if(weather.equals("비옴")){
			out.print("쇼핑");
		} else {
			out.print("그냥 있자");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");		//HTML에서 받을 때 인코딩
		response.setContentType("text/html;charset=UTF-8");		//	브라우저 출력 시 인코딩 방법(객체 출력 메소드-out 실행전에 인코딩해주기)
		PrintWriter out = response.getWriter();		//out객체(HTML에 write) 생성
		
		String koo = request.getParameter("koo");
		
		switch (koo) {
		case "near":
			out.print("<img src='https://user-images.githubusercontent.com/64455378/226259368-d49e8d63-1688-4e98-abc2-5658656e269c.gif' width=500>");
			break;
		default:
			out.print("<img src='https://thumbs.gfycat.com/DarkSpiffyHuemul-size_restricted.gif' width=500>");
			break;
		}
	}

}
