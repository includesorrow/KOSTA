<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html> 
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%-- �������� �Ⱥ��̴� jsp�ּ�
	  addMember��� �������� �Ķ���Ͱ����� �����ϴ� ����
	  ������ : addMember��� ���� �޾Ƽ� ó���ϴ� ����--%>
	
<form action="addMember" method="post">
	<table  style="margin:auto; width: 80%; ">
              			<tr>
              			
              				<th style="color:red; height: 40px">���̵�</th>
              				<td>
              				<input type="text" name="id" id="id" 
              					style="height: 30px; font-size: 13px"
              				>
              				</td>
              			</tr>
              			<tr>
              				<th>��й�ȣ</th>
              				<td><input type="password" name="pwd" id="pwd"></td>
              			</tr>
              			<tr>
              				<th>�̸�</th>
              				<td><input type="name" name="name" id="name"></td>
              			</tr>
              			<tr><td></td>
	              			<td>
	              				<input type="submit" value="����" >
	              			</td>
              			</tr>
              		</table>

</form>
</body>
</html>