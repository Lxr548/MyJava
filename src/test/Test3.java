package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test3 {

	public static void  main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("admin","admin@123");
		map.put("guess","123456");
		map.put("my","my_666");
		map.put("123","666");
		System.out.print("请输入账号：");
		Scanner admin=new Scanner(System.in);
		String admins=admin.nextLine();
		System.out.print("请输入密码：");
		Scanner pw=new Scanner(System.in);
		String pws=admin.nextLine();
		admin.close();
		pw.close();
		Iterator<String> keys = map.keySet().iterator();
		int i = 0;
        while (keys.hasNext()) {
        	String key = keys.next();
        	i++;
        	if(admins.equals(key)&&pws.equals(map.get(key))){
        		System.out.println("登陆成功！");
        		i--;
        		break;
        	}
        }
		if(i == map.size()){
			System.out.println("您输入的账号或密码不正确");
		}
	}
}
