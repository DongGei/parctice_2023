package LQ;

import java.util.*;

/**
 * @className: 考勤刷卡
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/3/15
 **/
public class 考勤刷卡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        TreeSet<Integer> set = new TreeSet<>();
        for (int j = 0; j < i*2; j++) {
            String s = sc.next();
            if (j%2!=0){
                set.add(Integer.parseInt(s));
            }
        }

      set.forEach(System.out::println);
    }

}
