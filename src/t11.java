import java.util.*;

/**
 * @className: t11
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/1/7
 **/
public class t11 {
    public static void main(String[] args) {
        int[][] a ={{1,2}};
        int prophet = findProphet(1, a);
        System.out.println("prophet = " + prophet);
    }
    public static int findProphet(int n, int[][] trust) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = trust[i][1];
            if (map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else {
                map.put(a,i);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));//升序
        Integer re = list.get(0).getKey();

        return re;
    }

}
