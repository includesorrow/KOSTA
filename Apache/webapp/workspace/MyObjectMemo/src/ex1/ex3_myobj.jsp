<%@page import="ex1.MyObjectMemo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex3_myobj.jsp</title>
</head>
<body>
<%
	//�޼��� �����̴ϱ�
	MyObjectMemo ref = new MyObjectMemo();
	int num = 1;


%> 

<p><%=ref.message(num)%></p>

</body>
</html>