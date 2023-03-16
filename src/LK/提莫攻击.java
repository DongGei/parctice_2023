package LK;

/**
 * @className: 提莫攻击
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/6/1
 **/
public class 提莫攻击 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int time = 0;
        int per = Integer.MIN_VALUE;

        for (int i = 0; i < timeSeries.length; i++) {
            int cur = timeSeries[i];
            if (per + duration > cur) {
                time += cur - per;
            } else {
                //没中毒
                time += duration;
                per = cur;
            }
        }
        return time;
    }
}