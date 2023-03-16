package LK;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LK239 {
	 public int[] maxSlidingWindow(int[] nums, int k) {
	      Deque<Integer> deque =new ArrayDeque<Integer>(); 
	      int[] res = new int[nums.length-k+1]; //一共窗口的次数

	      for (int right = 0; right < nums.length; right++) {
			while(!deque.isEmpty()&& nums[right]>=nums[deque.getLast()]) {
				deque.removeLast();
				
			}
			 // 存储元素下标
			deque.addLast(right);
			
			int left = right - k +1;
            // 当队首元素的下标小于滑动窗口左侧边界left时
            // 表示队首元素已经不再滑动窗口内，因此将其从队首移除
            if (deque.getFirst() < left) {
            	deque.removeFirst();
            }
            // 由于数组下标从0开始，因此当窗口右边界right+1大于等于窗口大小k时
            // 意味着窗口形成。此时，队首元素就是该窗口内的最大值
            if (right +1 >= k) {
                res[left] = nums[deque.getFirst()];
            }

		}
	      return res;
	}
	  
}
