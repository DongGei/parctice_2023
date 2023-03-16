package LK;

/**
 * @className: 二分_大于
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/29
 **/
public class 二分_大于 {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int c = l + (r - l) / 2;
            if(nums[c] <= target) l = c + 1; // #1 更新后l左侧元素「必」小于等于target
            else r = c - 1; // #2 更新后r右侧「必」大于target
        }
        return l == nums.length ? -1 : l; // 处理: 刚好大于/不存在
    }


}
