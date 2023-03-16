package LK;

import java.util.HashSet;
import java.util.Set;

public class LK202 {
	 public boolean isHappy(int n) {
		   Set<Integer> set = new HashSet<Integer>();
	       
		   while(!set.contains(n)) {
	            set.add(n);
	            n= nextN(n);
			    if (n==1) {
				return true;
			    }   
		   }
		   return false;
		 }
		 
		 public int nextN(int n) {
			 int re=0;
			 while(n > 0) {
				 int a = n%10;
				 n=n/10;
				 re+=a*a;
			 }
		        return re;
		}
}
