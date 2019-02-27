<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
</head>
<style>
	.h{background:orange;}
	.t{background:pink;}
</style>
<script>

var array=[
	{name:'김길동',addr:'서울 신촌'},
	{name:'김승아',addr:'서울 신촌'},
	{name:'이지현',addr:'서울 구로'}
	
	
];
$(function(){
	console.log(array[0].name);
	var addMember = {
			name : "박정아",addr : "서울가산"
			
	};
	array.push(addMember);
	$.each(array,function(idx,item){
		//var print='';
		//print +="<h1 ["+item.addr+"]+"   "+item.name+"</h1>";
		//document.getElementById("res").innerHTML += print;
		$('#res').append("<h1> ["+item.addr+"]"+" "+item.name+"</h1>");
		$('#res h1').addClass("h");
	});
	
	//2. $(selector).each(function(index,item){});
	$('p').each(function(index,item){
		$(item).addClass('t');
		$(this).append(":"+array[index].name);
	});
});





</script>

<body>

	<div id="res"></div>
	<h1>hello world</h1>
	<p>test1</p>
	<p>test2</p>
	<p>test3</p>
	
</body>
</html>