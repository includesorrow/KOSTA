package airline;

import org.apache.hadoop.io.Text;

//��� ���� �����͸� �м� �ϱ� ���� Ŭ������ ����
//11�� ��� ~ 30�� ������ ���� �����͵��� (HDFS) 2007~2008.csv ���Ͽ���
//��� !
//�����ͺ��̽����� 
//�⵵, ����, depdelay �Ǽ��� ī��Ʈ 
public class AirlinePerformanceParser {
   private int year;
   private int month;
   
   private int arriveDelayTime;
   private int departureDelayTime;
   private int distance;
   
   private boolean distanceAvailable = true;
   private boolean arriveAvailable = true;
   private boolean departureDelayAvailable = true;
   
   private String uniqueCarrier;
   
   
   
   public AirlinePerformanceParser(Text text) {
	   try
	   {
		   // "," �� �и��ؾ���. 
		   String[] colums = text.toString().split(",");
		   //���� �������� ����� ����
		   year = Integer.parseInt(colums[0]);
		   month = Integer.parseInt(colums[1]);
		   uniqueCarrier = colums[8];
		   
		   //colums[14], colums[15] �����ð��ȿ� 0�� ������ �Ǿ�� �ϴµ� NA
		   // NA(����ġ) ���� �����ϰ� �ִ�..
		   //����ġ�� �����ؾ� �Ѵ�.
		   if(!colums[15].equals("NA")) 
		   { 
			   departureDelayTime = Integer.parseInt(colums[15]);   
		   }
		   else
		   {
			   departureDelayAvailable = false;
		   }
		   if(!colums[14].equals("NA")) 
		   {
			   arriveDelayTime = Integer.parseInt(colums[14]);
			   
		   }
		   else
		   {
			   arriveAvailable = false;
		   }
		   
		   //���װŸ� NAó��
		   if (!colums[18].equals("NA"))
		   {
			   distance = Integer.parseInt(colums[18]);
		   }
		   else {
		   distanceAvailable = false;
		   }
	   }
	   catch (Exception e)
	   {
		   
	   }
	   
   }



public int getYear() {
	return year;
}



public int getMonth() {
	return month;
}



public int getArriveDelayTime() {
	return arriveDelayTime;
}



public int getDepartureDelayTime() {
	return departureDelayTime;
}



public int getDistance() {
	return distance;
}



public boolean isDistanceAvailable() {
	return distanceAvailable;
}



public boolean isArriveAvailable() {
	return arriveAvailable;
}



public boolean isDepartureDelayAvailable() {
	return departureDelayAvailable;
}



public String getUniqueCarrier() {
	return uniqueCarrier;
}
   
   
}