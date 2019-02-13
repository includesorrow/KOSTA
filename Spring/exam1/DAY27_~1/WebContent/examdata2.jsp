<%@page import="exam.ExamBeanInter"%>
<%@page import="exam.ExamBeanImple"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	ApplicationContext ctx= new GenericXmlApplicationContext("exam/exam.xml");

	// 스프링 컨테이너(ApplicationContext) 생성
	
	ExamBeanInter emi=ctx.getBean("examBean",ExamBeanImple.class);
	
	// examBean을 id값으로 스프링 컨테이너에서 ExamBeanImple라는 bean을 가져온다.
	
	emi.callExecutebean(request.getParameter("con"));
	
	// ExamBeanImple에서 callExecutebean의 메서드를 실행해서 con값을 exam.jsp에서 받아
	// (type1,type2,type3)에 따라 각각 typeA,B,C를 가져온다.
	
	String type=emi.getMessageBean();
	// 그 객체안에 있는 getMessageBean을 통해 typeA,B,C의 message값을 type이라는 String안에 적어둔다.
	
	%> 
<%=type // String 출력
%>
