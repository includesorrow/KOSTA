<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<style>
#wrap{width:450px; margin:auto;}
</style>
</head>
<body>
<div id="wrap">
	<h1>test1</h1>
</div>

</body>
<script>
$(function(){
    $('#wrap').css('backgroundColor','red');
    $('#wrap').css('text-align','center');
    $('#wrap h1').css('color','white');
    // 5초 후에 다음 스타일을 적용 시켜보자.
    setTimeout(function(){
    	//익명으로 호출되는건 동일함. 5000 = 딱 5초 이후에 한번만 수행됨.
        $('#wrap').css('backgroundColor','pink');
        $('#wrap h1').css('color','yellow');
    },5000);
});
</script>
</html>