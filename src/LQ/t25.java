package LQ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @className: t25
 * @description: 外卖店优先级 2019 题目07 80%
 * @author: Dong
 * @date: 2022/3/24
 **/
public class t25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //n个店
        int m = sc.nextInt();   //m条消息
        int t = sc.nextInt();   //t时刻
        boolean[] youXianJi = new boolean[n + 1]; //一一对应
        int[][] tsNs = new int[t + 1][n + 1];

        for (int i = 0; i < m; i++) {
            tsNs[sc.nextInt()][sc.nextInt()]++;
        }
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= n; j++) {

                if (tsNs[i][j] == 0) {
                    if (tsNs[i - 1][j] != 0) {
                        tsNs[i][j] = tsNs[i - 1][j] - 1;

                    }
                    if (tsNs[i][j] <= 3) {
                        youXianJi[j] = false;
                    }
                }else {
                    tsNs[i][j] = tsNs[i - 1][j] + tsNs[i][j] * 2;
                    if (tsNs[i][j] > 5) {
                        youXianJi[j] = true;
                    }
                }


//                if (tsNs[i][j] != 0) {
//
//                }


            }
        }
        int c = 0;
        for (boolean b : youXianJi) {
            if (b) {
                c++;
            }
        }
        //2 6 6 1 1 5 2 3 1 6 2 2 1 6 2
        System.out.println(c);
    }
}

