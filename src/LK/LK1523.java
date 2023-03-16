package LK;

/**
 * @className: LK1523
 * @description: 在区间范围内统计奇数数目
 * @author: Dong
 * @date: 2022/4/25
 **/
public class LK1523 {
    /*public int countOdds(int low, int high) {
        int re = 0;
        if (low % 2 != 0) {
            while (low <= high) {
                re++;
                low += 2;
            }
        } else {
            low += 1;
            while (low <= high) {
                re++;
                low += 2;
            }
        }
        return re;
    }

     */
    public int countOdds(int low, int high) {
        //个数为偶数
        if ((high - low + 1) % 2 == 0) {
            // 范围内奇数偶数数目相等，直接返回一半
            return ((high - low + 1) / 2);
        } else {
            // 长度为奇数(low和high均为奇数或者均为偶数)
            if (low % 2 == 0) { // 均为偶数
                return (high - low + 1) / 2;
            } else { // 均为奇数
                return (high - low + 1) / 2 + 1;
            }
        }
    }
}
