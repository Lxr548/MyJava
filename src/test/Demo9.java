package test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class Demo9 {

	public static void main(String[] args) {
		 LocalDate localDate = LocalDate.now();    
		 LocalTime localTime = LocalTime.now(); 
		 LocalDateTime localDateTime = LocalDateTime.now();
	     System.out.println("localDate -----"+localDate);
	     System.out.println("localTime -----"+localTime);
	     System.out.println("localDateTime -----"+localDateTime);

	}

}
