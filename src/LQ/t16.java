package LQ;

import java.math.BigInteger;

/**
 * @className: t16
 * @description:  斐波那契数列最大公约数 2020题目05
 * @author: Dong
 * @date: 2022/3/19
 **/
public class t16 {
    public static void main(String[] args) {
        BigInteger[] bigIntegers = new BigInteger[2020 + 1];
        bigIntegers[1] = new BigInteger("1");
        bigIntegers[2] = new BigInteger("1");
        for (int i = 3; i <= 2020; i++) {
            bigIntegers[i]=bigIntegers[i-1].add(bigIntegers[i-2]);
        }
        BigInteger f2020 = bigIntegers[2020];
        BigInteger f520 = bigIntegers[520];
        BigInteger re = get(f520, f2020);
        System.out.println(re);
    }
    static BigInteger get(BigInteger a,BigInteger b){
        if (b.compareTo(new BigInteger("0")) == 0){
            return a;
        }
       return get(b,a.mod(b));
    }
}
