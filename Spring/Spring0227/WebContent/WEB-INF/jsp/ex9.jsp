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
		/*
		filter() : 문서 객체를 탐색 및 필터링을 한다.
		- $(selector).filter(selector);
		- $(selector).filter(function(index){ });
		
		*/
		//1. 예전에 했던 홀수요소만 찾아서 문서객체의 색상을 변경해 보자
		//$('tr:odd').css({backgroundColor:'orange',color:"red"});
		//2. filter()메서드의 인자값에 even을 사용할 수 있다.
		//$('tr').filter(':even').css({backgroundColor : 'yellow', color:'blue'});
		//3. 3의 배수값을 리턴받아서 문서객체로 선택한다.
		$('tr').filter(function(index){return index%3==0}).css({backgroundColor:'yellow',color:'blue'});
		$('tr').filter(function(index){return index%3==1}).css({backgroundColor:'red',color:'gray'});
		$('tr').filter(function(index){return index%3==2}).css({backgroundColor:'blue',color:'yellow'});
		
	});
	
	



</script>
</head>

<body>
<div id="wrap">
	<table><%for (int i=0; i<10; i++){%>
		<tr>
			<td>Value : <%=i%></td>
		</tr>
		<% 
	}
	%>
	</table>
	

</div>

</body>
</html>