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
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return checkmirror(root.left,root.right);
    }
    public boolean checkmirror(TreeNode ln,TreeNode rn ){
        if(ln==null && rn==null){
            return true;
        }
        if(ln==null||rn==null){
            return false;
        }
        return (ln.val==rn.val &&checkmirror(ln.left,rn.right)&&checkmirror(ln.right,rn.left));
        
    }
}
//check ifboth left and right are null then true
//if on id only null then false
//if they are equal and the recursively the left side of left and right side of right is equal then true