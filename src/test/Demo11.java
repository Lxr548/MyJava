package test;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		System.out.println("请输入10个整数，每个整数用英文逗号（,）隔开。");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] nums = str.split(",");
		int[] a = new int[10];//构造有10个元素的一维数组a
		for(int i=0;i<10;i++) {
			a[i]=Integer.parseInt(nums[i]);
		}
		in.close();
        int temp;                            //用于交换的临时变量
		System.out.print("您输入的10个整数是：");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+",");
        for(int i=0;i<5;i++)
         {
            temp=a[i];
            a[i]=a[9-i];
            a[9-i]=temp;
         }
        System.out.print("\n交换后的10个整数是：");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+",");
	}

}