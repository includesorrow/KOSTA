<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%  //�� ������ service����. request�� responce �Ѵ� ������. �ٷ� ȣ���ؼ� ��� ����. �̰� ���尴ü��� ��.
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
			<tr><td>����:<%=num %></td></tr>
		</thead>
		<tbody>
		<%for(int i = 0; i<num; i++){ %>
			<tr><td> <%=i %></td></tr>
		<% } %>
		</tbody>
		</table>

</body>
</html>