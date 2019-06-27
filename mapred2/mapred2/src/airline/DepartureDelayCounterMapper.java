package airline;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class DepartureDelayCounterMapper 

	extends Mapper<LongWritable, Text, Text, IntWritable>{
		//MAP 출력값
		private static final IntWritable outputVal = new IntWritable(1);
		// 키
		private Text outputKey = new Text();
		@Override
		protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
				throws IOException, InterruptedException {
				AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
				//출력 키 설정
				//년도와 월을 하나로 묶어서 설정  
				StringBuffer sb = new StringBuffer();
				sb.append(parser.getYear()).append(",");
				sb.append(parser.getMonth());
				outputKey.set(sb.toString());
				//출발지연시간이 0보다 컸을 때 키를 만들어서 저장 
				if(parser.getDepartureDelayTime() >0) {
					context.write(outputKey, outputVal);
				}
		}
		
	}
	


