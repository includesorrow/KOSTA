package Ex1;

public class Ex1_Overload {

	public void drawCircle(int r) {
		System.out.println("지름이" + r + "인 원을 그린다.");
		
	}
	public void drawRec(int w, int h) {
		System.out.println("너비 : " + w + ", 높이 : " + h + "인 사각형을 그린다. ");
	}
	public void lineDraw(int x, int y, int len) {
		System.out.println("좌표  x : " + x + "좌표 y : " + y);
		System.out.println("길이가 " + len + "인 선을 그린다.");
	}
	
	
	public static void main(String[] args) {
		//String.valueof(~~~)
		//모든 자료형(boolean ~ double까지) 에서 String으로 변환
		//가독성도 떨어짐. 오버로드 규칙 지키면 설계적인 부분에서 뛰어남?
		Ex1_Overload ref = new Ex1_Overload();
		//ref.d
		
		//ref. 항목 겁나많음. 밑에는 오버로딩 한거임
	
		ref.draw(3);
		//이러면 draw내에서 전부 가능하다
	}
	
	
	
	
	//메소드 오버로딩 : 메소드의 이름을 같게 해둠으로써
	//메소드의 가독성과 일관성을 보장한다
	
	public void draw(int r) {
		System.out.println("지름이" + r + "인 원을 그린다.");
	}
	
	public void draw(int w, String h) {
		System.out.println("너비 : " + w + ", 높이 : " + h + "인 사각형을 그린다.");
	}
	
	public void draw(String h, int w) {
		System.out.println("너비 : " + w + ", 높이 : " + h + "인 사각형을 그린다.");
	}
	
	public void draw(int x , int y , int len) {
		System.out.println("좌표 x : "  + x + "좌표 y : " + y);
		System.out.println("길이가 " + len + "인 선을 그린다.");
	}
	
	
	
}
