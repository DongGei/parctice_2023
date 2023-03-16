package LK;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @className: 二叉树的层序遍历
 * @description: TODO 类描述
 * @author: Dong
 * @date: 2022/5/3
 **/
public class 二叉树的层序遍历 {
    //BFS
    /*
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> re = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        if (root == null) return re;
        queue.addFirst(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> arraylist = new ArrayList<>();

            int n = queue.size();//这个长度反应出来的是每一层的个数
            // 对这层的每一个进行处理，先进队的先处理，处理就是放值和放子节点
            for (int i = 0; i < n; i++) {
                root = queue.removeLast();
                arraylist.add(root.val);
                if(root.left!=null) queue.addFirst(root.left);
                if(root.right!=null) queue.addFirst(root.right);
            }
            //处理完一层后放到大list里
            re.add(arraylist);
        }
        return re;
    }
     */
    public static List<List<Integer>> re = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        re=new ArrayList<List<Integer>>(); //力扣必须写这一下，要不然静态变量不更新，默认是一个Solution类在跑所有测试点
        Order(root,0);
        return re;
    }
    public static void Order(TreeNode node,int deep){
        if (node==null) return;
        //每个节点进来先deep++ 传入的deep是父节点的所在层数
        deep++;
        if (re.size()<deep){//一个size是一层，如果节点所在木有创建层，先创建这一层放进去
            ArrayList<Integer> arrayList = new ArrayList<>();
            re.add(arrayList);
        }
        //取出这个节点对于的这一层
        List<Integer> curCheng = re.get(deep - 1);
        curCheng.add(node.val);
        Order(node.left,deep);
        Order(node.right,deep);

    }
}
