package LK;

import java.util.*;
class LK018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
		 for (int i = 0; i < nums.length; i++) {
			if (i>0  && nums[i]== nums[i-1]) {
				 continue;
			}
			for (int j = i+1; j < nums.length; j++) {
				//j>i+1 第一个是需要的 如果后面还有是重复的
				if (j>i+1  && nums[j]==nums[j-1]) {
					continue;
				}
				int left=j+1;
				int rigth=nums.length-1;
				
				while(left<rigth) {
					int sum=nums[i]+nums[j]+nums[left]+nums[rigth];
					if (sum>target) {
						rigth--;
					}else if (sum<target) {
						left++;
					}else{
						list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[rigth]));
						//这里记得写：left<rigth 
						while (left<rigth &&nums[left]==nums[left+1]) {
							left++;
						}
						while (left<rigth && nums[rigth]==nums[rigth-1] ) {
							rigth--;
						}
						left++;
						rigth--;
					}
					
				}
			}
			
		}
       return list; 
    }
}
