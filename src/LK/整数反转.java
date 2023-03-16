package LK;

import java.util.Arrays;

/**
 * @className: 整数反转
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/17
 **/
public class 整数反转 {
    public static void main(String[] args) {
        int reverse = reverse(1534236469);
        System.out.println(reverse);
    }

    public static int reverse(int x) {
        String s = String.valueOf(x);
        boolean f = false;
        if (s.charAt(0) == '-') {
            f = true;
        }
        String s1 = s.replace("-", "");
        StringBuffer stringBuffer = new StringBuffer(s1);
        StringBuffer reverse = stringBuffer.reverse();
        long l=0;
        if (f) {
            l = Long.parseLong("-" + reverse);
        } else {
            l = Long.parseLong("" + reverse);
        }
        if (l > 2147483648L) {
            return 0;
        } else {
            return (int) l;
        }
    }
}
