package learnDemo;

import java.util.Arrays;

/**
 * @className: 双边循环快速排序
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/20
 **/
public class 双边循环快速排序 {
    public static void main(String[] args) {
        int[] ints = {1, 5, 4, 6, 4, 0, 2};
        quickSort(ints, 0, ints.length - 1);
        System.out.println(Arrays.toString(ints));
    }

    private static void quickSort(int[] a, int l, int r) {
        if (l >= r) {
            return;
        }
        int i = partition(a, l, r);
        quickSort(a, l, i - 1);
        quickSort(a, i + 1, r);


    }

    private static int partition(int[] a, int l, int r) {
        int p=l;
        int i = l; //不可以是l+1  如果是两个元素l+1=r 错误！
        int j = r;
        while (i<j){
            // 下面while 顺序不能乱！ 基准点在哪里，就要先往哪里找   基准点l 那就先让j动起来去找l
            //因为基准点元素在最左边, 而左边分区都是小于等于基准点元素, 如果是i先动的话, 最后i=j停的位置一定是比基准点元素大的地方, 此时发生交换, 必然乱序
            while (i<j && a[j]>a[p]){
                j--;
            }
            while (i<j && a[i]<= a[p]){ //必须是 <=  因为刚开始就是等于的 也需要i++
                i++;
            }

            swap(a,i,j);
        }
        swap(a,i,p);
       return i;
    }

    private static void swap(int[] ints,int i,int j){
        int temp = ints[i];
        ints[i]=ints[j];
        ints[j]=temp;
    }

}
