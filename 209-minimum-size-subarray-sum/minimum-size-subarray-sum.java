class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int minwindow=Integer.MAX_VALUE;
        int l=0;
        int r=0;
        int sum=0;
        while(r<arr.length){
            sum+=arr[r];
            r++;
            
            while(sum>=target){
                int currwindow=r-l;
                minwindow=Math.min(minwindow,currwindow);

                sum-=arr[l];
                l++;
            }
        }
        return minwindow==Integer.MAX_VALUE ? 0: minwindow;
    }
}