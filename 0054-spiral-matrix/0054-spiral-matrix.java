class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output=new ArrayList<>();
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom=matrix.length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                output.add(matrix[top][i]);
                }
            top++;
            for(int i=top;i<=bottom;i++){
                output.add(matrix[i][right]);
                
            }
            right--;
            if(top<=bottom && left<=right){

            
            for(int i=right;i>=left;i--){
                output.add(matrix[bottom][i]);
                
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                output.add(matrix[i][left]);
                
            }
            left++;
        }
        }
        return output;
    }
}