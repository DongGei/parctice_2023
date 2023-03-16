package LK;

public class LK344 {
	public void reverseString(char[] s) {
        for (int i = 0; i < s.length; i++) {
			char temp;
			temp=s[i];
			s[i]=s[s.length-1-i];
			s[s.length-1-i]=temp;
		}
    }
}
