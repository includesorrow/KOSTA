<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<%--
jQuery �Լ� ���� ������
��� : constains(���ڿ�) : Ư�� ���ڿ��� �������ϴ� ���� ��ü�� ����
��� : eq(n) : n��° ��ġ�ϴ� ���� ��ü�� ����
��� : gt(n) : n��° �ʰ� ��ġ�ϴ� ���� ��ü�� ����
��� : has(h1) : h1�±׸� ������ �ִ� ���� ��ü�� ����. 
��� : lt(n) : n��° �̸��� ��ġ�ϴ� ���� ��ü�� ����
��� : not(������) : �����ڿ� ��ġ���� �ʴ� ���� ��ü�� ����
��� : nth-child(3n+1) : 3n+1��°�� ��ġ�ϴ� ���� ��ü�� �����Ѵ�. (1,4,7,...)

--%>

<script>
	$(document).ready(function(){
		console.log($('div>div').children().text());
		console.log("id�� test1�� ���� ��� : " + $('#test1').next.text());
		console.log("id�� target�� �θ��� h1�� ���� ��� :" +
			$.trim($('#target').parent().prev().text())
		);
		
		
		//$('div p:contains("Test")').css("background","pink");
		//�������� div�ȿ� �ִ� ��� ��ҿ��� test���ڿ��� ������ ��
		
		//$('div p:gt(0)').css('background','red');
		
		//$('div:has("h1")').css({'background':'yellow','border':'1px solid red'});
		//$('p:nth-child(2n+1)').css('background','green');
		
		//$('.test').children('h1').css('color','blue');
		console.log($('test2'));
		
		//  preview   [ ]    next
		
	});
</script>

<body>
	<div>
		<p>Test 1</p>
		<p id="test1">�̰��� Test�Դϴ�.</p>
		<p id="test2">������ �����!</p>
		<p>������ �ݿ���!</p>
		<p>������ �ݿ���!</p>
		<p>������ �ݿ���!</p>
		<p>������ �ݿ���!</p>
		<p>������ �ݿ���!</p>
		<h1>jQuery Test�Դϴ�.</h1>
	<div class="test">
		<h1 id='target'>jQueryTest2�Դϴ�.</h1>
	</div>
	</div>
	
	

</body>
</html>