<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>chartDemo</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script>
	$(function(){
		//Ajax�� ����ؼ� json �����͸� �񵿱������ �޾ƿ���
		var processed_json= [];
		
		$.getJSON('members/data.json',function(data){
			//Populate series ������ Ÿ������ �����͸� �����ϱ� ���� processed_json �迭�� ������ ��
			//Ajax�� ���۵Ǿ�� �����͸� �о� ���鼭 processed_json���� �����Ѵ�.
			console.log("����1");
			console.log(data);
			//��Ʈ view ��Ҹ� ������
			$('#container').highcharts({
				chart:{
					type:"column"
				},
				title:{
					text:"�л�������"
				},
				subtitle:{
					text:"����� ����Ÿ��Ʋ"
				},
				xAxis:{
					type:'category',
					title:{
						text:"x��"
					}
				},
				yAxis:{
					title:{
						text:"Scores"
					}
				}
			});
		});	
	});
	

</script>
</head>
<body>
<div style="width:800px; margin:auto; border:1px solid red;"></div>
	��Ʈ ����
<div id="container" style="height:400px"></div>
</body>
</html>