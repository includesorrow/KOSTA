<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>This is a heading</h2>
	<p>This is a paragraph.1</p>
	<p>This is another paragraph.2</p>
	<p>This is another paragraph.3</p>
	<button>Click me</button>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script>
		$(document).ready(function() {
			console.log('$(p):'+$('p').length);
			$("button").click(function() {
				$("p:first").css("background", "red"); // 첫 번째
				$("p:eq(1)").css("background", "blue"); // eq(idx) 요소
				$("p:last").css({"background" : "green"}); // 마지막 요소
			});
		});
	</script>
</body>
</html>