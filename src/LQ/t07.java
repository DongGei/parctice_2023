package LQ;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @className: t07
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/1/9
 **/
public class t07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger sum = BigInteger.ONE;
        while (n.intValue()>1){
            sum=sum.multiply(n);
            n=n.subtract(BigInteger.ONE);
        }
        System.out.println(sum);
    }
}

