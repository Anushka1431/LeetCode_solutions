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
 //make a helper function with a node and a sum
 //inc the sum as u go down 
 //when u reach the leaf node return the sum so far 
 //do recursive for left and right
class Solution {
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }
    int helper(TreeNode node, int sum){
        if(node==null){
            return 0;
        }
       
        sum=sum*10+node.val;
         if(node.left==null&&node.right==null){
            return sum;
        }
        return helper(node.left,sum)+helper(node.right,sum);
    }
}