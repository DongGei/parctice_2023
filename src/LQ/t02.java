package LQ;

import java.util.*;

public class t02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        Random random = new Random();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            int a = random.nextInt(1000) + 1;
            set.add(a);
        }
        ArrayList<Integer> integers = new ArrayList<>(set);
        integers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1.intValue()>o2.intValue()){
                    return 1;
                }else if (o1.intValue()==o2.intValue()){
                    return 0;
                }else {
                    return -1;
                }

            }
        });
        for (int i =0; i<integers.size()-1;i++) {
            System.out.print(integers.get(i) +" ");
        }
        System.out.print(integers.get(integers.size() - 1));

        scan.close();

    }
}
