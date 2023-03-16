package LK;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: 组合总和
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/27
 **/
public class 组合总和 {
    public static void main(String[] args) {
        int [] a ={2,3,6,7};
        List<List<Integer>> lists = new 组合总和().combinationSum(a, 7);
        System.out.println(lists);
    }
    public  List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();
        dfs(ans,candidates,0,target,integers);
        return ans;

    }
    private void dfs(List<List<Integer>> ans,int[] candidates,int dex,int target,List<Integer> combine){
        if (target==0){
            ans.add(new ArrayList<>(combine));
            return;
        }

        if (dex<candidates.length && target-candidates[dex]>=0){
            combine.add(candidates[dex]);
            dfs(ans,candidates,dex,target-candidates[dex],combine);
            combine.remove(combine.size()-1);
        }
        if (dex+1<candidates.length){
            dfs(ans,candidates,dex+1,target,combine);
        }
    }

}
