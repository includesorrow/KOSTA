<%@page import="ex1.Customer"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
Customer cust = new Customer();
cust.setName("홍길동");
cust.setEmail("hong.nate.com");
cust.setPhone("011-1234-5678");
request.setAttribute("customer",cust);
HashMap map = new HashMap();
map.put("name","소나타");
map.put("maker","현대자동차");
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
	<li> 이름 : ${customer.name }</li>
	<li> 메일 : ${customer.email }</li>
	<li> 이름 : ${customer.phone }</li>
	<br/>
	<li> 차명 : ${car.name }</li>
	<li> 제조사 : ${car.maker }</li>
	
</ul>

</body>
</html>