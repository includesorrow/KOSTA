<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex1.jsp</title>
<style>
	#demo{width: 300px; background: orange; color: #ffffff;}
</style>
</head>
<body>
	<button type="button" onclick="clickP()">
		Click me to display Date and Time.
	</button>
	<p id="demo"></p>
	<script>
		function clickP(){
			//document.getElementById("demo").innerHTML=Date();
			// ' '," "�� �����ؼ� ����� �����ϴ�.
			document.getElementById("demo").innerHTML = 'Hello "JavaScript" ';
		}
	</script>
</body>
</html>