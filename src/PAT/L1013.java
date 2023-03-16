package PAT;

import java.util.Scanner;

public class L1013 {
    private static int clca(int n){
        if (n==1){
            return 1;
        }else {
            return n*clca(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n=0;
        int i = sc.nextInt();
        for (int j=i;j>0;j--){
            n = clca(j);

            sum+=n;
        }

        System.out.println(sum);
        sc.close();
    }
}
