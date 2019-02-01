

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyHello
 */
@WebServlet("/MyHello")
public class MyHello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyHello() {}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, //�� ���忡�� ��ǲ��Ʈ��
			HttpServletResponse response // �� ���忡�� �ƿ�ǲ��Ʈ��
			) throws ServletException, IOException {
		System.out.println("get������� ȣ���� �˴ϴ�.");
		//ȭ���� ����ϱ� ���ؼ� �������� ��Ʈ���� ����.
		PrintWriter out = response.getWriter();
		out.println("<p style='color:red'>My First Servlet~~~! ����</p>");
		out.close();
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
