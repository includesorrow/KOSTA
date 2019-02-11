package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

public class Ex1_ActionFactory { 
	// Model을 관리하는 객체, Servlet이 접근하는 객체
	// Servlet에게 요청에 따른 모델을 다형성으로 생성한 후
	// 인터페이스를 반환
	private Properties prop;
	private Ex1_ActionFactory() {
		prop=new Properties();
	}
	private static Ex1_ActionFactory factory;
	public static synchronized Ex1_ActionFactory getFactory() {
		if(factory==null) factory=new Ex1_ActionFactory();
		return factory;
	}
	// cmd = > http://host/contextPath/cont?cmd=hello
	public Ex1_Action getAction(String cmd) {
		Ex1_Action action=null;
		try {
			prop.load(new FileInputStream(
					"C:\\bigdataStudy\\webapp\\workspace\\day26\\src\\ex2\\classinfo.properties"));
			System.out.println("key : "+prop.getProperty(cmd));
			String rPath= prop.getProperty(cmd);
			if(rPath==null) {
				cmd="index";
				rPath= prop.getProperty(cmd);
			}
			Class<Ex1_Action> haClass= (Class<Ex1_Action>) Class.forName(rPath);
			//클래스를 객체로 생성하는 메서드
			action= haClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		if(cmd.equals("hello")) {
//			action=new Ex1_HelloAction();
//		}
		return action;
	}
}
