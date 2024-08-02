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
    public void flatten(TreeNode root) {
        TreeNode current=root;
        while(current!=null){
            if(current.left!=null){
                TreeNode temp=current.left;
                while(temp.right!=null){
                    temp=temp.right;
                }
                temp.right=current.right;
                current.right=current.left;
                current.left=null;
                
            }
            current=current.right;
        }
    }
}
//go to left of current 
//take that as temp
//see if right of temp is null and when it is put whole right side tree on this node....here put 5 and 6 on 4
//then shift 2 and the whole sub tree to right side of 1
//then put all left as null
//then move to next current. right which is 2 now
//do the same cycle for its right subtree starting with 3 