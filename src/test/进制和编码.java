package test;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @className: 进制和编码
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/3/13
 **/
public class 进制和编码 {
    public static void main(String[] args) {
        String s ="ai你哟";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        for (byte aByte : bytes) {
            //System.out.println(aByte);
            String a = Integer.toBinaryString(aByte);
            //System.out.println("a = " + a);
            if (a.length()>23){
                String substring = a.substring(23, 31);
                System.out.println(substring);
            }else {
                System.out.println(a);
            }



        }
        String s1 = new String(bytes);
        System.out.println("s1 = " + s1);
    }
}
