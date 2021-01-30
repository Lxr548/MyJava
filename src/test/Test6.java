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
		System.out.print("请输入一个IP地址:");
		String key=in.next();
		in.close();
		String str;
		while ((str = br.readLine()) != null) {
			list.add(str);
		}
		if(list.indexOf(key)!=-1) {
			System.out.println("该IP地址可以访问网络");
		}else{
			System.out.println("该IP地址不允许访问网络");
		}
		br.close();
	}
}