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
    public int maxPathSum(TreeNode root) {
        maxpathsumrec(root);
        return totalmax;
    }
    int totalmax=Integer.MIN_VALUE;
    public int maxpathsumrec(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=Math.max(maxpathsumrec(root.left),0);
        int r=Math.max(maxpathsumrec(root.right),0);
        totalmax=Math.max(totalmax,root.val+l+r);
        return root.val +Math.max(l,r);
    }
}
/*okay so basically recursively travers l and l of the root.
keep a universal max value and update it at every root as root+l+r.
but while returning max value fro thet root to its upper root, return root+max(l,r), 
so that we get max value of the possible path from that node upwards. */