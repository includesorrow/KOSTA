package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Action;

/**
 * Servlet implementation class Controller
 */
@WebServlet("*.kosta")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PATH = "/WEB-INF/view/";
    public Controller() {
   
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//�ѱ�ó��
		request.setCharacterEncoding("euc-kr");
		//��û�ޱ�
		String cmd = request.getParameter("cmd");
		if(cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			//ex)Action action = newHelloAction(); ��������� �� �ּ� �޾ƿ�
			Action action = factory.getAction(cmd);
			//ActionForward�� ��ȯ - �̵����,view����
			ActionForward af = action.execute(request, response);
			if(af.isMethod()) {//redirect
				response.sendRedirect(af.getUrl());
			}else {//forward
				//���� ������ �� ��ȯ ���� �� �߿� url���� forward�� ����
				StringBuffer sb = new StringBuffer();
				sb.append(PATH).append(af.getUrl());
				RequestDispatcher rd = request.getRequestDispatcher(sb.toString());
				rd.forward(request, response);
			}
		}else {
			//��û�� ���� �� ó��
		}
		
	}
	
	//����ڰ� get���� ���� post�� ���� ���� �̷��� ��� ��û����� ó���ϱ� ���� ���
}
