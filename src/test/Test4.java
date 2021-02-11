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
    	File[] files = file.listFiles();
    	if (file.exists()) {
    		for (int i=0; i< files.length; i++) {
    			if(files[i].isDirectory()) {
    				continue;
    			}
    			System.out.println(files[i].getName());
    		}
    	}
    	else {
    		System.out.println( "目录不存在或它不是一个目录");            
    	}
	}
}