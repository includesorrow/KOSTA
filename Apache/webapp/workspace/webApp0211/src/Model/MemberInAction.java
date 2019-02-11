package Model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.ActionForward;
import vo.MemberDao;
import vo.MemberVO;
//������ ��û�� ���� �� post, cmd = memIn

public class MemberInAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException{
		//���� ��ü�� ����
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		//member�� �����ؾ� ��
		String dbid = "test";
		String dbpwd="test11";
		String path = "";
		boolean method = false;
		if(id.equals(dbid) && pwd.equals(dbpwd)) {
			path = "*.kosta?cmd=hello";
			method = true;
			//sessionScope�� ���̵��� ����
			session.setAttribute("uid",id);
			
		}
		else{ //����
			path = "error.jsp";
			method = false;
			request.setAttribute("msg", "�α��� ����");
			
		}
		return new ActionForward(path,method);
				
	
	

}}
