package LK;

public class Lk242 {
	  public boolean isAnagram(String s, String t) {
		  boolean bool=true;
	        int[] r =new int[26];
	        char[] ss=s.toCharArray();
	        char[] tt=t.toCharArray();
	        for (int i = 0; i < tt.length; i++) {
				char c = tt[i];
				r[c-'a']++;
			}
	        for (int i = 0; i < ss.length; i++) {
				char c = ss[i];
				r[c-'a']++;
			}
	        for (int i = 0; i < r.length; i++) {
				if (r[i]!=0) {
					bool=false;
				}
			}
	        return bool;
	    }
}
