package Model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.ActionForward;

public class LoginAction {



public ActionForward execute(HttpServletRequest request, 
		HttpServletResponse responce) throws IOException{
	String msg = request.getParameter("id") + "�� ȯ���մϴ�.";
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
	//Dao�� ���ؼ� �Է��� ó���� �� greeting���� �̵��Ѵ�.
	MemberDao.getDao().addMember(v);
	//redirect
	return new ActionForward("my.kosta?cmd=greeting",true);
			*/