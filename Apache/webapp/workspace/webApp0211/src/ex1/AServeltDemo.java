package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AServletDemo")
public class AServeltDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String PATH = "/WEB-INF/view/";
       private AmodelDemo model;
       
    public AServeltDemo() {
      model = new AmodelDemo();
    	// TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String msg = model.getMessage();
	request.setAttribute("msg", msg);
	RequestDispatcher rd = request.getRequestDispatcher(PATH + "aview.jsp");
	rd.forward(request, response);
	} 



}
