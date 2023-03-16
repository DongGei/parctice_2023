package luogu;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @className: 阶乘之和
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/19
 **/
public class 阶乘之和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger re = new BigInteger("0");
        BigInteger num = new BigInteger("1");
        for (int i =1;i<=n;i++){
            BigInteger bi= new BigInteger(i + "");
            num=num.multiply(bi);
            re = re.add(num);
        }
        System.out.println(re);
    }
}
