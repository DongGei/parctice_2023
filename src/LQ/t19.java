package LQ;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * @className: t19
 * @description: 字符串编码 2020题目08
 * @author: Dong
 * @date: 2022/3/19
 **/
public class t19 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        StringBuilder re = new StringBuilder();
        for (int i =0 ;i<chars.length;){
            if ((int)chars[i] == (int)'1'){
                //chars[i]-'0' 找到 它到0的距离 就是它真实的值 ，chars[i]是它的ASCii码值 ，chars[i]-'0'才是字面看到的值
                //(a+'A'-1) 从A开始后面a个 就是对应的英文字母；-1是因为 A 包括了A本身
                int a = (chars[i]-'0')* 10 +(chars[i+1]-'0');
                re.append((char)(a+'A'-1));
                i+=2;
            }else if ((int)chars[i]==(int)'2'&&chars[i+1]<=(int)'6'){
                int a = (chars[i]-'0')* 10 +(chars[i+1]-'0');
                re.append((char)(a+'A'-1));
                i+=2;
            }else {
                int a=(int)(chars[i]-'0');
                re.append((char)(a+'A'-1));
                i++;
            }
            //123242526  LCXYZ
        }
        System.out.println(re);

    }
}
