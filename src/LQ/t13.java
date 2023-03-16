package LQ;

import java.math.BigInteger;

/**
 * @className: t13
 * @description: 货物摆放
 * @author: Dong
 * @date: 2022/3/14
 **/
public class t13 {
    public static void main(String[] args) {
        int count=0;
        BigInteger a = new BigInteger("2021041820210418");
        BigInteger b = new BigInteger("2021041820210418");
        BigInteger c = new BigInteger("2021041820210418");
            while (!a.equals(new BigInteger("0"))){
                while (!b.equals(new BigInteger("0"))){
                    while (!c.equals(new BigInteger("0"))){
                        BigInteger multiply = a.multiply(b).multiply(c);
                        if (multiply.equals("2021041820210418")){
                            count++;
                        }
                        c=c.subtract(new BigInteger("1"));
                    }
                    b=b.subtract(new BigInteger("1"));
                }
                a=a.subtract(new BigInteger("1"));
            }
        System.out.println(count);
    }
}
