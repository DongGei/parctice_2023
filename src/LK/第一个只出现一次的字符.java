package LK;

import java.util.HashMap;
import java.util.StringJoiner;

/**
 * @className: 第一个只出现一次的字符
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/2/20
 **/
public class 第一个只出现一次的字符 {
    public char firstUniqChar(String s) {
        if (s.length()== 0){
            return ' ';
        }
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }

        }
        for (char c : chars) {
            if (map.get(c) == 1){
                return c;
            }
        }
        return ' ';
    }
    public char firstUniqChar2(String s) {
        if (s.length()== 0){
            return ' ';
        }
        int min=Integer.MAX_VALUE;
        for (int i ='a';i<='z';i++){
            if (s.indexOf(i)!=-1 && s.indexOf(i)==s.lastIndexOf(i)&& s.indexOf(i)<min){
                min=s.indexOf(i);
            }
        }
        return min==Integer.MAX_VALUE? ' ': s.charAt(min);
    }

    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner("=");
    }
}

