<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>upform.jsp</title>
<style>
#wrap {	width: 350px;	margin: auto}
</style>
</head>
<body>
	<div id="wrap">
		<fieldset>
			<legend>���� ���ε� ����</legend>
			<form action="upload" method="post" enctype="multipart/form-data">
				<p>
					�̹��� ���� : <input name="mfile" id="mfile" type="file">
				</p>
				<p>
					<input type="submit" value="send">
				</p>
			</form>
		</fieldset>
	</div>
</body>
</html>