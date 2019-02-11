package ex2;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Ex1_Action {
	// 인자 값이 HttpServletRequest request
	// ,HttpServletResponse responce
	public Ex1_ActionForward execute(HttpServletRequest request
			,HttpServletResponse responce) throws IOException;
}
