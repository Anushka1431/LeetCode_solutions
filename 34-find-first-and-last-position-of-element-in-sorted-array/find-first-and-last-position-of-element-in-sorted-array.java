class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=leftsearch(nums,target);
        ans[1]=rightsearch(nums,target);
        return ans;
    }
    public int leftsearch(int[] nums, int target){
        int s=0,e=nums.length-1;
        int ind=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                ind=mid;
                e=mid-1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return ind;
    }
    public int rightsearch(int[] nums, int target){
        int s=0,e=nums.length-1;
        int ind=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target==nums[mid]){
                ind=mid;
                s=mid+1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }

        }
        return ind;
    }
}