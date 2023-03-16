package learnDemo;

import java.util.Arrays;

/**
 * @className: 选择排序
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/17
 **/
public class 选择排序 {
    public static void main(String[] args) {
        int[] ints = {1, 5, 4, 6, 4, 0, 2};
        selectSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    public static  void selectSort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            int min=i;
            for (int j = i; j < a.length; j++) {
                if (a[j]<a[min]){
                    min=j;
                }
            }
            if (i!=min){
                swap(a,i,min);
            }

        }
    }
    public static void swap(int[] a, int i, int j){
        int t = a[i];
        a[i]=a[j];
        a[j]=t;
    }

}
