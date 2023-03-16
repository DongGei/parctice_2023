package LK;
/**
 * @className: LK977
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/1/14
 **/

public class LK977 {
    public static int[] sortedSquares(int[] nums) {
        int right=nums.length-1;
        int left=0;
        //每次比较两端的值 放入数组的最后
        int[] ints=new int[nums.length];
        int wz=nums.length;
        while (left<right){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                ints[--wz]=nums[left]*nums[left];
                left++;
            }else{
                ints[--wz]=nums[right]*nums[right];
                right--;
            }
        }
        return ints;
    }

    public static void main(String[] args) {
        int c=5;
        while(c-->0){
            System.out.println(c);
        }
    }
}
