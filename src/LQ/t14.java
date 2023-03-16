package LQ;

import java.util.Scanner;

//第十二届蓝桥杯 试题G:砝码称重
public class t14 {
	public static void main(String[] args) {
		/*
 		定义一个二维数组，分为两行
 		第一行用来存储可以被称出的重量，第j列表示的就是重量j
 		第二行用来临时存放称出的重量，作为重量的中转站
 		dp[i][j] == true时，表示重量j可以被称出
 		dp[i][j] == false时，表示重量j不能被称出
		 */
		int sum =0;
		boolean[][] dp = new boolean[2][100000];//对于所有评测用例，N​个砝码总重不超过 100000。
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //砝码个数
		for(int i=0; i<n; i++) {
			//取到的新砝码
			int wigth = sc.nextInt();
			sum += wigth;
			//for (int j = 0; j < 100000; j++) {
			//sum 是当前最多到达的重量

			//j必须从1开始 因为 下面的a,b可能是0，称重量是0的 是没有意义的

			for (int j = 1; j <= sum; j++) {
				if(dp[1][j]) {
					//根据上一个的可以称的重量 改变下一次的
					int a =wigth+j;
					int b =Math.abs(wigth-j);
					dp[0][a]=true;
					dp[0][b]=true;
				}
			}
			//新的这个绝对可以称出来
			dp[0][wigth]=true;
			//更新 注意必须 <=  因为第一次时 = wigth=sum
			for (int j = 1; j <= sum; j++) {
				if(dp[0][j]) {
					dp[1][j]=true;
				}
			}


		}
		//统计个数
		int c=0;
		for (int j = 1; j <= sum; j++) {
			if (dp[1][j]) {
				c++;
			}
		}
		System.out.println(c);

		sc.close();
	}
}

