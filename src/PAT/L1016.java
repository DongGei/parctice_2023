package PAT;

import java.util.Scanner;

public class L1016 {
    public static void main(String[] args){
        int sum=0;
        int hgnum=0;
        int[] m={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char ZtoM[] = {'1', '0', 'X','9', '8', '7', '6', '5', '4', '3', '2'};
        String[] s=new String[100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            s[i]= sc.next();
        }
        for(int i=0;i<n;i++){
            sum=0;
            for (int j=0;j<17;j++){
                if (s[i].charAt(j) == 'X'){
                    System.out.println(s[i]);
                    break;
                }
                int a = Integer.parseInt(String.valueOf(s[i].charAt(j))) * m[j];
                sum+=a;
            }
            if (ZtoM[sum%11]==s[i].charAt(17) ){
                hgnum++;
            }else {
                System.out.println(s[i]);
            }
        }
        if (hgnum == n){
            System.out.println("All passed");
        }
    }
}
