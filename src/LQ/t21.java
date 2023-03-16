package LQ;

import java.util.HashSet;

/**
 * @className: t21
 * @description: 不同子串 2019题目02
 * @author: Dong
 * @date: 2022/3/20
 **/
public class t21 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s = "0100110001010001" ;
        for (int i=0;i<s.length();i++){
            for (int j=i+1; j<=s.length();j++){
                String substring = s.substring(i, j);
                //左闭右开 subString(0,5),就是取下标[0,5)
                set.add(substring);
            }
        }
        System.out.println(set.size());
    }
}
