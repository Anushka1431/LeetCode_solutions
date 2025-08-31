class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans=helper(nums,target,0,nums.length-1);
        
        
        return ans ;
    }
    public int helper(int[] nums, int target, int start, int end){
        int mid=0;
        while(start<=end){
            mid=start+(end-start)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return start;
    }
}