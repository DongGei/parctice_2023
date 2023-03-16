package LQ;

import java.util.ArrayList;
import java.util.List;

public class t11 {
    public static void main(String[] args) {
        int cont = 0;
        long n = 2021041820210418L;
        List<Long> list = new ArrayList<Long>();
        for (long i = 1; i * i < n; i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        for (Long i : list) {
            for (Long j : list) {
                for (Long k : list) {
                    if (i * j * k == n) {
                        cont++;
                    }
                }
            }
        }
        System.out.println(cont);
    }
}

