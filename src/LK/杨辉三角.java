package LK;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: 杨辉三角
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/29
 **/
public class 杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        ArrayList<Integer> array = new ArrayList<>();
        //放好第一层
        array.add(1);
        ans.add(array);
        //利用i 来控制层数， i 就是ans的下标 也是层数
        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            //利用 j 来控制具体每层的数字 j就是row的下标
            for (int j = 0; j <= i; j++) {
                if (j==0||j==i){
                    row.add(1);
                }else {
                    row.add(ans.get(i-1).get(j-1)+ans.get(i-1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }

}
