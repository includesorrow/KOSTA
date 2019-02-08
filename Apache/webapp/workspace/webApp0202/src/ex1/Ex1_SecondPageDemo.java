package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class Ex1_SecondPageDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//이동 방식 :
	//redirect방식, forward방식 두가지로 구분된다.
	//forward방식은 request객체에 값을 저장해서 전달할 수 있는 특징이 있다.
	//http://localhost/webApp0201/first?msg=hi
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//redirect 방식은 responce객체가 주체
		PrintWriter out = resp.getWriter();
		//req.setAttribute("msg",msg);
		
		out.println("second");
		out.println("Second Page : " + req.getAttribute("msg"));
	} 
	


}
