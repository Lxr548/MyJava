package test;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cf = in.next();
		in.close();
		String yz="GET";
		if (cf.equals(yz)) {
			System.out.print(randomCode());
		}else {
			System.out.print("÷∏¡Ó¥ÌŒÛ£°");
		}
	}
	public static String randomCode() {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
