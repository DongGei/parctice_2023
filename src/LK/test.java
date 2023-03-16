package LK;

import java.util.Arrays;

/**
 * @className: test
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/4/6
 **/
public class test {
    public static void main(String[] args) {
        char[] m = "aaa".toCharArray();
        char[] n = "aaaaaaaa".toCharArray();
        int[][] f=new int[m.length+1][n.length+1];

        for (int i = 1; i <= m.length; i++) {
            for (int j = 1; j <= n.length; j++) {
                System.out.println(f[i][j]);
            }
        }
    }

}
