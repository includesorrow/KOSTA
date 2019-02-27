package kr.or.kosta.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//Ajax에 응답할 서버측 컨트롤러
// localhost/ajax/ajaxData1?subject=java
@Controller
@RequestMapping("/ajax")
public class AjaxDataController {

	@GetMapping("/ajaxData1")
	public String ajaxMethod(String subject, Model model) {
		System.out.println(subject);
		model.addAttribute("msg",subject);
		return "ex8_ajaxData";
	}
	
	@PostMapping(value="/ex6_data")
	public String ex6data(String gId, String age, String gname, String addr, String id, String pwd, Model model) {
		model.addAttribute("msg1",gId);
		model.addAttribute("msg2",age);
		model.addAttribute("msg3",gname);
		model.addAttribute("msg4",addr);
		model.addAttribute("msg5",id);
		model.addAttribute("msg6",pwd);
		return "ex6_data";
		
	}
	
	
}
