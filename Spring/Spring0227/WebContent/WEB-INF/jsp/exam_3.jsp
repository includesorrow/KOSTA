<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
	<style type="text/css">
		div{
			width : 600px; height : 200px;
			
		}
		.textstyle {
			font-size : 14pt; line-height:20pt; margin:10px;
		}
</style>
<script>
var number = 1;
	$(document).ready(function(){
	var first=$('div :first-child');
	setInterval(function(){
		if($.trim(first.text())==="five")
			first.css('background','blue');
		else
			first.css('background','red');
	first=first.next();
	
	},300);
	
	});
</script>

</head>
<body>
<!-- five란 단어라면 배경색은 보라색으로 변경하고 다른 노드들은 순차적으로 증가하면서
배경색을 노랑으로 변경하면서 출력 -->
<div>
<em> one </em>
<a> five </a>
<a> two </a>
<a> three </a>
<b> four </b>

<em> six </em>


</div>


</body>
</html>