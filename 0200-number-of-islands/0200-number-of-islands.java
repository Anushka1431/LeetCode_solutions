
class Solution {
    public static void dfs(char[][] grid,int i,int j){
        //check outside mtrix on all sides as it is 0 and vertices with 0 and return when u find
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length||grid[i][j]=='0')
            return;      
        //else do this       
        grid[i][j]='0';//mark 0 for visted
        //traverse all sides
        dfs(grid,i+1,j); 
        dfs(grid,i-1,j); 
        dfs(grid,i,j+1); 
        dfs(grid,i,j-1); 
    }
    public int numIslands(char[][] grid) {
        int count =0;
        //traverse array and wherver there is a 1 apply the dfs and increase the count 
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
           
        }
        return count ;
    }
    
}