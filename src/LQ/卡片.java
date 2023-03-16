package LQ;

import java.util.Scanner;

/**
 * @className: 卡片
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/3/15
 **/
public class 卡片 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n<=0){
            System.out.println(0);
        }
        int k=1;
        int cont=1,add=2;
        while (cont<n){
            cont+=add;
            add+=1;
            k++;
        }
        System.out.println(k);
    }

}
