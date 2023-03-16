package LQ;

/**
 * @className: t04
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/1/4
 **/
import java.util.Scanner;
import java.lang.Math;
// 1:无需package
// 2: 类名必须Main, 不可修改

public class t04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int score=0;
        double jgNum=0,yxnum=0;
        double jgl=0,yxl=0;
        for(int i = 0; i<n;i++){
            score = scan.nextInt();
            if(score >= 60){
                jgNum++;
            }
            if(score >=85)
                yxnum++;
        }
        jgl=Math.round(jgNum*100/n);
        yxl=Math.round(yxnum*100/n);
        System.out.println((int) jgl+"%");
        System.out.println((int)yxl+"%");
        scan.close();
    }
}
