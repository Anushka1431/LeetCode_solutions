/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(root==p||root==q){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);

        if(left!=null&&right!=null){
            return root;
        }
        return left==null ? right:left;
    }
}
//if root is not null and not equal to p or q then check for its left and right subtrees.
//when you find the p and q return them and when both left and right are not null return that root as the answer.
//also if you find the root in left side and right is null then return left or return right viceversa 