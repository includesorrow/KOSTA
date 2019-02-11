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
당신의 성적은 A입니다.
</c:when>
<c:when test="${score ge 80}">
당신의 성적은 B입니다.
</c:when>
<c:when test="${score ge 70}">
당신의 성적은 C입니다.
</c:when>
<c:when test="${score ge 60}">
당신의 성적은 D입니다.
</c:when>
<c:otherwise>
당신은 낙제입니다.
</c:otherwise>
</c:choose>
<form action="ex1_choose2.jsp">
	<input type="submit" value="뒤로가기">
</form>
</body>
</html>