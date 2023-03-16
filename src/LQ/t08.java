package LQ;


import java.util.Scanner;

public class t08 {
	public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int l = num;
        double sum=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        while(num>0) {
        	double  s = scan.nextDouble();
        	if (s>max) {
				max=(int)s;
			}
        	if (s<min) {
				min=(int)s;
			}
        	sum+=s;
      
        	num--;
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(String.format("%.2d", sum/l));
        scan.close();
    }
}
