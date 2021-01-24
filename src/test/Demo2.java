package test;

public class Demo2 {

	public static void main(String[] args) {
		Max a = new Max();
		a.max(6,12);
		a.max(6,12,10);
		a.max(9.58,18.65);
		a.max(19.35,28.99,65.99);
	}
}
 
class Max{
	public void max (int a,int b){
//		if( a >= b){
//		System.out.println("max:"+a);
//	}else 
//		System.out.println("max:"+b);
		System.out.println(a+","+b+"的最大值为:"+Math.max(a,b));
	}
	
	public void max (int a,int b,int c){
//		if( a >= b){
//    		if( a >= c){
//			System.out.println("max:"+a);
//		}else 
//			System.out.println("max:"+c);
//	}else 
//		System.out.println("max:"+b);

		System.out.println(a+","+b+","+c+"的最大值为:"+Math.max(Math.max(a,b),c));
	}
	
	public void max (double a,double b){
		System.out.println(a+","+b+"的最大值为:"+Math.max(a,b));
	}
	
	public void max(double a,double b,double c){
		System.out.println(a+","+b+","+c+"的最大值为:"+Math.max(Math.max(a,b),c));
	}

}