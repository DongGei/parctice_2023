package luogu;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @className: 欢乐的跳
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/9
 **/
public class 欢乐的跳 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cha = new int[n-1];
        HashSet<Integer> hashSet = new HashSet<>();
        int temp =sc.nextInt();
        hashSet.add(temp);
        for (int i = 0; i < n-1; i++) {
            int cur = sc.nextInt();
            hashSet.add(cur);
            cha[i] = Math.abs(temp-cur);
            temp=cur;
        }

        int is  = 1;
        for (int i = 0; i < cha.length; i++) {
            if (!hashSet.contains(cha[i])){
               is=0;
               break;
            }
        }
        if (is==1){
            System.out.println("Jolly");
        }else {
            System.out.println("Not jolly");
        }
    }
}
