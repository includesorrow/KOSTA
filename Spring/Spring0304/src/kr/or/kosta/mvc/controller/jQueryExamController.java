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
			if(name.equals("김길동") && orderName.equals("A001")){
				status="주문하신 금괴가 지금 발송중입니다.";
			}else if(name.equals("김길동") && orderName.equals("A002")) {
				status="주문하신 자동차는 공장에서 주문생산 완료되었습니다.";
			}else {
				status="이미 발송된 완료된 제품입니다.";
			}
			m.addAttribute("status",status);
		}
		return cmd;
	}
	
}
