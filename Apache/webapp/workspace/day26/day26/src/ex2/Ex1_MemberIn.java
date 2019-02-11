package ex2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ex1.MemberDao;
import ex1.MemberVO;
// 폼에서 요청이 왔을시 post, cmd=memIn
public class Ex1_MemberIn implements Ex1_Action{

	@Override
	public Ex1_ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException {
		MemberVO vo= new MemberVO();
		vo.setId(request.getParameter("id"));
		vo.setName(request.getParameter("name"));
		vo.setPwd(request.getParameter("pwd"));
		vo.setEmail(request.getParameter("email"));
		vo.setTel(request.getParameter("tel"));
		MemberDao.getDao().addMemeber(vo);
		Ex1_ActionForward af=new Ex1_ActionForward("my.kosta?cmd=greeting&id="+vo.getId(),true);
		
		return af;
	}

}
