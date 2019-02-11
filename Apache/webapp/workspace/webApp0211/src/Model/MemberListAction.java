package Model;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.ActionForward;
import vo.MemberDao2;
import vo.MemberVO;

public class MemberListAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse responce) throws IOException{
		List<MemberVO> list = MemberDao2.getDao().getList();
		request.setAttribute("list", list);
		return new ActionForward("memList.jsp",false);
	}
}
