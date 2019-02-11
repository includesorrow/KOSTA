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
	page scope에 Member객체를 member이라는 속성명으로 저장
	
	<c:set target="${member}" property="name" value="홍길동"/>
	 속성명이 member인 bean의 name property에 홍길동 값 저장.
	 <c:set target="${member}" property="email">
	 	hong@nate.com
	 </c:set>
	 속성명이 member인 bean의 email property에 hong@nate.com에 값 저장
	 <c:set var="phone" value="011-1234-5678"/>
	  phone이라는 속성명으로 011-1234-5678값을 page 범위에 저장
	  <c:set target="${member}" property="phone" value="${phone }"/>
	  속성명이 member인 bean의 phone property에 속성명 phone인 값을 읽어 저장
	<h4> 회원 정보 </h4>
	<ul>
	<li> 이름  : ${member.name}</li>
	<li> 메일  : ${member.email}</li>
	<li> 전화  : ${member.phone}</li>
	
	</ul>
</body>
</html>