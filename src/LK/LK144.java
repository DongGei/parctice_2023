package LK;

import java.util.ArrayList;
import java.util.List;

/**
 * @className: LK144
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/3/6
 **/
public class LK144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        preorder(result,root);
        return result;
    }
    public  List preorder(List list,TreeNode treeNode){
        list.add(treeNode.val);
        preorder(list,treeNode.left);
        preorder(list,treeNode.right);
        return list;
    }
}
