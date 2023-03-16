package LK;



public class offer05 {
	//public String replaceSpace(String s) {
	//	return s.replace(" ", "%20");
   // }
	public String replaceSpace(String s) {
		//StringBuffer是线程安全的，而StringBuilder则没有实现线程安全功能，所以性能略高。
		StringBuilder sb = new StringBuilder();
		char[] chars = s.toCharArray();
		int l= s.length();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				sb.append("  ");
			}
		}
		if (sb.length() == 0 || s == null || s.length() == 0) {
			return s;
		}
		s+=sb.toString();
		chars = s.toCharArray();
		int left=l-1;
		int rigth=chars.length-1;
		for (int i =l-1 ; i >= 0; i++) {
			if (chars[i] ==' ') {
				chars[rigth--]='0';
				chars[rigth--]='2';
				chars[rigth]='%';
			}else {
				chars[rigth]=chars[left];
			}
			rigth--;
			left--;
		}
	return new String(chars);
    }
}
