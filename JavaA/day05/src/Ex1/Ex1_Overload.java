package Ex1;

public class Ex1_Overload {

	public void drawCircle(int r) {
		System.out.println("������" + r + "�� ���� �׸���.");
		
	}
	public void drawRec(int w, int h) {
		System.out.println("�ʺ� : " + w + ", ���� : " + h + "�� �簢���� �׸���. ");
	}
	public void lineDraw(int x, int y, int len) {
		System.out.println("��ǥ  x : " + x + "��ǥ y : " + y);
		System.out.println("���̰� " + len + "�� ���� �׸���.");
	}
	
	
	public static void main(String[] args) {
		//String.valueof(~~~)
		//��� �ڷ���(boolean ~ double����) ���� String���� ��ȯ
		//�������� ������. �����ε� ��Ģ ��Ű�� �������� �κп��� �پ?
		Ex1_Overload ref = new Ex1_Overload();
		//ref.d
		
		//ref. �׸� �̳�����. �ؿ��� �����ε� �Ѱ���
	
		ref.draw(3);
		//�̷��� draw������ ���� �����ϴ�
	}
	
	
	
	
	//�޼ҵ� �����ε� : �޼ҵ��� �̸��� ���� �ص����ν�
	//�޼ҵ��� �������� �ϰ����� �����Ѵ�
	
	public void draw(int r) {
		System.out.println("������" + r + "�� ���� �׸���.");
	}
	
	public void draw(int w, String h) {
		System.out.println("�ʺ� : " + w + ", ���� : " + h + "�� �簢���� �׸���.");
	}
	
	public void draw(String h, int w) {
		System.out.println("�ʺ� : " + w + ", ���� : " + h + "�� �簢���� �׸���.");
	}
	
	public void draw(int x , int y , int len) {
		System.out.println("��ǥ x : "  + x + "��ǥ y : " + y);
		System.out.println("���̰� " + len + "�� ���� �׸���.");
	}
	
	
	
}
