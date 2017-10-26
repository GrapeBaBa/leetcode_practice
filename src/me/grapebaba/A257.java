package me.grapebaba;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by grapebaba on 10/25/17.
 */
public class A257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root != null) pathFromNode(root, "", res);
        return res;
    }

    private void pathFromNode(TreeNode node, String path, List<String> res) {
        if (node.left != null) {
            pathFromNode(node.left, path + node.val + "->", res);
        }
        if (node.right != null) {
            pathFromNode(node.right, path + node.val + "->", res);
        }
        if (node.left == null && node.right == null) {
            res.add(path + node.val);
        }
    }
}
