package Model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.ActionForward;
import vo.MemberDao;
import vo.MemberVO;
//폼에서 요청이 왔을 시 post, cmd = memIn

public class MemberInAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException{
		//세션 객체를 생성
		HttpSession session = request.getSession();
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		//member와 연결해야 함
		String dbid = "test";
		String dbpwd="test11";
		String path = "";
		boolean method = false;
		if(id.equals(dbid) && pwd.equals(dbpwd)) {
			path = "*.kosta?cmd=hello";
			method = true;
			//sessionScope에 아이디값을 저장
			session.setAttribute("uid",id);
			
		}
		else{ //실패
			path = "error.jsp";
			method = false;
			request.setAttribute("msg", "로그인 실패");
			
		}
		return new ActionForward(path,method);
				
	
	

}}
