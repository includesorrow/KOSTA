<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>greeting.jsp</title>
</head>
<body>
	<p style="color:green; font-size:20px">${msg }</p>
	<div>
		<form method="post" action="Login.kosta">
		<input type="hidden" name="cmd" value="Login">
			아이디 : <input type="text" name="id"> <br>
			비밀번호 : <input type="password" name="pwd"><br>
			<input type="submit" value="send">	
		</form>
	</div>

</body>
</html>