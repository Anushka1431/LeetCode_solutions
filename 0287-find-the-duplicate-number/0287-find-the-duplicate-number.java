class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
        int i=0;
        while(i<nums.length){
            int ci=nums[i]-1;
            if(nums[i]!=nums[ci]){
                swap(nums,i,ci);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans=nums[index];
                break;
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}