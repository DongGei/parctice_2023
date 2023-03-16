package LQ;

import java.util.Arrays;

/**
 * @className: t_binarySearch
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/1/14
 **/
public class t_binarySearch {
    public static void main(String[] args) {
       int[] a  = new int[]{10,11,23,33,45,50,60,65};
        int i = Arrays.binarySearch(a, 20);
        System.out.println("索引下标是"+i);
    }

}
