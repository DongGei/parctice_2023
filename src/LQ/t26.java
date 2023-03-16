package LQ;


import java.util.Scanner;

/**
 * @className: t26
 * @description: 人物相关性分析 2019题目08
 * @author: Dong
 * @date: 2022/3/25
 **/
public class t26 {
    public static void main(String[] args) {
        int re=0;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String[] words = s.split("\\s|\\.");
        for (int i=0;i< words.length;i++){
            if (words[i].equals("Alice")){
                for (int j=i+1;j< words.length;j++){
                    if (words[j].equals("Bob")){
                        int sum=1;
                        for (int m=i+1;m<j;m++){
                            sum+=words[m].length()+1;
                        }
                        if (sum<=k){
                            re++;
                        }
                    }
                }
            }
            if (words[i].equals("Bob")){
                for (int j=i+1;j< words.length;j++){
                    if (words[j].equals("Alice")){
                        int sum=1;
                        for (int m=i+1;m<j;m++){
                            sum+=words[m].length()+1;
                        }
                        if (sum<=k){
                            re++;
                        }
                    }
                }
            }
        }
        System.out.println(re);
    }
}
