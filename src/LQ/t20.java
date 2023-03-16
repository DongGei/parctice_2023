package LQ;

/**
 * @className: t20
 * @description: 组队 2019题目01
 * @author: Dong
 * @date: 2022/3/19
 **/
public class t20 {
    public static void main(String[] args) {
        int max=0;
        int[] i1 =new int[]{97, 92, 0, 0, 89, 82, 0, 0, 0, 95, 0, 0, 94, 0, 0, 0, 98, 93,0,0};
        int[] i2 =new int[]{90, 85, 0, 0, 83, 86, 0, 97, 0, 99, 0, 0, 91, 83, 0, 0, 83, 87,0,99};
        int[] i3 =new int[]{0, 96, 0, 0, 97, 0, 0, 96, 89, 0, 96, 0, 0, 87, 98, 0, 99, 92,0,96};
        int[] i4 =new int[]{0, 0, 0, 80, 0, 0, 87, 0, 0, 0, 97, 93, 0, 0, 97, 93, 98, 96,89,95};
        int[] i5 =new int[]{0, 0, 93, 86, 0, 0, 90, 0, 0, 0, 0, 98,0, 0, 98, 86, 81, 98,92,81};
        for (int a = 0; a < 20; a++) {
            for (int b = 0; b < 20; b++) {
                for (int c = 0; c < 20; c++) {
                    for (int d = 0; d < 20; d++) {
                        for (int e = 0; e < 20; e++) {
                            //如果a,b,c,d,e互不相同
                            if (a!=b && a!=c && a!=d && a!=e && b!=c &&
                                    b!=d && b!=e && c!=d && c!=e && d!=e) {
                                int temp = i1[a]+i2[b]+i3[c]+i4[d]+i5[e];
                                max = max > temp ? max : temp;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }
}


