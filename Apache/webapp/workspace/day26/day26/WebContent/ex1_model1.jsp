<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String[] movieList = { "�Ŀ�����", "�����", "����Ƹ�", "�巡�� ����̱�3", "����� : �������" };

	request.setAttribute("movieList", movieList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ȭ ä��</title>
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
		<thead><tr><td>�� ȭ �� ��</td></tr></thead>
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