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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Deque<TreeNode> q=new LinkedList<>();
        q.offer(root);
        boolean reverse=false;
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> level=new ArrayList<>(levelsize);
            for(int i=0;i<levelsize;i++){              
                if(!reverse){
                    TreeNode currentnode = q.pollFirst();
                    level.add(currentnode.val);
                    if(currentnode.left!=null){
                        q.addLast(currentnode.left);
                    }
                    if(currentnode.right!=null){
                        q.addLast(currentnode.right);
                    }
                }
                else{
                    TreeNode currentnode = q.pollLast();
                    level.add(currentnode.val);
                    if(currentnode.right!=null){
                        q.addFirst(currentnode.right);
                    }
                    if(currentnode.left!=null){
                        q.addFirst(currentnode.left);
                    }
                }
            }
            reverse=!reverse;
            result.add(level);
        }
        return result;
    }
}
//take a boolean reverse and then keep changing it thus changing the direction of polling with the help of deque.
//while doing the poll last in the conditions take the rightnode into the queue first and then eft so the order is maintained for next