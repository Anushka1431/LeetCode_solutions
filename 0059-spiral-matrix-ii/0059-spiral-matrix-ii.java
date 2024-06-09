class Solution {
    public int[][] generateMatrix(int n) {
        int top=0;
        int left=0;
        int right=n-1;
        int bottom=n-1;
        int num=1;
        int[][] output=new int[n][n];
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                output[top][i]=num;
                num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                output[i][right]=num;
                num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                output[bottom][i]=num;
                num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                output[i][left]=num;
                num++;
            }
            left++;
        }
        return output;

    }
}