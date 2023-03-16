package LK;

import java.util.HashMap;

/**
 * @className: 无重复字符的最长子串
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/16
 **/
public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        if (chars.length==0){
            return 0;
        }
        int maxRe = Integer.MIN_VALUE;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();  //字母 下标
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                left = Math.max(left, map.get(chars[i]) + 1);
            }
           // 不管是否更新left，都要更新 s.charAt(i) 的位置
            map.put(chars[i], i);
            maxRe = Math.max(maxRe, i - left + 1);
        }
        return maxRe;
    }
}
