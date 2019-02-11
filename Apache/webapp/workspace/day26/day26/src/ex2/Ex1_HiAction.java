package ex2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex1_HiAction implements Ex1_Action{

	@Override
	public Ex1_ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		Ex1_ActionForward af=new Ex1_ActionForward("hi.jsp",false);
		return af;
	}

}
