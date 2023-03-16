package NK;

import java.util.Scanner;

/**
 * @className: 排序子序列
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/22
 **/
public class 排序子序列 {
    //按照题目要求，排序子序列正确地定义是   序列中不能有递增和递减的情况同时出现
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        int flag = 0;//表示刚开始 不确定非递减还是非递增
        int result = 1;
        for (int i = 1; i < n; i++) {
            if (data[i] > data[i - 1]) {
                if (flag == 0) {
                    //如果不确定 那么标记为增的
                    flag = 1; // 1 增的
                }
                if (flag == -1) {
                    //如果它是降的 现在可以结束了
                    flag = 0;
                    result++;
                }
            }
            if (data[i] < data[i - 1]) {
                if (flag == 0) {
                    //如果不确定 那么标记为降的
                    flag = -1;
                }
                if (flag == 1) {
                    //如果它是增的 现在可以结束了
                    flag = 0;
                    result++;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
