package LK;

public class LKoffer58 {
	public String reverseLeftWords(String s, int n) {
		StringBuilder sBuilder =new StringBuilder();
		
		for (int i = n; i < s.length(); i++) {
			sBuilder.append(s.charAt(i));
		}
		for(int i = 0;i<n;i++) {
			sBuilder.append(s.charAt(i));
		}
		return sBuilder.toString();		
    }
	
}
