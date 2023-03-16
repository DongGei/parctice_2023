package PAT;

import java.util.Scanner;

public class L1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        int n=1,sum=0;
        for (int j=i1;j<=i2;j++){
            sum+=j;
            System.out.printf("%5d",j);
            if (n==5&& j!=i2){
                System.out.print("\n");
                n=0;
            }
            n++;
        }
        System.out.print("\n");
        System.out.print("Sum = "+sum);
    }
}
