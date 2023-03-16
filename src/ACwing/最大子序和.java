package ACwing;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * @className: 最大子序和
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/2
 **/
public class 最大子序和 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] sums = new int[n + 1];
        sums[0] = 0;
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + scanner.nextInt();
        }
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(0);//插入到最后
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            if (deque.isEmpty()) {
                deque.offerLast(i);//插入到最后
            } else {
                if (i - deque.peekFirst() > m) { //看一下第一个
                    deque.removeFirst();
                }
                ans = Math.max(ans, sums[i] - sums[deque.peekFirst()]);
                while (!deque.isEmpty() && sums[deque.peekLast()] >= sums[i]) { //看一下最后一个
                    deque.pollLast(); //Retrieves and removes
                }
                deque.offerLast(i);
            }

        }

        System.out.println(ans);
    }
}
//    public static void main(String[] args) {
//        int max = Integer.MIN_VALUE;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int[] ints = new int[n];
//        for (int i = 0; i < n; i++) {
//            ints[i] = sc.nextInt();
//        }
//
//        int l = 0;
//        int sum = 0;
//        for (int r = 0; r < n; r++) {
//            while (r - l +1> m) {
//                sum-=ints[l];
//                l++;
//            }
//            sum += ints[r];
//            max = max > sum ? max : sum;
//        }
//        System.out.println(max);
//    }
//}
