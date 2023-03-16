import java.util.HashMap;

/**
 * @className: 字节_数组两数求和
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2023/1/6
 **/
public class 字节_数组两数求和 {
    public static void main(String[] args) {
        int[] a = {0 ,1 ,2, 3, 4 ,5 ,6, 7, 8 ,9 };
        int solve = solve(a, 10, 7);
        System.out.println("solve = " + solve);
    }
    static int solve(int[] arr, int n, int m) {
        int re = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int a=m-arr[i];
            if (hashMap.containsKey(a)){
                re++;
            }
            hashMap.put(arr[i],i);
        }
        return re;
    }
}


