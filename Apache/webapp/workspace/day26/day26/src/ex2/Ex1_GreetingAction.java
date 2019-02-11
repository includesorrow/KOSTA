package ex2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex1_GreetingAction implements Ex1_Action{

	@Override
	public Ex1_ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		String msg=request.getParameter("id")+"님 환영합니다.";
		request.setAttribute("msg", msg);
		Ex1_ActionForward af=new Ex1_ActionForward("greeting.jsp",false);
		return af;
	}
	
}
