package test;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		System.out.println("������һ������:");
		Scanner in=new Scanner(System.in);
        	int x=in.nextInt();
        	in.close();
        	int y=2*(x+(x*10+x)+(x*100+x*10+x)+(x*1000+x*100+x*10+x))+(x*10000+x*1000+x*100+x*10+x);
        	System.out.println(x+"+"+x+x+"+"+x+x+x+"+"+x+x+x+x+"+"+x+x+x+x+x+"+"+x+x+x+x+"+"+x+x+x+"+"+x+x+"+"+x+"="+y);
	}
}