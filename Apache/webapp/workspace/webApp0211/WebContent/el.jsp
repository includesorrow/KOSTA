<%@page import="ex1.Customer"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
Customer cust = new Customer();
cust.setName("ȫ�浿");
cust.setEmail("hong.nate.com");
cust.setPhone("011-1234-5678");
request.setAttribute("customer",cust);
HashMap map = new HashMap();
map.put("name","�ҳ�Ÿ");
map.put("maker","�����ڵ���");
request.setAttribute("car",map);

%>



<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>JSP page</title>
</head>
<body>
<ul>
	<li> �̸� : ${customer.name }</li>
	<li> ���� : ${customer.email }</li>
	<li> �̸� : ${customer.phone }</li>
	<br/>
	<li> ���� : ${car.name }</li>
	<li> ������ : ${car.maker }</li>
	
</ul>

</body>
</html>