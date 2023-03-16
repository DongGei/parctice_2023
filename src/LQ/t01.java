package LQ;

import java.util.*;

public class t01 {
    public static void main(String[] args) {
        char maxChar;
        int maxNum;

        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String s =scan.next();
        Map HashMap = new HashMap<Character,Integer>();
        for (int i=0 ;i<s.length();i++){
            if (HashMap.containsKey(s.charAt(i))){
                int a =(int)HashMap.get(s.charAt(i));
                HashMap.put(s.charAt(i),a+1);
            }else {
                HashMap.put(s.charAt(i),1);
            }
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList(HashMap.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));//升序
        maxChar  = list.get(0).getKey();
        maxNum=list.get(0).getValue();
        System.out.println(maxChar);
        System.out.println(maxNum);
        scan.close();
    }
}
