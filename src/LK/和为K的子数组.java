package LK;

/**
 * @className: 和为K的子数组
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/2
 **/
public class 和为K的子数组 {
    public int subarraySum(int[] nums, int k) {
        int[] perSum = new int[nums.length + 1];
        perSum[0] = 0;
        int re = 0;
        for (int i = 1; i <= perSum.length; i++) {
            perSum[i] = perSum[i - 1] + nums[i - 1];
        }
        for (int l = 0; l < nums.length; l++) {
            for (int r = l; r <= nums.length; r++) {
                if (perSum[r] - perSum[l] == k) {
                    re++;
                }
            }
        }
        return re;
    }
}

//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        map.put(0, 1);
//        int preSum = 0;
//        int re = 0;
//        for (int i = 0; i < nums.length; i++) {
//            preSum += nums[i];
//            if (map.containsKey(preSum - k)) {
//                re += map.get(preSum - k);
//            }
//            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
//
//        }
//
//        return re;
//    }

//}