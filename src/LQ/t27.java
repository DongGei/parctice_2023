package LQ;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @className: t27
 * @description: 2019 题目09
 * @author: Dong
 * @date: 2022/3/25
 **/
public class t27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long sum = 0;
        if (m == 0) {
            for (int j = 0; j < m + n + 1; j++) {
                sum += sc.nextLong();
            }
        } else {
            long[] longs = new long[m + 1 + n];
            for (int j = 0; j < m + n + 1; j++) {
                longs[j] = sc.nextLong();
            }
            Arrays.sort(longs);
            sum = longs[m + n] - longs[0];
            for (int j = 1; j < m + n; j++) {
                sum+= Math.abs(longs[j]);
            }
        }
        System.out.println(sum);
    }
}
