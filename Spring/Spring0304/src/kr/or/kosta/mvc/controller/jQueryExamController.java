package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class jQueryExamController {

	@GetMapping("/exam2")
	public String ex1(String cmd, String name, String orderName, Model m) {
		String status;
		if(cmd.equals("ex3_ajax")) {
			if(name.equals("��浿") && orderName.equals("A001")){
				status="�ֹ��Ͻ� �ݱ��� ���� �߼����Դϴ�.";
			}else if(name.equals("��浿") && orderName.equals("A002")) {
				status="�ֹ��Ͻ� �ڵ����� ���忡�� �ֹ����� �Ϸ�Ǿ����ϴ�.";
			}else {
				status="�̹� �߼۵� �Ϸ�� ��ǰ�Դϴ�.";
			}
			m.addAttribute("status",status);
		}
		return cmd;
	}
	
}
