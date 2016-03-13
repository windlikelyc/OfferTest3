/**
 * Created by toryang on 16/3/13.
 */

/**
 * 题目描述:
 * 判断是不是平衡二叉树:
 */
public class BalencedTree {

    DepthOfTree depth = new DepthOfTree();
    public boolean isBalenceTree(TreeNode root){
        if (root == null){
            return true;
        }

        int leftCount = depth.TreeDepth(root.left);
        int rightCount = depth.TreeDepth(root.right);
        if (Math.abs(leftCount - rightCount) > 1){
            return false;
        }
        return isBalenceTree(root.left) && isBalenceTree(root.right);

    }



}
