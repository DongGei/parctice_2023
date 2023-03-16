package LK;//. 存在重复元素
//给定一个整数数组，判断是否存在重复元素。
//如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false

import java.util.HashSet;

//自己的思路 （大数据时超时 太水了！！！）
public class LK217 {
    int a = 0;
    public boolean containsDuplicate(int[] nums) {
        for (int num : nums) {
            for (int i : nums) {
                if (i == num)
                    a++;
            }
            if (a >= 2) {
                return true;
            }
            a=0;
        }
        return false;
    }
}
// HashSet解题
class LK21701 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
