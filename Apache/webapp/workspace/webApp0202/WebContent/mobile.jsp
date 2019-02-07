<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<style>
	h1 { color:pink; background: blue;}
</style>
<script> 	
//var 자바스크립트 변수 선언 
var ua = window.navigator.userAgent;
console.log("ua"+ua);
if(/lgtelecom/i.test(ua) || /Android/i.test(ua) || 
		/blackberry/i.test(ua) || /iPhone/i.test(ua) || 
		/ipad/i.test(ua) || /samsung/i.test(ua) ||
		/symbian/i.test(ua) || /sony/i.test(ua) || 
		/SCH-/i.test(ua) || /SPH-/i.test(ua)){
	//location.href="mobile.jsp";
} else {
	//location.href="myHello";
}

</script> 
</head>
<body>
<h1> 모바일페이지</h1>
</body>
</html>