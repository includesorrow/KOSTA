package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Model.Action;

//모델을 관리해주는 객체, servlet이 접근하는 객체
//서블릿에게 요청에 따른 모델을 생성한 후 다형성으로 처리
//모델을 다형성으로 생성한 후 인터페이스를 반환하는게 핵심임
public class ActionFactory {
	//싱글톤 작성
	private static ActionFactory factory;
	private Properties prop;
	private ActionFactory() {
		prop = new Properties();
		//한번만 할려고 이렇게 하는거임. 생성자에 안넣으면 여러번 실행됨
	}
	public static synchronized ActionFactory getFactory() {
		if(factory == null) factory = new ActionFactory();
		return factory;
	}
	//cmd => http://host/contextPath/cont?cmd=hello
	public Action getAction(String cmd) {
		
		
		Action action = null;
try{
	prop.load(new FileInputStream("C:\\KOSTA\\Apache\\webapp\\workspace\\webApp0211\\src\\Controller\\classinfo.properites"));
	System.out.println("key : " + prop.getProperty(cmd));
	String rPath = prop.getProperty(cmd);
	if(rPath == null) { 
		cmd = "index";
		rPath = prop.getProperty(cmd);
	}
	Class<Action> haClass = (Class<Action>) Class.forName(rPath);
	//new Instance() : 클래스를 객체로 생성
	action = haClass.newInstance();
	
}catch(Exception e){
	e.printStackTrace();
	
	
}
		
		//kosta?cmd=hello
		
			return action;
		
		//if구문 만들어서 하는데
		//하나가 추가될 때 마다 if추가해야함.
		//줄일방법이없을까? 연구하고올것
	}

}
