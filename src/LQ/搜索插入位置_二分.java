package LQ;

/**
 * @className: 搜索插入位置_二分
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/13
 **/
public class 搜索插入位置_二分 {

    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2; //对于这道题没用 条件里看了 应该不会溢出
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }

}
