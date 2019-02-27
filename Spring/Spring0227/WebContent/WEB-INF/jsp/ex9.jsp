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
		filter() : ���� ��ü�� Ž�� �� ���͸��� �Ѵ�.
		- $(selector).filter(selector);
		- $(selector).filter(function(index){ });
		
		*/
		//1. ������ �ߴ� Ȧ����Ҹ� ã�Ƽ� ������ü�� ������ ������ ����
		//$('tr:odd').css({backgroundColor:'orange',color:"red"});
		//2. filter()�޼����� ���ڰ��� even�� ����� �� �ִ�.
		//$('tr').filter(':even').css({backgroundColor : 'yellow', color:'blue'});
		//3. 3�� ������� ���Ϲ޾Ƽ� ������ü�� �����Ѵ�.
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