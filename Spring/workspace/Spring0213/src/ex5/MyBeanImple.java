package ex5;

public class MyBeanImple implements MyBeanInter{

	@Override
	public String myGetMessage(String name) {
		StringBuffer sb = new StringBuffer();
		sb.append("Message : ").append("test");
		sb.append("�ٽ� ���� ����!");
		return sb.toString();
	}

	
}
