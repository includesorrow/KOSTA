<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <!-- 이거 다 out.println으로 다 가는개념임 -->
    <!-- 선언부 -->
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
		<%--표현 out.println(testMsg) --%>
		<%--표현식 --%>
		<%= testMsg %>
	</div>
	<!-- 스크립트 릿 (service메서드 영역) -->
	<%!
	//서비스메서드영역안
	String testMsg = test();
	%>

</body>
</html>