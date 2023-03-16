package ACwing;

import java.util.HashMap;

/**
 * @className: 数组中出现次数超过一半的数字
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/10
 **/
public class 数组中出现次数超过一半的数字 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 1, 1, 3};
        int i = moreThanHalfNum_Solution(ints);
        System.out.println(i);
    }
    public static int moreThanHalfNum_Solution(int[] nums) {
        int re=0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)){
                hashMap.put(num,hashMap.get(num)+1);
                if(hashMap.get(num)>nums.length/2){
                    re= num;
                    break;
                }
            }else {
                hashMap.put(num,1);
            }
        }
        return re;
    }
}
