package PAT;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class L1003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashMap map = new HashMap();
        if(num == 0){
            System.out.println("0:1");
        }else{
            while (num != 0) {
                int i = num % 10;
                num = num / 10;
                if (map.containsKey(i)) {
                    int count = (int) map.get(i);
                    count++;
                    map.put(i, count);
                } else {
                    map.put(i, 1);
                }
            }
            Iterator iter = map.entrySet().iterator();
            while (iter.hasNext()) {
                Map.Entry entry = (Map.Entry) iter.next();
                Object key = entry.getKey();
                Object val = entry.getValue();
                System.out.println(key+":"+val);
            }
        }
    }
}
