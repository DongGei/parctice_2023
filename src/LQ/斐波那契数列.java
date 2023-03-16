package LQ;

/**
 * @className: 斐波那契数列
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/11
 **/
public class 斐波那契数列 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    public static int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
