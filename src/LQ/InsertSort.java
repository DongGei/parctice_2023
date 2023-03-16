package LQ;

import java.util.Arrays;

/**
 * @className: t
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/3/18
 **/
public class InsertSort {
    public static int[] insertSort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && temp < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        int[] ints = insertSort(new int[]{1, 5, 3, 4, 2, 0});
        System.out.println(Arrays.toString(ints));
    }
}
