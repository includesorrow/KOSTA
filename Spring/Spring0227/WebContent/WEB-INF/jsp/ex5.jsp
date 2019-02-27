<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
#wrap {width : 450px; margin:auto}
</style>
<script>
	$(document).ready(function(){
		$('.item').css('color','orange');
		$('div h1 .item').css('background','red');
		
		
		//'div h1 .item' << h1 안에 있는 것 중에 서 item인 애들만
	});
	

</script>
</head>
<body>

	<div>
		<h1 class="item">Hello World</h1>
		<h1 class="item select">hello World2</h1>
		<h1><p class="item">Hello World3</p></h1>
	</div>


</body>
</html>