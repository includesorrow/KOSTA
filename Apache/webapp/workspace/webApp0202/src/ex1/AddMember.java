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
       
    
		//join.jsp,formDemo.jsp에서 값을 전송했을 때 동작이 된다.    
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr"); //한글요청
		//form의 name을 매핑한다. -> String id, pwd, name
		//각각의 name들의 파라미터를 받는다.
		//request.getParameter("xx"); name="xx"
		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
		String name = request.getParameter("name");
		System.out.println(id);
		//브라우저로 보여줄 때 처리
		response.setContentType("text/html;charset=euc-kr");
		//브라우저로 보여줄 때 처리해야하는데text붙어야함. MINE타입인데 서버와 클라이언트 사이에
		//텍스트를 보내겠다. 그런 형식으로 보내면 브라우저가 그걸 읽어서 그거에 맞는 타입을 렌더링함.
		PrintWriter out = response.getWriter();
		out.println("<p style ='color:green'>" + id + "님 회원가입을 축하합니다.<p>");
		out.println("<p style ='color:blue'>" + pw + "님 회원가입을 축하합니다.<p>");
		out.println("<p style ='color:red'>" + name + "님 회원가입을 축하합니다.<p>");
		//Dao.getConn().addmember(MemberVO); 
		//이러면 DB에도 들어간다.
	}

}
