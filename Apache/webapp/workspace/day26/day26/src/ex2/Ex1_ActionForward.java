package ex2;

public class Ex1_ActionForward {
	private String url; // 모델이 수행 후 이동할 view
	private boolean method; // 모델이 수행 후 이동할 방식
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
