package LQ;

/**
 * @className: t05
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/1/4
 **/

import java.util.Scanner;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class t05 {
    public static void main(String[] args) {
        int k, k1;
        char[][] chars = new char[30][50];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            String str = scan.nextLine();
            char[] ch = str.toCharArray();
            chars[i] = ch;
        }


        int count = 0;
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 50; j++) {


                for (k = j; k < 50; k++) {
                    if (chars[i][j] < chars[i][k]) {
                        count++;
                    }
                }
                for (k = i; k < 30; k++) {
                    if (chars[i][j] < chars[k][j]) {
                        count++;
                    }

                }
                for (k = i, k1 = j; k < 30 && k1 < 50; k++, k1++) {
                    /**
                     * 右下遍历
                     */
                    if (chars[i][j] < chars[k][k1]) {
                        count++;
                    }
                }
                for (k = i, k1 = j; k >= 0 && k1 < 50; k--, k1++) {
                    /**
                     * 右上遍历
                     */
                    if (chars[i][j] < chars[k][k1]) {
                        count++;
                    }
                }
                for (k = i, k1 = j; k < 30 && k1 >= 0; k++, k1--) {
                    /**
                     * 左下遍历
                     */
                    if (chars[i][j] < chars[k][k1]) {
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
        scan.close();
    }
}
