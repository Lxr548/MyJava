package test;
import java.math.BigInteger;

public class Demo6 {

	public static void main(String[] args) {
		String str1 = "7100000000";//世界人口
		String str2 = "1400000000";//中国人口
		BigInteger Num1 = new BigInteger(str1);
		BigInteger Num2 = new BigInteger(str2);
		System.out.println("2019年世界人口总数约："+Num1);
		System.out.println("2019年中国人口总数约："+Num2);
	}
}
