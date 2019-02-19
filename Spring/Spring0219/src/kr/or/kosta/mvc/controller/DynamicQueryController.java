package kr.or.kosta.mvc.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.or.kosta.dto.SawonVO;
import kr.or.kosta.mvc.dao.DynamicExampleDao;
import kr.or.kosta.mvc.dao.DynamicExampleDaoInter;

@Controller
public class DynamicQueryController {
//
//   @Autowired
//   private DynamicExampleDao dao;
//   
//   @GetMapping(value= {"/dynamic1", "/dyex1"})
//   public String dynamic1() {
//      return "dynamicExample1";
//   }
//   
//   @GetMapping(value= {"/dynamic2", "/dyex2"})
//   public String dynamic2() {
//      return "dynamicExample2";
//   }
////   @GetMapping(value= {"/dynamic3", "/dyex3"})
////   public String dynamic3() {
////      return "dynamicExample3";
////   }
////   
//   @PostMapping("/dyex1")
//   public String dynamicQuery1(String saname, Model model) {
//      Map<String, String> map = new HashMap<>();
//      
//      map.put("saname", saname);
//      List<SawonVO> list = dao.getSawonList(map);
//      
//      model.addAttribute("list", list);
//      return "dynamicExample1";
//   }
//   
//   @PostMapping("/dyex2")
//   public String dynamicQuery2(String saname,String sajob, Model model) {
//      Map<String, String> map = new HashMap<>();
//      map.put("test","aa");
//      map.put("saname", saname);
//      map.put("sajob", sajob);
//      List<SawonVO> list = dao.getSawonList2(map);
//      
//      model.addAttribute("list", list);
//      return "dynamicExample2";
//   }
////   @PostMapping("/dyex3")
////   public String dynamicQuery3(String searchType ,String searchName,Model model) {
////      Map<String, String> map = new HashMap<>();
////      
////      
////      System.out.println("dynamicQuery3 :"+ searchName+" : "+searchType);
////      map.put("searchName", searchName);
////      map.put("searchType", searchType);
////      List<SawonVO> list = dao.getSawonWhereList(map);
////      
////      model.addAttribute("list", list);
////      return "dynamicExample3";
////   }
//   
//   private void dataHandler(Map<String,String> map, Model model) {
//      List<SawonVO> list = dao.getSawonChooseList(map);
//      model.addAttribute("list",list);
//   }
//   
//   @GetMapping(value= {"/dynamic3", "/dyex3"})
//   public String dynamicChooseQuery() {
//      return "dynamicExample3";
//   }
//   @PostMapping("/dyex3")
//   public String dynamicChooseQuery(String searchType,String searchName, Model model) {
//      Map<String, String> map = new HashMap<>();
//      
//      map.put("searchName", searchName);
//      map.put("searchType", searchType);
//      dataHandler(map,model);
//      return "dynamicExample3";
//   }

}