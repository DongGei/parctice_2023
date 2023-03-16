package LQ;

import java.util.Scanner;

/**
 * @className: t24
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/3/24
 **/
public class t24 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=1;i<=n;i++){
            if (check(i)){
                sum+=i;
            }

        }
        System.out.println(sum);

    }
    public static boolean check(Integer i){
        char[] chars = i.toString().toCharArray();
        for (char a :chars){
            if (a == '2' ||a == '0'||a == '1'||a == '9'){
                return true;
            }
        }
        return false;
    }

}
