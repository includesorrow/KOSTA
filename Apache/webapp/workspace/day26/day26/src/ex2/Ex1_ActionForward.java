package ex2;

public class Ex1_ActionForward {
	private String url; // ���� ���� �� �̵��� view
	private boolean method; // ���� ���� �� �̵��� ���
	public Ex1_ActionForward(String url, boolean method) {
		this.url = url;
		this.method = method;
	}
	public Ex1_ActionForward() {}
	public String getUrl() {
		return url;
	}
	public boolean isMethod() {
		return method;
	}
	
}
