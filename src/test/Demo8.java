package test;

import java.util.Calendar;
import java.text.SimpleDateFormat;
public class Demo8 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, 12-1);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.HOUR_OF_DAY, 10);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND,00);
//		System.out.println(cal.getTime());
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(fmt.format(cal.getTime()));
	}

}