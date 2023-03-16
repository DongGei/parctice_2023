package LQ;


/**
 * @className: t23
 * @description: 数的分解 题目04
 * @author: Dong
 * @date: 2022/3/24
 * 【问题描述】
 * 把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包 含数字 2 和 4，一共有多少种不同的分解方法？
 * 注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和 1001+1000+18 被视为同一种。
 * 【答案提交】
 * 这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一 个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 *
 * 该算法需要将2019拆成三部分，并且三部分如果只是顺序不一样则视为同一种，因而我们可以通过两成for循环直接暴力解题，
 * 并在每层循环中键入一个check方法用于检查数中是否含有“2”或“4”，同时为了避免顺序不同而导致的重复计算，
 * 可以考虑三部分由小到大的取值，即第一部分取值完毕后第二部分再第一部分加1的基础上往后查找，第三部分亦是如此
 **/
public class t23 {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 2019; i++) {
            for (int j = i+1; j <= 2019; j++) {
                int k = 2019 - i - j;
                if (k > j) {
                    if (check(k) && check(i) && check(j)) {
                        // System.out.println(i+" "+j+" "+k);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }

    public static boolean check(Integer a) {
        char[] chars = String.valueOf(a).toCharArray();
        for (char aChar : chars) {
            if (aChar == '2' || aChar == '4') {
                return false;
            }
        }
        return true;
    }
 }


/*
    public class t23 {
        public static void main(String[] args) {
            System.out.println(f(2019));
        }
        //返回统计结果
        public static int f(int num){
            int counts = 0;//用于统计不同组合的个数
            for (int i = 1; i <= num; i++) {
                if(check(String.valueOf(i))){//检验是否不含有“2”，“4”
                    for (int j = i+1; j <= num; j++) {
                        if(check(String.valueOf(j))){
                            int k = num - i - j;
                            if(check(String.valueOf(k)) && k > j){
                                counts++;
                            }
                        }
                    }
                }

            }
            return counts;
        }
        //检验是否含有“2”或“4”的方法，若含有返回false
        public static boolean check(String s){
            if(s.indexOf("2") != -1 || s.indexOf("4") != -1){//若含有“2”或“4”则返回false
                return false;
            }
            return true;
        }
    }


 */


