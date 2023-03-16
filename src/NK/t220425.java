package NK;

import java.util.Scanner;

/**
 * @className: t220425
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/4/25
 **/
public class t220425 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int len=sc.nextInt();
        int cout=sc.nextInt();
        String s=sc.next();
        char[] chars = s.toCharArray();
        for (int i=0;i<cout;i++){
            char a = chars[0];
            for (int j=i;j<chars.length-1;j++){
                chars[j]=chars[j+1];
            }
            chars[chars.length-1]=a;
        }
        for (char aChar : chars) {
            System.out.print(aChar);
        }

    }
}
