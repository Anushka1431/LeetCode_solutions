/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null;
            }
        TreeNode left=invertTree(root.left);
        TreeNode right=invertTree(root.right);
        
        root.left=right;
        root.right=left;
        
        return root;
    }
}
//call function recursively on lefta nd rirght side . once it reached end where theres no left and right ie they are null it will return from there . then it will carry out swap for all of them.