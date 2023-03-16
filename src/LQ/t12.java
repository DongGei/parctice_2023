package LQ;

import java.math.BigInteger;


//相乘（2021填空）
public class t12 {
	 public static void main(String[] args) {
	        
	        for (int i = 0; i <  1000000007; i++) {
	        	BigInteger a=new BigInteger(String.valueOf(i));
	        	a=a.multiply(new BigInteger("2021"));
	        	a=a.remainder(new BigInteger("1000000007"));
	        	if (a.equals(new BigInteger("999999999"))){
					System.out.println(i);
					return;
				}
			}
	        System.out.println(0);
	    }
}
