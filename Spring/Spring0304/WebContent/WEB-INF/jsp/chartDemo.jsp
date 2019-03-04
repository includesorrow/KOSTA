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
		//Ajax를 사용해서 json 데이터를 비동기식으로 받아오기
		var processed_json= [];
		
		$.getJSON('members/data.json',function(data){
			//Populate series 데이터 타입으로 데이터를 저장하기 위한 processed_json 배열을 생성한 후
			//Ajax로 전송되어온 데이터를 읽어 오면서 processed_json값을 저장한다.
			console.log("점검1");
			console.log(data);
			//차트 view 요소를 선택자
			$('#container').highcharts({
				chart:{
					type:"column"
				},
				title:{
					text:"학생데이터"
				},
				subtitle:{
					text:"여기는 서브타이틀"
				},
				xAxis:{
					type:'category',
					title:{
						text:"x축"
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
	차트 데모
<div id="container" style="height:400px"></div>
</body>
</html>