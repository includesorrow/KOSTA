package exam1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class exma2_result
 */
@WebServlet("/exam2_result")
public class exam2_result extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PATH="/WEB-INF/view/";
	private exam2_model model;
    public exam2_result() {
    	model= new exam2_model();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg= model.getone(Integer.parseInt(
				request.getParameter("num")));
		request.setAttribute("msg", msg);
		RequestDispatcher rd= request.getRequestDispatcher(PATH+"exam2_result.jsp");
		rd.forward(request, response);
	}
	
}
