package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Demo9 {

	public static void main(String[] args) {
		 LocalDate localDate = LocalDate.now();    
		 LocalTime localTime = LocalTime.now(); 
		 LocalDateTime localDateTime = LocalDateTime.now();
		 DateTimeFormatter datefmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 DateTimeFormatter timefmt = DateTimeFormatter.ofPattern("HH:mm:ss");
		 DateTimeFormatter datetimefmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	     System.out.println("localDate -----"+datefmt.format(localDate));
	     System.out.println("localTime -----"+timefmt.format(localTime));
	     System.out.println("localDateTime -----"+datetimefmt.format(localDateTime));

	}

}
