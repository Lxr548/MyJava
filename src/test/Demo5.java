package test;

public class Demo5 {
	public static void main(String[] args) {
		int g=369;
		int l=451;
		System.out.println("您的高考总分:"+g);
    	System.out.println("第一批本科录取分数线:"+l);
        String result=g<l?"未通过一本录取分数线":"通过一本录取分数线";
        System.out.println("高考结果："+result);
     }
}