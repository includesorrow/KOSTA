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
}