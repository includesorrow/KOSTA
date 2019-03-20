<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content=Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<style>
#wrap {
	width: 500px;
	margin: auto;
	border: 1px dotted;
}
</style>
</head>
<body>
	<div id="wrap">
		<table>
			<tr>
				<td>�����ȣ</td>
				<td>�����å</td>
				<td>����̸�</td>
				<td>����ȣ</td>
				<td>����</td>
			</tr>
			<c:forEach var="sawon" items="${splist }">
				<tr>
					<td>${sawon.sabun }</td>
					<td>${sawon.sajob }</td>
					<td>${sawon.saname }</td>
					<td>${sawon.sphone.phnum }</td>
					<td>${sawon.sphone.pmodel }</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>