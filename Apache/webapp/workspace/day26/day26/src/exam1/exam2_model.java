package exam1;

public class exam2_model {
	public String getone(int num) {
		String one;
		if(num>=90) {
			one="����� ������ A�Դϴ�.";
		}else if(num>=80) {
			one="����� ������ B�Դϴ�.";
		}else if(num>=70) {
			one="����� ������ C�Դϴ�.";
		}else if(num>=60) {
			one="����� ������ D�Դϴ�.";
		}else {
			one="����� �����Դϴ�.";
		}
		return one;
	}
}
