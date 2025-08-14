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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findnode(root,x);
        TreeNode yy=findnode(root,y);
        return level(root,xx,0)==level(root,yy,0) && !siblings(root,xx,yy);
    }
    public TreeNode findnode(TreeNode root, int x){
        if(root==null){
            return null;
        }
        if(root.val==x){
            return root;
        }
        TreeNode n=findnode(root.left,x);
        if(n!=null){
            return n;
        }
        return findnode(root.right,x);
    }
    public int level(TreeNode root, TreeNode x, int lev){
        if(root==null){
            return 0;
        }
        if(root==x){
            return lev;
        }
        int l=level(root.left,x,lev+1);
        if(l!=0){
            return l;
        }
        return level(root.right,x,lev+1);
    }
    public boolean siblings(TreeNode root, TreeNode x, TreeNode y){
        if(root==null){
            return false;
        }
        if((root.left==x&&root.right==y) ||(root.left==y&&root.right==x)||siblings(root.left,x,y)||siblings(root.right,x,y)){
            return true;
        }
        return false;
    }
}