<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>

#wrap{width:450px; margin:auto;}
</style>
</head>
<body>
<div id="wrap">
	<table style="width:100%"> 
		<tbody> 
			<tr> 
				<td class="item"> test내용입니다.</td>
			</tr>
			<tr>
				<td class="item select"> test내용입니다.</td>
			</tr>
			<tr>
				<td class="item"> test내용입니다.</td>
			</tr>
			<tr>
				<td class="item select"> test내용입니다.</td>
			</tr>
			<tr>
				<td class="item"> test내용입니다.</td>
			</tr>
		</tbody>
	</table>
</div>



</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(function(){

$('.item').css('background','yellow');
$('.item.select').css('background','orange');
    setTimeout(test,500);
    // 5초 후에 다음 스타일을 적용 시켜보자.

});

function test(){
	$('.item').css('backgroundColor','red');
	$('.item.select').css('backgroundColor','blue');
	setTimeout(test2,500);
}

function test2(){
	$('.item').css('backgroundColor','blue');
	$('.item.select').css('backgroundColor','red');
	setTimeout(test,500);
}

</script>


</html>