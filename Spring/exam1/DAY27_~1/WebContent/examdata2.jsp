<%@page import="exam.ExamBeanInter"%>
<%@page import="exam.ExamBeanImple"%>
<%@page import="org.springframework.context.support.GenericXmlApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	ApplicationContext ctx= new GenericXmlApplicationContext("exam/exam.xml");

	// ������ �����̳�(ApplicationContext) ����
	
	ExamBeanInter emi=ctx.getBean("examBean",ExamBeanImple.class);
	
	// examBean�� id������ ������ �����̳ʿ��� ExamBeanImple��� bean�� �����´�.
	
	emi.callExecutebean(request.getParameter("con"));
	
	// ExamBeanImple���� callExecutebean�� �޼��带 �����ؼ� con���� exam.jsp���� �޾�
	// (type1,type2,type3)�� ���� ���� typeA,B,C�� �����´�.
	
	String type=emi.getMessageBean();
	// �� ��ü�ȿ� �ִ� getMessageBean�� ���� typeA,B,C�� message���� type�̶�� String�ȿ� ����д�.
	
	%> 
<%=type // String ���
%>
