package luogu;

import java.util.Scanner;

/**
 * @className: 硬币翻转
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/11
 **/
public class 硬币翻转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int j=1;
        for (int i = 1; i <chars.length ; i++) {
            if (!(chars[i]==chars[i-1])){
                j++;
            }
        }
        if (chars[chars.length-1]=='1'){
            System.out.println(j-1);
        }else {
            System.out.println(j);
        }
    }

}
