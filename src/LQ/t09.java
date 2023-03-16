package LQ;

import java.util.ArrayList;
import java.util.List;

public class t09 {
	public static void main(String[] args) {
        long n =new Long("2021041820210418");
        List<Long> list = new ArrayList<Long>();
        for (long i = 1; i*i<n; i++) {
			if (n%i==0) {
				list.add(i);
				if (n/i != i) {
					list.add(n/i);
				}
			} 
		}
        int count=0;
        for (Long a : list) {
        	 for (Long b : list) {
        		 for (Long c : list) {
        				if (a*b*c==n) {
							count++;
						}
        			}
     		}
		}
        System.out.println(count);
    }
}

