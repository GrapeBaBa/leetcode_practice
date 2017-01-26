package me.grapebaba;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class A226 {
    //BFS
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                TreeNode temp = node.right;
                node.right = node.left;
                node.left = temp;
                queue.offer(node.left);
                queue.offer(node.right);
            }

        }
        return root;
    }

    //DFS
    public TreeNode invertTree1(TreeNode root) {
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                TreeNode temp = node.right;
                node.right = node.left;
                node.left = temp;
                stack.push(node.left);
                stack.push(node.right);
            }

        }
        return root;
    }

    //Recursion
    public TreeNode invertTree2(TreeNode root) {
        if (root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = invertTree2(right);
            root.right = invertTree2(left);
        }
        return root;
    }
}
