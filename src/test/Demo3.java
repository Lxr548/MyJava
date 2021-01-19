package test;

public class Demo3 {
	public static void main(String[] args) {
		int[] a=new int[15];
		int j=0;
		int t;
        for(int i=0;i<30;i++) {
        	if(i%2==1) {
        		a[j]=i;
        		j++;
        				}
        	}   		
    		for(int i = 0; i < a.length/ 2; i ++) {
    		    t = a[i];
    		    a[i] = a[a.length - 1 - i];
    		    a[a.length - 1 - i] = t;
    		}
    		System.out.println("30以内从大到小的前12个奇数为：");
    		for(int i = 0; i < 12; i ++) {
    		    System.out.println(a[i]);
    		}
        }
	}