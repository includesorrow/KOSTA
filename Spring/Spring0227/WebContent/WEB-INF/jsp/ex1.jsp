<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	#wrap {width : 100px; height:100px; background : orange;}
</style>
</head>
<body>
<div id="wrap">
</div>
		<input type="button" id="hideBtn" value="Hide">
		<input type="button" id="showBtn" value="Show">
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<script>

	$(function(){
		$('#hideBtn').click(function(){
			console.log("Hide Btn Clicked!");
			$('#wrap').css("background","orange")
			});
		
		$('#showBtn').click(function(){
			console.log("Show Btn Clicked!");
			$('#wrap').css("background","green")
		});
	});
		
	</script>
</html>