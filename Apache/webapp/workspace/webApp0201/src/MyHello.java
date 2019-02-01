

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
	protected void doGet(HttpServletRequest request, //얘 입장에선 인풋스트림
			HttpServletResponse response // 얘 입장에선 아웃풋스트림
			) throws ServletException, IOException {
		System.out.println("get방식으로 호출이 됩니다.");
		//화면을 출력하기 위해서 브라우저와 스트림을 연결.
		PrintWriter out = response.getWriter();
		out.println("<p style='color:red'>My First Servlet~~~! ㅎㅎ</p>");
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
