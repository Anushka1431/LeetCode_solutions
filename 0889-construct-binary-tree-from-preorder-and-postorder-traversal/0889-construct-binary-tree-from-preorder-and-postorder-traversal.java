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
    int index=0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return helper(preorder,postorder,0,preorder.length-1);
    }
    public TreeNode helper(int[] pre,int[] post,int l,int h){
        
        if(pre.length==0||index>=pre.length||l>h){
            return null;
        }
       TreeNode node=new TreeNode(pre[index]);
        index++;
        if(l==h||index>=pre.length){
            return node;
        }
        int i;
        for(i=0;i<post.length;i++){
            if(post[i]==pre[index]){
                break;
            }
        }        
        node.left=helper(pre,post,l,i);
        node.right=helper(pre,post,i+1,h-1);     
        
        return node;        
    }
}
//take index as 0 as a universal value so it doesnt apply 0 everytime in the loop
//l and h are low and high pointers in the array postorder l is start and h is last node
//create a new node which wouuld be root node which is the first position of preorder array
//this is index 0 and after this increase the index
//this second position is the split in between left and right in the postorder array
//then split accordingly and do recurssion on left and right side 