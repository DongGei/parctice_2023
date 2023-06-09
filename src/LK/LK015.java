package LK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LK015 {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
            	//满足条件，说明后面的都是大于0的，相加不可能是0
                return result;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
            	//如果它和前面的数一样。那么最后放回的值一样  可以跳过。去重
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            while (right > left) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    //去除重复
                    while (right > left && nums[right] == nums[right - 1]) right--;
                    while (right > left && nums[left] == nums[left + 1]) left++;
                    
                    right--; 
                    left++;
                }
            } 
        }
        return result;
    }
}
