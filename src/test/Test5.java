package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
 
public class Test5 {
	
	public static void main(String[] args) {
		String line = null;
		int totalCount = 0;
		File file = new File("E:/demo.txt");
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			StringBuffer sb = new StringBuffer();  
			while((line = reader.readLine()) != null) {  
				sb.append(line);  
			}  
			String str = sb.toString().toLowerCase();
			String[] elements = str.split("[,.\\s]");
			reader.close();
			Scanner in=new Scanner(System.in);
			System.out.print("请输入一个想要查找的单词:");
			String key=in.next();
			in.close();
			for (int i = 0; i < elements.length; i++) {
				if(elements[i].equals(key)) {
					totalCount++;
				}
			}
			System.out.println( key + "在文件中出现了" + totalCount + "次");
		}catch(FileNotFoundException e) {
			System.out.println("找不到指定的文件！");
		}catch(IOException e) {
			System.out.println("读取文件内容出错！");
		}
	}
}