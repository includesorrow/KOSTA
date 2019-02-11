<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--
요청 url이 http://localhost/day25/ex1_if1.jsp?type=guest인 경우와
요청 url이 http://localhost/day25/ex1_if1.jsp?type=member인 경우
각각 다른 화면이 나타나도록 해야 하는 경우 <c:if>를 사용해서 처리
--%>
	<c:if test="${param.type eq 'guest'}">
		홈페이지에 방문을 환영합니다. <br/>
		회원가입 바랍니다.
	</c:if>
	<c:if test="${param.type eq 'member'}">
		고객님 감사합니다 <br/>
		더 나은 서비스로 보답하겠습니다.
	</c:if>
	<br/>
</body>
</html>