package LK;

//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//贪心算法
public class LK053 {
    class Solution {
        public int maxSubArray(int[] nums) {
            int maxAns=nums[0];
            int sum=0;
            for (int i : nums) {
                sum+=i;
                if (maxAns<sum){
                    maxAns=sum;
                }
                //消除负影响
                if (sum<0){
                    sum=0;
                }
            }
        return maxAns;
        }
    }
}
