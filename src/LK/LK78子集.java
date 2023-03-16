package LK;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @className: LK78子集
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/20
 **/
public class LK78子集 {
        List<List<Integer>> result = new ArrayList<>();
        LinkedList<Integer> path = new LinkedList<>();

        public List<List<Integer>> subsets(int[] nums) {
            if (nums.length == 0){
                result.add(new ArrayList<>());
                return result;
            }
            backtracking(nums, 0);
            return result;
        }

        private void backtracking(int[] nums, int startIndex){
            result.add(new ArrayList<>(path));
            if (startIndex >= nums.length){
                return;
            }
            for (int i = startIndex; i < nums.length; i++){
                path.add(nums[i]);
                backtracking(nums, i + 1);
                path.removeLast();
            }
        }
}
