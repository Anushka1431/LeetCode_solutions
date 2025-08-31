class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int n=matrix.length;
        int s=0,e=m-1;
        int t=0,d=n-1;
        while(t<=d){
            int midh=t+(d-t)/2;
            if(target >= matrix[midh][0] && target <= matrix[midh][m-1]){
                return helper(matrix[midh],target,s,e);
            }
            else if(target>matrix[midh][m-1]){
                t=midh+1;
            }
            else{
                d=midh-1;
            }
        }
        return false;
    }
    public boolean helper(int[] arr, int target, int s, int e){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target>arr[mid]){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}