package LK;

import java.util.Arrays;

/**
 * @className: 左右两边子数组的和相等
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/22
 **/
public class 左右两边子数组的和相等 {
    public int pivotIndex(int[] nums) {
        int to = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (to - sum - nums[i] == sum) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}
