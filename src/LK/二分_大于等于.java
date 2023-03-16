package LK;


import org.junit.jupiter.api.Test;

/**
 * @className: 二分_大于等于
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/29
 **/
public class 二分_大于等于 {
    //最后达到的效果就是 l指向（目标或者刚好大于）  （或者数组的最后）
    public  int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l <= r){
            int c = l + (r - l) / 2;
            if(nums[c] < target) l = c + 1; // #1 更新后l左侧元素「必」小于target
            else r = c - 1; // #2 更新后r右侧「必」大于等于target
        }
        System.out.println(r);
        System.out.println(l);
        // return (l == nums.length || nums[l] != target) ? -1 : l; // 704题的返回，处理:相等/不等
        return l == nums.length ? -1 : l; // 处理: 相等/刚好大于/不存在
    }

    @Test
    public void test1() {
        int[] a ={1,2,3,4,5};
        int search = search(a, 3);
        System.out.println("下标:  "+search);
    }
}
