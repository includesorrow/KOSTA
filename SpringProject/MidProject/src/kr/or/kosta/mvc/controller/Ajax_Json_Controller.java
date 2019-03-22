package kr.or.kosta.mvc.controller;

import java.util.ArrayList;import java.util.HashMap;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.or.kosta.dto.Jamong;


/*
 * 
 * */
@RestController
public class Ajax_Json_Controller {
	
	@RequestMapping(value="/stringify", method=RequestMethod.POST)
    @ResponseBody
    public Object stringify(@RequestBody Jamong jamong) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("name", jamong.getAnalysistitle());
       
        return map;
    }
	
	    @PostMapping("/restController")
	    public Object restController(@RequestBody Jamong jamong) {
	        ArrayList<String> arrList = new ArrayList<String>();
	      
	            arrList.add(jamong.getAnalysistitle());
	            arrList.add(jamong.getAnalysisprice());
	            arrList.add(jamong.getAnalysistag());
	        
	        return arrList;
	    }
	}

	
	
