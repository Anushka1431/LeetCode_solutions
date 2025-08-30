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
    TreeNode prev=null;
    int mindiff=Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return mindiff;
    }
    public int inorder(TreeNode root){
        if(root==null){
            return 0;
        }
        TreeNode curr=root;
        inorder(root.left);
        
        if(prev!=null){
            mindiff=Math.min(mindiff,curr.val-prev.val);
        }
        prev=curr;
        
        inorder(root.right);
        return mindiff;
    }
}