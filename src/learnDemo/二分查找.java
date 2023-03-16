package learnDemo;

/**
 * @className: 二分查找
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/12/13
 **/
public class 二分查找 {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i<=j){
            int c =(i+j)>>>1;
            if (nums[c]==target){
                return c;
            }else if (nums[c]>target){
                j=c-1;
            }else {
                i=c+1;
            }
        }
        return -1;
    }

}
