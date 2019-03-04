<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>연습문제</title>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script>
	$(function() {
		var process_json1 = [];
		var process_json2 = [];
		console.log(data);
		$.each(data,function(item,index){
			console.log(item+":"+index.name+":"+index.list);
			$.each(index.list,function(ite,idx){
				if(index.name==="kim"){
					process_json1.push(idx);
				}else{
					process_json2.push(idx);
				}
			});
		});
		
		console.log("--------------")
		console.log(process_json1)
		console.log(process_json2)
		$('#container').hightcharts({
			chart : {
				type : 'column'
			},
			title : {
				text : "과일 소비량"
			},
			xAxis : {
				categories : [ 'Apples', 'Bananas', 'Oranges' ]
			},
			yAxis : {
				title : {
					text : "과일 소비"
				}
			},
			series : [ {
				name : 'Jane',
				data : [ 1, 0, 7 ]
			}, {
				name : 'kim',
				data : [ 5, 7, 2 ]
			}, {
				name : 'lee',
				data : [ 3, 3, 3 ]
			} ]
		});
	});
</script>
</head>
<body>
	<div id="container" style="width: 100%; height: 400%;"></div>
</body>
</html>