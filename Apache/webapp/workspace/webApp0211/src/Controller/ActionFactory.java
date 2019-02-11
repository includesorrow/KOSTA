package Controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Model.Action;

//���� �������ִ� ��ü, servlet�� �����ϴ� ��ü
//�������� ��û�� ���� ���� ������ �� ���������� ó��
//���� ���������� ������ �� �������̽��� ��ȯ�ϴ°� �ٽ���
public class ActionFactory {
	//�̱��� �ۼ�
	private static ActionFactory factory;
	private Properties prop;
	private ActionFactory() {
		prop = new Properties();
		//�ѹ��� �ҷ��� �̷��� �ϴ°���. �����ڿ� �ȳ����� ������ �����
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
	//new Instance() : Ŭ������ ��ü�� ����
	action = haClass.newInstance();
	
}catch(Exception e){
	e.printStackTrace();
	
	
}
		
		//kosta?cmd=hello
		
			return action;
		
		//if���� ���� �ϴµ�
		//�ϳ��� �߰��� �� ���� if�߰��ؾ���.
		//���Ϲ���̾�����? �����ϰ�ð�
	}

}
