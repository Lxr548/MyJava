package test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String str=in.nextLine();
		in.close();
		boolean result=isPalindrome(str);
		if(result)
			System.out.println(str+"���ַ�����һ����������");
		else
			System.out.println(str+"���ַ�������һ����������");
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