<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>회원가입</title>

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
					<input type="button" value="중복확인" onclick="checkMemberId()">
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