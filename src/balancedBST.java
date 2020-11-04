//import javax.swing.tree.TreeNode;
//
///**
// * Definition for a binary tree node.
// * public class TreeNode {
// *     int val;
// *     TreeNode left;
// *     TreeNode right;
// *     TreeNode() {}
// *     TreeNode(int val) { this.val = val; }
// *     TreeNode(int val, TreeNode left, TreeNode right) {
// *         this.val = val;
// *         this.left = left;
// *         this.right = right;
// *     }
// * }
// */
//class Solution {
//    public boolean isBalanced(TreeNode root) {
//
//        if (root == null) {
//
//            return true;
//        }
//
//        if (root.left == null || root.right == null) {
//            return true;
//        }
//        int LHeight = MaxDepth(root.left);
//        int RHeight = MaxDepth(root.right);
//
//        if (LHeight - RHeight < 2) {
//            return true;
//        }
//        return false;
//    }
//
//    private int MaxDepth(TreeNode root)
//    {
//        int height = 0;
//        if (root == null){
//            return height;
//        }
//        return 1+ Math.max(MaxDepth(root.left, root.right));
//    }
//
//
//}
//
//
