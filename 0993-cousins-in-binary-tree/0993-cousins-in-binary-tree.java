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
 first find the nodes x and y
 then check if they are at the same level and they are not siblings ie same parent
 */
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findnode(root,x);
        TreeNode yy=findnode(root,y);

        return(
            levelofnode(root,xx,0)==levelofnode(root,yy,0) && !issibling(root,xx,yy)
        );
    }
    //this finds the node of the gien value of x or y. it will recursively search for left and right side 
    public TreeNode findnode(TreeNode node,int x){
        if(node==null){
            return null;
        }
        if(node.val==x){
            return node;
        }
        TreeNode n=findnode(node.left,x);
        if(n!=null){
            return n;
        }
        return findnode(node.right,x);
    }
    public int levelofnode(TreeNode node, TreeNode x, int level){
        if(node==null){
            return 0;
        }
        if(node==x){
            return level; 
        }
        int l=levelofnode(node.left,x,level+1);
        if(l!=0){
            return l;
        }
        return levelofnode(node.right,x,level+1);
    }
    public boolean issibling(TreeNode node,TreeNode x,TreeNode y){
        if(node==null){
            return false;
        }
        return(node.left==x&&node.right==y||node.left==y&&node.right==x||issibling(node.left,x,y)||issibling(node.right,x,y));
           
    }
}