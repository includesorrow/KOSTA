package airline;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class DepartureDelayCounterMapper 

	extends Mapper<LongWritable, Text, Text, IntWritable>{
		//MAP ��°�
		private static final IntWritable outputVal = new IntWritable(1);
		// Ű
		private Text outputKey = new Text();
		@Override
		protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, Text, IntWritable>.Context context)
				throws IOException, InterruptedException {
				AirlinePerformanceParser parser = new AirlinePerformanceParser(value);
				//��� Ű ����
				//�⵵�� ���� �ϳ��� ��� ����  
				StringBuffer sb = new StringBuffer();
				sb.append(parser.getYear()).append(",");
				sb.append(parser.getMonth());
				outputKey.set(sb.toString());
				//��������ð��� 0���� ���� �� Ű�� ���� ���� 
				if(parser.getDepartureDelayTime() >0) {
					context.write(outputKey, outputVal);
				}
		}
		
	}
	


