package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ex2
 */
@WebServlet("/first")
public class Ex1_FirstPageDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//�̵� ��� :
	//redirect���, forward��� �ΰ����� ���еȴ�.
	//forward����� request��ü�� ���� �����ؼ� ������ �� �ִ� Ư¡�� �ִ�.
       
    public Ex1_FirstPageDemo() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		//��û���� ���� �ٽ� second�������� ������
		//scope => page, request, session, application
		// page : private request : protect ���� ������. 
		//redirect����� response ��ü�� ��ü
		
		//http://localhost/webApp0201/first?msg=hi
		System.out.println("�ι�° ������ ȣ��");
		String msg = req.getParameter("msg");
		req.setAttribute("msg", msg);
	//	resp.sendRedirect("second"); < Redirect���.�̷�����̸� second���� msg��¸���.
	//	foward��� request ��ü�� 7
		ü
		RequestDispatcher rd = req.getRequestDispatcher("second");
		//������ ���� ������ ���¿��� First���� Second�� ����. 
		rd.forward(req, resp);
		//�̷��� �ҷ��� ������ ������� �����ؾ��Ѵ�.
		 
	/*
	 * �������ڸ� redirect�� scope�� ����� �� ����.
	 * Foward����� ���� ����Ǿ��ִ�. View�� First�� ��. Request�� �����Ǵ°� �ٽ�.
	 * http://localhost:8024/webApp0201/first?msg=hi
	 * ���� �̰� �Է��ϸ� hi�� ����� ��. 
	 * hi�� request.scope���� �°���. 
	 */
	}

}
