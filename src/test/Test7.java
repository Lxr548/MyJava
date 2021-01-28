package test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str=in.nextLine();
		in.close();
		boolean result=isPalindrome(str);
		if(result)
			System.out.println(str+"该字符串是一个回文数。");
		else
			System.out.println(str+"该字符串不是一个回文数。");
		}
		
		public static boolean isPalindrome(String str) {
			int low=0;
			int hight=str.length()-1;
			while(low<=hight) {
			if(str.charAt(low)!=str.charAt(hight))
				return false;
			low++;
			hight--;
			}
			return true;
		}
}