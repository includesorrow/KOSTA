<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%--
��û url�� http://localhost/day25/ex1_if1.jsp?type=guest�� ����
��û url�� http://localhost/day25/ex1_if1.jsp?type=member�� ���
���� �ٸ� ȭ���� ��Ÿ������ �ؾ� �ϴ� ��� <c:if>�� ����ؼ� ó��
--%>
	<c:if test="${param.type eq 'guest'}">
		Ȩ�������� �湮�� ȯ���մϴ�. <br/>
		ȸ������ �ٶ��ϴ�.
	</c:if>
	<c:if test="${param.type eq 'member'}">
		������ �����մϴ� <br/>
		�� ���� ���񽺷� �����ϰڽ��ϴ�.
	</c:if>
	<br/>
</body>
</html>