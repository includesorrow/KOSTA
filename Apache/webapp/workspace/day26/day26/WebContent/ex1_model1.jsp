<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String[] movieList = { "파워무비", "범블비", "아쿠아맨", "드래곤 길들이기3", "어벤져스 : 엔드게임" };

	request.setAttribute("movieList", movieList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>영화 채널</title>
<style>
table { "
	width: 300px;
	margin: auto;
	border: 1px solid blue;
	text-align: center;"
}
</style>
</head>
<body>
	<table>
		<thead><tr><td>영 화 무 비</td></tr></thead>
		<tbody><tr><td>
		<ul>
			<c:forEach items="${movieList}" var="i">
				<li>${i}</li>
			</c:forEach>

		</ul>
		</td></tr>
		</tbody>
	</table>
</body>
</html>