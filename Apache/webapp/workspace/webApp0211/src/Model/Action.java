package Model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controller.ActionForward;

public interface Action {
	
	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse responce) throws IOException;	
	

}
