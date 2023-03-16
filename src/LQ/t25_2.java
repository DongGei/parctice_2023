package LQ;

/**
 * @className: t25_2
 * @description: 外卖店优先级 2019 题目07 100%
 * @author: Dong
 * @date: 2022/3/24
 **/
public class t25_2 {
    enum Size {SMAll, MEDIUM}

    public static void main(String[] args) {
        //hi𝕆中的𝕆实际上是是一个辅助字符，它实际上占用了两个char来保存，这个字符串中总共为4个char（就是4个代码单元），3个代码点。
//
//        String a = "\uD835\uDD46";//上下a其实是同一个
//        a = "𝕆";
//        //这个是代码单元数量
//        System.out.println(a.length());//2
//
//        int count = a.codePointCount(0, a.length());
//        //这个是码点数量
//        System.out.println(count);//1
        String b = "hi𝕆";
        char c = b.charAt(2);
        System.out.println(c);//?
        //得到第2个码点的
        int i = b.offsetByCodePoints(0, 2);
        int j = b.codePointAt(i);
        System.out.println(j);//120134

        int[] ints = b.codePoints().toArray(); //字符串到码点数组
        String s = new String(ints, 0,ints.length); //码点数组到字符串
        System.out.println(s);//hi𝕆

    }
}
