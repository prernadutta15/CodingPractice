package com.practice.Trees;

/**
 * @author salman.iraqui
 *
 */

/*
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 */

public class MaximumDepthOfBinaryTree {
	
	// Definition for a binary tree node.
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
      	TreeNode() {}
      	TreeNode(int val) { this.val = val; }

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
	
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int rH = maxDepth(root.right);
        int lH = maxDepth(root.left);
        return Math.max(rH, lH) + 1;
    }
}