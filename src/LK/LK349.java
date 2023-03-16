package LK;

import java.util.HashSet;
import java.util.Set;

class LK349 {
	  public int[] intersection(int[] nums1, int[] nums2) {
			int[] re =null;
			int count=0;
			
			Set<Integer> set1 = new HashSet<Integer>();
			Set<Integer> set2 = new HashSet<Integer>();
			
	        for (int i = 0; i < nums1.length; i++) {
				set1.add(nums1[i]);
			}
	        for (int i = 0; i < nums2.length; i++) {
				set2.add(nums2[i]);
			}
	        for (Integer i:set2) {
				if (set1.contains(i)) {
					count++;
				}
			}
	        re=new int[count];
	        count=0;
	        for (Integer i:set2) {
				if (set1.contains(i)) {
					re[count]=i;
	                count++;
				}
			}
	        
	       
	        return re;
	    }

	}
