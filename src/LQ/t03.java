package LQ;
/*
* 学校里有一个水房，水房里一共装有 mmm 个龙头可供同学们打开水，每个龙头每秒钟的供水量相等，均为 1。*/
import java.util.Scanner;

public class t03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //n个同学
        int n = scan.nextInt();

        //m个水龙头
        int m = scan.nextInt();
        //打完水的人数
        int ok=0;
        //时间s
        int s = 0;
        int[] ints = new int[n+m];
        for (int i = 0; i < n; i++) {
            ints[i] = scan.nextInt();
        }
        scan.close();
        while (ok < n) {
            for (int j = 0; j < m; j++) {
                ints[j]--;

            }
            s++;
            //代替m的 因为for里m会变
            int b=m;
            for (int k = 0; k < b; k++) {
                if (ints[k] == 0) {
                    m++;
                    ok++;
                }
            }
        }
        System.out.println(s);
    }
}
