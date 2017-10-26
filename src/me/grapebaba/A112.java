package me.grapebaba;

/**
 * Created by grapebaba on 10/26/17.
 */
public class A112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return hasPathSumFrom(root, 0, sum);
    }

    private boolean hasPathSumFrom(TreeNode node, int previous, int sum) {
        if (node == null) {
            return false;
        }
        if (node.left == null && node.right == null) {
            return previous + node.val == sum;

        }
        return hasPathSumFrom(node.left, previous + node.val, sum) || hasPathSumFrom(node.right, previous + node.val, sum);

    }
}
