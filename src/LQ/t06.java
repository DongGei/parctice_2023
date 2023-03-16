package LQ;

import java.util.Scanner;

/**
 * @className: t06
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/1/5
 **/
public class t06 {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ints = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                //java 默认是初始化外层是NULL 内层是0
                // 所以现在没有赋值的地方 默认是0
                ints[i][j] = sc.nextInt();
            }
        }

        int gbsu=1;
        for (int i =3; i<n;i++){
            for (int j=0 ;j<gbsu;j++){
                ints[i][j]=0;
                ints[i][i-j]=0;
            }
            gbsu++;
        }
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i);
            }
            System.out.println("");
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (j-1>=0){
                    if (ints[i - 1][j] > ints[i - 1][j - 1]) {
                        ints[i][j] = ints[i][j] + ints[i - 1][j];

                    } else {
                        ints[i][j] = ints[i][j] + ints[i - 1][j - 1];

                    }
                }else {
                    ints[i][j] = ints[i][j] + ints[i - 1][j];
                }
            }
        }
        int max=0;
        for (int i=0; i<n;i++){
            max=Math.max(max,ints[n-1][i]);
        }
        System.out.println(max);
    }
}
