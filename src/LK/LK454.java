package LK;

import java.util.HashMap;

public class LK454 {
	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		int re=0;
		HashMap<Integer, Integer> map1=new HashMap<Integer, Integer>();
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (map1.containsKey(nums1[i]+nums2[j])) {
					map1.put(nums1[i]+nums2[j],map1.get(nums1[i]+nums2[j])+1);
				}else {
					map1.put(nums1[i]+nums2[j],1);
				}
				
			}
		}
		for (int i = 0; i < nums3.length; i++) {
			for (int j = 0; j < nums4.length; j++) {
				if (map1.containsKey(0-(nums3[i]+nums4[j]))) {
					re+=map1.get(0-(nums3[i]+nums4[j]));
				}
				
			}
		}
		return re;
    }
}
