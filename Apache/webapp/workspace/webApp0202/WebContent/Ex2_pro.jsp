<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%  //이 영역은 service영역. request랑 responce 둘다 존재함. 바로 호출해서 사용 가능. 이걸 내장객체라고 함.
	int num = Integer.parseInt(request.getParameter("num"));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	table{width : 100px; margin : auto;}
	table thread td{ background : orange;}
	table tbody td{ background : yellow; border : 1px solid;
	text-align:center;}
</style>
</head>
<body>
	<table>
		<thead>
			<tr><td>숫자:<%=num %></td></tr>
		</thead>
		<tbody>
		<%for(int i = 0; i<num; i++){ %>
			<tr><td> <%=i %></td></tr>
		<% } %>
		</tbody>
		</table>

</body>
</html>