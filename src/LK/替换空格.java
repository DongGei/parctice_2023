package LK;

/**
 * @className: 替换空格
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/1
 **/
public class 替换空格 {
    public String replaceSpace2(String s) {
        return s.replaceAll("%20", " ");
    }
    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i =0;i<s.length();i++){
            char c = sb.charAt(i);
            if (c == ' '){
                sb.append("  ");
            }
        }
        int j =sb.length()-1;
        for (int i = s.length()-1; i >= 0; i--) {

           if (sb.charAt(i) == ' '){
               sb.setCharAt(j--,'0');
               sb.setCharAt(j--,'2');
               sb.setCharAt(j--,'%');
           }else {
               sb.setCharAt(j--, sb.charAt(i));
           }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println("replaceSpace(s) = " + replaceSpace(s));
    }
}
