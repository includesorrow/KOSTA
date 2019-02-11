package ex2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.kosta")
public class Ex1_ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static final String PATH="/WEB-INF/view/";
    public Ex1_ControlServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	// ���(GET/POST) ��û����� doProcess�� ó���ϱ� ���ؼ�
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//�ѱ�ó��
		request.setCharacterEncoding("euc-kr");
		//��û�ޱ�
		String cmd=request.getParameter("cmd");
		if(cmd != null) {
			Ex1_ActionFactory factory= Ex1_ActionFactory.getFactory();
			Ex1_Action action =factory.getAction(cmd);
			Ex1_ActionForward af= action.execute(request, response);
			if(af.isMethod()) {//redirect
				response.sendRedirect(af.getUrl());
			}else {
				StringBuffer sb=new StringBuffer();
				sb.append(PATH).append(af.getUrl());
				RequestDispatcher rd=request.getRequestDispatcher(sb.toString());
				rd.forward(request, response);
			}
		}else {
			//��û�� ������
		}
	}
}
