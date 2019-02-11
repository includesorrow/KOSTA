package ex2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex1_JoinMember implements Ex1_Action {

	@Override
	public Ex1_ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		Ex1_ActionForward af=new Ex1_ActionForward("join.jsp",false);
		return af;
	}

}
