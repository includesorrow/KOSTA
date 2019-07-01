<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/default.css">
</head>

<body>


<c:choose>
	<c:when test="${sessionScope.uid == null}">
		<script>
			location="loginForm"
		</script>
	</c:when>
<c:otherwise>
	<table>
		<c:forEach var="e" step="1" begin="0" end="20">
			<tr>
				<td>${e }</td>
				<td>test${e }</td>
			</tr>
		</c:forEach>
	</table>

</c:otherwise>
</c:choose>
</body>
</html>