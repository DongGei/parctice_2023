package learnDemo;

import java.util.Arrays;

/**
 * @className: 快速排序
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/20
 **/
public class 快速排序 {
    public static void main(String[] args) {
        int[] ints = {1, 5, 4, 6, 4, 0, 2};
        quickSort(ints,0,ints.length-1);
        System.out.println(Arrays.toString(ints));
    }
   private static void quickSort(int[] a ,int l,int r){
        if (l>=r){
            return;
        }
       int i = partition(a, l, r);
       quickSort(a,l,i-1);
       quickSort(a,i+1,r);


   }
    private  static  int partition(int[] a ,int l,int r){
        //双指针
        int p = r;
        int i=l;
        for (int j = l; j < p; j++) {
            if (a[j]<a[p]){
            swap(a,i,j);
            i++;
            }
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
