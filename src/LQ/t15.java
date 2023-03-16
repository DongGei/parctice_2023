package LQ;

import java.util.Arrays;

/**
 * @className: t15
 * @description: 分配口罩 2020题目04
 * @author: Dong
 * @date: 2022/3/18
 **/
public class t15 {
    public static void main(String[] args) {
        int[] nums = {9090400, 8499400, 5926800, 8547000, 4958200,
                4422600, 5751200, 4175600, 6309600, 5865200,
                6604400, 4635000, 10663400, 8087200, 4554000};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sum1=0;
        int sum2=0;
        for (int i =0 ; i<nums.length;i++){
            if (sum1>sum2){
                sum2+=nums[i];
            }else {
                sum1+=nums[i];
            }

        }
        System.out.println(sum1-sum2);
    }
}
