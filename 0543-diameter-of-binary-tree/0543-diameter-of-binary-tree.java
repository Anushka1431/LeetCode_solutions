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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter-1;
    }
    public int height(TreeNode node){
        if(node==null){
            return 0;
        }
        int lh=height(node.left);
        int rh=height(node.right);

        int dia=lh+rh+1;
        diameter=Math.max(diameter,dia);

        return Math.max(lh,rh)+1;

    }
}
//use DFS 
//calculate the height of the every node, left and right height +the node =diameter ...then subract the node so it gives actual path diameter 