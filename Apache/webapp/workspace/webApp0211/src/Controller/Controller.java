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
	//한글처리
		request.setCharacterEncoding("euc-kr");
		//요청받기
		String cmd = request.getParameter("cmd");
		if(cmd != null) {
			ActionFactory factory = ActionFactory.getFactory();
			//ex)Action action = newHelloAction(); 만들어져서 그 주소 받아옴
			Action action = factory.getAction(cmd);
			//ActionForward를 반환 - 이동방식,view정보
			ActionForward af = action.execute(request, response);
			if(af.isMethod()) {//redirect
				response.sendRedirect(af.getUrl());
			}else {//forward
				//모델이 수행한 후 반환 받은 값 중에 url값을 forward로 지정
				StringBuffer sb = new StringBuffer();
				sb.append(PATH).append(af.getUrl());
				RequestDispatcher rd = request.getRequestDispatcher(sb.toString());
				rd.forward(request, response);
			}
		}else {
			//요청이 없을 때 처리
		}
		
	}
	
	//사용자가 get으로 올지 post로 올지 몰라서 이렇게 모든 요청방식을 처리하기 위한 방법
}
