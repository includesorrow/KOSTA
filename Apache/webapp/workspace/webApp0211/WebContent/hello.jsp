<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>hello.jsp</title>
</head>
<body>
<h1>${msg } / ${sessionScope.uid }</h1>
<c:choose >
	<c:when test="${sessionScope.uid == null }">
<a href="*.kosta?cmd=greeting&id=Login">로그인</a>
	</c:when>
	<c:otherwise>
	${sessionScope.uid } 님 반갑습니다. 
	<a href="*.kosta?cmd=Logout"> 로그아웃</a>
	</c:otherwise>
</c:choose>
</body>
</html>