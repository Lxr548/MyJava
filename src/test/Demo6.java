package test;
import java.math.BigInteger;

public class Demo6 {

	public static void main(String[] args) {
		String str1 = "7100000000";//�����˿�
		String str2 = "1400000000";//�й��˿�
		BigInteger Num1 = new BigInteger(str1);
		BigInteger Num2 = new BigInteger(str2);
		System.out.println("2019�������˿�����Լ��"+Num1);
		System.out.println("2019���й��˿�����Լ��"+Num2);
	}
}
