package Model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.ActionForward;

public class LoginAction {



public ActionForward execute(HttpServletRequest request, 
		HttpServletResponse responce) throws IOException{
	String msg = request.getParameter("id") + "님 환영합니다.";
	request.setAttribute("msg",msg);
	return new ActionForward("greeting.jsp",false);
}
}
/*
@Override
public ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException{
	MemberVO v = new MemberVO();
	v.setId(request.getParameter("id"));
	v.setPwd(request.getParameter("pwd"));
	v.setName(request.getParameter("name"));
	v.setEmail(request.getParameter("email"));
	v.setTel(request.getParameter("tel"));
	//Dao를 통해서 입력을 처리한 후 greeting으로 이동한다.
	MemberDao.getDao().addMember(v);
	//redirect
	return new ActionForward("my.kosta?cmd=greeting",true);
			*/