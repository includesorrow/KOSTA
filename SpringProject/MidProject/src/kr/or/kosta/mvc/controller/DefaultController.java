package kr.or.kosta.mvc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;


/*
 * DispatcherServlet ��û�� �����ϴ� ��
 * RequestMapping => HandlerMapping
 * 
 * */
@Controller
public class DefaultController {

	@Autowired
	private DynamicExampleDao dao; 
	
	
	
	@RequestMapping("/")
	public String index() {
		System.out.println("index");
		return "index";
	}
	
	@GetMapping("/{path}")
	public String ex1(@PathVariable String path) {
		return path;
	}
	
	

	@GetMapping(value={"/blank5"})
	public String movielist5(Model m) {
		Map<String, String> map= new HashMap<String, String>();
		m.addAttribute("list",dao.getMovieList3(map));
		return "blank5";
	}
	
	@PostMapping("/blank5")
	public String searchTitle5(String searchType,String search,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("searchType", searchType);
		map.put("search", search); 
		System.out.println(search);
		m.addAttribute("list",dao.getMovieList3(map)); 
		m.addAttribute("searchType",searchType);
		return "blank5";
	}
	
	
	@RequestMapping(value="update.do", method=RequestMethod.POST)
	public String update(@ModelAttribute MovieVO vo) throws Exception{
		dao.updateprice(vo);
		return "redirect:blank5";
	}
	
	@RequestMapping(value="insert.do", method=RequestMethod.POST)
	public String insert(@ModelAttribute MovieVO vo) throws Exception{
		dao.createmovie(vo);
		return "redirect:blank5";
	}
	
	@RequestMapping(value="delete.do", method=RequestMethod.POST)
	public String delete(@ModelAttribute MovieVO vo) throws Exception{
		dao.deletemovie(vo);
		return "redirect:blank5";
	}

		
	



	
	
	}
