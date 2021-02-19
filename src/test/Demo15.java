package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Demo15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入您要查询的日期:");
		String s = in.next();
		in.close();
		String[] f = {"yyyy-MM-dd","yyyy/MM/dd","yyyy年MM月dd日","yyyy.MM.dd"};
		 if(isValidDate(s,f[0])|isValidDate(s,f[1])|isValidDate(s,f[2])|isValidDate(s,f[3]))
			 day(s);
		 else
			 System.out.println("您输入的内容不是一个日期");
	}
	public static boolean isValidDate(String str,String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);	
		try {
			sdf.setLenient(false);
			sdf.parse(str);
		} catch (ParseException e) {
//			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public static void day(String s) {
		String[] time = s.split("\\D");
		int year = Integer.parseInt(time[0]);
		int month = Integer.parseInt(time[1]);
		int day = Integer.parseInt(time[2]);
		int sum=0;
		int[][] a={{31,28,31,30,31,30,31,31,30,31,30,31},{31,29,31,30,31,30,31,31,30,31,30,31}};
		for(int i=0;i<month-1;i++)
		{
			if((year%4==0&&year%100!=0)||year%400==0)
				sum=sum+a[1][i];
			else
				sum=sum+a[0][i];
		}
		sum=sum+day;
		System.out.println(s+"是"+year+"的第"+sum+"天");
	}
}