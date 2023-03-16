package LK;

/**
 * @className: 最长公共子序列
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/4
 **/
public class 最长公共子序列 {
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            char[] m = text1.toCharArray();
            char[] n = text2.toCharArray();
            int[][] f = new int[m.length + 1][n.length + 1];  //java默认里面全是0

            for (int i = 1; i <= m.length; i++) {
                for (int j = 1; j <= n.length; j++) {
                    if (m[i-1]==n[j-1]){
                        f[i][j]=1+f[i-1][j-1];
                    }else {
                        f[i][j]=Math.max(f[i][j-1],f[i-1][j]);
                    }
                }
            }
            return f[m.length][n.length];
        }
    }
}
