package test;

import java.util.Scanner;

public class Demo11 {

	public static void main(String[] args) {
		System.out.println("������10��������ÿ��������Ӣ�Ķ��ţ�,��������");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] nums = str.split(",");
		int[] a = new int[10];//������10��Ԫ�ص�һά����a
		for(int i=0;i<10;i++) {
			a[i]=Integer.parseInt(nums[i]);
		}
		in.close();
        int temp;                            //���ڽ�������ʱ����
		System.out.print("�������10�������ǣ�");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+",");
        for(int i=0;i<5;i++)
         {
            temp=a[i];
            a[i]=a[9-i];
            a[9-i]=temp;
         }
        System.out.print("\n�������10�������ǣ�");
        for(int i=0;i<10;i++)
            System.out.print(a[i]+",");
	}

}