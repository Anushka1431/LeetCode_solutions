class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q=new LinkedList<>();
        int freshoranges=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }
                else if(grid[i][j]==1){
                    freshoranges++;
                }
            }
        }

        int[][] DIR={{1,0},{-1,0},{0,1},{0,-1}};
        int step=0;
        
        while(!q.isEmpty() && freshoranges>0){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] curr=q.poll();
                for(int[] dir:DIR){
                    int nextx=curr[0]+dir[0];
                    int nexty=curr[1]+dir[1];
                
                if(nextx<0 || nextx>=grid.length || nexty<0 || nexty>=grid[0].length || grid[nextx][nexty]!=1){
                    continue;
                }
                q.offer(new int[]{nextx,nexty});
                grid[nextx][nexty]=2;
                freshoranges--;
            }}
            step++;
        }
        return freshoranges == 0 ? step : -1;
    }
}
//bfs
//traverse the array and put all the rotten ornges in the queue
//make a count of fresh oranges 
//make a direction array of 4 direction
//while the queue is not empty and fresh oranges are not over iterate over the queue and take a step variable
//travers every direction in the direction array
//take nextx and nexty as x and y variables of the neighbours of the curr
//if it is fresh then add it to the queue and make it rotten 
//reduce the freshcount
//increase the step
//return the steps 