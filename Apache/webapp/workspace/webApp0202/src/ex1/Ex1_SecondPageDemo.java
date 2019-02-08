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
	
	//�̵� ��� :
	//redirect���, forward��� �ΰ����� ���еȴ�.
	//forward����� request��ü�� ���� �����ؼ� ������ �� �ִ� Ư¡�� �ִ�.
	//http://localhost/webApp0201/first?msg=hi
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//redirect ����� responce��ü�� ��ü
		PrintWriter out = resp.getWriter();
		//req.setAttribute("msg",msg);
		
		out.println("second");
		out.println("Second Page : " + req.getAttribute("msg"));
	} 
	


}
