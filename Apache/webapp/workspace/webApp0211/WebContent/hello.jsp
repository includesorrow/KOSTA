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
<a href="*.kosta?cmd=greeting&id=Login">�α���</a>
	</c:when>
	<c:otherwise>
	${sessionScope.uid } �� �ݰ����ϴ�. 
	<a href="*.kosta?cmd=Logout"> �α׾ƿ�</a>
	</c:otherwise>
</c:choose>
</body>
</html>