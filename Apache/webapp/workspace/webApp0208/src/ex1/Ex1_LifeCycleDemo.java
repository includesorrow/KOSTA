package ex1;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex1
 */
@WebServlet("/ex1")
public class Ex1_LifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public Ex1_LifeCycleDemo() {
    
    	super();
    }

	@Override
	public void init() throws ServletException {

System.out.println("Init 호출");
	}

	public void destroy() {
System.out.println("Destroy 호출");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
