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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0){
            return null;
        }
        //first node of proorder is the root of BT
        int root=preorder[0];
        int index =0;
        
        //find the root as index in the inorder array
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==root){
                index= i;
            }
        }
//now traverse the left and right subtrees
//for left the preorder is the index and one node after it and inorder is left side of index
//for right do the rest
        TreeNode node=new TreeNode(root);
        node.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        node.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return node;
    }
}