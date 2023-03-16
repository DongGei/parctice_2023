package LQ;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @className: t18
 * @description: 八次求和 2020题目07
 * @author: Dong
 * @date: 2022/3/19
 **/
public class t18 {
    public static void main(String[] args) {
        long l1 = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

            int n = 1000000;
            sc.close();
            BigInteger sum = new BigInteger("0");
            for (int i = 1; i <= n; i++) {
                BigInteger a = new BigInteger(String.valueOf(i));
                BigInteger pow = a.pow(8);
                sum = sum.add(pow);
            }
            System.out.println(sum.mod(new BigInteger("123456789")));

        long l2 = System.currentTimeMillis();
        System.out.println((l2 - l1)/ 100 /1000);
        System.out.println(l2 - l1/1000);
    }

}
