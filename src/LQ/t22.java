package LQ;

/**
 * @className: t22
 * @description:  数列求值 2019 03题
 * @author: Dong
 * @date: 2022/3/23
 **/
public class t22 {
    public static void main(String[] args) {
        int a=1,b=1,c=1,temp;
        for (int i =4;i<=20190324;i++){
            temp=(a+b+c)%100000;
            a=b;
            b=c;
            c=temp;

        }
        System.out.println(c);
    }
}
