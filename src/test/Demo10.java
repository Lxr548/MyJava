package test;

import java.util.Scanner;

public class Demo10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String[] nums = str.split(",");
		int a=Integer.parseInt(nums[0]);
		int b=Integer.parseInt(nums[1]);
		in.close();
		try {
			int i=a/b;
			System.out.print(i);
		}catch (ArithmeticException e){
			System.out.print(e.toString());
		}
	}
}
