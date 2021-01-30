package test;


import java.io.File;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("请输入一个目录的地址:");
    	String filePath = in.nextLine();
    	in.close();
    	File file = new File(filePath);
    	if (file.exists()) {
    		File[] files = file.listFiles();
    		for (int i=0; i< files.length; i++) {
    			System.out.println(files[i].getName());
    		}
    	}
    	else {
    		System.out.println( "目录不存在或它不是一个目录");            
    	}
	}
}
