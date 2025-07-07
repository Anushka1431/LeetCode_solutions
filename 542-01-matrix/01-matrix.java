class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        boolean[][] vis=new boolean[m][n];
        int[][] dist=new int[m][n];
        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==0){
                    q.offer(new int[]{i,j});
                    vis[i][j]=true;
                }

            }
        }
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int row=curr[0];
            int col=curr[1];
            for(int[] d: dir){
                int newrow=row+d[0];
                int newcol=col+d[1];
                if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && !vis[newrow][newcol]){
                    dist[newrow][newcol]=dist[row][col]+1;
                    q.offer(new int[]{newrow,newcol});
                    vis[newrow][newcol]=true;

                }
            }
        }
        return dist;
    }
  
}
//distance problems use bfs.-->q of ll
//instead of looking from 1s to 0 for distance look for all 
//0s and their distance to each adjacent node. that way it would build up.
//vis and dist matrix.
//add all 0s to queue as coordination and dist 0, vis true.
//traverse each adj cell of the q item and if not visited add it to q.
//also add+1 to the distance.