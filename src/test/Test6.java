package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Test6 {

	
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		File f = new File("E:/white_list.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		Scanner in=new Scanner(System.in);
		System.out.print("������һ��IP��ַ:");
		String key=in.next();
		in.close();
		String str;
		while ((str = br.readLine()) != null) {
			list.add(str);
		}
		if(list.indexOf(key)!=-1) {
			System.out.println("��IP��ַ���Է�������");
		}else{
			System.out.println("��IP��ַ�������������");
		}
		br.close();
	}
}