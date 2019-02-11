<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%
int score;
try{
score=Integer.parseInt(request.getParameter("val"));
}catch(NumberFormatException e){
	score=0;
}
request.setAttribute("score", score);
%>
<html>
<head>
<meta charset="EUC-KR">
<title>ex1_choose1.jsp</title>
</head>
<body>
<c:choose>
<c:when test="${score ge 90}">
����� ������ A�Դϴ�.
</c:when>
<c:when test="${score ge 80}">
����� ������ B�Դϴ�.
</c:when>
<c:when test="${score ge 70}">
����� ������ C�Դϴ�.
</c:when>
<c:when test="${score ge 60}">
����� ������ D�Դϴ�.
</c:when>
<c:otherwise>
����� �����Դϴ�.
</c:otherwise>
</c:choose>
<form action="ex1_choose2.jsp">
	<input type="submit" value="�ڷΰ���">
</form>
</body>
</html>