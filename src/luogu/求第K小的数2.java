package luogu;

import java.util.Scanner;

/**
 * @className: 求第K小的数2
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/16
 **/
public class 求第K小的数2 {
    static int k;
    static int[] a = new int[10000];
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            a[i] = sc1.nextInt();
        }
        quick_sort(0,n - 1);
    }

    public static void quick_sort(int left,int right){
        int i = left,j = right;
        int mid = a[(left+right) / 2];

        do{
            while (a[j] > mid){
                j--;
            }
            while (a[i] < mid){
                i++;
            }
            if(i <= j){
                int temp;
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j--;
                i++;
            }
        }while(i <= j);

        if(k <= j){
            quick_sort(left,j);
        }else if(k >= i){
            quick_sort(i,right);
        }else{
            System.out.println(a[j+1]);
            System.exit(0);
        }
    }
}
