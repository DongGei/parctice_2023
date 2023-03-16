import java.util.ArrayList;


/**
 * @className: t1
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/20
 **/
public class t1 {
//    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
//        ArrayList<Integer> b = new ArrayList<>();
//        b.add(1);
//        a.add(b);
//        System.out.println(a);
//        b.add(2);
//        a.add(b);
//        System.out.println(a);
    //[[1]]
    //[[1, 2], [1, 2]]
//    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        a.add(new ArrayList<>(b));
        System.out.println(a);
        b.add(2);
        a.add(new ArrayList<>(b));
        System.out.println(a);
    }
}
