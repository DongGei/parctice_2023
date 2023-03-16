package LK;

public class LK541 {
	public String reverseStr(String s, int k) {
        char[] chars=s.toCharArray();
        for (int i = 0; i < chars.length; i+=k) {
        	if (i+k-1>chars.length) {
        		for (int l = i,r=chars.length-1; l < chars.length-i/2; l++,r--) {
    				char temp=chars[l];
    				chars[l]=chars[r];
    				chars[r]=temp;
    			}
        		break;
			}
			int r=i-1+k;
			for (int l = i; l < k/2; l++,r--) {
				char temp=chars[l];
				chars[l]=chars[r];
				chars[r]=temp;
				
			}
			
		}
        return chars.toString();
      
    }
}
