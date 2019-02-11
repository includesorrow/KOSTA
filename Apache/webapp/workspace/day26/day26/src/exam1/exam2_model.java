package exam1;

public class exam2_model {
	public String getone(int num) {
		String one;
		if(num>=90) {
			one="당신의 성적은 A입니다.";
		}else if(num>=80) {
			one="당신의 성적은 B입니다.";
		}else if(num>=70) {
			one="당신의 성적은 C입니다.";
		}else if(num>=60) {
			one="당신의 성적은 D입니다.";
		}else {
			one="당신은 낙제입니다.";
		}
		return one;
	}
}
