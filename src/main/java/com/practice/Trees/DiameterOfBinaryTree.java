package com.practice.Trees;

/**
 * @author salman.iraqui
 *
 */

/*
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 */

public class DiameterOfBinaryTree {
	
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
	
	public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        diameterOfBinaryTreeHelper(root, diameter);
        return diameter[0];
    }

    public int diameterOfBinaryTreeHelper(TreeNode root, int[] diameter) {
        if(root == null)
            return 0;
        int lh = diameterOfBinaryTreeHelper(root.left, diameter);
        int rh = diameterOfBinaryTreeHelper(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh+rh);
        return 1 + Math.max(lh, rh);
    }
}