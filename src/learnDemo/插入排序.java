package learnDemo;

import java.util.Arrays;

/**
 * @className: 插入排序
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/19
 **/
public class 插入排序 {
    public static void main(String[] args) {
        int[] ints = {1, 5, 4, 6, 4, 0, 2};
        insertSort(ints);
        System.out.println(Arrays.toString(ints));
    }
    public static void insertSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            // i 是待插入的元素位置 看看i插入在哪合适
            int t = a[i];  //temp 先拿出来
            int j = i-1;
            //从i的前一个开始到数组第一个
            while (j >= 0) {
                if (t< a[j]){
                    // 如果 比i大 就后移一位置
                    a[j+1]=a[j];
                }else {
                    //前面都是已排序的 一个小 前面的也小 可以退出循环了
                    break;
                }
                j--;
            }
            //现在j是待插入元素应该位置的前一个
            a[j+1]=t;
        }
    }
}
