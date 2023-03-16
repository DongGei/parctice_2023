package Algorithm.Tree;

public class PreOrderTest {
    public static void main(String[] args) {
        TreeNode[] nodes = new TreeNode[10];
        //初始化了这个类型的数组
        for (int i = 0; i < 10; i++) {   //初始化这个数组里的给个对象
            nodes[i] = new TreeNode(i, null, null);
        }

        for (int i = 0; i < 10; i++) {
            //对于索引为K=1 开始的节点，其左孩子为（2*K） 右孩子为（ 2*K+1）
            //i=0 开始
            if (i * 2 + 1 < 10) {
                //如果有左孩子
                nodes[i].left = nodes[i * 2 + 1];
            }
            if (i * 2+2 < 10) {
                // 如果有右孩子
                nodes[i].right = nodes[i * 2+2];
            }
        }
        preOrderRe(nodes[0]);
    }

    public static void preOrderRe(TreeNode treeNode) {
        System.out.print(treeNode.value);
        if (treeNode.left != null) {
            preOrderRe(treeNode.left);
        }
        if (treeNode.right != null) {
            preOrderRe(treeNode.right);
        }
    }
}
