package LK;

/**
 * @className: 二维数组中的查找
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/18
 **/
public class 二维数组中的查找 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0, j = col - 1;
        while (i < row && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    public boolean findNumberIn2DArray2(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int i=0,j=col-1;
        while (i<row&&j>=0){
           if (matrix[i][j]>target){
                 j--;
           }else if (matrix[i][j]<target){
                 i++;
           }else {
               return true;
           }
        }
        return false;
    }
}
