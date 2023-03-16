package LK;

/**
 * @className: 顺时针打印矩阵
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/2/20
 **/
public class 顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix== null || matrix.length==0){
            return new int[0];
        }
        int l = 0;                      //左边界
        int r = matrix[0].length - 1;   //右边界
        int t = 0;                      //上边界
        int b = matrix.length - 1;      //下边界

        int row = matrix.length, col = matrix[0].length;
        int[] res = new int[row * col];

        int x = 0;
        while (true) {
            for (int i = l; i <= r; i++) res[x++] = matrix[t][i]; // left to right.
            if (++t > b) break;
            for (int i = t; i <= b; i++) res[x++] = matrix[i][r]; // top to bottom.
            if (l > --r) break;
            for (int i = r; i >= l; i--) res[x++] = matrix[b][i]; // right to left.
            if (t > --b) break;
            for (int i = b; i >= t; i--) res[x++] = matrix[i][l]; // bottom to top.
            if (++l > r) break;
        }
        return res;
    }
}
