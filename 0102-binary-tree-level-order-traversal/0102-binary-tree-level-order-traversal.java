/**DFS 
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        Queue <TreeNode> queue=new LinkedList<>();

        if(root==null){
            return result;
        }
        queue.offer(root);
        
        while(!queue.isEmpty()){
            int levelsize=queue.size();
        List<Integer> level=new ArrayList<>(levelsize);
            for(int i=0;i<levelsize;i++){
                TreeNode currentnode=queue.poll();
                level.add(currentnode.val);
                if(currentnode.left!=null){
                    queue.offer(currentnode.left);
                }
                if(currentnode.right!=null){
                    queue.offer(currentnode.right);
                }

        }
        result.add(level);
        } 
         
      return result;
    }
}
//traverse through all the nodes and add them in a queue linked list. then remove them one by one and when u remove add their left and right nodes in the queue. once u remove add it in an arraylist of tht level . then add all these levels in the result list of lists.