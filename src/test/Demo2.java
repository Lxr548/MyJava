package test;

public class Demo2 {

	public static void main(String[] args) {
        		Add s1 = new Add();
        		s1.Add(6,12);
        		s1.Add(6,12,10);
        		s1.Add(9.58,18.65);
        		s1.Add(19.35,28.99,65.99);
        	}
        }
         
	class Add{
			public void Add (int a,int b){
//        		if( a >= b){
//    			System.out.println("max:"+a);
//    		}else 
//    			System.out.println("max:"+b);
        		System.out.println(a+","+b+"的最大值为:"+Math.max(a,b));
        	}
        	
        	public void Add (int a,int b,int c){
//        		if( a >= b){
//  	      		if( a >= c){
//   	 			System.out.println("max:"+a);
//  	  		}else 
//    				System.out.println("max:"+c);
//    		}else 
//    			System.out.println("max:"+b);

        		System.out.println(a+","+b+","+c+"的最大值为:"+Math.max(Math.max(a,b),c));
        	}
        	
        	public void Add (double a,double b){
        		System.out.println(a+","+b+"的最大值为:"+Math.max(a,b));
        	}
        	
        	public void Add(double a,double b,double c){
        		System.out.println(a+","+b+","+c+"的最大值为:"+Math.max(Math.max(a,b),c));
        	}

}