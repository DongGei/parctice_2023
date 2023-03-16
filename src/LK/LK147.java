package LK;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class LK147 {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer,Integer> map =new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else {
				map.put(nums[i], 1);
			}
		}
		PriorityQueue<Integer> queue =new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return map.get(o1)-map.get(o2);
			}
		});
		for (Integer key : map.keySet()) {
			if (queue.size()<k) {
				queue.add(key);
			}else if (map.get(queue.peek())<map.get(key)) {
				queue.remove();
				queue.add(key);

			}
		}
		int[] res =new int[k];
		for (int i = 0; i < k; i++) {
			res[i]=queue.remove();
		}
		return res;
    }
}
