package Model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.ActionForward;

public class HelloAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException{
		String msg = "helloMVC!";
		request.setAttribute("msg", msg);
		//false : forward, true : redirect
		return new ActionForward("hello.jsp", false);
				
	}
	
}
