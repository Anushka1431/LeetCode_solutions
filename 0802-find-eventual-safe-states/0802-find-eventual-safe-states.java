import java.util.*;
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n =graph.length;
        int[] outdegree=new int[n];
        List<List<Integer>> reversegraph=new ArrayList<>();
        List<Integer> safenodes=new ArrayList<>(); 
//initialize reversegraph
        for(int i=0;i<n;i++){
            reversegraph.add(new ArrayList<>());
        }
//add values in reversegraph.  here we take a node from for example[1,2] we get 1 and add 0 to it in reverse grah and take 2 and add 0 toit . 
        for(int i=0;i<n;i++){
            for(int node:graph[i]){
                reversegraph.get(node).add(i);
            }
            //outdegree is for original graph only
            outdegree[i]=graph[i].length;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(outdegree[i]==0){
                q.offer(i);
            }

        }
        //bfs
        while(!q.isEmpty()){
            int currnode=q.poll();
            safenodes.add(currnode);
            for(int neighbour:reversegraph.get(currnode)){
                outdegree[neighbour]--;
                if(outdegree[neighbour]==0){
                    q.offer(neighbour);
                }
            }
        }
        Collections.sort(safenodes);
        return safenodes;

    }
}