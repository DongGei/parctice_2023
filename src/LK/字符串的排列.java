package LK;


/**
 * @className: 字符串的排列
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/31
 **/
public class 字符串的排列 {
    public boolean checkInclusion(String s1, String s2) {
        //s1 的排列之一是 s2 的 子串
        int[] nums = new int[26];
        int l1 = s1.length();
        int l2 = s2.length();
        for (int i = 0; i < l1; i++) {
            nums[s1.charAt(i) - 'a']--;
        }
        int l = 0;
        for (int r = 0; r < l2; r++) {
            int R = s2.charAt(r) - 'a';
            nums[R]++;
            while (nums[R] > 0) {
                nums[s2.charAt(l) - 'a']--;
                l++;
            }
            if (r - l + 1 == l1) {
                return true;
            }
        }
        return false;
    }
}
