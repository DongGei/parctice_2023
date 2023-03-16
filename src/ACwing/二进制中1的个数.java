package ACwing;

/**
 * @className: 二进制中1的个数
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/17
 **/
public class 二进制中1的个数 {
    /*   负数错误
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
           if ((n&1)==1){
               //相当于n和00000...1 每一位都按位与。只有n的最后一位是1时 结果才是1
               count++;
           }
            n=n>>1;
        }
        return count;
    }
     */
    static int BinaryNumOf1(int num) {
        int cont = 0;
        while (num != 0) {
            num = num & (num - 1);
            cont++;
        }
        return cont;
    }

    public static void main(String[] args) {
        int num = -2;
        int ret = BinaryNumOf1(num);
        System.out.println(ret);
    }

}
