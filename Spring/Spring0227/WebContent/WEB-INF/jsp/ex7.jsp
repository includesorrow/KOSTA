<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<style>
table {width:200px;}
</style>
<script>
var flag = false;
	$(document).ready(function(){
		//$('tr:first').css("background","olive");
		
	setInterval(function(){
		if(flag){
		$('tr:odd').css("background","pink");
		$('tr:even').css("background","yellow");
		flag = false;
	}
		else{
			$('tr:odd').css("background","yellow");
			$('tr:even').css("background","pink");
		flag = true;
		}
		console.log("1");
	},1000);
	
		
	});
</script>


</head>
<body>

	<table>
		<c:forEach var="i" begin="0" end="9" step="1">
		<tr>
			<td>${i }</td>
		</tr>
		</c:forEach>
		
	</table>


</body>
</html>