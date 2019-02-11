package ex1;

public class MyObjectMemo {
	
	
	public MyObjectMemo() {
		System.out.println("MyObjectDemo»ý¼º!");
	}

	public String message(int num) {
		if(num==1) {
			return "È¦";
			
		}
		else if(num == 2) {
			return "Â¦";
		}else
		{
			return "¤±¤©";
		}
	}
	
}
