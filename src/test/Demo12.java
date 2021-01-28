package test;

import java.util.Scanner;

public class Demo12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (count < 0) {
                break;
            }
            String temp = str.substring(i, i + 1);
            if (temp.equals("(")) {
                count++;
            }
            if (temp.equals(")")) {
                count--;
            }
        }
        if (count == 0) {
            System.out.println("您输入的内容，括号完全配对");
        } else {
            System.out.println("您输入的内容，括号不配对");
        }
	}

}