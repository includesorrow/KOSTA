package kr.or.kosta.mvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.or.kosta.dto.MovieVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;


/*
 * DispatcherServlet 요청에 응답하는 모델
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
	
	
//	@GetMapping(value= {"/blank2"})
//	public String movielist(Model m) {
//		System.out.println("blank2");
//		Map<String, String> map = new HashMap<String, String>();
//		String movielistt = dao.getMovieList();
//		System.out.println("aa : "+movielistt);
////		for(MovieVO e : movielistt) {
////			System.out.println(e.getMovie_title());
////		}
//		m.addAttribute("list",movielistt);
//		
//		return "blank2";
//	}
//	
//	@PostMapping("/blank2")
//	public String searchMovie(String movie_title, Model m) {
//		Map<String,String> map = new HashMap<String,String>();
//		map.put("movie_title",movie_title);
//		
////		List<MovieVO> movielistt = dao.getMovieList(map);
////		System.out.println(movielistt);
////		m.addAttribute("list",dao.getMovieList(map));
//		return "blank2";
//	}
	
	@GetMapping(value={"/blank2"})
	public String movielist(Model m) {
		Map<String, String> map= new HashMap<String, String>();
		m.addAttribute("list",dao.getMovieList(map));
		return "blank2";
	}
	
	@PostMapping("/blank2")
	public String searchTitle(String movie_title,Model m) {
		Map<String, String> map= new HashMap<String, String>();
		map.put("movie_title", movie_title);
		m.addAttribute("list",dao.getMovieList(map));
		return "blank2";
	}
	
	
	
}