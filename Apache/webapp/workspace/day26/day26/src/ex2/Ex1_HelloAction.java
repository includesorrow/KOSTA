package ex2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex1_HelloAction implements Ex1_Action {

	@Override
	public Ex1_ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String msg="hello MVC!";
		request.setAttribute("msg", msg);
		//false : forward·Î ¼³Á¤. true : redirect
		return new Ex1_ActionForward("hello.jsp",false);
	}

}
