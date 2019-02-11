<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- 웹에서는 안보이는 jsp주석
	  addMember라는 서블릿으로 파라미터값들을 전송하는 예제
	  서버측 : addMember라는 값을 받아서 처리하는 예제--%>
	
<form action="addMember" method="post">
	<table  style="margin:auto; width: 80%; ">
              			<tr>
              			
              				<th style="color:red; height: 40px">아이디</th>
              				<td>
              				<input type="text" name="id" id="id" 
              					style="height: 30px; font-size: 13px"
              				>
              				</td>
              			</tr>
              			<tr>
              				<th>비밀번호</th>
              				<td><input type="password" name="pwd" id="pwd"></td>
              			</tr>
              			<tr>
              				<th>이름</th>
              				<td><input type="name" name="name" id="name"></td>
              			</tr>
              			<tr><td></td>
	              			<td>
	              				<input type="submit" value="가입" >
	              			</td>
              			</tr>
              		</table>

</form>
</body>
</html>