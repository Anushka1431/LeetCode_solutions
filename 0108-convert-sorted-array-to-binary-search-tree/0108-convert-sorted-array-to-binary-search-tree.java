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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0){
            return null;
        }
        return populatesort(nums,0,nums.length-1);

    }
    public TreeNode populatesort(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=start+(end-start)/2;
        //create a new node as the middle root node 
        TreeNode node=new TreeNode(nums[mid]);
        node.left=populatesort(nums,start,mid-1);
        node.right=populatesort(nums,mid+1,end);

        return node;
    }
   
}
