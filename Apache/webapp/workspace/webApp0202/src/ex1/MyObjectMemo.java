package ex1;

public class MyObjectMemo {
	
	
	public MyObjectMemo() {
		System.out.println("MyObjectDemo����!");
	}

	public String message(int num) {
		if(num==1) {
			return "Ȧ";
			
		}
		else if(num == 2) {
			return "¦";
		}else
		{
			return "����";
		}
	}
	
}
