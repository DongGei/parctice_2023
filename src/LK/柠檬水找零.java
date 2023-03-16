package LK;

import java.util.HashMap;

/**
 * @className: 柠檬水找零
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/15
 **/
public class 柠檬水找零 {
    public static void main(String[] args) {
        System.out.println(lemonadeChange(new int[]{5,5,5,5,10,5,10,10,10,20
}));
    }
    public static boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < bills.length; i++) {
            int cur = bills[i];
            if (cur == 5) {
                if (map.containsKey(5)) {
                    map.put(5, map.get(5) + 1);
                } else map.put(5, 1);

            } else {
                int b = cur;
                while (cur != 5) {
                    while (map.containsKey(cur - 5)&&map.get(cur-5)>0&&b-(cur-5)>0) {
                        map.replace(cur - 5, map.get(cur - 5) - 1);
                        b = b - (cur - 5);
                        if(b==5){
                            break;
                        }
                    }
                    if(b==5){
                        break;
                    }
                    cur -=5;
                }
                if (b != 5) {
                    return false;
                }else {
                    if (map.containsKey(bills[i])) {
                        map.put(bills[i], map.get(bills[i]) + 1);
                    } else map.put(bills[i], 1);
                }

            }
        }
        return true;
    }
}
