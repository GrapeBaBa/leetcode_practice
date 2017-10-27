package me.grapebaba;

/**
 * Created by grapebaba on 10/27/17.
 */
public class A111 {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        if(root.left==null){
            return minDepth(root.right)+1;
        }
        if(root.right==null){
            return minDepth(root.left)+1;
        }
        return Math.min(minDepth(root.right)+1,minDepth(root.left)+1);
    }
}
