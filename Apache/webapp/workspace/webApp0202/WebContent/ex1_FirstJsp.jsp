<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <!-- �̰� �� out.println���� �� ���°����� -->
    <!-- ����� -->
 <%!    private String msg = "ok";
    public String test(){
    	return "himan";
    }
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div style="width : 300pk; background:orange;">
		<%--ǥ�� out.println(testMsg) --%>
		<%--ǥ���� --%>
		<%= testMsg %>
	</div>
	<!-- ��ũ��Ʈ �� (service�޼��� ����) -->
	<%!
	//���񽺸޼��念����
	String testMsg = test();
	%>

</body>
</html>