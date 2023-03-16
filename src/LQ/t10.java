package LQ;
//卡片
public class t10 {
	public static void main(String[] args) {
		int [] ints =new int[10];
		int num = 1;
		boolean b =true;
		while(b) {
			int tnum=num;
			while (tnum>0) {
				ints[tnum%10]++;
				if (ints[tnum%10]>2021) {
					//已经用了2022个，说明 num这个数不能拼出来
					System.out.println(num-1);
					b =false;	
					break;
				}
				tnum=tnum/10;
			}
			num++; 
		}
		
	}
	
}
