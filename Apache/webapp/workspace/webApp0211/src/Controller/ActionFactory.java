package Controller;

import Model.Action;

//���� �������ִ� ��ü, servlet�� �����ϴ� ��ü
//�������� ��û�� ���� ���� ������ �� ���������� ó��
//���� ���������� ������ �� �������̽��� ��ȯ�ϴ°� �ٽ���
public class ActionFactory {
	//�̱��� �ۼ�
	private static ActionFactory factory;
	
	public static synchronized ActionFactory getFactory() {
		if(factory == null) factory = new ActionFactory();
		return factory;
	}
	//cmd => http://host/contextPath/cont?cmd=hello
	public Action getAction(String cmd) {
		Action action = null;
		
		return action;
		
		//if���� ���� �ϴµ�
		//�ϳ��� �߰��� �� ���� if�߰��ؾ���.
		//���Ϲ���̾�����? �����ϰ�ð�
	}

}
