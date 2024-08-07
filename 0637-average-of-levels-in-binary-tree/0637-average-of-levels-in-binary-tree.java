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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelsize=queue.size();
            Double sum=0.00000;
            for(int i=0;i<levelsize;i++){
                TreeNode currentnode=queue.poll();
                sum+=currentnode.val;
                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }
            }
            Double avg=sum/levelsize;
            result.add(avg);
        }
        return result;
    }
}