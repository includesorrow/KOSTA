<%@page import="Controller.ActionFactory"%>
<%@page import="Controller.Controller"%>
<%@page import="vo.MemberVO"%>
<%@page import="vo.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    
<%
%>
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>memberForm.jsp</title>
<style type="text/css">
#content {
	margin: auto;
	width: 450px;
}
#content fieldset {
	width: 100%;
}
input{
	background-color: #f0fccb;
}
</style>

<script>
//�ڹٽ�ũ��Ʈ �Լ�
function checkMemberId(){
	//form �ȿ� input �±� �Ӽ��߿� id�Ӽ� => jQuery�� ���� ��ü�� �����ϴ�.
	let idv = document.getElementById("id");
		alert("�ߺ�Ȯ�� ��ư!" + idv.value);
}
</script>
</head>
<body>
<div id="content">
		<form method="post" action="test.kosta" id="memberForm">
		<input type="hidden" name="cmd"  value="memIn">
			<fieldset>
				<legend>Member Join</legend>
				<p>
					<label>ID : </label> 
					<input name="id" id="id">
					<input type="button" value="�ߺ�Ȯ��" onclick="checkMemberId()">
				</p>
				<p>
					<label>PWD : </label> <input type="password" name="pwd" id="pwd">
				</p>
				<p>
					<label>Name : </label> <input name="name" id="name">
				</p>
				<p>
					<label>email : </label> <input name="email" id="email">
				</p>
				<p>
					<label>tel : </label> <input name="tel" id="tel">
				</p>
				<p>
					<input type="submit">
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>