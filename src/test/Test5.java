package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Test5 {
	
	public static void main(String[] args)throws IOException {
		File file = new File("E:/demo.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		StringBuffer sb = new StringBuffer();  
		while((line = reader.readLine()) != null) {  
			sb.append(line);  
		}  
		String str = sb.toString().toLowerCase();
		String[] elements = str.split("[,.\\s]");
		reader.close();
		Scanner in=new Scanner(System.in);
		System.out.print("������һ����Ҫ���ҵĵ���:");
		String key=in.next();
		in.close();
		int totalCount = 0;
		for (int i = 0; i < elements.length; i++) {
			if(elements[i].equals(key)) {
				totalCount++;
			}
		}
		System.out.println( key + "���ļ��г�����" + totalCount + "��");
	}
}