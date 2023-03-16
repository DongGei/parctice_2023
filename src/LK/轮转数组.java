package LK;

import java.util.Arrays;

/**
 * @className: 轮转数组
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/23
 **/
public class 轮转数组 {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    private void reverse(int[] nums, int l,int r){
        while (l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }
    //nums = "----->-->"; k =3
    //result = "-->----->";
    //
    //reverse "----->-->" we can get "<--<-----"
    //reverse "<--" we can get "--><-----"
    //reverse "<-----" we can get "-->----->"

}
