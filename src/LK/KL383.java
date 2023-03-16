package LK;



public class KL383 {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while (i<=j){
            int c =i+(j-i)/2;
            if (nums[c]==target){
                return nums[c];
            }else if (nums[c]>target){
                j=c-1;
            }else {
                i=c+1;
            }
        }
        return -1;
    }
	public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr =new int[26];
        for(char c :magazine.toCharArray()) {
        	arr[c-'a']++;
        }
        for(char c :ransomNote.toCharArray()) {
        	arr[c-'a']--;
        	
        }
        for (int i = 0; i < arr.length; i++) {
			if (arr[i]>0) {
				return true;
			}
		}
        return false ;
    }
	
}

