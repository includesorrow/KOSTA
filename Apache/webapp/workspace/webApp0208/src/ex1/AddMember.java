package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddMember
 */
@WebServlet("/addMember")
public class AddMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
		//join.jsp,formDemo.jsp���� ���� �������� �� ������ �ȴ�.    
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr"); //�ѱۿ�û
		//form�� name�� �����Ѵ�. -> String id, pwd, name
		//������ name���� �Ķ���͸� �޴´�.
		//request.getParameter("xx"); name="xx"
		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
		String name = request.getParameter("name");
		System.out.println(id);
		//�������� ������ �� ó��
		response.setContentType("text/html;charset=euc-kr");
		//�������� ������ �� ó���ؾ��ϴµ�text�پ����. MINEŸ���ε� ������ Ŭ���̾�Ʈ ���̿�
		//�ؽ�Ʈ�� �����ڴ�. �׷� �������� ������ �������� �װ� �о �װſ� �´� Ÿ���� ��������.
		PrintWriter out = response.getWriter();
		out.println("<p style ='color:green'>" + id + "�� ȸ�������� �����մϴ�.<p>");
		out.println("<p style ='color:blue'>" + pw + "�� ȸ�������� �����մϴ�.<p>");
		out.println("<p style ='color:red'>" + name + "�� ȸ�������� �����մϴ�.<p>");
		//Dao.getConn().addmember(MemberVO); 
		//�̷��� DB���� ����.
	}

}
