//see first cell in matrix and if it isnt visited then apply dfs on it .
//in dfs make the i visited and then check for the connected components j
//if j is 1 and not visited then apply dfs on it, else return. 
//once reurned a province is increased
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int prov=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                dfs(isConnected,vis,i);//this is the inside j loop
                ++prov;
            }
        }
        return prov;

    }
    public void dfs(int[][] isConnected, boolean[] vis,int i){
        vis[i]=true;
        for(int j=0;j<isConnected.length;j++){
            if(!vis[j] &&isConnected[i][j]==1){
                dfs(isConnected,vis,j);
            }
        }
    }
}