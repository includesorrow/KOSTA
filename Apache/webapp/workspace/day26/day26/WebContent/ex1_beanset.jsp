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
	<jsp:useBean id="member" class="ex1.MemberVO"/>
	page scope�� Member��ü�� member�̶�� �Ӽ������� ����
	
	<c:set target="${member}" property="name" value="ȫ�浿"/>
	 �Ӽ����� member�� bean�� name property�� ȫ�浿 �� ����.
	 <c:set target="${member}" property="email">
	 	hong@nate.com
	 </c:set>
	 �Ӽ����� member�� bean�� email property�� hong@nate.com�� �� ����
	 <c:set var="phone" value="011-1234-5678"/>
	  phone�̶�� �Ӽ������� 011-1234-5678���� page ������ ����
	  <c:set target="${member}" property="phone" value="${phone }"/>
	  �Ӽ����� member�� bean�� phone property�� �Ӽ��� phone�� ���� �о� ����
	<h4> ȸ�� ���� </h4>
	<ul>
	<li> �̸�  : ${member.name}</li>
	<li> ����  : ${member.email}</li>
	<li> ��ȭ  : ${member.phone}</li>
	
	</ul>
</body>
</html>