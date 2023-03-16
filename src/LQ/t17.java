package LQ;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @className: t17
 * @description: 分类计数 2020题目06
 * @author: Dong
 * @date: 2022/3/19
 **/
public class t17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int xiaox=0;
        int dax=0;
        int shuz=0;
        for(char c:s.toCharArray()){
            if((int)c <= (int)'z' && (int)c >= (int)'a'){
                xiaox++;
            }
            if((int)c <= (int)'Z' && (int)c >= (int)'A'){
                dax++;
            }
            if((int)c <= (int)'9' && (int)c >= (int)'0'){
                shuz++;
            }
        }
        System.out.println(xiaox);
        System.out.println(dax);
        System.out.println(shuz);
    }
}
