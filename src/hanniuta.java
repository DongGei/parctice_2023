/**
 * @className: hanniuta
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/4/10
 **/
public class hanniuta {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    static void  hanoi(int n,char A,char B,char C){
        if(n ==1){
            System.out.println(A+"-->"+C);
        }else {
            hanoi(n-1,A,C,B);
            System.out.println(A+"-->"+C);
            hanoi(n-1,B,A,C);
        }
    }
}
