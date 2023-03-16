package luogu;


import java.util.Scanner;

/**
 * @className: 小鱼的航程
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/12
 **/
public class 小鱼的航程 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt()-1;
        int n = sc.nextInt();
        int re = 0;
        for (int i = 0; i < n; i++) {
            if (!(x == 5 || x == 6)) {
                re += 250;
            }
            x = (x + 1) % 7;
        }
        System.out.println(re);
    }
}
