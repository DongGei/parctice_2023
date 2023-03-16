package luogu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @className: 求第K小的数
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/16
 **/

public class 求第K小的数 {
    public static int[] nums;
    public static int k ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        nums = new int[n];
        for (int i =0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        sort(0, n - 1);
    }
    public static void sort(int l, int r) {
        int mid = (l + r) / 2;
        int i=l, j=r;
        do {
            while (nums[i] < nums[mid]) {
                i++;
            }
            while (nums[j] > nums[mid]) {
                j--;
            }
            if (i<j){
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
                i++;
                j--;
            }
        }while (i<j);
        if (k<=j-1){
            sort(l,j-1);
        }else if (i+1<=k){
            sort(i+1,r);
        }else{
            System.out.println(nums[j]);
            System.exit(0);
        }
    }
}

