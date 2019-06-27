package airline;

import org.apache.hadoop.io.Text;

//출발 지연 데이터를 분석 하기 위한 클래스를 정의
//11시 출발 ~ 30분 정도가 지난 데이터들을 (HDFS) 2007~2008.csv 파일에서
//출력 !
//데이터베이스에서 
//년도, 월별, depdelay 건수를 카운트 
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
		   // "," 로 분리해야함. 
		   String[] colums = text.toString().split(",");
		   //운항 연도값을 멤버에 저장
		   year = Integer.parseInt(colums[0]);
		   month = Integer.parseInt(colums[1]);
		   uniqueCarrier = colums[8];
		   
		   //colums[14], colums[15] 지연시간안에 0이 기준이 되어야 하는데 NA
		   // NA(결측치) 값을 포함하고 있다..
		   //결측치를 제거해야 한다.
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
		   
		   //운항거리 NA처리
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