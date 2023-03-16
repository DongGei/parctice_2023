package learnDemo;

import java.util.Arrays;

/**
 * @className: 冒泡排序
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/17
 **/
public class 冒泡排序 {
    public static void main(String[] args) {
        int[] ints = {1, 5, 4, 6, 4, 0, 2};
        bubble(ints);
        System.out.println(Arrays.toString(ints));
        System.out.println("isPowerOfFour = " + isPowerOfFour(21));
    }

    private static void bubble(int[] ints) {
        int n=ints.length-1;
        while (true){
            int last = 0; //没有交换的化 就是全部排好了就是0
            for (int i = 0; i < n; i++) {
                if (ints[i]>ints[i+1]){
                    swap(ints,i ,i+1);
                    last=i; //最后一次交换的索引 作为 下一次冒泡排序的次数
                }
            }
            n=last;
            if (n==0){
                break;
            }
        }


    }
    private static void swap(int[] ints,int i,int j){
        int temp = ints[i];
        ints[i]=ints[j];
        ints[j]=temp;
    }

    static boolean isPowerOfFour(int a) {
        // 补充具体实现
        if(a==1){
            return true;
        }
        int t = 4;
        while(t<=a){
            if(a == t){
                return true;
            }
            t=t*4;
        }
        return false;
    }


}
