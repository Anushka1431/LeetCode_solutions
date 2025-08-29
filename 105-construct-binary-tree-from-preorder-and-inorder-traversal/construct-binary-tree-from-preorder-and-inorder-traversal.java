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
    int index;
    Map<Integer,Integer> map=new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        index=0;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] preorder, int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        int root=preorder[index];
        index++;
        TreeNode node=new TreeNode(root);
        int rootpos=map.get(root);

        node.left=helper(preorder, inorder,start,rootpos-1);
        node.right=helper(preorder,inorder,rootpos+1,end);
        return node;
    }
}