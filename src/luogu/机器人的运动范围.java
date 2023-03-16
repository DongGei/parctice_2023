package luogu;

/**
 * @className: 机器人的运动范围
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/24
 **/
public class 机器人的运动范围 {
    public int movingCount(int threshold, int rows, int cols) {
        int flag[][] = new int[rows][cols]; //记录是否已经走过
        return helper(0, 0, rows, cols, flag, threshold);
    }
    private int helper(int i, int j, int rows, int cols, int[][] flag, int threshold) {
        // 首先保证索引不能越界    该位置没重复走过    并且数位之和没有超过阀值
        if (i < 0 || i >= rows || j < 0 || j >= cols || getSum(i,j)  > threshold || flag[i][j] == 1)
            return 0;
        flag[i][j] = 1;
        return helper(i - 1, j, rows, cols, flag, threshold)
                + helper(i + 1, j, rows, cols, flag, threshold)
                + helper(i, j - 1, rows, cols, flag, threshold)
                + helper(i, j + 1, rows, cols, flag, threshold)
                + 1;
    }
    private int getSum(int row,int col){
        int sum=0;
        while (row!=0){
            sum+=row%10;
            row/=10;
        }
        while (col!=0){
            sum+=col%10;
            col/=10;
        }
        return sum;
    }
}
