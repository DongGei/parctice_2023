package PAT;

import java.util.Scanner;

public class L1015 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            char p =sc.next().charAt(0);
            for(int i=0; i<Math.round(num/2);i++){
                for(int j=0; j<num;j++){
                    System.out.print(p);
                }
                if(i<Math.round(num/2)-1){
                    System.out.print("\n");
                }

            }
        }

}
