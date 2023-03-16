package NK;

import java.util.HashMap;

/**
 * @className: 数组中重复的数字
 * @description: https://www.nowcoder.com/practice/6fe361ede7e54db1b84adc81d09d8524?tpId=13&tqId=11203&tab=answerKey&from=cyc_github
 * @author: Dong
 * @date: 2023/1/28
 **/
public class 数组中重复的数字 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param numbers int整型一维数组
     * @return int整型
     */
    public int duplicate (int[] numbers) {
        // write code here
        for (int i = 0; i < numbers.length; i++) {
            while (numbers[i] != i){
                if (numbers[i]== numbers[numbers[i]]){
                    return numbers[i];
                }
                swap(numbers,i,numbers[i]);
            }
            swap(numbers,i,numbers[i]);
        }
        return -1;
    }
    private void swap(int[] nums,int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }

    public int duplicate2 (int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])){
                return numbers[i];
            }else {
                map.put(numbers[i],1);
            }

        }
        return -1;
    }
}
