package exam1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class exam1_aservlet
 */
@WebServlet("/exam1_aservlet")
public class exam1_aservlet extends HttpServlet {
	exam1_amodel xa; 
	public exam1_aservlet() {
		xa= new exam1_amodel();
	}
	private static final long serialVersionUID = 1L;
    private static final String PATH="/WEB-INF/view/";
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String test=xa.test();
		request.setAttribute("test", test);
		RequestDispatcher rd= request.getRequestDispatcher(PATH+"exam1_aview.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
