package LK;

import java.util.List;

/**
 * @className: 汉诺塔问题
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/15
 **/
public class 汉诺塔问题 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        move(n,A,B,C);
    }
    public void move(int n,List<Integer> a, List<Integer> b, List<Integer> c){
        if (n==1){
            c.add(0,c.remove(0));
        }else {
            move(n-1,a,c,b);
            c.add(0,a.remove(0));
            move(n-1,b,a,c);
        }

    }
}
