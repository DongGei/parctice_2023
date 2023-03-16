package LK;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @className: sy001
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/4/6
 **/
public class sy001 {
    /*给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。*/



        private static Object Arrays;
        public static void main(String[] args) {
            System.out.println("请输入一个正整数n,你输入n之后，即将为你展现其对应的二维数组螺旋矩阵！！");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] res = new int[n][n];

            //循环圈数
            int loop = n/2;
            //每圈起始位置，刚开始为（0，0）
            int x = 0;
            int y = 0;
            //偏移量
            int offect = 1;
            //填充数字
            int count = 1;

            while(loop > 0) {
                int i = x;
                int j = y;

                //上侧从左到右
                for(; j < y + n - offect; j++){
                    res[x][j] = count;
                    count++;
                }
                //第一次，此时 j = 2
                //右侧从上到下
                for(; i < x + n - offect; i++){
                    res[i][j] = count;
                    count++;
                }
                //第一次，此时 i = 2
                //下侧从右往左
                for(; j > y; j--){
                    res[i][j] = count;
                    count++;
                }
                //第一次，此时 j = 0
                //左侧从下往上
                for(; i > x; i--){
                    res[i][x] = count;
                    count++;
                }

                loop--;

                x += 1;
                y += 1;

                offect += 2;
            }

            if(n % 2 ==1){
                res[n/2][n/2] = count;
            }

            for(int m = 0; m < n; m++)
            {
                for(int k = 0; k < n; k++)
                {
                    System.out.print(res[m][k]);
                }
                System.out.println();
            }


        }
    }

