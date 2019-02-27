<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
	//속성선택자
	$('input[type=text]:first').val('XmanData').attr('name',"gId");
	$('input[type=text]:eq(1)').attr('name','age');
	$('input[type=text]:eq(2)').val('Bigdata').attr('name','gname');
	$('input[type=text]:eq(3)').attr('name','addr');		
	$('input[type=text]:last').val('아이디를 입력').attr('name','id');
	$('input[type=password]').val('My JQuery! password').attr('name','pwd');
	
	});
	
</script>
</head>
<body>

<div>
	<form method="post" action="ex6_data">
	<fieldset>
	
	<legend>동적 폼 속성 추가 예제</legend>
		<p><label>gId</label> <input type="text" /></p>
		<p><label>age</label> <input type="text"/></p>
		<p><label>gname</label> <input type="text"/></p>
		<p><label>addr</label> <input type="text"/></p>
		<p><label>id</label> <input type="text"/></p>
		<p><label>pwd</label> <input type="password"/></p>
		<p><input type="submit" value="send"></p>
	</fieldset>
	</form>
	
	</div>
</body>
</html>