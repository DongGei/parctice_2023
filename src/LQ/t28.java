package LQ;

/**
 * @className: t28
 * @description: 第几天 2018 01题
 * @author: Dong
 * @date: 2022/3/25
 **/
public class t28 {
    public static void main(String[] args) {
        int year=2000;
        if ((year%4==0&& year%100!=0)||(year%400==0)){
            System.out.println(year);
        }
    }
}
