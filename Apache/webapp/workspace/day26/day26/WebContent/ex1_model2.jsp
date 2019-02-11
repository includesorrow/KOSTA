<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ex1.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	MemberVO vo1 = new MemberVO("홍길동", "hong@nate.com", "011-123-4567");
	MemberVO vo2 = new MemberVO("이순신", "lee@nate.com", "011-123-4567");
	MemberVO vo3 = new MemberVO("김유신", "kim@nate.com", "011-123-4567");

	List<MemberVO> memberList = new ArrayList<>();
	memberList.add(vo1);
	memberList.add(vo2);
	memberList.add(vo3);

	request.setAttribute("memberList", memberList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
table {
	width: 400px;
	margin: auto;
	border: 1px solid blue;
	text-align: center;
}
</style>
</head>
<body>
	<table>
		<thead>
			<tr>
				<td><h3>멤 버</h3></td>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td><ul>
						<li>이름&emsp;&emsp;&emsp;메일&emsp;&emsp;&emsp;&emsp;전화</li>
						<c:forEach items="${memberList}" var="m" varStatus="num">
							<li>${num.count}${m.name} &nbsp; ${m.email} &nbsp; ${m.phone }</li>
						</c:forEach>
					</ul></td>
			</tr>
		</tbody>
	</table>
</body>
</html>