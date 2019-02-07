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
	
	//이동 방식 :
	//redirect방식, forward방식 두가지로 구분된다.
	//forward방식은 request객체에 값을 저장해서 전달할 수 있는 특징이 있다.
       
    public Ex1_FirstPageDemo() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   
		//요청받은 값을 다시 second페이지로 보내기
		//scope => page, request, session, application
		// page : private request : protect 같은 내용임. 
		//redirect방식은 response 객체가 주체
		
		//http://localhost/webApp0201/first?msg=hi
		System.out.println("두번째 페이지 호출");
		String msg = req.getParameter("msg");
		req.setAttribute("msg", msg);
	//	resp.sendRedirect("second"); < Redirect방식.이런방식이면 second에서 msg출력못함.
	//	foward방식 request 객체가 7
		체
		RequestDispatcher rd = req.getRequestDispatcher("second");
		//기존의 값이 유지된 성태에서 First에서 Second로 보냄. 
		rd.forward(req, resp);
		//이렇게 할려면 포워드 방식으로 저장해야한다.
		 
	/*
	 * 정리하자면 redirect는 scope를 사용할 수 없다.
	 * Foward방식은 값이 저장되어있다. View는 First를 봄. Request는 유지되는게 핵심.
	 * http://localhost:8024/webApp0201/first?msg=hi
	 * 이제 이거 입력하면 hi가 출력이 됨. 
	 * hi는 request.scope에서 온거임. 
	 */
	}

}
