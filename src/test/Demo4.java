package test;

public class Demo4 {
	public static void main(String[] args) {
		int sum=0;
        for(int i=0;i<=1000;i++) {
        	if(i%2==0) {
        		if(i==40||i==48) {
        			continue;
        		}
        		sum=sum+i;
        		if(sum>=25000) {
        			break;
        		}
        	}
        } 
    	System.out.print("0��1000֮��(40,48���������ڵ���25000����)ż���ĺ�Ϊ��"+sum);
    }
}