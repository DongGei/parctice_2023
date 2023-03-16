package LQ;

import java.util.Scanner;

/**
 * @className: 问题描述
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/3/15
 **/
public class 特殊年份  {
    public static void main(String[] args) {
        int c=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int year = sc.nextInt();
            int ge =year%10;
            year= year / 10;
            int shi =year%10;
            year= year / 10;
            int bai =year%10;
            year= year / 10;
            int qiang =year%10;
            year= year / 10;

            if (qiang == shi&&ge-bai==1) {
                c++;
            }
        }
        sc.close();
        System.out.println(c);
    }
}
